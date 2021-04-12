package rnsr.rag.derivation;

import rnsr.rag.derivation.Interface.IDerivationConfigurationTerm;
import rnsr.rag.grammar.InstantiatedRule;
import rnsr.rag.grammar.VariableSet;

import java.util.ArrayList;

public class DerivationConfiguration extends ArrayList<IDerivationConfigurationTerm> {

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

        /*
        DerivationConfiguration dc = new DerivationConfiguration();

        boolean done = false;


        for (int i = 0; i < this.size(); i++) {
            IDerivationConfigurationTerm ct = this.get(i);
            if (done || !(ct instanceof DerivationPairVariable) || !(ct.match(p))) {
                dc.add(ct);
                continue;
            }
            DerivationConfiguration ruleConfig = rule.getConfiguration().getDerivationObject();
            ArrayList<IDerivationConfigurationTerm> termList = new ArrayList<>();
            for (IDerivationConfigurationTerm ruleCT: ruleConfig)
                if (!(ruleCT instanceof DerivationLambda))
                    termList.add(ruleCT);
            dc.addAll(termList);
            done = true;
        }


        /*
        for (int i = 0; i < this.size(); i++) {
            IDerivationConfigurationTerm ct = this.get(i);
            if (done || !(ct instanceof DerivationPairVariable)) {
                dc.add(ct);
                continue;
            }

            DerivationPairVariable pair = (DerivationPairVariable) ct;
            if (pair.getId() == p.getId()) {
                dc.addAll(rule.getConfiguration().getDerivationObject());
                done = true;
            } else {
                dc.add(pair);
            }

        }
        */
        return dc;
    }

    public boolean match(DerivationConfiguration other) {
        if (!(other instanceof DerivationConfiguration)) return false;
        DerivationConfiguration otherConfig = (DerivationConfiguration) other;
        if (this.size() != otherConfig.size()) return false;
        for (int i = 0; i < this.size(); i++) {
            if (!this.get(i).match(otherConfig.get(i))) return false;
        }
        return true;
    }

}