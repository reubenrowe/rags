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

    public String toString() {
        return "<" + left + ", " + right + ">";
    }

}
