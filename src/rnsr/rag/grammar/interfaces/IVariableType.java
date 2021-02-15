package rnsr.rag.grammar.interfaces;

import rnsr.rag.grammar.Answer;

import java.util.HashSet;

/**
 * Indicates that an object can clone (make a deep copy) of itself
 */
public interface IVariableType<T>
{

	public boolean match(String token);

	public HashSet<Answer> getPool();

	public boolean isConcat();
	
}