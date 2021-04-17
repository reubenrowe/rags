package rnsr.rag.derivation;

import rnsr.rag.derivation.Enum.Algebra;
import rnsr.rag.derivation.Interface.IDerivationTerm;
import rnsr.rag.grammar.VariableSet;

public class DerivationLambda implements IDerivationTerm {

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
        return "#";
    }

    public DerivationLambda clone() {
        return new DerivationLambda();
    }

    public DerivationLambda replaceQuery(int queryID, DerivationTerm config) {
        return this;
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

}
