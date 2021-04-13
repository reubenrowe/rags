package rnsr.rag.derivation;

import rnsr.rag.derivation.Interface.IDerivationConfigurationTerm;
import rnsr.rag.derivation.Interface.IDerivationQueryTerm;
import rnsr.rag.grammar.VariableSet;

public class DerivationQuery implements IDerivationQueryTerm {

    private DerivationConfiguration metaSyntax;
    private DerivationConfiguration syntax;
    private int id;

    public DerivationQuery(DerivationConfiguration metaSyntax, DerivationConfiguration syntax, int id) {
        this.metaSyntax = metaSyntax;
        this.syntax = syntax;
        this.id = id;
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

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DerivationQuery resolve(VariableSet bindings) {
        return new DerivationQuery(metaSyntax.resolve(bindings), syntax.resolve(bindings), id);
    }

    public IDerivationConfigurationTerm applyQuery(int queryID, DerivationConfiguration step) {
        if (queryID != id)
            return new DerivationQuery(metaSyntax.applyQuery(queryID, step), syntax.applyQuery(queryID, step), id);

        DerivationConfiguration newSyntax = new DerivationConfiguration();
        newSyntax.add(new DerivationInverse(step));
        return new DerivationQuery(metaSyntax, newSyntax, id);
    }

    public boolean match(IDerivationConfigurationTerm other) {
        if (!(other instanceof DerivationQuery)) return false;
        DerivationQuery otherQuery = (DerivationQuery) other;
        return metaSyntax.match(otherQuery.metaSyntax) && syntax.match(otherQuery.syntax);
    }

    public String toString() {
        return "(" + metaSyntax + "?" + syntax + ")";
    }

    public DerivationQuery clone() {
        return new DerivationQuery(metaSyntax.clone(), syntax.clone(), id);
    }

}