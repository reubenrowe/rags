package rnsr.rag.grammar;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SubQueryResult {

    private ExtendedAnswer result;
    private ArrayList<SubQuery> subQueries;

    public SubQueryResult(ExtendedAnswer result, ArrayList<SubQuery> subQueries) {
        this.result = result;
        this.subQueries = subQueries;
    }

    public ExtendedAnswer getResult() {
        return result;
    }

    public void setResult(ExtendedAnswer result) {
        this.result = result;
    }

    public ArrayList<SubQuery> getSubQueries() {
        return subQueries;
    }

    public void setSubQueries(ArrayList<SubQuery> subQueries) {
        this.subQueries = subQueries;
    }

    public SubQueryResult merge(SubQueryResult other) {

        ExtendedAnswer newEA = new ExtendedAnswer();
        newEA.addAll(this.result);
        newEA.addAll(other.getResult());

        ArrayList<SubQuery> newList = new ArrayList<>();
        newList.addAll(this.subQueries);
        newList.addAll(other.getSubQueries());

        return new SubQueryResult(newEA, newList);

    }

    public static HashSet<SubQueryResult> subQueryResultsPermutations(ArrayList<HashSet<SubQueryResult>> subQuerySetList) {

        ArrayList<SubQueryResult> permutations = new ArrayList<>();

        ArrayList<ArrayList<SubQueryResult>> prListList = new ArrayList<>();
        for (Set<SubQueryResult> prSet: subQuerySetList) prListList.add(new ArrayList<>(prSet));

        int sum = 1;
        for (Set<SubQueryResult> possibleAnswerSet: subQuerySetList) sum *= possibleAnswerSet.size();
        for (int i = 0; i < sum; i++) permutations.add(null);

        for (int i = 0; i < prListList.size(); i++) {
            ArrayList<SubQueryResult> currentPossibilityPool = prListList.get(i);
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

}
