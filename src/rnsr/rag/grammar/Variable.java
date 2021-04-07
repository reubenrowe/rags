package rnsr.rag.grammar;

import rnsr.rag.derivation.Interface.IDerivationQueryTerm;
import rnsr.rag.grammar.exception.CloneException;
import rnsr.rag.grammar.exception.UnificationLambdaException;
import rnsr.rag.grammar.interfaces.IConfigurationTerm;
import rnsr.rag.grammar.interfaces.IContextClonable;
import rnsr.rag.grammar.interfaces.IPolynomialTerm;
import rnsr.rag.grammar.types.Type;
import rnsr.rag.parser.Parser;
import rnsr.rag.util.ConsumeSetting;
import rnsr.rag.util.UnificationSetting;

import java.util.HashSet;

/**
 * Represents a variable in a RAG polynomial expression
 */
public	class		Variable
		implements	IPolynomialTerm, IContextClonable<Variable>
{

	private int id;
	private Type type;

	public Variable(Type type) {
		this.type = type;
	}

	public Variable() {
		this(null);
	}

	public boolean isConstrained() {
		return type != null;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Type getType() {
		return type;
	}

	public void setID(int id) {
		this.id = id;
	}

	public int getID() {
		return this.id;
	}

	/**
	 * IContextClonable method - clones this Variable
	 */

	public Variable clone(ContextMapping context) throws CloneException
	{
		if (context.containsKey(this))
		{
			return context.get(this);
		}
		else
		{
			throw new CloneException("Variable cannot be found in context!");
		}
	}

	/**
	 * Overload method to check the equality of variables. NB. This method just calls the
	 * superclass (Object) method as variables are only equal if they reference the same object
	 */
	public boolean equals(Variable v)
	{
		return super.equals(v);
	}
	
	public String toString()
	{
		// TODO : Implement a better naming scheme for variables
		return "_v" + this.id;
	}

	public HashSet<ExtendedAnswer> resolveQueries(Parser parser) {
		return new HashSet<>();
	}

	private String tag;

	public String getTag() { return tag; }

	public void setTag(String tag) { this.tag = tag; }

	public void resolveForConstraints(String input, SententialForm currentForm, CandidateSet candidates) throws CloneException {

		Pair p = (Pair) currentForm.m_configuration.remove(0);
		Variable originalRHS = p.Right();

		if (currentForm.m_variables.get(this) != null && !currentForm.m_variables.get(this).Empty()) { // Variable already bound to something
			Polynomial varPoly = currentForm.m_variables.get(this);
			Configuration front = new Configuration();
			currentForm.m_variables.put(p.Right(), varPoly);
			for (IPolynomialTerm pt: varPoly) front.add((IConfigurationTerm) pt);
			currentForm.m_configuration.addAll(0, front);
			return;
		}

		for (Answer a: type.getAlphabet()) {
			String aID = a.Identifier().Identifier();		// Assuming a is terminal
			if (aID.startsWith(input)) {

				//ContextMapping cloneContext = new ContextMapping();
				//SententialForm clonedForm = currentForm.cloneObject(cloneContext);
				SententialForm clonedForm = currentForm;

				if (!type.isConcatenable()) {
					clonedForm.m_variables.put(this, new Polynomial(a));
					clonedForm.m_variables.put(originalRHS, new Polynomial(this));
					clonedForm.m_configuration.add(0, new Answer(new AnswerIdentifier(aID)));
					//candidates.add(clonedForm);
				} else {

					Polynomial currentPolyForVar;
					if (currentForm.m_variables.get(this) != null) {
						currentPolyForVar = currentForm.m_variables.get(this);
					} else currentPolyForVar = new Polynomial();
					currentPolyForVar.add(a);

					clonedForm.m_variables.put(this, currentPolyForVar);
					clonedForm.m_variables.put(originalRHS, new Polynomial(this));

					clonedForm.m_configuration.add(0, new Answer(new AnswerIdentifier(aID)));
					//candidates.add(clonedForm);

					ContextMapping cloneContext2 = new ContextMapping();
					SententialForm clonedForm2 = clonedForm.cloneObject(cloneContext2);
					clonedForm2.m_configuration.add(1, new Pair(new Polynomial(cloneContext2.get(this)), cloneContext2.get(originalRHS)));
					candidates.add(clonedForm2);

				}

			}
		}

	}

	public UnificationSetting unify(Polynomial other) throws UnificationLambdaException {
		VariableSet newBindings = new VariableSet();

		// For variables with no type: take everything
		if (this.type == null) {
			newBindings.put(this, other);
			return new UnificationSetting(newBindings, new Polynomial());
		}

		// For now: assuming that Polynomial 'other' is a list of length 1 containing a single terminal.
		Answer polyAns = (Answer) other.get(0);
		ConsumeSetting consumeSetting = this.type.consumeFromAnswer(polyAns);
		Polynomial rest = consumeSetting.getRemainder();
		newBindings.put(this, consumeSetting.getConsumed());

		return new UnificationSetting(newBindings, rest);
	}

	public Polynomial resolveInnerVariables(VariableSet sfBindings) {
		return sfBindings.get(this);
	}

	public VariableSet usedVariables() {
		VariableSet vs = new VariableSet();
		vs.put(this);
		return vs;
	}

	public IDerivationQueryTerm getDerivationObject() {
		return null;
	}

}
