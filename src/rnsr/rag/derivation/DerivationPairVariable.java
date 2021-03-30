package rnsr.rag.derivation;

import rnsr.rag.derivation.Interface.IDerivationConfigurationTerm;
import rnsr.rag.grammar.Variable;

public class DerivationPairVariable implements IDerivationConfigurationTerm {

    private DerivationAnswer answer;
    private Variable variable;

    public DerivationAnswer getAnswer() {
        return answer;
    }

    public void setAnswer(DerivationAnswer answer) {
        this.answer = answer;
    }

    public Variable getVariable() {
        return variable;
    }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }

}
