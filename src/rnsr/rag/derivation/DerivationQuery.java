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

    public IDerivationConfigurationTerm applyQueryReverse(int queryID, DerivationConfiguration step, boolean isLeft) {
        if (queryID != id)
            return new DerivationQuery(metaSyntax.applyQuery(queryID, step), syntax.applyQuery(queryID, step), id);

        DerivationConfiguration newStep = new DerivationConfiguration();
        newStep.add(new DerivationInverse(step));
        return (isLeft) ? new DerivationQuery(newStep, syntax, id) : new DerivationQuery(metaSyntax, newStep, id);
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

    public IDerivationConfigurationTerm replaceQuery(int queryID, DerivationConfiguration config) {
        if (this.id != queryID) return new DerivationQuery(metaSyntax.replaceQuery(queryID, config), syntax.replaceQuery(queryID, config), id);
        DerivationPair dp = (DerivationPair) config.get(0);
        DerivationPolynomial dPoly = new DerivationPolynomial();
        for (IDerivationConfigurationTerm ct: dp.getRight()) dPoly.add((IDerivationQueryTerm) ct);
        return dPoly;
    }

}