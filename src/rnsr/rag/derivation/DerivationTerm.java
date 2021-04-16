package rnsr.rag.derivation;

import rnsr.rag.derivation.Enum.Algebra;
import rnsr.rag.derivation.Interface.IDerivationTerm;
import rnsr.rag.grammar.InstantiatedRule;
import rnsr.rag.grammar.VariableSet;

import java.util.ArrayList;

public class DerivationTerm extends ArrayList<IDerivationTerm> implements IDerivationTerm {

    public String toString() {
        String s = "";
        for (IDerivationTerm ct: this) s += ct;
        return s;
    }

    public DerivationTerm() {
        super();
    }

    public DerivationTerm(IDerivationTerm dt) {
        super();
        this.add(dt);
    }

    public DerivationTerm resolve(VariableSet bindings) {
        DerivationTerm dc = new DerivationTerm();
        for (IDerivationTerm ct: this) {
            IDerivationTerm ct2 = ct.resolve(bindings);
            if (ct2 != null) dc.add(ct2.resolve(bindings));
        }
        return dc;
    }

    public DerivationTerm applyStep(int pairID, InstantiatedRule rule, VariableSet bindings) {
        DerivationTerm dc = new DerivationTerm();
        boolean done = false;
        for (int i = 0; i < this.size(); i++) {
            IDerivationTerm ct = this.get(i);
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

    public DerivationTerm applyQuery(int queryID, DerivationTerm step) {
        DerivationTerm dc = new DerivationTerm();
        for (IDerivationTerm ct: this) dc.add(ct.applyQuery(queryID, step));
        return dc;
    }

    public DerivationTerm applyQueryReverse(int queryID, DerivationTerm step) {
        DerivationTerm dc = new DerivationTerm();
        for (IDerivationTerm ct: this) dc.add(ct.applyQueryReverse(queryID, step));
        return dc;
    }

    public boolean match(IDerivationTerm other) {
        if (!(other instanceof DerivationTerm)) return false;
        DerivationTerm otherC = (DerivationTerm) other;
        if (otherC.size() != this.size()) return false;
        for (int i = 0; i < this.size(); i++) {
            if (!this.get(i).match(otherC.get(i))) return false;
        }
        return true;
    }

    public DerivationTerm clone() {
        DerivationTerm newDC = new DerivationTerm();
        for (IDerivationTerm ct: this) newDC.add(ct.clone());
        return newDC;
    }

    public DerivationTerm replaceQuery(int queryID, DerivationTerm config) {
        DerivationTerm newDC = new DerivationTerm();
        for (IDerivationTerm ct: this) newDC.add(ct.replaceQuery(queryID, config));
        return newDC;
    }

    public Algebra termAlgebra() {
        Algebra currentAlgebraLevel = Algebra.TERMINAL;
        for (IDerivationTerm t: this) {
            currentAlgebraLevel = currentAlgebraLevel.compare(t.termAlgebra());
        }
        return currentAlgebraLevel;
    }

    public IDerivationTerm findQuery(int queryID) {
        for (IDerivationTerm dt: this) {
            IDerivationTerm subTermFinding = dt.findQuery(queryID);
            if (subTermFinding != null) return subTermFinding;
        }
        return null;
    }

}