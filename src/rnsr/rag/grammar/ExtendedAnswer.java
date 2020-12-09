package rnsr.rag.grammar;

import rnsr.rag.grammar.interfaces.IPolynomialTerm;

/**
 * Represents a concatenation (string) of Answers
 */
public	class		ExtendedAnswer
		extends		Polynomial
{

	public ExtendedAnswer() {
		super();
	}

	public ExtendedAnswer(IPolynomialTerm pt) {
		super(pt);
	}
	/**
	 * Removes and returns the leftmost answer in this answer string.
	 * Nonterminal answers are returned as is. Terminal answers are
	 * returned one character at a time. 
	 */
	public Answer removeHeadToken()
	{

		Answer a = (Answer) this.remove(0);
		
		if (a.Identifier().Terminal())
		{
			String terminalStr = a.Identifier().Identifier();
			
			if (terminalStr.length() > 1)
			{
				AnswerIdentifier newId = new AnswerIdentifier(terminalStr.substring(1));
				this.add(0, new Answer(newId));
			}
			
			AnswerIdentifier returnId = null;
			if (terminalStr.length() == 0)
			{
				returnId = AnswerIdentifier.Lambda();
			}
			else
			{
				returnId = new AnswerIdentifier(terminalStr.substring(0, 1));
			}
			
			return new Answer(returnId);
		}
		
		else
		{
			return a;
		}
	}

}