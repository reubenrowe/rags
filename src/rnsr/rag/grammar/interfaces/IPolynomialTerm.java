package rnsr.rag.grammar.interfaces;

import rnsr.rag.grammar.ExtendedAnswer;
import rnsr.rag.parser.Parser;

import java.util.Set;

/**
 * Indicates and object that can be part of a RAG polynomial expression
 */
public interface IPolynomialTerm
{

	/**
	 * Overridden method to provide a string representation of a polynomial term
	 */
	public String toString();

	public Set<ExtendedAnswer> resolveQueries(Parser p);

	public Object clone();

}
