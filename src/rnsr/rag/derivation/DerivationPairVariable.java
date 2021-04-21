package rnsr.rag.derivation;

import rnsr.rag.derivation.Enum.Algebra;
import rnsr.rag.derivation.Interface.IDerivationTerm;
import rnsr.rag.grammar.Variable;
import rnsr.rag.grammar.VariableSet;

public class DerivationPairVariable implements IDerivationTerm {

    private DerivationTerm polynomial;
    private Variable variable;
    private int id;

    public DerivationPairVariable(DerivationTerm polynomial, Variable variable, int id) {
        this.polynomial = polynomial;
        this.variable = variable;
        this.id = id;
    }

    public DerivationTerm getAnswer() {
        return polynomial;
    }

    public void setAnswer(DerivationTerm polynomial) {
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

    public IDerivationTerm resolve(VariableSet bindings) {

        DerivationTerm dc1 = new DerivationTerm();
        DerivationTerm p = polynomial.resolve(bindings);
        dc1.add(p);

        DerivationTerm dc2 = new DerivationTerm();
        DerivationTerm dp = bindings.get(variable).getDerivationObject().resolve(bindings);

        dc2.add(dp);

        return new DerivationPair(dc1, dc2);
    }

    public IDerivationTerm applyQuery(int queryID, DerivationTerm step) {
        return new DerivationPairVariable(polynomial.applyQuery(queryID, step), variable, id);
    }

    public IDerivationTerm applyQueryReverse(int queryID, DerivationTerm step) {
        return new DerivationPairVariable(polynomial.applyQueryReverse(queryID, step), variable, id);
    }

    public DerivationPairVariable clone() {
        return new DerivationPairVariable(polynomial.clone(), variable, id);
    }

    public DerivationPairVariable replaceQuery(int queryID, DerivationTerm config) {
        return new DerivationPairVariable(polynomial.replaceQuery(queryID, config), variable, id);
    }

    public Algebra termAlgebra() {
        return Algebra.CONFIGURATION;
    }

    public IDerivationTerm findQuery(int queryID) {
        return polynomial.findQuery(queryID);
    }

    public IDerivationTerm removeSurroundedLambdas() {
        return new DerivationPairVariable(polynomial.removeSurroundedLambdas(), variable, id);
    }

    public IDerivationTerm applyInvertToPreviousQueries(int queryID) {
        return new DerivationPairVariable(polynomial.applyInvertToPreviousQueries(queryID), variable, id);
    }

    public boolean queryIsSubQuery(int queryID) {
        return polynomial.queryIsSubQuery(queryID);
    }

}
