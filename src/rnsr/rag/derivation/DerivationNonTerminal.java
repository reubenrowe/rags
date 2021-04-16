package rnsr.rag.derivation;

import rnsr.rag.derivation.Enum.Algebra;
import rnsr.rag.derivation.Interface.IDerivationTerm;
import rnsr.rag.grammar.VariableSet;

import java.util.ArrayList;

public class DerivationNonTerminal implements IDerivationTerm {

    private String identifier;
    private ArrayList<DerivationTerm> args;

    public DerivationNonTerminal(String identifier, ArrayList<DerivationTerm> args) {
        this.identifier = identifier;
        this.args = args;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String toString() {
        String s = identifier;
        if (args.size() < 1) return s;
        s += "[";
        for (int i = 0; i < args.size(); i++) {
            s += args.get(i).toString();
            if (i < args.size() - 1) s += ", ";
        }
        s += "]";
        return s;
    }

    public IDerivationTerm resolve(VariableSet bindings) {
        ArrayList<DerivationTerm> dpList = new ArrayList<>();
        for (DerivationTerm dp: args) dpList.add(dp.resolve(bindings));
        return new DerivationNonTerminal(identifier, dpList);
    }

    public IDerivationTerm applyQuery(int queryID, DerivationTerm step) {
        ArrayList<DerivationTerm> polyList = new ArrayList<>();
        for (DerivationTerm p: args) polyList.add(p.applyQuery(queryID, step));
        return new DerivationNonTerminal(identifier, polyList);
    }

    public IDerivationTerm applyQueryReverse(int queryID, DerivationTerm step) {
        ArrayList<DerivationTerm> polyList = new ArrayList<>();
        for (DerivationTerm p: args) polyList.add(p.applyQueryReverse(queryID, step));
        return new DerivationNonTerminal(identifier, polyList);
    }

    public boolean match(IDerivationTerm other) {
        if (!(other instanceof DerivationNonTerminal)) return false;
        DerivationNonTerminal otherNT = (DerivationNonTerminal) other;
        return identifier.equals(otherNT.identifier) && args.size() == otherNT.args.size();
    }

    public DerivationNonTerminal clone() {
        ArrayList<DerivationTerm> newArgs=  new ArrayList<>();
        for (DerivationTerm p: args) newArgs.add(p.clone());
        return new DerivationNonTerminal(identifier, newArgs);
    }

    public DerivationNonTerminal replaceQuery(int queryID, DerivationTerm config) {
        ArrayList<DerivationTerm> newArgs=  new ArrayList<>();
        for (DerivationTerm p: args) newArgs.add(p.replaceQuery(queryID, config));
        return new DerivationNonTerminal(identifier, newArgs);
    }

    public Algebra termAlgebra() {
        Algebra currentAlgebraLevel = Algebra.ANSWER;
        for (DerivationTerm dt: args) {
            currentAlgebraLevel = currentAlgebraLevel.compare(dt.termAlgebra());
        }
        return currentAlgebraLevel;
    }

    public IDerivationTerm findQuery(int queryID) {
        for (DerivationTerm dt: this.args) {
            IDerivationTerm subTermFinding = dt.findQuery(queryID);
            if (subTermFinding != null) return subTermFinding;
        }
        return null;
    }

}
