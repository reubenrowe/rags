package rnsr.rag.derivation;

import rnsr.rag.derivation.Interface.IDerivationConfigurationTerm;
import rnsr.rag.grammar.InstantiatedRule;
import rnsr.rag.grammar.VariableSet;

import java.util.ArrayList;

public class DerivationConfiguration extends ArrayList<IDerivationConfigurationTerm> implements IDerivationConfigurationTerm {

    public String toString() {
        String s = "";
        for (IDerivationConfigurationTerm ct: this) s += ct;
        return s;
    }

    public DerivationConfiguration resolve(VariableSet bindings) {
        DerivationConfiguration dc = new DerivationConfiguration();
        for (IDerivationConfigurationTerm ct: this) {
            IDerivationConfigurationTerm ct2 = ct.resolve(bindings);
            if (ct2 != null) dc.add(ct2.resolve(bindings));
        }
        return dc;
    }

    public DerivationConfiguration applyStep(int pairID, InstantiatedRule rule, VariableSet bindings) {
        DerivationConfiguration dc = new DerivationConfiguration();
        boolean done = false;
        for (int i = 0; i < this.size(); i++) {
            IDerivationConfigurationTerm ct = this.get(i);
            if (done || !(ct instanceof DerivationPairVariable)) {
                dc.add(ct);
                continue;
            }
            DerivationPairVariable pair = (DerivationPairVariable) ct;
            if (pair.getId() == pairID) {
                dc.addAll(rule.getConfiguration().getDerivationObject());
                done = true;
            } else {
                dc.add(pair);
            }
        }
        return dc;
    }

    public DerivationConfiguration applyQuery(int queryID, DerivationConfiguration step) {
        DerivationConfiguration dc = new DerivationConfiguration();
        for (IDerivationConfigurationTerm ct: this) dc.add(ct.applyQuery(queryID, step));
        return dc;
    }

    public boolean match(IDerivationConfigurationTerm other) {
        if (!(other instanceof DerivationConfiguration)) return false;
        DerivationConfiguration otherC = (DerivationConfiguration) other;
        if (otherC.size() != this.size()) return false;
        for (int i = 0; i < this.size(); i++) {
            if (!this.get(i).match(otherC.get(i))) return false;
        }
        return true;
    }

}