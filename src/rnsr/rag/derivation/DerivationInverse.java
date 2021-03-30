package rnsr.rag.derivation;

import rnsr.rag.derivation.Interface.IDerivationConfigurationTerm;
import rnsr.rag.derivation.Interface.IDerivationQueryTerm;

public class DerivationInverse implements IDerivationConfigurationTerm, IDerivationQueryTerm {

    private IDerivationConfigurationTerm contents;

    public IDerivationConfigurationTerm getContents() {
        return contents;
    }

    public void setContents(IDerivationConfigurationTerm contents) {
        this.contents = contents;
    }

}
