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

    public boolean match(IDerivationConfigurationTerm other) {
        if (!(other instanceof DerivationInverse)) return false;
        return contents.match(((DerivationInverse) other).contents);
    }

    public String toString() {
        return "!(" + contents + ")";
    }

}
