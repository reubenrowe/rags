package rnsr.rag.examples;
import rnsr.rag.grammar.*;
import rnsr.rag.grammar.exception.ArgumentMismatchException;
import rnsr.rag.grammar.exception.RuleFunctionException;
import rnsr.rag.grammar.exception.VariableNotFoundException;

import java.util.ArrayList;
public class PeanoAdderExampleNew extends CommandLineInputBase {
    public Grammar CreateRAG() throws ArgumentMismatchException, RuleFunctionException, VariableNotFoundException {
        AnswerIdentifier answer_Add_0 = new AnswerIdentifier("Add", 0);
        AnswerIdentifier answer_Num_0 = new AnswerIdentifier("Num", 0);
        AnswerIdentifier answer_Star_1 = new AnswerIdentifier("Star", 1);
        AnswerIdentifier answer_Inc_0 = new AnswerIdentifier("Inc", 0);
        AnswerIdentifier answer_ReArr_0 = new AnswerIdentifier("ReArr", 0);
        AnswerIdentifier answer_Dec_0 = new AnswerIdentifier("Dec", 0);
        AnswerIdentifier answer_TERMINAL_1 = new AnswerIdentifier("s");
        AnswerIdentifier answer_TERMINAL_2 = new AnswerIdentifier("0");
        AnswerIdentifier answer_TERMINAL_0 = new AnswerIdentifier("+");
        Grammar g = new Grammar(answer_Add_0);
        ArrayList<Variable> vars;
        ArrayList<Variable> args;
        VariableSet varSet;
        Configuration c;
        ArrayList<Polynomial> answerArgs;
        ////////////////////////////////////////////////////
        vars = new ArrayList<>();
        varSet = new VariableSet();
        args = new ArrayList<>();
        for (int i = 0; i <= 2; i++) {
            Variable v = new Variable();
            vars.add(v);
            varSet.put(v);
        }
        args.add(vars.get(0));
        c = new Configuration();
        Polynomial poly1 = new Polynomial();
        poly1.add(new Answer(answer_Num_0));
        c.add(new Pair(poly1, vars.get(1)));
        c.add(new Answer(answer_TERMINAL_0));
        poly1 = new Polynomial();
        poly1.add(new Answer(answer_Add_0));
        c.add(new Pair(poly1, vars.get(2)));
        poly1 = new Polynomial();
        Polynomial poly2 = new Polynomial();
        poly2.add(new Answer(answer_ReArr_0));
        Polynomial poly3 = new Polynomial();
        poly3.add(vars.get(1));
        poly3.add(new Answer(answer_TERMINAL_0));
        poly3.add(vars.get(2));
        poly1.add(new Query(poly2, poly3));
        g.addRule(answer_Add_0, new Rule(c, varSet, poly1, args));
        ////////////////////////////////////////////////////
        vars = new ArrayList<>();
        varSet = new VariableSet();
        args = new ArrayList<>();
        for (int i = 0; i <= 1; i++) {
            Variable v = new Variable();
            vars.add(v);
            varSet.put(v);
        }
        args.add(vars.get(0));
        c = new Configuration();
        poly1 = new Polynomial();
        poly1.add(new Answer(answer_Num_0));
        c.add(new Pair(poly1, vars.get(1)));
        poly1 = new Polynomial();
        poly1.add(vars.get(1));
        g.addRule(answer_Add_0, new Rule(c, varSet, poly1, args));
        ////////////////////////////////////////////////////
        vars = new ArrayList<>();
        varSet = new VariableSet();
        args = new ArrayList<>();
        for (int i = 0; i <= 1; i++) {
            Variable v = new Variable();
            vars.add(v);
            varSet.put(v);
        }
        args.add(vars.get(0));
        c = new Configuration();
        c.add(new Answer(answer_TERMINAL_1));
        poly1 = new Polynomial();
        poly1.add(new Answer(answer_Num_0));
        c.add(new Pair(poly1, vars.get(1)));
        poly1 = new Polynomial();
        poly1.add(new Answer(answer_TERMINAL_1));
        poly1.add(vars.get(1));
        g.addRule(answer_Num_0, new Rule(c, varSet, poly1, args));
        ////////////////////////////////////////////////////
        vars = new ArrayList<>();
        varSet = new VariableSet();
        args = new ArrayList<>();
        for (int i = 0; i <= 0; i++) {
            Variable v = new Variable();
            vars.add(v);
            varSet.put(v);
        }
        args.add(vars.get(0));
        c = new Configuration();
        c.add(new Answer(answer_TERMINAL_2));
        poly1 = new Polynomial();
        poly1.add(new Answer(answer_TERMINAL_2));
        g.addRule(answer_Num_0, new Rule(c, varSet, poly1, args));
        ////////////////////////////////////////////////////
        vars = new ArrayList<>();
        varSet = new VariableSet();
        args = new ArrayList<>();
        for (int i = 0; i <= 1; i++) {
            Variable v = new Variable();
            vars.add(v);
            varSet.put(v);
        }
        args.add(vars.get(0));
        c = new Configuration();
        poly1 = new Polynomial();
        poly1.add(new Answer(answer_Num_0));
        c.add(new Pair(poly1, vars.get(1)));
        c.add(new Answer(answer_TERMINAL_0));
        c.add(new Answer(answer_TERMINAL_2));
        poly1 = new Polynomial();
        poly1.add(vars.get(1));
        g.addRule(answer_ReArr_0, new Rule(c, varSet, poly1, args));
        ////////////////////////////////////////////////////
        vars = new ArrayList<>();
        varSet = new VariableSet();
        args = new ArrayList<>();
        for (int i = 0; i <= 2; i++) {
            Variable v = new Variable();
            vars.add(v);
            varSet.put(v);
        }
        args.add(vars.get(0));
        c = new Configuration();
        poly1 = new Polynomial();
        poly1.add(new Answer(answer_Num_0));
        c.add(new Pair(poly1, vars.get(1)));
        c.add(new Answer(answer_TERMINAL_0));
        poly1 = new Polynomial();
        poly1.add(new Answer(answer_Num_0));
        c.add(new Pair(poly1, vars.get(2)));
        poly1 = new Polynomial();
        poly2 = new Polynomial();
        poly2.add(new Answer(answer_ReArr_0));
        poly3 = new Polynomial();
        Polynomial poly4 = new Polynomial();
        poly4.add(new Answer(answer_Inc_0));
        Polynomial poly5 = new Polynomial();
        poly5.add(vars.get(1));
        poly3.add(new Query(poly4, poly5));
        poly3.add(new Answer(answer_TERMINAL_0));
        Polynomial poly6 = new Polynomial();
        poly6.add(new Answer(answer_Dec_0));
        Polynomial poly7 = new Polynomial();
        poly7.add(vars.get(2));
        poly3.add(new Query(poly6, poly7));
        poly1.add(new Query(poly2, poly3));
        g.addRule(answer_ReArr_0, new Rule(c, varSet, poly1, args));
        ////////////////////////////////////////////////////
        vars = new ArrayList<>();
        varSet = new VariableSet();
        args = new ArrayList<>();
        for (int i = 0; i <= 1; i++) {
            Variable v = new Variable();
            vars.add(v);
            varSet.put(v);
        }
        args.add(vars.get(0));
        c = new Configuration();
        poly1 = new Polynomial();
        poly1.add(new Answer(answer_Num_0));
        c.add(new Pair(poly1, vars.get(1)));
        poly1 = new Polynomial();
        poly1.add(new Answer(answer_TERMINAL_1));
        poly1.add(vars.get(1));
        g.addRule(answer_Inc_0, new Rule(c, varSet, poly1, args));
        ////////////////////////////////////////////////////
        vars = new ArrayList<>();
        varSet = new VariableSet();
        args = new ArrayList<>();
        for (int i = 0; i <= 1; i++) {
            Variable v = new Variable();
            vars.add(v);
            varSet.put(v);
        }
        args.add(vars.get(0));
        c = new Configuration();
        c.add(new Answer(answer_TERMINAL_1));
        poly1 = new Polynomial();
        poly1.add(new Answer(answer_Num_0));
        c.add(new Pair(poly1, vars.get(1)));
        poly1 = new Polynomial();
        poly1.add(vars.get(1));
        g.addRule(answer_Dec_0, new Rule(c, varSet, poly1, args));
        ////////////////////////////////////////////////////
        vars = new ArrayList<>();
        varSet = new VariableSet();
        args = new ArrayList<>();
        for (int i = 0; i <= 1; i++) {
            Variable v = new Variable();
            vars.add(v);
            varSet.put(v);
        }
        args.add(vars.get(0));
        args.add(vars.get(1));
        c = new Configuration();
        c.add(new Answer(AnswerIdentifier.Lambda()));
        poly1 = new Polynomial();
        poly1.add(new Answer(AnswerIdentifier.Lambda()));
        g.addRule(answer_Star_1, new Rule(c, varSet, poly1, args));
        ////////////////////////////////////////////////////
        vars = new ArrayList<>();
        varSet = new VariableSet();
        args = new ArrayList<>();
        for (int i = 0; i <= 3; i++) {
            Variable v = new Variable();
            vars.add(v);
            varSet.put(v);
        }
        args.add(vars.get(0));
        args.add(vars.get(1));
        c = new Configuration();
        poly1 = new Polynomial();
        poly1.add(args.get(1));
        c.add(new Pair(poly1, vars.get(2)));
        poly1 = new Polynomial();
        answerArgs = new ArrayList<>();
        poly2 = new Polynomial();
        poly2.add(args.get(1));
        answerArgs.add(poly2);
        poly1.add(new Answer(answer_Star_1, answerArgs));
        c.add(new Pair(poly1, vars.get(3)));
        poly1 = new Polynomial();
        poly1.add(vars.get(2));
        poly1.add(vars.get(3));
        g.addRule(answer_Star_1, new Rule(c, varSet, poly1, args));
        ////////////////////////////////////////////////////



        ////////////////////////////////////////////////////
        return g;
    }
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("ERROR: Expecting some input to parse!");
            System.exit(-1);
        }
        performTest(new PeanoAdderExampleNew(), args[0]);
    }
}