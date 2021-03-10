package rnsr.rag.grammar.types;

import rnsr.rag.grammar.Answer;

import java.util.HashSet;

public abstract class Type {

    protected HashSet<Answer> alphabet;
    protected boolean isConcatenable;
    protected boolean isLambdaAllowing;

    public Type(boolean isConcatenable, boolean isLambdaAllowing) {
        this.isConcatenable = isConcatenable;
        this.isLambdaAllowing = isLambdaAllowing;
    }

    protected HashSet<Answer> getAlphabet() {
        return this.alphabet;
    }

    protected boolean isConcatenable() {
        return this.isConcatenable;
    }

    protected boolean isLambdaAllowing() {
        return this.isLambdaAllowing;
    }

}
