package rnsr.rag.grammar;

public class UnificationSetting {

    private VariableSet variables;
    private Polynomial remainder;

    public UnificationSetting(VariableSet variables, Polynomial remainder) {
        this.variables = variables;
        this.remainder = remainder;
    }

    public VariableSet getVariables() {
        return variables;
    }

    public Polynomial getRemainder() {
        return remainder;
    }

}
