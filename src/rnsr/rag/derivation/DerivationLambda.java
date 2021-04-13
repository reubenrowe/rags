package rnsr.rag.derivation;

import rnsr.rag.derivation.Interface.IDerivationAnswerTerm;
import rnsr.rag.derivation.Interface.IDerivationConfigurationTerm;
import rnsr.rag.grammar.VariableSet;

public class DerivationLambda implements IDerivationAnswerTerm {

    public IDerivationConfigurationTerm resolve(VariableSet bindings) {
        return this;
    }

    public IDerivationConfigurationTerm applyQuery(int queryID, DerivationConfiguration step) {
        return this;
    }

    public IDerivationConfigurationTerm applyQueryReverse(int queryID, DerivationConfiguration step, boolean isLeft) {
        return this;
    }

    public boolean match(IDerivationConfigurationTerm other) {
        return other instanceof DerivationLambda;
    }

    public String toString() {
        return "#";
    }

    public DerivationLambda clone() {
        return new DerivationLambda();
    }

}
