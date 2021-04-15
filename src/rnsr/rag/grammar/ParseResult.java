package rnsr.rag.grammar;

import rnsr.rag.derivation.DerivationSequence;
import rnsr.rag.parser.Parser;

import java.util.Collections;
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




    public HashSet<ParseResult> resolveInnerQueries(Parser parser) {

        HashSet<ParseResult> resultSet = new HashSet<>();
        HashSet<SubQueryResult> subQuerySet = result.resolveInnerQueries(parser);

        for (SubQueryResult sqr: subQuerySet) {
            DerivationSequence dcClone = dc.clone();
            for (SubQuery sq: sqr.getSubQueries()) {

                dcClone.applyQueryReverse(sq.getQueryID(), sq.getSequence(), false);

                System.out.println("ID: " + sq.getQueryID());
                System.out.println("RES: " + sq.getResult());
                System.out.println("SUB DERIV:");
                System.out.println(sq.getSequence());
                System.out.println("-------");


            }
            resultSet.add(new ParseResult(sqr.getResult(), null, dcClone));
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
