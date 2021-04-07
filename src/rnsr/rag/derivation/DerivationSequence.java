package rnsr.rag.derivation;

import rnsr.rag.grammar.VariableSet;

import java.util.ArrayList;

public class DerivationSequence extends ArrayList<DerivationConfiguration> {

    VariableSet originalBindings = new VariableSet();

    public VariableSet getOriginalBindings() {
        return originalBindings;
    }

    public void setOriginalBindings(VariableSet originalBindings) {
        this.originalBindings = originalBindings;
    }

}
