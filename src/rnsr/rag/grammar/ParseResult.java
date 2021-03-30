package rnsr.rag.grammar;

public class ParseResult {

    private ExtendedAnswer result;
    private Query original;

    public ParseResult(ExtendedAnswer result, Query original) {
        this.result = result;
        this.original = original;
    }

    public ExtendedAnswer getResult() {
        return result;
    }

    public void setResult(ExtendedAnswer result) {
        this.result = result;
    }


    public String toString() {
        String s = "- START QUERY: " + this.original + "\n";
        s += "- SEMANTIC RESULT: " + this.result + "\n";
        s += "- FORMAL DERIVATION: \n";
        s += "OWO";
        return s + "\n";
    }

}
