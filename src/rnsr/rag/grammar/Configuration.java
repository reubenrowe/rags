package rnsr.rag.grammar;

import rnsr.rag.derivation.DerivationTerm;
import rnsr.rag.grammar.exception.AnswerMismatchException;
import rnsr.rag.grammar.exception.CloneException;
import rnsr.rag.grammar.interfaces.IConfigurationTerm;
import rnsr.rag.grammar.interfaces.IConsumable;
import rnsr.rag.grammar.interfaces.IContextClonable;

import java.util.ArrayList;

/**
 * Represents a configuration in a RAG derivation
 */
public	class		Configuration
		extends		ArrayList<IConfigurationTerm>
		implements	IContextClonable<Configuration>, IConsumable
{

	/**
	 * IContextClonable method - clones this configuration
	 */
	public Configuration clone(ContextMapping context) throws CloneException
	{
		Configuration clone = new Configuration();

		for (IConfigurationTerm t : this)
		{
			clone.add((IConfigurationTerm) ((IContextClonable) t).clone(context));
		}

		return clone;
	}

	/**
	 * IConsumable method - consumes the head token of this configuration
	 * if it matches the given answer. Throws an exception otherwise.
	 */
	public void consumeToken(Answer answer) throws AnswerMismatchException
	{


		// If the head term is not an answer, then there is no match
		if (!(this.get(0) instanceof Answer))
		{
			throw new AnswerMismatchException("The head term is not an answer!");
		}
		
		// If the answers don't match, throw an exception
		if (!((Answer) this.get(0)).match(answer))
		{
			throw new AnswerMismatchException("The given answer does not match the term at the head of this configuration!");
		}
		
		// Otherwise, we can consume a token
		Answer head = (Answer) this.remove(0);

		// If the answer is a terminal one, we have to check for a partial match
		if (head.Identifier().Terminal() && !head.Identifier().equals(AnswerIdentifier.Lambda()))
		{
			if (answer.Identifier().Identifier().length() < head.Identifier().Identifier().length())
			{
				String remaining = head.Identifier().Identifier().substring(answer.Identifier().Identifier().length());
				this.add(0, new Answer(new AnswerIdentifier(remaining)));
			}
		}
	}

	public VariableSet usedVariables() {
		VariableSet vs = new VariableSet();
		for (IConfigurationTerm ct: this) {
			vs.putAll(ct.usedVariables());
		}
		return vs;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < this.size(); i++) {
			sb.append(this.get(i));
			if (i < this.size() - 1) sb.append(" ");
		}
		sb.append("]");
		return sb.toString();
	}

	public DerivationTerm getDerivationObject() {
		DerivationTerm dc = new DerivationTerm();
		for (IConfigurationTerm ct: this) dc.add(ct.getDerivationObject());
		return dc;
	}

}
