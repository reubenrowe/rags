package rnsr.rag.derivation;

import rnsr.rag.grammar.InstantiatedRule;
import rnsr.rag.grammar.VariableSet;

import java.util.ArrayList;

public class DerivationSequence extends ArrayList<DerivationConfiguration> {

    VariableSet originalBindings;
    public String steps = "";

    public DerivationSequence(VariableSet originalBindings) {
        this.originalBindings = originalBindings;
    }

    public VariableSet getOriginalBindings() {
        return originalBindings;
    }

    public void setOriginalBindings(VariableSet originalBindings) {
        this.originalBindings = originalBindings;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < this.size(); i++) {
            s += this.get(i);
            if (i < this.size() - 1) s += "\n => ";
        }
        //s += "\n\n" + steps;
        return s;
    }

    public DerivationSequence resolve() {
        DerivationSequence ds = new DerivationSequence(originalBindings);
        for (DerivationConfiguration dc: this) ds.add(dc.resolve(originalBindings));
        ds.steps += this.steps;
        return ds;
    }

    public void applyStep(DerivationPairVariable p, InstantiatedRule rule) {
        DerivationConfiguration tailConfiguration = this.get(this.size() - 1);
        this.add(tailConfiguration.applyStep(p, rule, originalBindings));
        this.steps += p + " (" + p.getId() + ")   ->   " + rule.getConfiguration() + "    :    " + originalBindings + "\n";
    }

}
