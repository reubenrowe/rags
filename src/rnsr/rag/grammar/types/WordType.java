package rnsr.rag.grammar.types;

import rnsr.rag.grammar.Answer;
import rnsr.rag.grammar.AnswerIdentifier;
import rnsr.rag.grammar.interfaces.IVariableType;

import java.util.HashSet;

public class WordType implements IVariableType {

    private HashSet<Answer> pool = new HashSet<>();
    private boolean isConcat = true;

    public WordType() {
        for (char c: "abcdefghijklmnopqrstuvwxyz".toCharArray()) {
            pool.add(new Answer(new AnswerIdentifier(String.valueOf(c))));
            pool.add(new Answer(new AnswerIdentifier(String.valueOf(Character.toUpperCase(c)))));
        }
    }

    public boolean match(String token) {
        return pool.contains(new Answer(new AnswerIdentifier(token)));
    }

    public HashSet<Answer> getPool() {
        return pool;
    }

    public boolean isConcat() {
        return isConcat;
    }

    public String toString() {
        return "&WORD";
    }
}
