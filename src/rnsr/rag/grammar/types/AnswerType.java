package rnsr.rag.grammar.types;

import rnsr.rag.grammar.Answer;
import rnsr.rag.grammar.Polynomial;
import rnsr.rag.grammar.exception.UnificationLambdaException;
import rnsr.rag.grammar.interfaces.IVariableType;
import rnsr.rag.util.ConsumeSetting;

import java.util.HashSet;

public class AnswerType extends Type implements IVariableType {

    public AnswerType() {
        super(false, true);
    }

    private static HashSet<Answer> makeAlphabet() {
        return null;
    }

    public boolean match(Answer token) {
        return true;
    }

    public ConsumeSetting consumeFromAnswer(Answer other) throws UnificationLambdaException {
        return new ConsumeSetting(new Polynomial(other), new Polynomial());
    }

}