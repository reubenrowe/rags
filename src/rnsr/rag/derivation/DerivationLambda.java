package rnsr.rag.derivation;

import rnsr.rag.derivation.Interface.IDerivationAnswerTerm;
import rnsr.rag.derivation.Interface.IDerivationConfigurationTerm;
import rnsr.rag.grammar.VariableSet;

public class DerivationLambda implements IDerivationAnswerTerm {

    public IDerivationConfigurationTerm resolve(VariableSet bindings) {
        return this;
    }

}
