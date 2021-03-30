package rnsr.rag.derivation;

import rnsr.rag.derivation.Interface.IDerivationQueryTerm;

public class DerivationQuery implements IDerivationQueryTerm {

    private IDerivationQueryTerm metaSyntax;
    private IDerivationQueryTerm syntax;

    public IDerivationQueryTerm getMetaSyntax() {
        return metaSyntax;
    }

    public void setMetaSyntax(IDerivationQueryTerm metaSyntax) {
        this.metaSyntax = metaSyntax;
    }

    public IDerivationQueryTerm getSyntax() {
        return syntax;
    }

    public void setSyntax(IDerivationQueryTerm syntax) {
        this.syntax = syntax;
    }
}
