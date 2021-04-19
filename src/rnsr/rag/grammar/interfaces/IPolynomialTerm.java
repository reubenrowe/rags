package rnsr.rag.grammar.interfaces;

import rnsr.rag.derivation.Interface.IDerivationTerm;
import rnsr.rag.grammar.Polynomial;
import rnsr.rag.grammar.SubQueryResult;
import rnsr.rag.grammar.VariableSet;
import rnsr.rag.grammar.exception.CloneException;
import rnsr.rag.grammar.exception.PolynomialUnificationException;
import rnsr.rag.grammar.exception.UnificationLambdaException;
import rnsr.rag.parser.Parser;
import rnsr.rag.util.UnificationSetting;

import java.util.HashSet;

/**
 * Indicates and object that can be part of a RAG polynomial expression
 */
public interface IPolynomialTerm
{

	/**
	 * Overridden method to provide a string representation of a polynomial term
	 */
	String toString();

	HashSet<SubQueryResult> resolveInnerQueries(Parser parser);

	/**
	 * Method used to unify a polynomial term with a polynomial in a pattern matching operation.
	 * @param other The Polynomial to unify with the current polynomial term.
	 * @return UnificationSetting object containing the binding and polynomial information from the unification
	 */
	UnificationSetting unify(Polynomial other) throws PolynomialUnificationException, CloneException, UnificationLambdaException;

	Polynomial resolveInnerVariables(VariableSet sfBindings);

	VariableSet usedVariables();

	IDerivationTerm getDerivationObject();

}
