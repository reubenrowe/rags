package rnsr.rag.grammar.interfaces;

import rnsr.rag.grammar.*;
import rnsr.rag.grammar.exception.CloneException;
import rnsr.rag.grammar.exception.PolynomialUnificationException;
import rnsr.rag.grammar.exception.UnificationLambdaException;
import rnsr.rag.parser.Parser;
import rnsr.rag.util.UnificationSetting;

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

	/**
	 * Method used to unify a polynomial term with a polynomial in a pattern matching operation.
	 * @param poly The Polynomial to unify with the current polynomial term.
	 * @return UnificationSetting object containing the binding and polynomial information from the unification
	 */
	public UnificationSetting unify(Polynomial poly) throws PolynomialUnificationException, CloneException, UnificationLambdaException;

	public Polynomial resolveInnerVariables(VariableSet sfBindings);

}
