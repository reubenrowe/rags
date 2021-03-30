package rnsr.rag.derivation;

public class DerivationPair {

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
