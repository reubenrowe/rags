package rnsr.rag.derivation;

import rnsr.rag.grammar.VariableSet;

import java.util.ArrayList;

public class DerivationSequence extends ArrayList<DerivationConfiguration> {

    VariableSet originalBindings;

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
            if (i < this.size() - 1) s += " => ";
        }
        return s;
    }

    public DerivationSequence resolve() {
        DerivationSequence ds = new DerivationSequence(originalBindings);
        for (DerivationConfiguration dc: this) ds.add(dc.resolve(originalBindings));
        return ds;
    }

}
