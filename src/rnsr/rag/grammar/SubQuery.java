package rnsr.rag.grammar;

import rnsr.rag.derivation.DerivationSequence;

public class SubQuery {

    private int queryID;
    private DerivationSequence sequence;
    private ExtendedAnswer result;

    public SubQuery(int queryID, DerivationSequence sequence, ExtendedAnswer result) {
        this.queryID = queryID;
        this.sequence = sequence;
        this.result = result;
    }

    public ExtendedAnswer getResult() {
        return result;
    }

    public void setResult(ExtendedAnswer result) {
        this.result = result;
    }

    public int getQueryID() {
        return queryID;
    }

    public void setQueryID(int queryID) {
        this.queryID = queryID;
    }

    public DerivationSequence getSequence() {
        return sequence;
    }

}
