package rnsr.rag.derivation;

import rnsr.rag.derivation.Interface.IDerivationConfigurationTerm;
import rnsr.rag.derivation.Interface.IDerivationQueryTerm;
import rnsr.rag.grammar.VariableSet;

import java.util.ArrayList;

public class DerivationPolynomial extends ArrayList<IDerivationQueryTerm> implements IDerivationQueryTerm {

    public String toString() {
        String s = "";
        for (IDerivationQueryTerm qt: this) s += qt;
        return s;
    }

    public IDerivationConfigurationTerm resolve(VariableSet bindings) {
        DerivationPolynomial dp = new DerivationPolynomial();
        for (IDerivationQueryTerm qt: this) dp.add((IDerivationQueryTerm) qt.resolve(bindings));
        return dp;
    }

}