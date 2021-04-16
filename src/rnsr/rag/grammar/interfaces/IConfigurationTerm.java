package rnsr.rag.grammar.interfaces;

import rnsr.rag.derivation.Interface.IDerivationTerm;
import rnsr.rag.grammar.VariableSet;

/**
 * Indicates an object that is part of a RAG configuration algebra
 */
public	interface	IConfigurationTerm {

    VariableSet usedVariables();

    IDerivationTerm getDerivationObject();

}
