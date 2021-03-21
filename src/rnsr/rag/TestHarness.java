package rnsr.rag;

import rnsr.rag.grammar.Grammar;
import rnsr.rag.grammar.ParseResult;
import rnsr.rag.parser.Parser;
import rnsr.rag.parser.exception.ParseException;

import java.util.Set;

public class TestHarness {

    public static void runGrammar(Grammar g, String input) {

        Parser p = new Parser(g);
        try {
            Set<ParseResult> results = p.parse(input);
            System.out.println("Input parsed OK");

            int counter = 1;
            for (ParseResult result : results) {
                System.out.print(counter);
                System.out.print(": \n");
                System.out.print(result.toString());
                counter++;
            }
        }
        catch (ParseException e) {
            e.printStackTrace(System.err);
            System.exit(0);
        }

    }

}
