package rnsr.rag.examples;

import rnsr.rag.grammar.*;
import rnsr.rag.grammar.exception.ArgumentMismatchException;
import rnsr.rag.grammar.exception.RuleFunctionException;
import rnsr.rag.grammar.exception.VariableNotFoundException;
import rnsr.rag.grammar.interfaces.IVariableTypeNew;
import rnsr.rag.grammar.types.LetterType;
import rnsr.rag.grammar.types.Word;
import rnsr.rag.grammar.types.WordType;

import java.util.ArrayList;

public class UnifyTestExample extends CommandLineInputBase {

    public Grammar CreateRAG() throws ArgumentMismatchException, RuleFunctionException, VariableNotFoundException {

        // Construct Answer Identifier set
        AnswerIdentifier start = new AnswerIdentifier("Start", 0);
        AnswerIdentifier test = new AnswerIdentifier("Test", 1);

        Grammar g = new Grammar(start);



        /* ********** RULE PRODUCTIONS ********** */



        ArrayList<Variable> vars;
        ArrayList<Polynomial> args;
        VariableSet varSet;
        Configuration c;
        Polynomial poly;



        // <Start, _v1> -> <Test("testing"), _v1>
        vars = new ArrayList<>();
        varSet = new VariableSet();
        for (int i = 0; i <= 1; i++) {
            Variable v = new Variable();
            vars.add(i, v);
            varSet.put(v);
        }

        vars.get(0).setTag("_v0 in Test");
        vars.get(1).setTag("_v1 in Test");

        args = new ArrayList<>();
        args.add(new Polynomial(vars.get(0)));

        c = new Configuration();
        ArrayList<Polynomial> testArg = new ArrayList<>();
        testArg.add(new Polynomial(new Answer(new AnswerIdentifier("testing"))));
        c.add(new Pair(new Polynomial(new Answer(test, testArg)), vars.get(1)));

        g.addRule(start, new Rule(c, varSet, new Polynomial(vars.get(1)), args));



        // <Test(_z_t), _v1> -> <_z, _v1> <_t, _v2>
        vars = new ArrayList<>();
        varSet = new VariableSet();
        for (int i = 0; i <= 4; i++) {
            Variable v = new Variable();
            vars.add(i, v);
            varSet.put(v);
        }

        vars.get(1).setType(new LetterType());
        vars.get(2).setType(new WordType());

        vars.get(0).setTag("_v0 in Test");
        vars.get(1).setTag("_z in Test");
        vars.get(2).setTag("_t in Test");
        vars.get(3).setTag("_v1 in Test");
        vars.get(4).setTag("_v2 in Test");

        args = new ArrayList<>();
        args.add(new Polynomial(vars.get(0)));
        poly = new Polynomial();
        poly.add(vars.get(1));
        poly.add(vars.get(2));
        args.add(poly);

        c = new Configuration();
        c.add(new Pair(new Polynomial(args.get(1).get(0)), vars.get(3)));
        c.add(new Pair(new Polynomial(args.get(1).get(1)), vars.get(4)));

        g.addRule(test, new Rule(c, varSet, new Polynomial(vars.get(3)), args));



        /* ****************************************/



        return g;

    }

    public static void main(String[] args) {
        // Sanity checks
        if (args.length == 0) {
            System.err.println("Expecting some input to parse!");
            System.exit(0);
        }

        System.out.println("///////");
        Answer a = new Answer(new AnswerIdentifier("owo"));
        IVariableTypeNew t = new Word();
        System.out.println(t.match(a));
        System.out.println("///////");

        performTest(new UnifyTestExample(), args[0]);
    }

}
