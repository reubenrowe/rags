package rnsr.rag.derivation;

import rnsr.rag.grammar.VariableSet;

import java.util.ArrayList;

public class DerivationSequence extends ArrayList<DerivationConfiguration> {

    VariableSet bindings = new VariableSet();

    public VariableSet getBindings() {
        return bindings;
    }

    public void setBindings(VariableSet bindings) {
        this.bindings = bindings;
    }

}
