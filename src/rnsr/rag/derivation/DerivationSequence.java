package rnsr.rag.derivation;

import rnsr.rag.grammar.InstantiatedRule;
import rnsr.rag.grammar.VariableSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class DerivationSequence extends ArrayList<DerivationConfiguration> {

    VariableSet originalBindings;
    HashMap<Integer, DerivationPolynomial> subSequenceMap;

    public DerivationSequence(VariableSet originalBindings) {
        this.originalBindings = originalBindings;
        this.subSequenceMap = new HashMap<>();
    }

    public VariableSet getOriginalBindings() {
        return originalBindings;
    }

    public void setOriginalBindings(VariableSet originalBindings) {
        this.originalBindings = originalBindings;
    }

    public HashMap<Integer, DerivationPolynomial> getSubsequenceMap() {
        return subSequenceMap;
    }

    public void setSubSequenceMap(HashMap<Integer, DerivationPolynomial> subSequenceMap) {
        this.subSequenceMap = subSequenceMap;
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
        for (DerivationConfiguration dc: this) ds.add(dc.resolve(originalBindings));
        return ds;
    }

    public void applyStep(int pairID, InstantiatedRule rule) {
        DerivationConfiguration tailConfiguration = this.get(this.size() - 1);
        this.add(tailConfiguration.applyStep(pairID, rule, originalBindings));
    }

    public void applyQuery(int queryID, DerivationSequence querySequence) {
        Collections.reverse(querySequence);
        DerivationConfiguration tailConfiguration = this.get(this.size() - 1);
        querySequence.remove(0);
        for (DerivationConfiguration dc: querySequence) {
            this.add(tailConfiguration.applyQuery(queryID, dc));
            tailConfiguration = this.get(this.size() - 1);
        }
    }

    public void applyQueryReverse(int queryID, DerivationSequence querySequence, boolean isLeft) {
        Collections.reverse(querySequence);
        querySequence.remove(0);
        DerivationConfiguration headConfiguration = this.get(0);
        DerivationConfiguration last = querySequence.get(querySequence.size() - 1);
        for (DerivationConfiguration dc: querySequence) {
            headConfiguration = headConfiguration.applyQueryReverse(queryID, dc, isLeft);
            this.add(0, headConfiguration);
        }
        this.add(0, headConfiguration.replaceQuery(queryID, last));
    }

    public void putQueryResult(int queryID, DerivationPolynomial result) {
        subSequenceMap.put(queryID, result);
    }



    public DerivationSequence merge(DerivationSequence other) {

        // Merging the variable bindings for both old derivation sequences
        VariableSet newBindings = new VariableSet();
        newBindings.putAll(this.getOriginalBindings());
        newBindings.putAll(other.getOriginalBindings());
        DerivationSequence newDS = new DerivationSequence(newBindings);

        DerivationConfiguration otherHead = other.remove(0);
        DerivationSequence appended = this.append(otherHead);
        DerivationConfiguration tailConfiguration = this.get(this.size() - 1);

        for (DerivationConfiguration cStep: other) {
            DerivationConfiguration newStep = tailConfiguration.clone();
            newStep.addAll(cStep);
            appended.add(newStep);
        }

        return newDS;

    }

    /**
     * Simply appends a configuration to the end of all steps in this derivation sequence
     * @param other
     * @return
     */
    public DerivationSequence append(DerivationConfiguration other) {
        DerivationSequence ds = new DerivationSequence(originalBindings);
        for (DerivationConfiguration dc: this) dc.addAll(other);
        return ds;
    }

    public DerivationSequence clone() {
        DerivationSequence newSeq = new DerivationSequence(originalBindings);
        HashMap<Integer, DerivationPolynomial> newSubSequenceMap = new HashMap<>();
        for (int k: subSequenceMap.keySet()) newSubSequenceMap.put(k, subSequenceMap.get(k).clone());
        newSeq.setSubSequenceMap(newSubSequenceMap);
        for (DerivationConfiguration c: this) newSeq.add(c.clone());
        return newSeq;
    }

}
