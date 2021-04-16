package rnsr.rag.derivation;

import rnsr.rag.derivation.Enum.Algebra;
import rnsr.rag.derivation.Interface.IDerivationTerm;
import rnsr.rag.grammar.VariableSet;

public class DerivationQuery implements IDerivationTerm {

    private DerivationTerm metaSyntax;
    private DerivationTerm syntax;
    private int id;

    public DerivationQuery(DerivationTerm metaSyntax, DerivationTerm syntax, int id) {
        this.metaSyntax = metaSyntax;
        this.syntax = syntax;
        this.id = id;
    }

    public DerivationTerm getMetaSyntax() {
        return metaSyntax;
    }

    public void setMetaSyntax(DerivationTerm metaSyntax) {
        this.metaSyntax = metaSyntax;
    }

    public DerivationTerm getSyntax() {
        return syntax;
    }

    public void setSyntax(DerivationTerm syntax) {
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

    public IDerivationTerm applyQuery(int queryID, DerivationTerm step) {
        if (queryID != id)
            return new DerivationQuery(metaSyntax.applyQuery(queryID, step), syntax.applyQuery(queryID, step), id);

        DerivationTerm newSyntax = new DerivationTerm();
        newSyntax.add(new DerivationInverse(step));
        return new DerivationQuery(metaSyntax, newSyntax, id);
    }

    public IDerivationTerm applyQueryReverse(int queryID, DerivationTerm step) {
        if (queryID != id)
            return new DerivationQuery(metaSyntax.applyQuery(queryID, step), syntax.applyQuery(queryID, step), id);

        DerivationTerm newStep = new DerivationTerm();
        newStep.add(new DerivationInverse(step));
        return new DerivationQuery(metaSyntax, newStep, id);
    }

    public boolean match(IDerivationTerm other) {
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

    public IDerivationTerm replaceQuery(int queryID, DerivationTerm config) {
        if (this.id != queryID) return new DerivationQuery(metaSyntax.replaceQuery(queryID, config), syntax.replaceQuery(queryID, config), id);
        return config;
        //DerivationPair dp = (DerivationPair) config.get(0);
        //DerivationTerm dPoly = new DerivationTerm();
        //for (IDerivationTerm ct: dp.getRight()) dPoly.add(ct);
        //return dPoly;
    }

    public Algebra termAlgebra() {
        Algebra currentAlgebraLevel = Algebra.QUERY;
        currentAlgebraLevel = currentAlgebraLevel.compare(metaSyntax.termAlgebra());
        currentAlgebraLevel = currentAlgebraLevel.compare(syntax.termAlgebra());
        return currentAlgebraLevel;
    }

    public IDerivationTerm findQuery(int queryID) {
        if (queryID != this.id) {
            IDerivationTerm dt1 = metaSyntax.findQuery(queryID);
            IDerivationTerm dt2 = syntax.findQuery(queryID);
            return (dt1 != null) ? dt1 : (dt2 != null) ? dt2 : null;
        }
        return this;
    }

}