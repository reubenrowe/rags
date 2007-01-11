package rnsr.rag.grammar.interfaces;

import rnsr.rag.grammar.exception.CloneException;

/**
 * Indicates that an object can clone (make a deep copy) of itself
 */
public interface IClonable<T>
{

	/**
	 * Method to produce a clone of this object 
	 */
	public T cloneObject() throws CloneException;
	
}