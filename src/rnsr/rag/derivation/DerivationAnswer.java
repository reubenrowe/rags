package rnsr.rag.derivation;

import rnsr.rag.derivation.Interface.IDerivationConfigurationTerm;
import rnsr.rag.derivation.Interface.IDerivationQueryTerm;

import java.util.ArrayList;

public class DerivationAnswer implements IDerivationConfigurationTerm, IDerivationQueryTerm {

    private ArrayList<DerivationTerminal> terminals = new ArrayList<DerivationTerminal>();

    public ArrayList<DerivationTerminal> getTerminals() {
        return terminals;
    }

    public void setTerminals(ArrayList<DerivationTerminal> terminals) {
        this.terminals = terminals;
    }
}
