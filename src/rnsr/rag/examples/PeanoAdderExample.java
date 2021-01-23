package rnsr.rag.examples;

import rnsr.rag.grammar.*;
import rnsr.rag.grammar.exception.ArgumentMismatchException;
import rnsr.rag.grammar.exception.RuleFunctionException;
import rnsr.rag.grammar.exception.VariableNotFoundException;

import java.util.ArrayList;
import java.util.HashSet;

public class PeanoAdderExample extends CommandLineInputBase {

    public Grammar CreateRAG() throws ArgumentMismatchException, RuleFunctionException, VariableNotFoundException {

        // Construct Answer Identifier set
        AnswerIdentifier answer_Add = new AnswerIdentifier("Add", 0);
        AnswerIdentifier answer_Num = new AnswerIdentifier("Num", 0);
        AnswerIdentifier answer_ReArr = new AnswerIdentifier("ReArr", 0);
        AnswerIdentifier answer_Inc = new AnswerIdentifier("Inc", 0);
        AnswerIdentifier answer_Dec = new AnswerIdentifier("Dec", 0);
        AnswerIdentifier answer_S = new AnswerIdentifier("s");
        AnswerIdentifier answer_Zero = new AnswerIdentifier("0");
        AnswerIdentifier answer_Plus = new AnswerIdentifier("+");

        Grammar g = new Grammar(answer_Add);

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

        // Add: <v0, ReArr?(v1 + v2)> -> <Num, v1> '+' <Add, v2>
        vars = new ArrayList<>();
        varSet = new VariableSet();
        for (int i = 0; i <= 2; i++) {
            Variable v = new Variable();
            vars.add(i, v);
            varSet.put(v);
        }
        args = new ArrayList<Variable>();
        args.add(vars.get(0));
        c = new Configuration();
        c.add(new Pair(
                new Polynomial(new Answer(answer_Num)),
                vars.get(1)
        ));
        c.add(new Answer(answer_Plus));
        c.add(new Pair(
                new Polynomial(new Answer(answer_Add)),
                vars.get(2)
        ));
        poly = new Polynomial(vars.get(1));
        poly.add(new Answer(answer_Plus));
        poly.add(vars.get(2));
        g.addRule(answer_Add, new Rule(c, varSet,
                new Polynomial(new Query(new Polynomial(new Answer(answer_ReArr)), poly)), args));

        // Add: <v0, v1> -> <Num, v1>
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
                new Polynomial(new Answer(answer_Num)),
                vars.get(1)
        ));
        g.addRule(answer_Add, new Rule(c, varSet, new Polynomial(vars.get(1)), args));

        // Num: <v0, 's' v1> -> 's' <Num, v1>
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
        c.add(new Answer(answer_S));
        c.add(new Pair(
                new Polynomial(new Answer(answer_Num)),
                vars.get(1)
        ));
        poly = new Polynomial(new Answer(answer_S));
        poly.add(vars.get(1));
        g.addRule(answer_Num, new Rule(c, varSet, poly, args));

        // Num: <v0, '0'> -> '0'
        vars = new ArrayList<>();
        varSet = new VariableSet();
        for (int i = 0; i <= 0; i++) {
            Variable v = new Variable();
            vars.add(i, v);
            varSet.put(v);
        }
        args = new ArrayList<>();
        args.add(vars.get(0));
        c = new Configuration();
        c.add(new Answer(answer_Zero));
        g.addRule(answer_Num, new Rule(c, varSet, new Polynomial(new Answer(answer_Zero)), args));

        // ReArr: <v0, v1> -> <Num, v1> '+' '0'
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
                new Polynomial(new Answer(answer_Num)),
                vars.get(1)
        ));
        c.add(new Answer(answer_Plus));
        c.add(new Answer(answer_Zero));
        g.addRule(answer_ReArr, new Rule(c, varSet, new Polynomial(vars.get(1)), args));

        // ReArr: <v0, ReArr?((inc?v1) '+' (dec?v2))> -> <Num, v1> '+' <Num, v2>
        vars = new ArrayList<>();
        varSet = new VariableSet();
        for (int i = 0; i <= 2; i++) {
            Variable v = new Variable();
            vars.add(i, v);
            varSet.put(v);
        }
        args = new ArrayList<>();
        args.add(vars.get(0));
        c = new Configuration();
        c.add(new Pair(
                new Polynomial(new Answer(answer_Num)),
                vars.get(1)
        ));
        c.add(new Answer(answer_Plus));
        c.add(new Pair(
                new Polynomial(new Answer(answer_Num)),
                vars.get(2)
        ));
        poly = new Polynomial(vars.get(2));
        Query innerQuery1 = new Query(new Polynomial(new Answer(answer_Inc)), new Polynomial(vars.get(1)));
        Query innerQuery2 = new Query(new Polynomial(new Answer(answer_Dec)), poly);
        poly = new Polynomial(innerQuery1);
        poly.add(new Answer(answer_Plus));
        poly.add(innerQuery2);
        g.addRule(answer_ReArr, new Rule(c, varSet,
                new Polynomial(new Query(new Polynomial(new Answer(answer_ReArr)), poly)), args));

        // Inc: <v0, sv1> -> <Num, v1>
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
                new Polynomial(new Answer(answer_Num)),
                vars.get(1)
        ));
        poly = new Polynomial(new Answer(answer_S));
        poly.add(vars.get(1));
        g.addRule(answer_Inc, new Rule(c, varSet, poly, args));

        // Dec: <v0, v1> -> 's' <Num, v1>
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
        c.add(new Answer(answer_S));
        c.add(new Pair(
                new Polynomial(new Answer(answer_Num)),
                vars.get(1)
        ));
        g.addRule(answer_Dec, new Rule(c, varSet, new Polynomial(vars.get(1)), args));

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
        g.addRule(new AnswerIdentifier("NotLet", 1), new Rule(c, varSet, new Polynomial(args.get(1)), args, conditions));

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
