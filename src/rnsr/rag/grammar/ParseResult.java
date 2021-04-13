package rnsr.rag.grammar;

import rnsr.rag.derivation.DerivationConfiguration;
import rnsr.rag.derivation.DerivationSequence;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ParseResult {

    private ExtendedAnswer result;
    private Query original;
    private DerivationSequence dc;

    public ParseResult(ExtendedAnswer result, Query original, DerivationSequence dc) {
        this.result = result;
        this.original = original;
        this.dc = dc;
    }

    public ExtendedAnswer getResult() {
        return result;
    }

    public void setResult(ExtendedAnswer result) {
        this.result = result;
    }

    public DerivationSequence getDerivationSequence() {
        return dc;
    }

    public Query getOriginalQuery() {
        return original;
    }

    /*
    public HashSet<ParseResult> resolveQueries(Parser parser) {
        HashSet<ParseResult> resolvedResults = new HashSet<>();
        for (ParseResult pr: result.resolveInnerQueries(parser)) {
            resolvedResults.add(pr);
        }
        return resolvedResults;
    }
     */

    public ParseResult merge(ParseResult other) {

        ExtendedAnswer newEA = new ExtendedAnswer();

        if (other.getDerivationSequence() == null) {
            // Merging with a ParseResult object which only consists of answers - so no sub-derivations
            newEA.addAll(other.getResult());
            DerivationConfiguration newDC = new DerivationConfiguration();
            newDC.add(other.getResult().getDerivationObject());
            DerivationSequence newDS = this.dc.append(newDC);
            return new ParseResult(newEA, null, newDS);
        }

        DerivationSequence oldDS = dc.clone();
        DerivationSequence newDS = oldDS.merge(other.getDerivationSequence());

        return new ParseResult(newEA, original, newDS);

    }

    public static HashSet<ParseResult> parseResultPermutations(ArrayList<HashSet<ParseResult>> resultSetList) {

        ArrayList<ParseResult> permutations = new ArrayList<>();

        // Creating a list of lists of extended answers from a list of sets of extended answers
        // Need to access the elements of the extended answer set in an ordered way
        ArrayList<ArrayList<ParseResult>> prListList = new ArrayList<>();

        for (Set<ParseResult> prSet: resultSetList) {
            prListList.add(new ArrayList<>(prSet));
        }

        // Creating an empty list for every permutation of the Answers possible
        int sum = 1;
        for (Set<ParseResult> possibleAnswerSet: resultSetList) sum *= possibleAnswerSet.size();
        for (int i = 0; i < sum; i++) permutations.add(null);

        // Filling the list of permutations of Answers
        for (int i = 0; i < prListList.size(); i++) {
            ArrayList<ParseResult> currentPossibilityPool = prListList.get(i);
            for (int j = 0; j < sum; j++) {
                if (permutations.get(j) == null) {
                    permutations.set(j, currentPossibilityPool.get(j % currentPossibilityPool.size()));
                } else {
                    permutations.get(j).merge(currentPossibilityPool.get(j % currentPossibilityPool.size()));
                }
            }
        }

        return new HashSet<>(permutations);

    }

    public String toString() {
        String s = "- START QUERY: " + this.original + "\n";
        s += "- SEMANTIC RESULT: " + this.result + "\n";
        s += "- FORMAL DERIVATION: \n";
        s += dc;
        return s + "\n";
    }

}
