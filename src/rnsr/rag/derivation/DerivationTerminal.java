package rnsr.rag.derivation;

import rnsr.rag.derivation.Interface.IDerivationAnswerTerm;
import rnsr.rag.derivation.Interface.IDerivationConfigurationTerm;
import rnsr.rag.grammar.VariableSet;

public class DerivationTerminal implements IDerivationAnswerTerm {

    private String symbol;

    public DerivationTerminal(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public IDerivationConfigurationTerm resolve(VariableSet bindings) {
        return this;
    }

    public String toString() {
        return symbol;
    }

}
