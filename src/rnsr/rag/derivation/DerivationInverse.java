package rnsr.rag.derivation;

import rnsr.rag.derivation.Interface.IDerivationConfigurationTerm;
import rnsr.rag.grammar.VariableSet;

public class DerivationInverse implements IDerivationConfigurationTerm {

    private IDerivationConfigurationTerm contents;

    public DerivationInverse(IDerivationConfigurationTerm contents) {
        this.contents = contents;
    }

    public IDerivationConfigurationTerm getContents() {
        return contents;
    }

    public void setContents(IDerivationConfigurationTerm contents) {
        this.contents = contents;
    }

    public IDerivationConfigurationTerm resolve(VariableSet bindings) {
        return new DerivationInverse(contents.resolve(bindings));
    }

    public IDerivationConfigurationTerm applyQuery(int queryID, DerivationConfiguration step) {
        return new DerivationInverse(contents.applyQuery(queryID, step));
    }

    public IDerivationConfigurationTerm applyQueryReverse(int queryID, DerivationConfiguration step, boolean isLeft) {
        return new DerivationInverse(contents.applyQueryReverse(queryID, step, isLeft));
    }

    public boolean match(IDerivationConfigurationTerm other) {
        if (!(other instanceof DerivationInverse)) return false;
        return contents.match(((DerivationInverse) other).contents);
    }

    public String toString() {
        return "!(" + contents + ")";
    }

    public DerivationInverse clone() {
        return new DerivationInverse(contents.clone());
    }

    public DerivationInverse replaceQuery(int queryID, DerivationConfiguration config) {
        return new DerivationInverse(contents.replaceQuery(queryID, config));

    }

}
