package rnsr.rag.examples;

import rnsr.rag.grammar.*;
import rnsr.rag.grammar.exception.ArgumentMismatchException;
import rnsr.rag.grammar.exception.RuleFunctionException;
import rnsr.rag.grammar.exception.VariableNotFoundException;

import java.util.ArrayList;
import java.util.HashSet;

public class VarsTestExample extends CommandLineInputBase {

    public Grammar CreateRAG() throws ArgumentMismatchException, RuleFunctionException, VariableNotFoundException {

        // Construct Answer Identifier set
        AnswerIdentifier start = new AnswerIdentifier("Start");
        AnswerIdentifier notLet = new AnswerIdentifier("NotLet", 1);

        Grammar g = new Grammar(start);

        // &ALPHABET
        HashSet<Answer> alphabetSet = new HashSet<>();
        for (char c: "abcdefghijklmnopqrstuvwxyz".toCharArray()) {
            alphabetSet.add(new Answer(new AnswerIdentifier(String.valueOf(c))));
            alphabetSet.add(new Answer(new AnswerIdentifier(String.valueOf(Character.toUpperCase(c)))));
        }

        /* ********** RULE PRODUCTIONS ********** */

        // Declare variables for reuse
        ArrayList<Variable> vars;
        ArrayList<Variable> args;
        VariableSet varSet;
        Configuration c;
        Polynomial poly;

        // Start: <v0, _v1> -> <NotLet["a"], _v1>
        vars = new ArrayList<>();
        varSet = new VariableSet();
        for (int i = 0; i <= 1; i++) {
            Variable v = new Variable();
            vars.add(i, v);
            varSet.put(v);
        }
        args = new ArrayList<>();
        args.add(vars.get(0));
        c = new Configuration();
        c.add(new Pair(
                new Polynomial(new Answer(notLet)),
                vars.get(1)
        ));
        g.addRule(start, new Rule(c, varSet, new Polynomial(vars.get(1)), args));

        // z,zP:&ALPHABET;z != zP; : <NotLet[z], #> -> <zP, _v1>
        vars = new ArrayList<>();
        varSet = new VariableSet();
        for (int i = 0; i <= 3; i++) {
            Variable v = new Variable();
            vars.add(i, v);
            varSet.put(v);
        }
        vars.get(1).setPossibleAnswers(alphabetSet);
        vars.get(2).setPossibleAnswers(alphabetSet);
        ArrayList<VariableCondition> conditions = new ArrayList<>();
        conditions.add(new VariableCondition(vars.get(1), vars.get(2), VariableCondition.VariableConditionType.NE));
        args = new ArrayList<>();
        args.add(vars.get(0));
        args.add(vars.get(1));
        args.add(vars.get(2));
        c = new Configuration();
        c.add(new Pair(
                new Polynomial(args.get(2)),
                vars.get(3)
        ));
        g.addRule(notLet, new Rule(c, varSet, new Polynomial(args.get(1)), args, conditions));

        /* ****************************************/

        return g;

    }

    public static void main(String[] args) {
        // Sanity checks
        if (args.length == 0) {
            System.err.println("Expecting some input to parse!");
            System.exit(0);
        }
        performTest(new PeanoAdderExample(), args[0]);
    }

}
