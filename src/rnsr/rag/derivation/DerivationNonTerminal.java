package rnsr.rag.derivation;

import rnsr.rag.derivation.Interface.IDerivationAnswerTerm;

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

}
