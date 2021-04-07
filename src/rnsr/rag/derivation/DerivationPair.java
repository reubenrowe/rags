package rnsr.rag.derivation;

import rnsr.rag.derivation.Interface.IDerivationConfigurationTerm;

public class DerivationPair implements IDerivationConfigurationTerm {

    private DerivationConfiguration left;
    private DerivationConfiguration right;

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

}
