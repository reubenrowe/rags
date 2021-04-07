package rnsr.rag.derivation;

import rnsr.rag.derivation.Interface.IDerivationConfigurationTerm;
import rnsr.rag.grammar.Variable;

public class DerivationPairVariable implements IDerivationConfigurationTerm {

    private DerivationPolynomial polynomial;
    private Variable variable;

    public DerivationPairVariable(DerivationPolynomial polynomial, Variable variable) {
        this.polynomial = polynomial;
        this.variable = variable;
    }

    public DerivationPolynomial getAnswer() {
        return polynomial;
    }

    public void setAnswer(DerivationPolynomial polynomial) {
        this.polynomial = polynomial;
    }

    public Variable getVariable() {
        return variable;
    }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }

}
