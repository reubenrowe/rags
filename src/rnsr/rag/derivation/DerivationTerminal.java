package rnsr.rag.derivation;

import rnsr.rag.derivation.Enum.Algebra;
import rnsr.rag.derivation.Interface.IDerivationTerm;
import rnsr.rag.grammar.VariableSet;

public class DerivationTerminal implements IDerivationTerm {

    private String symbol;

    public DerivationTerminal(String symbol) {
        this.symbol = symbol;
    }

    public IDerivationTerm resolve(VariableSet bindings) {
        return this;
    }

    public IDerivationTerm applyQuery(int queryID, DerivationTerm step) {
        return this;
    }

    public IDerivationTerm applyQueryReverse(int queryID, DerivationTerm step) {
        return this;
    }

    public String toString() {
        return symbol;
    }

    public DerivationTerminal clone() {
        return new DerivationTerminal(symbol);
    }

    @Override
    public IDerivationTerm replaceQuery(int queryID, DerivationTerm config) {
        return new DerivationTerminal(symbol);
    }

    public Algebra termAlgebra() {
        return Algebra.TERMINAL;
    }

    public IDerivationTerm findQuery(int queryID) {
        return null;
    }

    public IDerivationTerm removeSurroundedLambdas() {
        return this;
    }

    public IDerivationTerm applyInvertToPreviousQueries(int queryID) {
        return new DerivationTerminal(symbol);
    }

}
