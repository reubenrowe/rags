package rnsr.rag.grammar.interfaces;

import rnsr.rag.derivation.Interface.IDerivationConfigurationTerm;
import rnsr.rag.grammar.VariableSet;

/**
 * Indicates an object that is part of a RAG configuration algebra
 */
public	interface	IConfigurationTerm {

    VariableSet usedVariables();

    IDerivationConfigurationTerm getDerivationObject();

}
