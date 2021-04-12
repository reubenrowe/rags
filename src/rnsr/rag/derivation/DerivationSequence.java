package rnsr.rag.derivation;

import rnsr.rag.grammar.InstantiatedRule;
import rnsr.rag.grammar.VariableSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class DerivationSequence extends ArrayList<DerivationConfiguration> {

    VariableSet originalBindings;
    HashMap<Integer, DerivationSequence> subSequenceMap;

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

    public HashMap<Integer, DerivationSequence> getSubsequenceMap() {
        return subSequenceMap;
    }

    public void setSubSequenceMap(HashMap<Integer, DerivationSequence> subSequenceMap) {
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

    public void putSubQuerySequence(int queryID, DerivationSequence subSequence) {
        this.subSequenceMap.put(queryID, subSequence);
    }

}
