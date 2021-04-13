package rnsr.rag.derivation.Interface;

import rnsr.rag.derivation.DerivationConfiguration;
import rnsr.rag.grammar.VariableSet;

public interface IDerivationConfigurationTerm {

    IDerivationConfigurationTerm resolve(VariableSet bindings);

    IDerivationConfigurationTerm applyQuery(int queryID, DerivationConfiguration step);

    IDerivationConfigurationTerm applyQueryReverse(int queryID, DerivationConfiguration step, boolean isLeft);

    IDerivationConfigurationTerm clone();

    boolean match(IDerivationConfigurationTerm other);

}
