package rnsr.rag.derivation;

import rnsr.rag.derivation.Interface.IDerivationConfigurationTerm;
import rnsr.rag.grammar.VariableSet;

public class DerivationPair implements IDerivationConfigurationTerm {

    private DerivationConfiguration left;
    private DerivationConfiguration right;

    public DerivationPair(DerivationConfiguration left, DerivationConfiguration right) {
        this.left = left;
        this.right = right;
    }

    public DerivationConfiguration getLeft() {
        return left;
    }

    public void setLeft(DerivationConfiguration left) {
        this.left = left;
    }

    public DerivationConfiguration getRight() {
        return right;
    }

    public void setRight(DerivationConfiguration right) {
        this.right = right;
    }

    public IDerivationConfigurationTerm resolve(VariableSet bindings) {
        return this;
    }

    public IDerivationConfigurationTerm applyQuery(int queryID, DerivationConfiguration step) {
        return new DerivationPair(left.applyQuery(queryID, step), right.applyQuery(queryID, step));
    }

    public IDerivationConfigurationTerm applyQueryReverse(int queryID, DerivationConfiguration step, boolean isLeft) {
        return new DerivationPair(left.applyQueryReverse(queryID, step, isLeft), right.applyQueryReverse(queryID, step, isLeft));
    }

    public boolean match(IDerivationConfigurationTerm other) {
        return false;
    }

    public String toString() {
        return "<" + left + ", " + right + ">";
    }

    public DerivationPair clone() {
        return new DerivationPair(left.clone(), right.clone());
    }

}
