package rnsr.rag.grammar.types;

import rnsr.rag.grammar.Answer;
import rnsr.rag.grammar.AnswerIdentifier;
import rnsr.rag.grammar.Polynomial;
import rnsr.rag.grammar.exception.UnificationLambdaException;
import rnsr.rag.grammar.interfaces.IVariableType;
import rnsr.rag.util.ConsumeSetting;

import java.util.HashSet;

public class WordType extends Type implements IVariableType {

    private static HashSet<Answer> typeAlphabet = makeAlphabet();

    public WordType() {
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

    public ConsumeSetting consumeFromAnswer(Answer other) throws UnificationLambdaException {
        String answerID = other.Identifier().Identifier();
        String consumed = "";
        for (char c: answerID.toCharArray()) {
            if (!this.alphabet.contains(new Answer(new AnswerIdentifier(String.valueOf(c))))) break;
            consumed += String.valueOf(c);
        }
        return new ConsumeSetting(new Polynomial(new Answer(new AnswerIdentifier(consumed))),
                new Polynomial(new Answer(new AnswerIdentifier(answerID.substring(consumed.length())))));
    }

}
