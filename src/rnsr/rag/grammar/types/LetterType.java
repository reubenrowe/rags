package rnsr.rag.grammar.types;

import rnsr.rag.grammar.Answer;
import rnsr.rag.grammar.AnswerIdentifier;
import rnsr.rag.grammar.Polynomial;
import rnsr.rag.grammar.exception.UnificationLambdaException;
import rnsr.rag.grammar.interfaces.IVariableType;
import rnsr.rag.util.ConsumeSetting;

import java.util.HashSet;

public class LetterType extends Type implements IVariableType {

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

    public ConsumeSetting consumeFromAnswer(Answer other) throws UnificationLambdaException {
        String answerID = other.Identifier().Identifier();
        if (answerID.equals(AnswerIdentifier.Lambda().Identifier())) throw new UnificationLambdaException(); // Not lambda-allowing
        char c = answerID.charAt(0);
        if (!this.alphabet.contains(new Answer(new AnswerIdentifier(String.valueOf(c))))) throw new UnificationLambdaException();
        return new ConsumeSetting(new Polynomial(new Answer(new AnswerIdentifier(String.valueOf(c)))), // Consumed
                new Polynomial(new Answer(new AnswerIdentifier(answerID.substring(1))))); // Remainder

    }

}
