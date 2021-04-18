package rnsr.rag.derivation;

import rnsr.rag.derivation.Enum.Algebra;
import rnsr.rag.derivation.Interface.IDerivationTerm;
import rnsr.rag.grammar.VariableSet;

public class DerivationInverse implements IDerivationTerm {

    private IDerivationTerm contents;

    public DerivationInverse(IDerivationTerm contents) {
        this.contents = contents;
    }

    public IDerivationTerm getContents() {
        return contents;
    }

    public void setContents(IDerivationTerm contents) {
        this.contents = contents;
    }

    public IDerivationTerm resolve(VariableSet bindings) {
        return new DerivationInverse(contents.resolve(bindings));
    }

    public IDerivationTerm applyQuery(int queryID, DerivationTerm step) {
        return new DerivationInverse(contents.applyQuery(queryID, step));
    }

    public IDerivationTerm applyQueryReverse(int queryID, DerivationTerm step) {
        return new DerivationInverse(contents.applyQueryReverse(queryID, step));
    }

    public String toString() {
        return "!(" + contents + ")";
    }

    public DerivationInverse clone() {
        return new DerivationInverse(contents.clone());
    }

    public DerivationInverse replaceQuery(int queryID, DerivationTerm config) {
        return new DerivationInverse(contents.replaceQuery(queryID, config));

    }

    public Algebra termAlgebra() {
        return Algebra.CONFIGURATION;
    }

    public IDerivationTerm findQuery(int queryID) {
        return contents.findQuery(queryID);
    }

    public IDerivationTerm removeSurroundedLambdas() {
        return new DerivationInverse(contents.removeSurroundedLambdas());
    }

    public IDerivationTerm applyInvertToPreviousQueries(int queryID) {
        return new DerivationInverse(contents.applyInvertToPreviousQueries(queryID));
    }


}
