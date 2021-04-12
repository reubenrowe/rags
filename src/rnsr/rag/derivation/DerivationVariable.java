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

    public boolean match(IDerivationConfigurationTerm other) {

        return true;

    }

}
