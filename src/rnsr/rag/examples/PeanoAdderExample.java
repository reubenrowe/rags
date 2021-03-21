package rnsr.rag.examples;
import rnsr.rag.grammar.*;
import rnsr.rag.grammar.exception.ArgumentMismatchException;
import rnsr.rag.grammar.exception.RuleFunctionException;
import rnsr.rag.grammar.exception.VariableNotFoundException;

import java.util.ArrayList;
public class PeanoAdderExample extends CommandLineInputBase {
    public Grammar CreateRAG() throws ArgumentMismatchException, RuleFunctionException, VariableNotFoundException {
        AnswerIdentifier nt_answer_Add_0 = new AnswerIdentifier("Add", 0);
        AnswerIdentifier nt_answer_Num_0 = new AnswerIdentifier("Num", 0);
        AnswerIdentifier nt_answer_Inc_0 = new AnswerIdentifier("Inc", 0);
        AnswerIdentifier nt_answer_ReArr_0 = new AnswerIdentifier("ReArr", 0);
        AnswerIdentifier nt_answer_Dec_0 = new AnswerIdentifier("Dec", 0);
        AnswerIdentifier tl_answer_1 = new AnswerIdentifier("s");
        AnswerIdentifier tl_answer_2 = new AnswerIdentifier("0");
        AnswerIdentifier tl_answer_0 = new AnswerIdentifier("+");
        ArrayList<Variable> vars;
        ArrayList<VariableCondition> conditions;
        VariableSet varSet;
        Configuration c;
        ////////////////////////////////////////////////////
        ArrayList<Polynomial> args1;
        Grammar g = new Grammar(new Answer(nt_answer_Add_0));
        ////////////////////////////////////////////////////
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

        Polynomial poly1 = new Polynomial();
        poly1.add(new Answer(nt_answer_Num_0));
        c.add(new Pair(poly1, vars.get(1)));

        c.add(new Answer(tl_answer_0));

        Polynomial poly2 = new Polynomial();
        poly2.add(new Answer(nt_answer_Add_0));
        c.add(new Pair(poly2, vars.get(2)));

        Polynomial poly3 = new Polynomial();
        Polynomial poly4 = new Polynomial();
        poly4.add(new Answer(nt_answer_ReArr_0));
        Polynomial poly5 = new Polynomial();
        poly5.add(vars.get(1));
        poly5.add(new Answer(tl_answer_0));
        poly5.add(vars.get(2));
        poly3.add(new Query(poly4, poly5));

        g.addRule(nt_answer_Add_0, new Rule(c, varSet, poly3, args1, conditions));
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
        poly1.add(new Answer(nt_answer_Num_0));
        c.add(new Pair(poly1, vars.get(1)));

        poly2 = new Polynomial();
        poly2.add(vars.get(1));

        g.addRule(nt_answer_Add_0, new Rule(c, varSet, poly2, args1, conditions));
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
        poly1.add(new Answer(nt_answer_Num_0));
        c.add(new Pair(poly1, vars.get(1)));

        poly2 = new Polynomial();
        poly2.add(new Answer(tl_answer_1));
        poly2.add(vars.get(1));

        g.addRule(nt_answer_Num_0, new Rule(c, varSet, poly2, args1, conditions));
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

        c.add(new Answer(tl_answer_2));

        poly1 = new Polynomial();
        poly1.add(new Answer(tl_answer_2));

        g.addRule(nt_answer_Num_0, new Rule(c, varSet, poly1, args1, conditions));
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
        poly1.add(new Answer(nt_answer_Num_0));
        c.add(new Pair(poly1, vars.get(1)));

        c.add(new Answer(tl_answer_0));

        c.add(new Answer(tl_answer_2));

        poly2 = new Polynomial();
        poly2.add(vars.get(1));

        g.addRule(nt_answer_ReArr_0, new Rule(c, varSet, poly2, args1, conditions));
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
        poly1.add(new Answer(nt_answer_Num_0));
        c.add(new Pair(poly1, vars.get(1)));

        c.add(new Answer(tl_answer_0));

        poly2 = new Polynomial();
        poly2.add(new Answer(nt_answer_Num_0));
        c.add(new Pair(poly2, vars.get(2)));

        poly3 = new Polynomial();
        poly4 = new Polynomial();
        poly4.add(new Answer(nt_answer_ReArr_0));
        poly5 = new Polynomial();
        Polynomial poly6 = new Polynomial();
        poly6.add(new Answer(nt_answer_Inc_0));
        Polynomial poly7 = new Polynomial();
        poly7.add(vars.get(1));
        poly5.add(new Query(poly6, poly7));
        poly5.add(new Answer(tl_answer_0));
        Polynomial poly8 = new Polynomial();
        poly8.add(new Answer(nt_answer_Dec_0));
        Polynomial poly9 = new Polynomial();
        poly9.add(vars.get(2));
        poly5.add(new Query(poly8, poly9));
        poly3.add(new Query(poly4, poly5));

        g.addRule(nt_answer_ReArr_0, new Rule(c, varSet, poly3, args1, conditions));
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
        poly1.add(new Answer(nt_answer_Num_0));
        c.add(new Pair(poly1, vars.get(1)));

        poly2 = new Polynomial();
        poly2.add(new Answer(tl_answer_1));
        poly2.add(vars.get(1));

        g.addRule(nt_answer_Inc_0, new Rule(c, varSet, poly2, args1, conditions));
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
        poly1.add(new Answer(nt_answer_Num_0));
        c.add(new Pair(poly1, vars.get(1)));

        poly2 = new Polynomial();
        poly2.add(vars.get(1));

        g.addRule(nt_answer_Dec_0, new Rule(c, varSet, poly2, args1, conditions));
        //////////////////////////////////////////////////
        return g;
    }
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("ERROR: Expecting some input to parse!");
            System.exit(-1);
        }
        performTest(new PeanoAdderExample(), args[0]);
    }
}