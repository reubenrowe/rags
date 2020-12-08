package rnsr.rag.grammar.interfaces;

import rnsr.rag.grammar.Answer;

import java.util.HashSet;

/**
 * Indicates and object that can be part of a RAG polynomial expression
 */
public interface IPolynomialTerm
{

	/**
	 * Overridden method to provide a string representation of a polynomial term
	 */
	public String toString();

	public HashSet<Answer> resolveQueries();

	public Object clone();

}
