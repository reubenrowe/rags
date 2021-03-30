package rnsr.rag.derivation;

import rnsr.rag.derivation.Interface.IDerivationAnswerTerm;

import java.util.ArrayList;

public class DerivationNonTerminal implements IDerivationAnswerTerm {

    private String ID;
    private ArrayList<DerivationPolynomial> args;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

}
