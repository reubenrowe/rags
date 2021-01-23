package rnsr.rag.grammar;

public class VariableCondition {

    public static enum VariableConditionType { NE; }

    private Variable v1;
    private Variable v2;
    private VariableConditionType condition;

    public VariableCondition(Variable v1, Variable v2, VariableConditionType condition) {
        this.v1 = v1;
        this.v2 = v2;
        this.condition = condition;
    }

    public Variable getFirstVariable() {
        return v1;
    }

    public Variable getSecondVariable() {
        return v2;
    }

    public VariableConditionType getConditionType() {
        return condition;
    }

}
