package rnsr.rag.grammar.types;

import rnsr.rag.grammar.Answer;

import java.util.HashSet;

public abstract class Type {

    public static final Type LETTER_TYPE = new LetterType();
    public static final Type WORD_TYPE = new WordType();

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

}
