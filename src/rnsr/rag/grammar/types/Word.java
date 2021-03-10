package rnsr.rag.grammar.types;

import rnsr.rag.grammar.Answer;
import rnsr.rag.grammar.AnswerIdentifier;
import rnsr.rag.grammar.interfaces.IVariableTypeNew;

import java.util.HashSet;

public class Word extends Type implements IVariableTypeNew {

    private static HashSet<Answer> typeAlphabet = makeAlphabet();

    public Word() {
        super(true, true);
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

    public boolean match(Answer in) {
        if (in.equals(new Answer(AnswerIdentifier.Lambda()))) return true; // Lambda allowing
        if (in.Arguments() != null) return false;
        for (char c: in.Identifier().Identifier().toCharArray()) {
            Answer cAns = new Answer(new AnswerIdentifier(String.valueOf(c)));
            if (!this.alphabet.contains(cAns)) {
                return false;
            }
        }
        return true;
    }

}
