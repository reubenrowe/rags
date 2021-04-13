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

    public IDerivationConfigurationTerm applyQuery(int queryID, DerivationConfiguration step) {
        DerivationPolynomial dp = new DerivationPolynomial();
        for (IDerivationQueryTerm qt: this) dp.add((IDerivationQueryTerm) qt.applyQuery(queryID, step));
        return dp;
    }

    public boolean match(IDerivationConfigurationTerm other) {
        if (!(other instanceof DerivationPolynomial)) return false;
        DerivationPolynomial otherPoly = (DerivationPolynomial) other;
        if (this.size() != otherPoly.size()) return false;
        for (int i = 0; i < this.size(); i++)
            if (!this.get(i).match(otherPoly.get(i))) return false;
        return true;
    }

    public boolean onlyLambda() {
        return (this.size() == 1 && this.get(0) instanceof DerivationLambda) || (this.size() == 1 && this.get(0) instanceof DerivationPolynomial && ((DerivationPolynomial) this.get(0)).onlyLambda());
    }

    public DerivationPolynomial clone() {
        DerivationPolynomial newP = new DerivationPolynomial();
        for (IDerivationQueryTerm qt: this) newP.add((IDerivationQueryTerm) qt.clone());
        return newP;
    }

}