package rnsr.rag.grammar.interfaces;

import rnsr.rag.grammar.Answer;

/**
 * Indicates that an object can clone (make a deep copy) of itself
 */
public interface IVariableTypeNew<T>
{

	public boolean match(Answer token);

	
}