package rnsr.rag.grammar.interfaces;

import rnsr.rag.grammar.Answer;
import rnsr.rag.grammar.exception.UnificationLambdaException;
import rnsr.rag.util.ConsumeSetting;

/**
 * Interface for enforcing type classes of Variables
 */
public interface IVariableType {

	ConsumeSetting consumeFromAnswer(Answer other) throws UnificationLambdaException;

	boolean match(Answer token);
	
}