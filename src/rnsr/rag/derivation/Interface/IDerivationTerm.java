package rnsr.rag.derivation.Interface;

import rnsr.rag.derivation.DerivationTerm;
import rnsr.rag.derivation.Enum.Algebra;
import rnsr.rag.grammar.VariableSet;

public interface IDerivationTerm {

    IDerivationTerm resolve(VariableSet bindings);

    IDerivationTerm applyQuery(int queryID, DerivationTerm step);

    IDerivationTerm applyQueryReverse(int queryID, DerivationTerm step);

    IDerivationTerm clone();

    IDerivationTerm replaceQuery(int queryID, DerivationTerm config);

    IDerivationTerm findQuery(int queryID);

    Algebra termAlgebra();

    boolean match(IDerivationTerm other);

}
