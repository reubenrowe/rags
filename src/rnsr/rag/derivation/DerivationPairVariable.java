package rnsr.rag.derivation;

import rnsr.rag.derivation.Interface.IDerivationConfigurationTerm;
import rnsr.rag.grammar.Variable;
import rnsr.rag.grammar.VariableSet;

public class DerivationPairVariable implements IDerivationConfigurationTerm {

    private DerivationPolynomial polynomial;
    private Variable variable;
    private int id;

    public DerivationPairVariable(DerivationPolynomial polynomial, Variable variable, int id) {
        this.polynomial = polynomial;
        this.variable = variable;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    public String toString() {
        return "<" + polynomial + ", " + variable + ">";
    }

    public IDerivationConfigurationTerm resolve(VariableSet bindings) {

        DerivationConfiguration dc1 = new DerivationConfiguration();
        DerivationPolynomial p = (DerivationPolynomial) polynomial.resolve(bindings);
        dc1.add(p);

        DerivationConfiguration dc2 = new DerivationConfiguration();
        DerivationPolynomial dp = (DerivationPolynomial) bindings.get(variable).getDerivationObject().resolve(bindings);
        dc2.add(dp);

        return new DerivationPair(dc1, dc2);
    }

    public IDerivationConfigurationTerm applyQuery(int queryID, DerivationConfiguration step) {
        return new DerivationPairVariable((DerivationPolynomial) polynomial.applyQuery(queryID, step), variable, id);
    }

    public boolean match(IDerivationConfigurationTerm other) {
        if (!(other instanceof DerivationPairVariable)) return false;
        DerivationPairVariable otherPair = (DerivationPairVariable) other;
        return this.polynomial.match(otherPair.polynomial);
    }

}
