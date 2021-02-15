package rnsr.rag.grammar;

import rnsr.rag.grammar.exception.CloneException;
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

				//if (!checkConditions(currentForm, a)) continue; // Before cloning - check conditions on answer

				ContextMapping cloneContext = new ContextMapping();
				SententialForm clonedForm = currentForm.cloneObject(cloneContext);

				if (!type.isConcat()) {
					clonedForm.m_variables.put(cloneContext.get(this), new Polynomial(a));
					clonedForm.m_variables.put(cloneContext.get(originalRHS), new Polynomial(cloneContext.get(this)));
					clonedForm.m_configuration.add(0, new Answer(new AnswerIdentifier(aID)));
					candidates.add(clonedForm);
				} else {

					Polynomial currentPolyForVar;
					if (currentForm.m_variables.get(this) != null) {
						currentPolyForVar = currentForm.m_variables.get(this).clone(cloneContext);
					} else currentPolyForVar = new Polynomial();
					currentPolyForVar.add(a);

					clonedForm.m_variables.put(cloneContext.get(this), currentPolyForVar);
					clonedForm.m_variables.put(cloneContext.get(originalRHS), new Polynomial(cloneContext.get(this)));

					clonedForm.m_configuration.add(0, new Answer(new AnswerIdentifier(aID)));
					candidates.add(clonedForm);

					ContextMapping cloneContext2 = new ContextMapping();
					SententialForm clonedForm2 = clonedForm.cloneObject(cloneContext2);
					clonedForm2.m_configuration.add(1, new Pair(new Polynomial(cloneContext2.get(cloneContext.get(this))), cloneContext2.get(cloneContext.get(originalRHS))));
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

}
