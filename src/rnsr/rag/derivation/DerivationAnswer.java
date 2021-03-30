package rnsr.rag.derivation;

import rnsr.rag.derivation.Interface.IDerivationAnswerTerm;
import rnsr.rag.derivation.Interface.IDerivationConfigurationTerm;
import rnsr.rag.derivation.Interface.IDerivationQueryTerm;

import java.util.ArrayList;

public class DerivationAnswer extends ArrayList<IDerivationAnswerTerm> implements IDerivationConfigurationTerm, IDerivationQueryTerm {

}
