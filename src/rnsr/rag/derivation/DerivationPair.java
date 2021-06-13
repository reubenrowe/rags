package rnsr.rag.derivation;

import rnsr.rag.derivation.Enum.Algebra;
import rnsr.rag.derivation.Interface.IDerivationTerm;
import rnsr.rag.grammar.ContextMapping;
import rnsr.rag.grammar.VariableSet;

public class DerivationPair implements IDerivationTerm {

    private DerivationTerm left;
    private DerivationTerm right;

    public DerivationPair(DerivationTerm left, DerivationTerm right) {
        this.left = left;
        this.right = right;
    }

    public IDerivationTerm resolve(VariableSet bindings) {
        return this;
    }

    public IDerivationTerm applyQuery(int queryID, DerivationTerm step) {
        return new DerivationPair(left.applyQuery(queryID, step), right.applyQuery(queryID, step));
    }

    public IDerivationTerm applyQueryReverse(int queryID, DerivationTerm step) {
        return new DerivationPair(left.applyQueryReverse(queryID, step), right.applyQueryReverse(queryID, step));
    }

    public String toString() {
        return "<" + left + ", " + right + ">";
    }

    public DerivationPair clone() {
        return new DerivationPair(left.clone(), right.clone());
    }

    public DerivationPair clone(ContextMapping context) {
        return new DerivationPair(left.clone(context), right.clone(context));
    }

    public DerivationPair replaceQuery(int queryID, DerivationTerm config) {
        return new DerivationPair(left.replaceQuery(queryID, config), right.replaceQuery(queryID, config));
    }

    public Algebra termAlgebra() {
        return Algebra.CONFIGURATION;
    }

    public IDerivationTerm findQuery(int queryID) {
        IDerivationTerm dt1 = left.findQuery(queryID);
        IDerivationTerm dt2 = right.findQuery(queryID);
        return (dt1 != null) ? dt1 : (dt2 != null) ? dt2 : null;
    }

    public IDerivationTerm removeSurroundedLambdas() {
        return new DerivationPair(left.removeSurroundedLambdas(), right.removeSurroundedLambdas());
    }

    public IDerivationTerm applyInvertToPreviousQueries(int queryID) {
        return new DerivationPair(left.applyInvertToPreviousQueries(queryID), right.applyInvertToPreviousQueries(queryID));
    }

    public boolean queryIsSubQuery(int queryID) {
        return left.queryIsSubQuery(queryID) || right.queryIsSubQuery(queryID);
    }

}
