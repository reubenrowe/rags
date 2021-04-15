package rnsr.rag.derivation;

import rnsr.rag.derivation.Interface.IDerivationAnswerTerm;
import rnsr.rag.derivation.Interface.IDerivationConfigurationTerm;
import rnsr.rag.grammar.Polynomial;
import rnsr.rag.grammar.Variable;
import rnsr.rag.grammar.VariableSet;

public class DerivationVariable implements IDerivationAnswerTerm {

    private Variable variable;

    public DerivationVariable(Variable variable) {
        this.variable = variable;
    }

    public IDerivationConfigurationTerm resolve(VariableSet bindings) {
        Polynomial p = bindings.get(variable);
        Variable v;
        while (p.onlyVariable()) {
            v = (Variable) p.get(0);
            p = bindings.get(v);
        }
        DerivationPolynomial poly2 = (DerivationPolynomial) p.getDerivationObject().resolve(bindings);
        return poly2;
    }

    public IDerivationConfigurationTerm applyQuery(int queryID, DerivationConfiguration step) {
        return this;
    }

    public IDerivationConfigurationTerm applyQueryReverse(int queryID, DerivationConfiguration step, boolean isLeft) {
        return this;
    }

    public boolean match(IDerivationConfigurationTerm other) {
        return true;
    }

    public DerivationVariable clone() {
        return new DerivationVariable(variable);
    }

    public IDerivationConfigurationTerm replaceQuery(int queryID, DerivationConfiguration config) {
        return new DerivationVariable(variable);
    }

}
