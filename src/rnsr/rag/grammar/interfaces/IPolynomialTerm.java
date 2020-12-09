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

	/**
	 * Method used to resolve queries contained within polynomials as polynomial terms
	 * @param p The Parser object we pass to sub-queries for resolution
	 * @return The set of extended answers derived from resolving queries within a single extended answer
	 */
	public Set<ExtendedAnswer> resolveQueries(Parser p);

}
