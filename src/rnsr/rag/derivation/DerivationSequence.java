package rnsr.rag.derivation;

import rnsr.rag.derivation.Enum.Algebra;
import rnsr.rag.derivation.Interface.IDerivationTerm;
import rnsr.rag.grammar.InstantiatedRule;
import rnsr.rag.grammar.VariableSet;

import java.util.ArrayList;
import java.util.Collections;

public class DerivationSequence extends ArrayList<DerivationTerm> {

    VariableSet originalBindings;

    public DerivationSequence() {
        this(null);
    }

    public DerivationSequence(VariableSet originalBindings) {
        this.originalBindings = originalBindings;
    }

    public VariableSet getOriginalBindings() {
        return originalBindings;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < this.size(); i++) {
            s += this.get(i);
            if (i < this.size() - 1) s += "\n => ";
        }
        return s;
    }

    public DerivationSequence resolve() {
        DerivationSequence ds = new DerivationSequence(originalBindings);
        for (DerivationTerm dc: this) ds.add(dc.resolve(originalBindings));
        return ds;
    }

    public void applyStep(int pairID, InstantiatedRule rule) {
        DerivationTerm tailConfiguration = this.get(this.size() - 1);
        this.add(tailConfiguration.applyStep(pairID, rule, originalBindings));
    }

    public void applyQuery(int queryID, DerivationSequence querySequence, IDerivationTerm result) {

        DerivationSequence invertedSeq = querySequence.reverseAndInvert();
        DerivationTerm head = this.remove(this.size() - 1);
        DerivationQuery parent = (DerivationQuery) head.findQuery(queryID);

        DerivationSequence embedded = new DerivationSequence();
        for (DerivationTerm dt: invertedSeq)
            embedded.add(new DerivationTerm(new DerivationQuery(parent.getMetaSyntax(), dt, parent.getId())));

        DerivationSequence finalEmbed = new DerivationSequence();
        for (int i = embedded.size() - 1; i >= 0; i--)
            finalEmbed.add(head.clone().replaceQuery(queryID, embedded.get(i)));

        finalEmbed = finalEmbed.reverseSequence();

        for (DerivationTerm dt: finalEmbed) this.add(dt);

    }

    public void applyQueryReverse(int queryID, DerivationSequence querySequence, IDerivationTerm result) {

        int last = getLastMentionQueryIndex(queryID);

        DerivationSequence invertedSeq = querySequence.reverseAndInvert();
        DerivationTerm firstQueryMentionStep = this.remove(last);
        DerivationQuery parent = (DerivationQuery) firstQueryMentionStep.findQuery(queryID);

        DerivationSequence embedded = new DerivationSequence();
        for (DerivationTerm dt: invertedSeq)
            embedded.add(new DerivationTerm(new DerivationQuery(parent.getMetaSyntax(), dt, parent.getId())));
        embedded.add(new DerivationTerm(result));

        // Check at this point if the parent query is part of another query - if not thne we apply inverse, if so, we only reverse
        // invertedSeq = embedded.reverseAndInvert();
        if (firstQueryMentionStep.queryIsSubQuery(queryID))
            invertedSeq = embedded.reverseSequence();
        else
            invertedSeq = embedded.reverseAndInvert();

        DerivationSequence finalEmbed = new DerivationSequence();
        for (int i = invertedSeq.size() - 1; i >= 0; i--)
            finalEmbed.add(firstQueryMentionStep.clone().replaceQuery(queryID, invertedSeq.get(i)));

        for (DerivationTerm dt: finalEmbed) this.add(last, dt);

        // Replace all previous mentions of this query with its result
        for (int i = last-1; i >= 0; i--) this.set(i, this.get(i).replaceQuery(queryID, new DerivationTerm(result)));

    }

    public int getLastMentionQueryIndex(int queryID) {
        int n = -1;
        for (int i = 0; i < this.size(); i++) {
            IDerivationTerm dt = this.get(i).findQuery(queryID);
            if (dt == null || !((DerivationQuery) dt).isRewritable()) continue;
            n = i;
        }

        for (int i = n + 1; i < this.size(); i++)
            this.set(i, this.get(i).applyInvertToPreviousQueries(queryID));
        return n;
    }

    public DerivationSequence reverseSequence() {
        DerivationSequence cloneDS = this.clone();
        Collections.reverse(cloneDS);
        return cloneDS;
    }

    public DerivationSequence reverseAndInvert() {
        DerivationSequence cloneDS = this.clone();
        Collections.reverse(cloneDS);
        return cloneDS.applyInverse(cloneDS);
    }

    public DerivationSequence applyInverse(DerivationSequence sequence) {
        DerivationSequence invertedSequence = new DerivationSequence(null);
        for (DerivationTerm dt: sequence) {
            if (dt.termAlgebra().equals(Algebra.ANSWER) || dt.termAlgebra().equals(Algebra.TERMINAL))
                invertedSequence.add(dt);
            else
                invertedSequence.add(new DerivationTerm(new DerivationInverse(dt)));
        }
        return invertedSequence;
    }

    public DerivationSequence applyInvertToPreviousQueries(int queryID) {
        DerivationSequence sequenceWithQueryInvert = new DerivationSequence();
        for (DerivationTerm dt: this) sequenceWithQueryInvert.add(dt.applyInvertToPreviousQueries(queryID));
        return sequenceWithQueryInvert;
    }

    public DerivationSequence clone() {
        DerivationSequence newSeq = new DerivationSequence(originalBindings);
        for (DerivationTerm c: this) newSeq.add(c.clone());
        return newSeq;
    }

    public DerivationSequence removeSurroundedLambdas() {
        DerivationSequence ds = new DerivationSequence();
        for (DerivationTerm dt: this) {
            DerivationTerm dt2 = dt.removeSurroundedLambdas();
            if (dt2.size() > 0) ds.add(dt.removeSurroundedLambdas());
        }
        return ds;
    }

}
