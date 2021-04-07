package rnsr.rag.derivation;

import rnsr.rag.derivation.Interface.IDerivationAnswerTerm;
import rnsr.rag.derivation.Interface.IDerivationConfigurationTerm;
import rnsr.rag.grammar.VariableSet;

import java.util.ArrayList;

public class DerivationAnswer extends ArrayList<IDerivationAnswerTerm> implements IDerivationAnswerTerm {

    public IDerivationConfigurationTerm resolve(VariableSet bindings) {
        DerivationAnswer da = new DerivationAnswer();
        for (IDerivationAnswerTerm at: this) da.add((IDerivationAnswerTerm) at.resolve(bindings));
        return da;
    }

}
