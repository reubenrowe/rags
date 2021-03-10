package rnsr.rag.grammar.types;

import rnsr.rag.grammar.Answer;
import rnsr.rag.grammar.AnswerIdentifier;

import java.util.HashSet;

public class LetterType extends Type {

    private static HashSet<Answer> typeAlphabet = makeAlphabet();

    public LetterType() {
        super(false, false);
        this.alphabet = typeAlphabet;
    }

    private static HashSet<Answer> makeAlphabet() {
        HashSet<Answer> alphabet = new HashSet<>();
        for (char c: "abcdefghijklmnopqrstuvwxyz".toCharArray()) {
            alphabet.add(new Answer(new AnswerIdentifier(String.valueOf(c))));
            alphabet.add(new Answer(new AnswerIdentifier(String.valueOf(Character.toUpperCase(c)))));
        }
        return alphabet;
    }

    public boolean match(Answer token) {
        return (token.Identifier().Identifier().length() == 1)
                && this.alphabet.contains(token);
    }

}
