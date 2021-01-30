package rnsr.rag.grammar;

import rnsr.rag.grammar.exception.CloneException;
import rnsr.rag.grammar.interfaces.IContextClonable;
import rnsr.rag.grammar.interfaces.IPolynomialTerm;
import rnsr.rag.parser.Parser;

import java.util.HashSet;

/**
 * Represents a variable in a RAG polynomial expression
 */
public	class		Variable
		implements	IPolynomialTerm, IContextClonable<Variable>
{

	private int index;
	private HashSet<Answer> possibleAnswers;

	public Variable(HashSet<Answer> possibleAnswers) {
		this.possibleAnswers = possibleAnswers;
	}

	public Variable() {
		this(null);
	}

	public boolean isConstrained() {
		return possibleAnswers != null && possibleAnswers.size() > 0;
	}

	public HashSet<Answer> getPossibleAnswers() {
		return possibleAnswers;
	}

	public void setPossibleAnswers(HashSet<Answer> possibleAnswers) {
		this.possibleAnswers = possibleAnswers;
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
		for (Answer a: possibleAnswers) {
			String aID = a.Identifier().Identifier();		// Assuming a is terminal
			if (aID.startsWith(input)) {
				ContextMapping cloneContext = new ContextMapping();
				SententialForm clonedForm = currentForm.cloneObject(cloneContext);
				clonedForm.m_configuration.add(0, new Answer(new AnswerIdentifier(aID)));
				clonedForm.m_variables.put(cloneContext.get(this), new Polynomial(a));
				clonedForm.m_variables.put(cloneContext.get(originalRHS), new Polynomial(cloneContext.get(this)));
				candidates.add(clonedForm);
			}
		}
	}

}
