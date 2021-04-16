package rnsr.rag.derivation;

import rnsr.rag.derivation.Enum.Algebra;
import rnsr.rag.derivation.Interface.IDerivationTerm;
import rnsr.rag.grammar.Polynomial;
import rnsr.rag.grammar.Variable;
import rnsr.rag.grammar.VariableSet;

public class DerivationVariable implements IDerivationTerm {

    private Variable variable;

    public DerivationVariable(Variable variable) {
        this.variable = variable;
    }

    public IDerivationTerm resolve(VariableSet bindings) {
        Polynomial p = bindings.get(variable);
        Variable v;
        while (p.onlyVariable()) {
            v = (Variable) p.get(0);
            p = bindings.get(v);
        }
        DerivationTerm poly2 = p.getDerivationObject().resolve(bindings);
        return poly2;
    }

    public IDerivationTerm applyQuery(int queryID, DerivationTerm step) {
        return this;
    }

    public IDerivationTerm applyQueryReverse(int queryID, DerivationTerm step) {
        return this;
    }

    public DerivationVariable clone() {
        return new DerivationVariable(variable);
    }

    public IDerivationTerm replaceQuery(int queryID, DerivationTerm config) {
        return new DerivationVariable(variable);
    }

    public Algebra termAlgebra() {
        return Algebra.ANSWER;
    }

    public IDerivationTerm findQuery(int queryID) {
        return null;
    }

}
