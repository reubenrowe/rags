package rnsr.rag.derivation;

import rnsr.rag.derivation.Interface.IDerivationAnswerTerm;
import rnsr.rag.derivation.Interface.IDerivationConfigurationTerm;
import rnsr.rag.derivation.Interface.IDerivationQueryTerm;
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
        DerivationPolynomial poly = (DerivationPolynomial) p.getDerivationObject().resolve(bindings);
        //System.out.println(poly);

        DerivationPolynomial poly2 = new DerivationPolynomial();
        if (poly.size() > 1) {
            for (IDerivationQueryTerm qt: poly) {
                if (!(qt instanceof DerivationLambda) &&
                        !(qt instanceof DerivationPolynomial && ((DerivationPolynomial) qt).onlyLambda()))
                    poly2.add(qt);
            }
        } else {
            poly2 = poly;
        }


        return poly2;
    }

    public boolean match(IDerivationConfigurationTerm other) {

        return true;

    }

}
