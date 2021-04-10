package rnsr.rag.examples;

import rnsr.rag.TestHarness;
import rnsr.rag.grammar.*;
import rnsr.rag.grammar.exception.ArgumentMismatchException;
import rnsr.rag.grammar.exception.RuleFunctionException;
import rnsr.rag.grammar.exception.VariableNotFoundException;

import java.util.ArrayList;
public class TripleABC {
    public Grammar CreateRAG() throws ArgumentMismatchException, RuleFunctionException, VariableNotFoundException {
        AnswerIdentifier nt_answer_A_0 = new AnswerIdentifier("A", 0);
        AnswerIdentifier nt_answer_SubB_1 = new AnswerIdentifier("SubB", 1);
        AnswerIdentifier nt_answer_S_0 = new AnswerIdentifier("S", 0);
        AnswerIdentifier nt_answer_SubC_1 = new AnswerIdentifier("SubC", 1);
        AnswerIdentifier tl_answer_2 = new AnswerIdentifier("c");
        AnswerIdentifier tl_answer_1 = new AnswerIdentifier("b");
        AnswerIdentifier tl_answer_0 = new AnswerIdentifier("a");
        ArrayList<Variable> vars;
        ArrayList<VariableCondition> conditions;
        VariableSet varSet;
        Configuration c;
        ////////////////////////////////////////////////////
        ArrayList<Polynomial> args1;
        Grammar g = new Grammar(new Answer(nt_answer_S_0));
        ////////////////////////////////////////////////////
        vars = new ArrayList<>();
        varSet = new VariableSet();
        args1 = new ArrayList<>();
        conditions = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            Variable v = new Variable();
            vars.add(v);
            varSet.put(v);
        }

        args1.add(new Polynomial(vars.get(0)));

        c = new Configuration();

        Polynomial poly1 = new Polynomial();
        poly1.add(new Answer(nt_answer_A_0));
        c.add(new Pair(poly1, vars.get(1)));

        Polynomial poly2 = new Polynomial();
        ArrayList<Polynomial> args2 = new ArrayList<>();
        Polynomial poly3 = new Polynomial();
        poly3.add(vars.get(1));
        args2.add(poly3);
        poly2.add(new Answer(nt_answer_SubB_1, args2));
        c.add(new Pair(poly2, vars.get(2)));

        Polynomial poly4 = new Polynomial();
        ArrayList<Polynomial> args3 = new ArrayList<>();
        Polynomial poly5 = new Polynomial();
        poly5.add(vars.get(1));
        args3.add(poly5);
        poly4.add(new Answer(nt_answer_SubC_1, args3));
        c.add(new Pair(poly4, vars.get(3)));

        Polynomial poly6 = new Polynomial();
        poly6.add(new Answer(AnswerIdentifier.Lambda()));

        g.addRule(nt_answer_S_0, new Rule(c, varSet, poly6, args1, conditions));
        //////////////////////////////////////////////////
        vars = new ArrayList<>();
        varSet = new VariableSet();
        args1 = new ArrayList<>();
        conditions = new ArrayList<>();
        for (int i = 0; i < 1; i++) {
            Variable v = new Variable();
            vars.add(v);
            varSet.put(v);
        }

        args1.add(new Polynomial(vars.get(0)));

        c = new Configuration();

        c.add(new Answer(AnswerIdentifier.Lambda()));

        poly1 = new Polynomial();
        poly1.add(new Answer(AnswerIdentifier.Lambda()));

