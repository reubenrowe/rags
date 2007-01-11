package rnsr.rag.grammar.interfaces;

import rnsr.rag.grammar.VariableSet;

import rnsr.rag.grammar.exception.VariableNotBoundException;
import rnsr.rag.grammar.exception.VariableNotFoundException;

/**
 * Indicates that this term may contain variables which can be resolved
 */
public interface IResolvable<T>
{

	/**
	 * Returns a deep clone of the object with all variables resolved to their bound terms
	 */
	public T resolve(VariableSet variables) throws VariableNotBoundException, VariableNotFoundException;
}
