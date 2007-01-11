package rnsr.rag.grammar.interfaces;

import rnsr.rag.grammar.Answer;

import rnsr.rag.grammar.exception.AnswerMismatchException;

/**
 * An object implementing this interface indicates that it is comprised of tokens which 
 * can be consumed by the parsing process 
 */
public interface IConsumable
{

	/**
	 * Consumes a token from the head of this object
	 * @param input - the answer representing the token expected to be consumed
	 */
	public void consumeToken(Answer input) throws AnswerMismatchException;
	
}
