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
}
