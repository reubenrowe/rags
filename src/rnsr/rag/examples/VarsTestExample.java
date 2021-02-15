package rnsr.rag.examples;

import rnsr.rag.grammar.*;
import rnsr.rag.grammar.exception.ArgumentMismatchException;
import rnsr.rag.grammar.exception.RuleFunctionException;
import rnsr.rag.grammar.exception.VariableNotFoundException;
import rnsr.rag.grammar.types.WordType;

import java.util.ArrayList;
import java.util.HashSet;

public class VarsTestExample extends CommandLineInputBase {

    public Grammar CreateRAG() throws ArgumentMismatchException, RuleFunctionException, VariableNotFoundException {

        // Construct Answer Identifier set
        AnswerIdentifier start = new AnswerIdentifier("Start", 0);
        AnswerIdentifier notLet = new AnswerIdentifier("NotLet", 1);

        Grammar g = new Grammar(start);

        // &LETTER
        HashSet<Answer> letterSet = new HashSet<>();
        for (char c: "abcdefghijklmnopqrstuvwxyz".toCharArray()) {
            letterSet.add(new Answer(new AnswerIdentifier(String.valueOf(c))));
            letterSet.add(new Answer(new AnswerIdentifier(String.valueOf(Character.toUpperCase(c)))));
        }

        // &WORD
        

        /* ********** RULE PRODUCTIONS ********** */

        // Declare variables for reuse
        ArrayList<Variable> vars;
        ArrayList<Variable> args;
        VariableSet varSet;
        Configuration c;
        Polynomial poly;

        // <Start, _v1> -> <NotLet["z"], _v1>
        vars = new ArrayList<>();
        varSet = new VariableSet();
        for (int i = 0; i <= 1; i++) {
            Variable v = new Variable();
            vars.add(i, v);
            varSet.put(v);
        }

        vars.get(0).setTag("_v0 (in Start)");
        vars.get(1).setTag("_v1 (in Start)");

        args = new ArrayList<>();
        args.add(vars.get(0));
        c = new Configuration();
        ArrayList<Polynomial> param = new ArrayList<>();
        param.add(new Polynomial(new Answer(new AnswerIdentifier("z"))));
        c.add(new Pair(
                new Polynomial(new Answer(notLet, param)),
                vars.get(1)
        ));
        g.addRule(start, new Rule(c, varSet, new Polynomial(vars.get(1)), args));

        // _z,_zP:&ALPHABET;_z != _zP; : <NotLet[_z], _zP> -> <_zP, _v1>
        vars = new ArrayList<>();
        varSet = new VariableSet();
        for (int i = 0; i <= 3; i++) {
            Variable v = new Variable();
            vars.add(i, v);
            varSet.put(v);
        }

        vars.get(0).setTag("v0 (in NotLet)");
        vars.get(1).setTag("_z (in NotLet)");
        vars.get(2).setTag("_zP (in NotLet)");
        vars.get(3).setTag("_v1 (in NotLet)");

        vars.get(1).setType(new WordType());
        vars.get(2).setType(new WordType());
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
        g.addRule(notLet, new Rule(c, varSet, new Polynomial(args.get(2)), args, conditions));

        /* ****************************************/

        return g;

    }

    public static void main(String[] args) {
        // Sanity checks
        if (args.length == 0) {
            System.err.println("Expecting some input to parse!");
            System.exit(0);
        }
        performTest(new VarsTestExample(), args[0]);
    }

}
