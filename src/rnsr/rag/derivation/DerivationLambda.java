package rnsr.rag.derivation;

import rnsr.rag.derivation.Interface.IDerivationAnswerTerm;
import rnsr.rag.derivation.Interface.IDerivationConfigurationTerm;
import rnsr.rag.grammar.VariableSet;

public class DerivationLambda implements IDerivationAnswerTerm {

    public IDerivationConfigurationTerm resolve(VariableSet bindings) {
        return this;
    }

    public boolean match(IDerivationConfigurationTerm other) {
        return other instanceof DerivationLambda;
    }

    public String toString() {
        return "#";
    }

}