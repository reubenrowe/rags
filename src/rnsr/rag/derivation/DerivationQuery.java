package rnsr.rag.derivation;

import rnsr.rag.derivation.Interface.IDerivationConfigurationTerm;
import rnsr.rag.derivation.Interface.IDerivationQueryTerm;
import rnsr.rag.grammar.VariableSet;

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

    public DerivationQuery resolve(VariableSet bindings) {
        return new DerivationQuery(metaSyntax.resolve(bindings), syntax.resolve(bindings));
    }

    public boolean match(IDerivationConfigurationTerm other) {
        if (!(other instanceof DerivationQuery)) return false;
        DerivationQuery otherQuery = (DerivationQuery) other;
        return metaSyntax.match(otherQuery.metaSyntax) && syntax.match(otherQuery.syntax);
    }

}
