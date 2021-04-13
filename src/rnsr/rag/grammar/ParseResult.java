package rnsr.rag.grammar;

import rnsr.rag.derivation.DerivationConfiguration;
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

    public ExtendedAnswer getResult() {
        return result;
    }

    public void setResult(ExtendedAnswer result) {
        this.result = result;
    }

    public DerivationSequence getDerivationSequence() {
        return dc;
    }



    public HashSet<ParseResult> resolveQueries(Parser parser) {
        HashSet<ParseResult> resolvedResults = new HashSet<>();
        for (ParseResult pr: result.resolveInnerQueries(parser)) {
            resolvedResults.add(pr);
        }
        return resolvedResults;
    }

    public ParseResult merge(ParseResult other) {

        ExtendedAnswer newEA = new ExtendedAnswer();

        if (other.getDerivationSequence() == null) {
            // Merging with a ParseResult object which only consists of answers - so no sub-derivations
            newEA.addAll(other.getResult());
            DerivationConfiguration newDC = new DerivationConfiguration();
            newDC.add(other.getResult().getDerivationObject());
            DerivationSequence newDS = this.dc.append(newDC);
            return new ParseResult(newEA, original, newDS);
        }

        DerivationSequence oldDS = dc;

        DerivationConfiguration result = other.getDerivationSequence().get(0);
        oldDS.append(result); // Appending query result to the end of each existing derivation step

        return null;

    }

    public String toString() {
        String s = "- START QUERY: " + this.original + "\n";
        s += "- SEMANTIC RESULT: " + this.result + "\n";
        s += "- FORMAL DERIVATION: \n";
        s += dc;
        return s + "\n";
    }

}
