package rnsr.rag.grammar;

import rnsr.rag.derivation.DerivationSequence;

import java.util.ArrayList;

public class SubQuery {

    private int queryID;
    private DerivationSequence sequence;
    private ExtendedAnswer result;
    private ArrayList<SubQuery> childQueries;

    public SubQuery(int queryID, DerivationSequence sequence, ExtendedAnswer result, ArrayList<SubQuery> childQueries) {
        this.queryID = queryID;
        this.sequence = sequence;
        this.result = result;
        this.childQueries = childQueries;
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

    public void setSequence(DerivationSequence sequence) {
        this.sequence = sequence;
    }

    public ArrayList<SubQuery> getChildQueries() {
        return childQueries;
    }

    public void setChildQueries(ArrayList<SubQuery> childQueries) {
        this.childQueries = childQueries;
    }

    public ArrayList<SubQuery> getSubQueryOrder() {
        ArrayList<SubQuery> order = new ArrayList<>();
        order.addAll(this.childQueries);
        order.add(this);
        return order;
    }

}
