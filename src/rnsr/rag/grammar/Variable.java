package rnsr.rag.grammar;

import rnsr.rag.grammar.exception.CloneException;
import rnsr.rag.grammar.exception.PolynomialUnificationException;
import rnsr.rag.grammar.interfaces.IContextClonable;
import rnsr.rag.grammar.interfaces.IPolynomialTerm;
import rnsr.rag.grammar.interfaces.IVariableType;
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
	private IVariableType type;

	public Variable(IVariableType type) {
		this.type = type;
	}

	public Variable() {
		this(null);
	}

	public boolean isConstrained() {
		return type != null;
	}

	public void setType(IVariableType type) {
		this.type = type;
	}

	public IVariableType getType() {
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
		for (Answer a: (HashSet<Answer>) type.getPool()) {
			String aID = a.Identifier().Identifier();		// Assuming a is terminal
			if (aID.startsWith(input)) {

				//ContextMapping cloneContext = new ContextMapping();
				//SententialForm clonedForm = currentForm.cloneObject(cloneContext);
				SententialForm clonedForm = currentForm;

				if (!type.isConcat()) {
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

	public UnificationSetting unify(Polynomial poly) throws PolynomialUnificationException {
		Polynomial rest = new Polynomial();
		VariableSet bindings = new VariableSet();
		Answer polyAnswer = (Answer) poly.get(0);
		String polyAnswerID = polyAnswer.Identifier().Identifier();
		HashSet<Answer> typePossibilities = (HashSet<Answer>) type.getPool();
		if (!type.isConcat()) { // atomic Havetype, e.g. LETTER.
			for (Answer a: typePossibilities) {
				String aID = a.Identifier().Identifier();
				if (polyAnswerID.startsWith(aID)) {
					if (polyAnswerID.length() > aID.length()) // If equal, no need to fill the new Polynomial since no remainder
						rest.add(new Answer(new AnswerIdentifier(polyAnswerID.substring(aID.length()))));
					else
						rest = poly;	// Used all of poly
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

	public Polynomial resolveInnerVariables(VariableSet sfBindings) {

		return sfBindings.get(this);

	}

}
