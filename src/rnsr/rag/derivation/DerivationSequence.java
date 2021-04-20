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

        DerivationSequence invertedSeq = querySequence.reverseSequence();
        DerivationTerm head = this.remove(this.size() - 1);
        DerivationQuery parent = (DerivationQuery) head.findQuery(queryID);

        DerivationSequence embedded = new DerivationSequence();
        for (DerivationTerm dt: invertedSeq)
            embedded.add(new DerivationTerm(new DerivationQuery(parent.getMetaSyntax(), dt, parent.getId())));
        //embedded.add(new DerivationTerm(result));

        DerivationSequence finalEmbed = new DerivationSequence();
        for (int i = embedded.size() - 1; i >= 0; i--) {
            finalEmbed.add(head.clone().replaceQuery(queryID, embedded.get(i)));
            DerivationQuery.doneReplace = false;
        }

        Collections.reverse(finalEmbed);

        for (DerivationTerm dt: finalEmbed) this.add(dt);

    }

    public void applyQueryReverse(int queryID, DerivationSequence querySequence, IDerivationTerm result) {

        /*
        DerivationSequence invertedSeq = querySequence.reverseSequence();
        DerivationTerm head = this.remove(0);
        DerivationQuery parent = (DerivationQuery) head.findQuery(queryID);

        DerivationSequence embedded = new DerivationSequence();
        for (DerivationTerm dt: invertedSeq)
            embedded.add(new DerivationTerm(new DerivationQuery(parent.getMetaSyntax(), dt, parent.getId())));
        embedded.add(new DerivationTerm(result));
        invertedSeq = embedded.reverseSequence();

        DerivationSequence finalEmbed = new DerivationSequence();
        for (int i = invertedSeq.size() - 1; i >= 0; i--) {
            finalEmbed.add(head.clone().replaceQuery(queryID, invertedSeq.get(i)));
            DerivationQuery.doneReplace = false;
        }

        DerivationSequence invertedPrevious = this.applyInvertToPreviousQueries(queryID);
        for (int i = 0; i < this.size(); i++) {
            this.set(i, invertedPrevious.get(i));
            DerivationQuery.doneReplace = false;
        }
        for (DerivationTerm dt: finalEmbed) this.add(0, dt);
         */

        int first = this.getFirstMentionQueryIndex(queryID);

        /*
        System.out.println("First mention of query " + queryID + ": " + first);
        for (int i = first; i >= 0; i--) {
            System.out.println("\tFound this query in index " + i + "? - " + this.get(i).findQuery(queryID));
        }
         */

        DerivationSequence invertedSeq = querySequence.reverseSequence();
        DerivationTerm firstQueryMentionStep = this.remove(first);
        DerivationQuery parent = (DerivationQuery) firstQueryMentionStep.findQuery(queryID);

        DerivationSequence embedded = new DerivationSequence();
        for (DerivationTerm dt: invertedSeq)
            embedded.add(new DerivationTerm(new DerivationQuery(parent.getMetaSyntax(), dt, parent.getId())));
        embedded.add(new DerivationTerm(result));
        invertedSeq = embedded.reverseSequence();

        DerivationSequence finalEmbed = new DerivationSequence();
        for (int i = invertedSeq.size() - 1; i >= 0; i--) {
            finalEmbed.add(firstQueryMentionStep.clone().replaceQuery(queryID, invertedSeq.get(i)));
            DerivationQuery.doneReplace = false;
        }

        /*
        DerivationSequence invertedPrevious = this.applyInvertToPreviousQueries(queryID);
        for (int i = 0; i < this.size(); i++) {
            this.set(i, invertedPrevious.get(i));
            DerivationQuery.doneReplace = false;
        }

         */

        Collections.reverse(finalEmbed);
        this.addAll(first, finalEmbed);

        for (int i = first-1; i >= 0; i--) {
            this.set(i, this.get(i).replaceQuery(queryID, new DerivationTerm(result)));
            DerivationQuery.doneReplace = false;
        }

    }

    public int getFirstMentionQueryIndex(int queryID) {
        int n = -1;
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).findQuery(queryID) != null) n = i;
        }
        return n;
    }

    public DerivationSequence reverseSequence() {
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
        for (DerivationTerm dt: this) {
            sequenceWithQueryInvert.add(dt.applyInvertToPreviousQueries(queryID));
            DerivationQuery.doneReplace = false;
        }
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
