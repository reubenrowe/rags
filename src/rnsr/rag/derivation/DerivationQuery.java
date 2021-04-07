package rnsr.rag.derivation;

import rnsr.rag.derivation.Interface.IDerivationQueryTerm;

public class DerivationQuery implements IDerivationQueryTerm {

    private DerivationConfiguration metaSyntax;
    private DerivationConfiguration syntax;

    public DerivationQuery(DerivationConfiguration metaSyntax, DerivationConfiguration syntax) {
        this.metaSyntax = metaSyntax;
        this.syntax = syntax;
    }

    public DerivationConfiguration getMetaSyntax() {
        return metaSyntax;
    }

    public void setMetaSyntax(DerivationConfiguration metaSyntax) {
        this.metaSyntax = metaSyntax;
    }

    public DerivationConfiguration getSyntax() {
        return syntax;
    }

    public void setSyntax(DerivationConfiguration syntax) {
        this.syntax = syntax;
    }

}