        g.addRule(nt_answer_A_0, new Rule(c, varSet, poly1, args1, conditions));
        //////////////////////////////////////////////////
        vars = new ArrayList<>();
        varSet = new VariableSet();
        args1 = new ArrayList<>();
        conditions = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            Variable v = new Variable();
            vars.add(v);
            varSet.put(v);
        }

        args1.add(new Polynomial(vars.get(0)));

        c = new Configuration();

        c.add(new Answer(tl_answer_0));

        poly1 = new Polynomial();
        poly1.add(new Answer(nt_answer_A_0));
        c.add(new Pair(poly1, vars.get(1)));

        poly2 = new Polynomial();
        poly2.add(new Answer(tl_answer_0));
        poly2.add(vars.get(1));

        g.addRule(nt_answer_A_0, new Rule(c, varSet, poly2, args1, conditions));
        //////////////////////////////////////////////////
        vars = new ArrayList<>();
        varSet = new VariableSet();
        args1 = new ArrayList<>();
        conditions = new ArrayList<>();
        for (int i = 0; i < 1; i++) {
            Variable v = new Variable();
            vars.add(v);
            varSet.put(v);
        }

        args1.add(new Polynomial(vars.get(0)));
        poly1 = new Polynomial();
        poly1.add(new Answer(AnswerIdentifier.Lambda()));
        args1.add(poly1);

        c = new Configuration();

        c.add(new Answer(AnswerIdentifier.Lambda()));

        poly2 = new Polynomial();
        poly2.add(new Answer(AnswerIdentifier.Lambda()));

        g.addRule(nt_answer_SubB_1, new Rule(c, varSet, poly2, args1, conditions));
        //////////////////////////////////////////////////
        vars = new ArrayList<>();
        varSet = new VariableSet();
        args1 = new ArrayList<>();
        conditions = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Variable v = new Variable();
            vars.add(v);
            varSet.put(v);
        }

        args1.add(new Polynomial(vars.get(0)));
        poly1 = new Polynomial();
        poly1.add(new Answer(tl_answer_0));
        poly1.add(vars.get(1));
        args1.add(poly1);

        c = new Configuration();

        c.add(new Answer(tl_answer_1));

        poly2 = new Polynomial();
        args2 = new ArrayList<>();
        poly3 = new Polynomial();
        poly3.add(vars.get(1));
        args2.add(poly3);
        poly2.add(new Answer(nt_answer_SubB_1, args2));
        c.add(new Pair(poly2, vars.get(2)));

        poly4 = new Polynomial();
        poly4.add(new Answer(AnswerIdentifier.Lambda()));

        g.addRule(nt_answer_SubB_1, new Rule(c, varSet, poly4, args1, conditions));
        //////////////////////////////////////////////////
        vars = new ArrayList<>();
        varSet = new VariableSet();
        args1 = new ArrayList<>();
        conditions = new ArrayList<>();
        for (int i = 0; i < 1; i++) {
            Variable v = new Variable();
            vars.add(v);
            varSet.put(v);
        }

        args1.add(new Polynomial(vars.get(0)));
        poly1 = new Polynomial();
        poly1.add(new Answer(AnswerIdentifier.Lambda()));
        args1.add(poly1);

        c = new Configuration();

        c.add(new Answer(AnswerIdentifier.Lambda()));

        poly2 = new Polynomial();
        poly2.add(new Answer(AnswerIdentifier.Lambda()));

        g.addRule(nt_answer_SubC_1, new Rule(c, varSet, poly2, args1, conditions));
        //////////////////////////////////////////////////
        vars = new ArrayList<>();
        varSet = new VariableSet();
        args1 = new ArrayList<>();
        conditions = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Variable v = new Variable();
            vars.add(v);
            varSet.put(v);
        }

        args1.add(new Polynomial(vars.get(0)));
        poly1 = new Polynomial();
        poly1.add(new Answer(tl_answer_0));
        poly1.add(vars.get(1));
        args1.add(poly1);

        c = new Configuration();

        c.add(new Answer(tl_answer_2));

        poly2 = new Polynomial();
        args2 = new ArrayList<>();
        poly3 = new Polynomial();
        poly3.add(vars.get(1));
        args2.add(poly3);
        poly2.add(new Answer(nt_answer_SubC_1, args2));
        c.add(new Pair(poly2, vars.get(2)));

        poly4 = new Polynomial();
        poly4.add(new Answer(AnswerIdentifier.Lambda()));

        g.addRule(nt_answer_SubC_1, new Rule(c, varSet, poly4, args1, conditions));
        //////////////////////////////////////////////////
        return g;
    }
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("ERROR: Expecting some input to parse!");
            System.exit(-1);
        }
        Grammar g = null;
        try {
            g = new TripleABC().CreateRAG();
        } catch (Exception e) {
            System.err.println("Could no create grammar!");
            e.printStackTrace(System.err);
        }
        TestHarness.runGrammar(g, args[0]);
    }
}