package rnsr.rag.examples;

import rnsr.rag.grammar.*;
import rnsr.rag.grammar.exception.ArgumentMismatchException;
import rnsr.rag.grammar.exception.RuleFunctionException;
import rnsr.rag.grammar.exception.VariableNotFoundException;

import java.util.ArrayList;

public class StringEqualityExample extends CommandLineInputBase {

    public Grammar CreateRAG() throws ArgumentMismatchException, RuleFunctionException, VariableNotFoundException {

        // Construct Answer Identifier set
        AnswerIdentifier start = new AnswerIdentifier("Start", 0);
        AnswerIdentifier eq = new AnswerIdentifier("Eq", 1);
        AnswerIdentifier ok = new AnswerIdentifier("ok");

        Grammar g = new Grammar();

        // &LETTER
        // "new LetterType()" in constructor

        // &WORD
        // "new WordType()" in constructor

        /* ********** RULE PRODUCTIONS ********** */

        // Declare variables for reuse/home/luke/Programming/Jara/SLELabs
        ArrayList<Variable> vars;
        ArrayList<Polynomial> args;
        VariableSet varSet;
        Configuration c;
        Polynomial poly;

        // <Start, (eq("ok") ? "ok")> -> "ok"
        vars = new ArrayList<>();
        varSet = new VariableSet();
        for (int i = 0; i <= 1; i++) {
            Variable v = new Variable();
            vars.add(i, v);
            varSet.put(v);
        }
        args = new ArrayList<>();
        args.add(new Polynomial(vars.get(0)));
        c = new Configuration();
        c.add(new Answer(ok));
        ArrayList<Polynomial> params = new ArrayList<>();
        params.add(new Polynomial(new Answer(ok)));
        Polynomial poly1 = new Polynomial(new Answer(new AnswerIdentifier("eq"), params));
        Polynomial poly2 = new Polynomial(new Answer(ok));
        Query q = new Query(poly1, poly2);
        g.addRule(start, new Rule(c, varSet, new Polynomial(q), args));


        // _z:&LETTER, t:&WORD <Eq(zt), F> -> #


        // _z:&LETTER, t:&WORD <Eq(zt), F> -> z <eq(t), F>


        // _z:&LETTER, t:&WORD <Eq(zt), F> -> <not(z), _v1> <star(letter), _v2>



        /* ****************************************/

        return g;

    }

    public static void main(String[] args) {
        // Sanity checks
        if (args.length == 0) {
            System.err.println("Expecting some input to parse!");
            System.exit(0);
        }
        performTest(new StringEqualityExample(), args[0]);
    }

}
