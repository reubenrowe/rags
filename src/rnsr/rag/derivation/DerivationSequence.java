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
        for (int i = 0; i < this.size(); i++) this.set(i, invertedPrevious.get(i));

        for (DerivationTerm dt: finalEmbed) this.add(0, dt);

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
