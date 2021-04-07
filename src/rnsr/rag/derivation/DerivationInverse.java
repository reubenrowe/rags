package rnsr.rag.derivation;

import rnsr.rag.derivation.Interface.IDerivationConfigurationTerm;

public class DerivationInverse implements IDerivationConfigurationTerm {

    private IDerivationConfigurationTerm contents;

    public IDerivationConfigurationTerm getContents() {
        return contents;
    }

    public void setContents(IDerivationConfigurationTerm contents) {
        this.contents = contents;
    }

}
