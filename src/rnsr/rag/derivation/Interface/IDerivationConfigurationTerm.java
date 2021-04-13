package rnsr.rag.derivation.Interface;

import rnsr.rag.derivation.DerivationConfiguration;
import rnsr.rag.grammar.VariableSet;

public interface IDerivationConfigurationTerm {

    IDerivationConfigurationTerm resolve(VariableSet bindings);

    IDerivationConfigurationTerm applyQuery(int queryID, DerivationConfiguration step);

    IDerivationConfigurationTerm clone();

    boolean match(IDerivationConfigurationTerm other);

}
