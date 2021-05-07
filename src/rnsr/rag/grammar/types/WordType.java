package rnsr.rag.grammar.types;

import rnsr.rag.grammar.Answer;
import rnsr.rag.grammar.AnswerIdentifier;
import rnsr.rag.grammar.Polynomial;
import rnsr.rag.grammar.exception.UnificationLambdaException;
import rnsr.rag.grammar.interfaces.IPolynomialTerm;
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
        alphabet.add(new Answer(AnswerIdentifier.Lambda()));
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

    public ConsumeSetting consumeFromPolynomial(Polynomial other) throws UnificationLambdaException {
        IPolynomialTerm pt;
        Polynomial remainder = new Polynomial();
        String word = "";

        for (int i = 0; i < other.size(); i++) {
            pt = other.get(i);
            if (pt.equals(new Answer(AnswerIdentifier.Lambda()))) {
                continue;     // Ignore lambdas
            } else if (pt instanceof Answer && (((Answer) pt).Identifier().Terminal())) {

                // We have a terminal

                String terminal = (((Answer)pt).Identifier().Identifier());
                int matchLength = matchString(terminal);

                if (matchLength != 0) {

                    String sub = terminal.substring(0, matchLength);
                    word += sub;
                    if (matchLength == terminal.length()) {
                        continue;
                    } else {
                        remainder.add(new Answer(new AnswerIdentifier(terminal.substring(matchLength + 1))));
                        for (int j = i + 1; j < other.size(); j++) remainder.add(other.get(j));
                        return new ConsumeSetting(new Polynomial(new Answer(new AnswerIdentifier(word))), remainder);
                    }

                } else {
                    // No prefix of the terminal matches
                    if (word.length() == 0) throw new UnificationLambdaException();
                    for (int j = i; j < other.size(); j++) remainder.add(other.get(j));
                    return new ConsumeSetting(new Polynomial(new Answer(new AnswerIdentifier(word))), remainder);
                }

            } else {
                if (word.length() == 0) throw new UnificationLambdaException();
                for (int j = i; j < other.size(); j++) remainder.add(other.get(j));
                return new ConsumeSetting(new Polynomial(new Answer(new AnswerIdentifier(word))), remainder);
            }
        }

        return new ConsumeSetting(new Polynomial(new Answer(new AnswerIdentifier(word))), remainder);

    }

    public int matchString(String s) {
        int i;
        for (i = 0; i < s.length(); i++)
            if (!alphabet.contains(new Answer(new AnswerIdentifier(String.valueOf(s.charAt(i))))))
                break;
        return i;
    }

}
