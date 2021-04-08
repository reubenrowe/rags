package rnsr.rag.derivation.Interface;

import rnsr.rag.grammar.VariableSet;

public interface IDerivationConfigurationTerm {

    IDerivationConfigurationTerm resolve(VariableSet bindings);

    boolean match(IDerivationConfigurationTerm other);

}
