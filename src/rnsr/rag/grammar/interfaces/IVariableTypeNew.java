package rnsr.rag.grammar.interfaces;

import rnsr.rag.grammar.Answer;

/**
 * Enforcees the functionality of Type classes
 */
public interface IVariableTypeNew<T> {

	boolean match(Answer token);

}