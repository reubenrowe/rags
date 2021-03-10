package rnsr.rag.grammar.interfaces;

import rnsr.rag.grammar.Answer;
import rnsr.rag.grammar.Polynomial;
import rnsr.rag.grammar.exception.UnificationLambdaException;

/**
 * Interface for enforcing type classes of Variables
 */
public interface IVariableType {

	Polynomial consumeFromAnswer(Answer other) throws UnificationLambdaException;

	boolean match(Answer token);
	
}