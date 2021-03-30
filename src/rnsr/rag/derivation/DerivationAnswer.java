package rnsr.rag.derivation;

import rnsr.rag.derivation.Interface.IDerivationConfigurationTerm;
import rnsr.rag.derivation.Interface.IDerivationQueryTerm;

import java.util.ArrayList;

public class DerivationAnswer implements IDerivationConfigurationTerm, IDerivationQueryTerm {

    ArrayList<DerivationTerminal> terminals = new ArrayList<DerivationTerminal>();

}
