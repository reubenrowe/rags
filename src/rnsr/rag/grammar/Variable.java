package rnsr.rag.grammar;

import rnsr.rag.grammar.exception.CloneException;
import rnsr.rag.grammar.exception.PolynomialUnificationException;
import rnsr.rag.grammar.exception.UnificationLambdaException;
import rnsr.rag.grammar.interfaces.IConfigurationTerm;
import rnsr.rag.grammar.interfaces.IContextClonable;
import rnsr.rag.grammar.interfaces.IPolynomialTerm;
import rnsr.rag.grammar.types.Type;
import rnsr.rag.grammar.types.WordType;
import rnsr.rag.parser.Parser;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Represents a variable in a RAG polynomial expression
 */
public	class		Variable
		implements	IPolynomialTerm, IContextClonable<Variable>
{

	private int index;
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
		return "v" + this.hashCode() + " [" + tag + "]";
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

	public boolean checkConditions(SententialForm currentForm, Answer possibleAnswer) {
		ArrayList<VariableCondition> conditions = currentForm.m_conditions;
		for (VariableCondition vc: conditions) {
			 if (vc.getFirstVariable().equals(this) || vc.getSecondVariable().equals(this)) {
			 	Variable other = (this.equals(vc.getFirstVariable())) ? vc.getSecondVariable() : vc.getFirstVariable();
				 Polynomial otherP = currentForm.m_variables.get(other);
				 Polynomial thisP = new Polynomial(possibleAnswer);
			 	switch (vc.getConditionType()) {

			 		case NE: {
						if (thisP.equals(otherP)) {
							return false;
						}
					}

				}
			 }
		}
		return true;
	}

	public UnificationSetting unify(Polynomial poly) throws PolynomialUnificationException, UnificationLambdaException {
		Polynomial rest = new Polynomial();
		VariableSet bindings = new VariableSet();

		if (poly.onlyLambda() || poly.Empty()) {
			if (this.type instanceof WordType) {
				bindings.put(this, new Polynomial(new Answer(AnswerIdentifier.Lambda())));
				return new UnificationSetting(bindings, rest);
			} else {
				throw new UnificationLambdaException();
			}
		}

		Answer polyAnswer = (Answer) poly.get(0);

		String polyAnswerID = polyAnswer.Identifier().Identifier();

		if (type == null) { // If no type, we simply take the entire polynomial
			bindings.put(this, poly);
			return new UnificationSetting(bindings, new Polynomial());
		}

		HashSet<Answer> typePossibilities = type.getAlphabet();

		if (!type.isConcatenable()) { // atomic Havetype, e.g. LETTER.
			for (Answer a: typePossibilities) {
				String aID = a.Identifier().Identifier();
				if (polyAnswerID.startsWith(aID)) {
					if (polyAnswerID.length() > aID.length())
						rest.add(new Answer(new AnswerIdentifier(polyAnswerID.substring(aID.length()))));
					bindings.put(this, new Polynomial(a));
					break;
				}
			}
		} else { // concatenation type, e.g. WORD - positive closure over LETTER
			for (char c: polyAnswerID.toCharArray()) {
				boolean inSet = false;
				for (Answer a: typePossibilities) {
					inSet = new Answer(new AnswerIdentifier(String.valueOf(c))).equals(a);
					if (inSet) break;
				}
				if (!inSet)
					throw new PolynomialUnificationException(polyAnswerID + " could not satisfy type " + type + "!"); // Error case

			}
			rest = new Polynomial();
			bindings.put(this, poly);
		}
		return new UnificationSetting(bindings, rest);
	}

	public UnificationSetting unifySecond(Polynomial other) {
		VariableSet newBindings = new VariableSet();
		Polynomial rest = new Polynomial();

		// For now: assuming that Polynomial 'other' is a list of length 1 containing a single terminal.


		return new UnificationSetting(newBindings, rest);
	}

	public Polynomial resolveInnerVariables(VariableSet sfBindings) {
		return sfBindings.get(this);
	}

}
