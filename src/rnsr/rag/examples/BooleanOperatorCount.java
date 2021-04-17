package rnsr.rag.examples;

import rnsr.rag.TestHarness;
import rnsr.rag.grammar.*;
import rnsr.rag.grammar.exception.ArgumentMismatchException;
import rnsr.rag.grammar.exception.RuleFunctionException;
import rnsr.rag.grammar.exception.VariableNotFoundException;

import java.util.ArrayList;
public class BooleanOperatorCount {
    public Grammar CreateRAG() throws ArgumentMismatchException, RuleFunctionException, VariableNotFoundException {
        AnswerIdentifier nt_answer_D_0 = new AnswerIdentifier("D", 0);
        AnswerIdentifier nt_answer_S_0 = new AnswerIdentifier("S", 0);
        AnswerIdentifier nt_answer_F_0 = new AnswerIdentifier("F", 0);
        AnswerIdentifier nt_answer_E_0 = new AnswerIdentifier("E", 0);
        AnswerIdentifier nt_answer_Y_0 = new AnswerIdentifier("Y", 0);
        AnswerIdentifier tl_answer_1 = new AnswerIdentifier("s");
        AnswerIdentifier tl_answer_3 = new AnswerIdentifier("!");
        AnswerIdentifier tl_answer_5 = new AnswerIdentifier("1");
        AnswerIdentifier tl_answer_4 = new AnswerIdentifier("0");
        AnswerIdentifier tl_answer_0 = new AnswerIdentifier("|");
        AnswerIdentifier tl_answer_7 = new AnswerIdentifier(")");
        AnswerIdentifier tl_answer_6 = new AnswerIdentifier("(");
        AnswerIdentifier tl_answer_2 = new AnswerIdentifier("&");
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
        for (int i = 0; i < 2; i++) {
            Variable v = new Variable();
            vars.add(v);
            varSet.put(v);
        }

        args1.add(new Polynomial(vars.get(0)));

        c = new Configuration();

        Polynomial poly1 = new Polynomial();
        poly1.add(new Answer(nt_answer_E_0));
        c.add(new Pair(poly1, vars.get(1)));

        Polynomial poly2 = new Polynomial();
        poly2.add(vars.get(1));

        g.addRule(nt_answer_S_0, new Rule(c, varSet, poly2, args1, conditions));
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

        c = new Configuration();

        poly1 = new Polynomial();
        poly1.add(new Answer(nt_answer_E_0));
        c.add(new Pair(poly1, vars.get(1)));

        c.add(new Answer(tl_answer_0));

        poly2 = new Polynomial();
        poly2.add(new Answer(nt_answer_S_0));
        c.add(new Pair(poly2, vars.get(2)));

        Polynomial poly3 = new Polynomial();
        poly3.add(new Answer(tl_answer_1));
        poly3.add(vars.get(1));
        poly3.add(vars.get(2));

        g.addRule(nt_answer_S_0, new Rule(c, varSet, poly3, args1, conditions));
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

        poly1 = new Polynomial();
        poly1.add(new Answer(nt_answer_D_0));
        c.add(new Pair(poly1, vars.get(1)));

        poly2 = new Polynomial();
        poly2.add(vars.get(1));

        g.addRule(nt_answer_E_0, new Rule(c, varSet, poly2, args1, conditions));
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

        c = new Configuration();

        poly1 = new Polynomial();
        poly1.add(new Answer(nt_answer_D_0));
        c.add(new Pair(poly1, vars.get(1)));

        c.add(new Answer(tl_answer_2));

        poly2 = new Polynomial();
        poly2.add(new Answer(nt_answer_E_0));
        c.add(new Pair(poly2, vars.get(2)));

        poly3 = new Polynomial();
        poly3.add(new Answer(tl_answer_1));
        poly3.add(vars.get(1));
        poly3.add(vars.get(2));

        g.addRule(nt_answer_E_0, new Rule(c, varSet, poly3, args1, conditions));
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

        poly1 = new Polynomial();
        poly1.add(new Answer(nt_answer_F_0));
        c.add(new Pair(poly1, vars.get(1)));

        poly2 = new Polynomial();
        poly2.add(vars.get(1));

        g.addRule(nt_answer_D_0, new Rule(c, varSet, poly2, args1, conditions));
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

        c.add(new Answer(tl_answer_3));

        poly1 = new Polynomial();
        poly1.add(new Answer(nt_answer_F_0));
        c.add(new Pair(poly1, vars.get(1)));

        poly2 = new Polynomial();
        poly2.add(new Answer(tl_answer_1));
        poly2.add(vars.get(1));

        g.addRule(nt_answer_D_0, new Rule(c, varSet, poly2, args1, conditions));
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

        c.add(new Answer(tl_answer_4));

        poly1 = new Polynomial();
        poly1.add(new Answer(AnswerIdentifier.Lambda()));

        g.addRule(nt_answer_F_0, new Rule(c, varSet, poly1, args1, conditions));
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

        c.add(new Answer(tl_answer_5));

        poly1 = new Polynomial();
        poly1.add(new Answer(AnswerIdentifier.Lambda()));

        g.addRule(nt_answer_F_0, new Rule(c, varSet, poly1, args1, conditions));
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

        c.add(new Answer(tl_answer_6));

        poly1 = new Polynomial();
        poly1.add(new Answer(nt_answer_S_0));
        c.add(new Pair(poly1, vars.get(1)));

        c.add(new Answer(tl_answer_7));

        poly2 = new Polynomial();
        poly3 = new Polynomial();
        poly3.add(new Answer(nt_answer_Y_0));
        Polynomial poly4 = new Polynomial();
        poly4.add(vars.get(1));
        poly2.add(new Query(poly3, poly4));

        g.addRule(nt_answer_F_0, new Rule(c, varSet, poly2, args1, conditions));
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

        g.addRule(nt_answer_Y_0, new Rule(c, varSet, poly1, args1, conditions));
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

        c.add(new Answer(tl_answer_1));

        poly1 = new Polynomial();
        poly1.add(new Answer(nt_answer_Y_0));
        c.add(new Pair(poly1, vars.get(1)));

        poly2 = new Polynomial();
        poly2.add(new Answer(tl_answer_1));
        poly2.add(vars.get(1));

        g.addRule(nt_answer_Y_0, new Rule(c, varSet, poly2, args1, conditions));
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
            g = new BooleanOperatorCount().CreateRAG();
        } catch (Exception e) {
            System.err.println("Could no create grammar!");
            e.printStackTrace(System.err);
        }
        TestHarness.runGrammar(g, args[0]);
    }
}