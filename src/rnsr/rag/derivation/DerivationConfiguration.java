package rnsr.rag.derivation;

import rnsr.rag.derivation.Interface.IDerivationConfigurationTerm;
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
        for (IDerivationConfigurationTerm ct: this) dc.add(ct.resolve(bindings));
        return dc;
    }

}