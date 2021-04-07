package rnsr.rag.grammar;

import rnsr.rag.derivation.DerivationSequence;

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


    public String toString() {
        String s = "- START QUERY: " + this.original + "\n";
        s += "- SEMANTIC RESULT: " + this.result + "\n";
        s += "- FORMAL DERIVATION: \n";
        s += dc;
        return s + "\n";
    }

}
