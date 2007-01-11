package rnsr.rag.grammar.interfaces;

import rnsr.rag.grammar.ContextMapping;

import rnsr.rag.grammar.exception.CloneException;

/**
 * An object that imlements this interface can clone (make a deep copy) of itself when provided
 * with a context mapping (i.e. a mapping between the variables of the source sentential form of
 * which this object is a member, and the variables of the sentential form to which the cloned
 * object will belong)
 */
public interface IContextClonable<T>
{

	/**
	 * The method to produce a clone of this object
	 * @param context - the context for the cloning operation
	 */
	public T clone(ContextMapping context) throws CloneException;
	
}
