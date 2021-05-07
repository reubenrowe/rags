package rnsr.rag.grammar.types;

import rnsr.rag.grammar.Answer;
import rnsr.rag.grammar.AnswerIdentifier;
import rnsr.rag.grammar.Polynomial;
import rnsr.rag.grammar.exception.UnificationLambdaException;
import rnsr.rag.grammar.interfaces.IPolynomialTerm;
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

    public ConsumeSetting consumeFromPolynomial(Polynomial other) throws UnificationLambdaException {
        Polynomial remainder = new Polynomial();

        int counter;
        for (counter = 0; counter < other.size(); counter++)
            if (!other.get(counter).equals(new Answer(AnswerIdentifier.Lambda()))) break;
        if (counter >= other.size()) throw new UnificationLambdaException();
        IPolynomialTerm pt = other.get(counter);

        if ((pt instanceof Answer) && (((Answer)pt).Identifier().Terminal())) {
            if ((((Answer) pt).Identifier().Identifier().length() > 0) &&
                    match(new Answer(new AnswerIdentifier(((Answer) pt).Identifier().Identifier().substring(0,1))))) {
                String orig = ((Answer) pt).Identifier().Identifier();
                String cut = String.valueOf(orig.charAt(0));
                Answer a = new Answer(new AnswerIdentifier(cut));
                if (!cut.equals(orig)) remainder.add(new Answer(new AnswerIdentifier(orig.substring(cut.length()))));
                for (int i = counter + 1; i < other.size(); i++) remainder.add(other.get(i));
                return new ConsumeSetting(new Polynomial(a), remainder);

            }
        }

        throw new UnificationLambdaException();

    }

}
