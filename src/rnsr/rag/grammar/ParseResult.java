package rnsr.rag.grammar;

public class ParseResult {

    private String derivation;
    private ExtendedAnswer result;

    public ParseResult(ExtendedAnswer result, String derivation) {
        this.result = result;
        this.derivation = derivation;
    }

    public String getDerivation() {
        return derivation;
    }

    public void setDerivation(String derivation) {
        this.derivation = derivation;
    }

    public ExtendedAnswer getResult() {
        return result;
    }

    public void setResult(ExtendedAnswer result) {
        this.result = result;
    }

    public String toString() {
        String s = "- RESULT: " + this.result + "\n";
        s += "- DERIVATION: \n";
        s += derivation;
        return s + "\n";
    }

}
