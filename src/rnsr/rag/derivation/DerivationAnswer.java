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

    public IDerivationConfigurationTerm applyQuery(int queryID, DerivationConfiguration step) {
        DerivationAnswer newDA = new DerivationAnswer();
        for (IDerivationAnswerTerm at: this) newDA.add((IDerivationAnswerTerm) at.applyQuery(queryID, step));
        return newDA;
    }

    public boolean match(IDerivationConfigurationTerm other) {
        if (!(other instanceof DerivationAnswer)) return false;
        DerivationAnswer otherAnswer = (DerivationAnswer) other;
        if (this.size() != otherAnswer.size()) return false;
        for (int i = 0; i < this.size(); i++) {
            if (!this.get(i).match(otherAnswer.get(i))) return false;
        }
        return true;
    }

    public DerivationAnswer clone() {
        DerivationAnswer newAnswer = new DerivationAnswer();
        for (IDerivationAnswerTerm at: this) newAnswer.add((IDerivationAnswerTerm) at.clone());
        return newAnswer;
    }

}
