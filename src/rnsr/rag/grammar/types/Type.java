package rnsr.rag.grammar.types;

import rnsr.rag.grammar.Answer;
import rnsr.rag.grammar.exception.UnificationLambdaException;
import rnsr.rag.grammar.interfaces.IVariableType;
import rnsr.rag.util.ConsumeSetting;

import java.util.HashSet;

public abstract class Type implements IVariableType {

    public static final LetterType LETTER_TYPE = new LetterType();
    public static final WordType WORD_TYPE = new WordType();
    public static final AnswerType ANSWER_TYPE = new AnswerType();

    protected HashSet<Answer> alphabet;
    protected boolean isConcatenable;
    protected boolean isLambdaAllowing;

    public Type(boolean isConcatenable, boolean isLambdaAllowing) {
        this.isConcatenable = isConcatenable;
        this.isLambdaAllowing = isLambdaAllowing;
    }

    public HashSet<Answer> getAlphabet() {
        return this.alphabet;
    }

    public boolean isConcatenable() {
        return this.isConcatenable;
    }

    public boolean isLambdaAllowing() {
        return this.isLambdaAllowing;
    }

    public boolean match(Answer a) {
        return false;
    }

    public ConsumeSetting consumeFromAnswer(Answer other) throws UnificationLambdaException { return null; }

}
