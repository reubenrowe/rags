package rnsr.rag.derivation;

import rnsr.rag.derivation.Interface.IDerivationConfigurationTerm;
import rnsr.rag.grammar.Variable;
import rnsr.rag.grammar.VariableSet;

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

    public String toString() {
        return "<" + polynomial + ", " + variable + ">";
    }

    public IDerivationConfigurationTerm resolve(VariableSet bindings) {
        DerivationConfiguration dc1 = new DerivationConfiguration();
        dc1.add(polynomial);
        DerivationConfiguration dc2 = new DerivationConfiguration();
        DerivationPolynomial dp = (DerivationPolynomial) bindings.get(variable).getDerivationObject().resolve(bindings);
        dc2.add(dp);
        return new DerivationPair(dc1, dc2);
    }
}
