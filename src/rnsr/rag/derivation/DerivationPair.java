package rnsr.rag.derivation;

import rnsr.rag.derivation.Interface.IDerivationConfigurationTerm;

public class DerivationPair implements IDerivationConfigurationTerm {

    private DerivationAnswer answer;
    private DerivationQuery query;

    public DerivationAnswer getAnswer() {
        return answer;
    }

    public void setAnswer(DerivationAnswer answer) {
        this.answer = answer;
    }

    public DerivationQuery getQuery() {
        return query;
    }

    public void setQuery(DerivationQuery query) {
        this.query = query;
    }

}
