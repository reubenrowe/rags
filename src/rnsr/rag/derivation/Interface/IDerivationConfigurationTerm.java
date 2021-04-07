package rnsr.rag.derivation.Interface;

import rnsr.rag.grammar.VariableSet;

public interface IDerivationConfigurationTerm {

    public IDerivationConfigurationTerm resolve(VariableSet bindings);

}
