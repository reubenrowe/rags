package rnsr.rag.derivation;

import rnsr.rag.derivation.Interface.IDerivationAnswerTerm;
import rnsr.rag.derivation.Interface.IDerivationConfigurationTerm;
import rnsr.rag.grammar.VariableSet;

import java.util.ArrayList;

public class DerivationNonTerminal implements IDerivationAnswerTerm {

    private String identifier;
    private ArrayList<DerivationPolynomial> args;

    public DerivationNonTerminal(String identifier, ArrayList<DerivationPolynomial> args) {
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

    public IDerivationConfigurationTerm resolve(VariableSet bindings) {
        ArrayList<DerivationPolynomial> dpList = new ArrayList<>();
        for (DerivationPolynomial dp: args) dpList.add((DerivationPolynomial) dp.resolve(bindings));
        return new DerivationNonTerminal(identifier, dpList);
    }

    public IDerivationConfigurationTerm applyQuery(int queryID, DerivationConfiguration step) {
        ArrayList<DerivationPolynomial> polyList = new ArrayList<>();
        for (DerivationPolynomial p: args) polyList.add((DerivationPolynomial) p.applyQuery(queryID, step));
        return new DerivationNonTerminal(identifier, polyList);
    }

    public boolean match(IDerivationConfigurationTerm other) {
        if (!(other instanceof DerivationNonTerminal)) return false;
        DerivationNonTerminal otherNT = (DerivationNonTerminal) other;
        return identifier.equals(otherNT.identifier) && args.size() == otherNT.args.size();
    }

    public DerivationNonTerminal clone() {
        ArrayList<DerivationPolynomial> newArgs=  new ArrayList<>();
        for (DerivationPolynomial p: args) newArgs.add((DerivationPolynomial) p.clone());
        return new DerivationNonTerminal(identifier, newArgs);
    }

}
