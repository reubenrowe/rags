package rnsr.rag.derivation;

import rnsr.rag.derivation.Enum.Algebra;
import rnsr.rag.derivation.Interface.IDerivationTerm;
import rnsr.rag.grammar.VariableSet;

public class DerivationQuery implements IDerivationTerm {

    private DerivationTerm metaSyntax;
    private DerivationTerm syntax;
    private int id;

    public static boolean doneReplace = false;

    public DerivationQuery(DerivationTerm metaSyntax, DerivationTerm syntax, int id) {
        this.metaSyntax = metaSyntax;
        this.syntax = syntax;
        this.id = id;
    }

    public DerivationTerm getMetaSyntax() {
        return metaSyntax;
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

    public String toString() {
        return "(" + metaSyntax + "?" + syntax + ")";
    }

    public DerivationQuery clone() {
        return new DerivationQuery(metaSyntax.clone(), syntax.clone(), id);
    }

    public IDerivationTerm replaceQuery(int queryID, DerivationTerm config) {
        DerivationQuery sub = new DerivationQuery(metaSyntax.replaceQuery(queryID, config), syntax.replaceQuery(queryID, config), id);
        if (this.id == queryID && !doneReplace) {
            doneReplace = true;
            return config;
        }
        return sub;

    }

    public Algebra termAlgebra() {
        Algebra currentAlgebraLevel = Algebra.QUERY;
        currentAlgebraLevel = currentAlgebraLevel.compare(metaSyntax.termAlgebra());
        currentAlgebraLevel = currentAlgebraLevel.compare(syntax.termAlgebra());
        return currentAlgebraLevel;
    }

    public IDerivationTerm findQuery(int queryID) {
        IDerivationTerm dt1 = metaSyntax.findQuery(queryID);
        IDerivationTerm dt2 = syntax.findQuery(queryID);
        return (dt1 != null && (((DerivationQuery) dt1).id == queryID)) ? dt1 :
                (dt2 != null && (((DerivationQuery) dt2).id == queryID)) ? dt2 :
                        (this.id == queryID) ? this :
                                null;
    }

    public IDerivationTerm removeSurroundedLambdas() {
        return new DerivationQuery(metaSyntax.removeSurroundedLambdas(), syntax.removeSurroundedLambdas(), id);
    }

}