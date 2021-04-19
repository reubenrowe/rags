package rnsr.rag.grammar;

import rnsr.rag.derivation.DerivationSequence;
import rnsr.rag.parser.Parser;

import java.util.HashSet;

public class ParseResult {

    private ExtendedAnswer result;
    private Query original;
    private DerivationSequence dc;

    public ParseResult(ExtendedAnswer result, Query original, DerivationSequence dc) {
        this.result = result;
        this.original = original;
        this.dc = dc;
    }

    public void setOriginal(Query q) {
        this.original = q;
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

    public HashSet<ParseResult> resolveInnerQueries(Parser parser) {

        HashSet<ParseResult> resultSet = new HashSet<>();
        HashSet<SubQueryResult> subQuerySet = result.resolveInnerQueries(parser);

        for (SubQueryResult sqr: subQuerySet) {
            DerivationSequence dcClone = dc.clone();
            for (SubQuery sq: sqr.getSubQueries()) {
                //for (SubQuery sq2: sq.getSubQueryOrder()) {
                    //dcClone.applyQueryReverse(sq2.getQueryID(), sq2.getSequence(), sq2.getResult().getDerivationObject());
                //}
                dcClone.applyQueryReverse(sq.getQueryID(), sq.getSequence(), sq.getResult().getDerivationObject());
            }
            resultSet.add(new ParseResult(sqr.getResult(), this.original, dcClone.removeSurroundedLambdas()));
        }

        return resultSet;

    }

    public String toString() {
        String s = "- START QUERY: " + this.original + "\n";
        s += "- SEMANTIC RESULT: " + this.result + "\n";
        s += "- FORMAL DERIVATION: \n";
        s += dc;
        return s + "\n";
    }

}
