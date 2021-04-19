package rnsr.rag.examples;

import rnsr.rag.TestHarness;
import rnsr.rag.grammar.*;
import rnsr.rag.grammar.exception.ArgumentMismatchException;
import rnsr.rag.grammar.exception.RuleFunctionException;
import rnsr.rag.grammar.exception.VariableNotFoundException;
import rnsr.rag.grammar.types.Type;

import java.util.ArrayList;
public class DerefExample {
    public Grammar CreateRAG() throws ArgumentMismatchException, RuleFunctionException, VariableNotFoundException {
        AnswerIdentifier nt_answer_DeRef_1 = new AnswerIdentifier("DeRef", 1);
        AnswerIdentifier nt_answer_Echo_0 = new AnswerIdentifier("Echo", 0);
        AnswerIdentifier nt_answer_Letter_0 = new AnswerIdentifier("Letter", 0);
        AnswerIdentifier nt_answer_False_0 = new AnswerIdentifier("False", 0);
        AnswerIdentifier nt_answer_Star_1 = new AnswerIdentifier("Star", 1);
        AnswerIdentifier nt_answer_Map_3 = new AnswerIdentifier("Map", 3);
        AnswerIdentifier nt_answer_Not_1 = new AnswerIdentifier("Not", 1);
        AnswerIdentifier nt_answer_True_0 = new AnswerIdentifier("True", 0);
        AnswerIdentifier nt_answer_Eq_1 = new AnswerIdentifier("Eq", 1);
        AnswerIdentifier tl_answer_6 = new AnswerIdentifier("T");
        AnswerIdentifier tl_answer_4 = new AnswerIdentifier("c");
        AnswerIdentifier tl_answer_2 = new AnswerIdentifier("b");
        AnswerIdentifier tl_answer_3 = new AnswerIdentifier("2");
        AnswerIdentifier tl_answer_0 = new AnswerIdentifier("a");
        AnswerIdentifier tl_answer_1 = new AnswerIdentifier("1");
        AnswerIdentifier tl_answer_7 = new AnswerIdentifier("F");
        AnswerIdentifier tl_answer_5 = new AnswerIdentifier("5");
        ArrayList<Variable> vars;
        ArrayList<VariableCondition> conditions;
        VariableSet varSet;
        Configuration c;
        ////////////////////////////////////////////////////
        ArrayList<Polynomial> args1 = new ArrayList<>();
        Polynomial poly1 = new Polynomial();
        ArrayList<Polynomial> args2 = new ArrayList<>();
        Polynomial poly2 = new Polynomial();
        poly2.add(new Answer(tl_answer_0));
        args2.add(poly2);
        Polynomial poly3 = new Polynomial();
        poly3.add(new Answer(tl_answer_1));
        args2.add(poly3);
        Polynomial poly4 = new Polynomial();
        ArrayList<Polynomial> args3 = new ArrayList<>();
        Polynomial poly5 = new Polynomial();
        poly5.add(new Answer(tl_answer_2));
        args3.add(poly5);
        Polynomial poly6 = new Polynomial();
        poly6.add(new Answer(tl_answer_3));
        args3.add(poly6);
        Polynomial poly7 = new Polynomial();
        ArrayList<Polynomial> args4 = new ArrayList<>();
        Polynomial poly8 = new Polynomial();
        poly8.add(new Answer(tl_answer_4));
        args4.add(poly8);
        Polynomial poly9 = new Polynomial();
        poly9.add(new Answer(tl_answer_5));
        args4.add(poly9);
        Polynomial poly10 = new Polynomial();
        poly10.add(new Answer(AnswerIdentifier.Lambda()));
        args4.add(poly10);
        poly7.add(new Answer(nt_answer_Map_3, args4));
        args3.add(poly7);
        poly4.add(new Answer(nt_answer_Map_3, args3));
        args2.add(poly4);
        poly1.add(new Answer(nt_answer_Map_3, args2));
        args1.add(poly1);
        Grammar g = new Grammar(new Answer(nt_answer_DeRef_1, args1));
        ////////////////////////////////////////////////////
        vars = new ArrayList<>();
        varSet = new VariableSet();
        args1 = new ArrayList<>();
        conditions = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            Variable v = new Variable();
            vars.add(v);
            varSet.put(v);
        }

        args1.add(new Polynomial(vars.get(0)));
        poly1 = new Polynomial();
        args2 = new ArrayList<>();
        poly2 = new Polynomial();
        poly2.add(vars.get(1));
        args2.add(poly2);
        poly3 = new Polynomial();
        poly3.add(vars.get(2));
        args2.add(poly3);
        poly4 = new Polynomial();
        poly4.add(vars.get(3));
        args2.add(poly4);
        poly1.add(new Answer(nt_answer_Map_3, args2));
        args1.add(poly1);

        c = new Configuration();

        poly5 = new Polynomial();
        args2 = new ArrayList<>();
        poly6 = new Polynomial();
        poly6.add(new Answer(nt_answer_Echo_0));
        args2.add(poly6);
        poly5.add(new Answer(nt_answer_Star_1, args2));
        c.add(new Pair(poly5, vars.get(4)));

        poly7 = new Polynomial();
        poly8 = new Polynomial();
        poly8.add(new Answer(nt_answer_True_0));
        poly9 = new Polynomial();
        poly10 = new Polynomial();
        args3 = new ArrayList<>();
        Polynomial poly11 = new Polynomial();
        poly11.add(vars.get(1));
        args3.add(poly11);
        poly10.add(new Answer(nt_answer_Eq_1, args3));
        Polynomial poly12 = new Polynomial();
        poly12.add(vars.get(4));
        poly9.add(new Query(poly10, poly12));
        poly7.add(new Query(poly8, poly9));
        c.add(new Pair(poly7, vars.get(5)));

        Polynomial poly13 = new Polynomial();
        poly13.add(vars.get(2));

        g.addRule(nt_answer_DeRef_1, new Rule(c, varSet, poly13, args1, conditions));
        //////////////////////////////////////////////////
        vars = new ArrayList<>();
        varSet = new VariableSet();
        args1 = new ArrayList<>();
        conditions = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            Variable v = new Variable();
            vars.add(v);
            varSet.put(v);
        }

        args1.add(new Polynomial(vars.get(0)));
        poly1 = new Polynomial();
        args2 = new ArrayList<>();
        poly2 = new Polynomial();
        poly2.add(vars.get(1));
        args2.add(poly2);
        poly3 = new Polynomial();
        poly3.add(vars.get(2));
        args2.add(poly3);
        poly4 = new Polynomial();
        poly4.add(vars.get(3));
        args2.add(poly4);
        poly1.add(new Answer(nt_answer_Map_3, args2));
        args1.add(poly1);

        c = new Configuration();

        poly5 = new Polynomial();
        args2 = new ArrayList<>();
        poly6 = new Polynomial();
        poly6.add(new Answer(nt_answer_Echo_0));
        args2.add(poly6);
        poly5.add(new Answer(nt_answer_Star_1, args2));
        c.add(new Pair(poly5, vars.get(4)));

        poly7 = new Polynomial();
        poly8 = new Polynomial();
        poly8.add(new Answer(nt_answer_False_0));
        poly9 = new Polynomial();
        poly10 = new Polynomial();
        args3 = new ArrayList<>();
        poly11 = new Polynomial();
        poly11.add(vars.get(1));
        args3.add(poly11);
        poly10.add(new Answer(nt_answer_Eq_1, args3));
        poly12 = new Polynomial();
        poly12.add(vars.get(4));
        poly9.add(new Query(poly10, poly12));
        poly7.add(new Query(poly8, poly9));
        c.add(new Pair(poly7, vars.get(5)));

        poly13 = new Polynomial();
        Polynomial poly14 = new Polynomial();
        args4 = new ArrayList<>();
        Polynomial poly15 = new Polynomial();
        poly15.add(vars.get(3));
        args4.add(poly15);
        poly14.add(new Answer(nt_answer_DeRef_1, args4));
        Polynomial poly16 = new Polynomial();
        poly16.add(vars.get(4));
        poly13.add(new Query(poly14, poly16));

        g.addRule(nt_answer_DeRef_1, new Rule(c, varSet, poly13, args1, conditions));
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
        poly1 = new Polynomial();
        poly1.add(new Answer(AnswerIdentifier.Lambda()));
        args1.add(poly1);

        c = new Configuration();

        poly2 = new Polynomial();
        args2 = new ArrayList<>();
        poly3 = new Polynomial();
        poly3.add(new Answer(nt_answer_Echo_0));
        args2.add(poly3);
        poly2.add(new Answer(nt_answer_Star_1, args2));
        c.add(new Pair(poly2, vars.get(1)));

        poly4 = new Polynomial();
        poly4.add(new Answer(AnswerIdentifier.Lambda()));

        g.addRule(nt_answer_DeRef_1, new Rule(c, varSet, poly4, args1, conditions));
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
        poly2.add(new Answer(tl_answer_6));

        g.addRule(nt_answer_Eq_1, new Rule(c, varSet, poly2, args1, conditions));
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
        poly1.add(new Answer(AnswerIdentifier.Lambda()));
        args1.add(poly1);

        c = new Configuration();

        poly2 = new Polynomial();
        poly2.add(new Answer(nt_answer_Letter_0));
        c.add(new Pair(poly2, vars.get(1)));

        poly3 = new Polynomial();
        args2 = new ArrayList<>();
        poly4 = new Polynomial();
        poly4.add(new Answer(nt_answer_Letter_0));
        args2.add(poly4);
        poly3.add(new Answer(nt_answer_Star_1, args2));
        c.add(new Pair(poly3, vars.get(2)));

        poly5 = new Polynomial();
        poly5.add(new Answer(tl_answer_7));

        g.addRule(nt_answer_Eq_1, new Rule(c, varSet, poly5, args1, conditions));
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
        poly1.add(vars.get(1));
        poly1.add(vars.get(2));
        args1.add(poly1);
        vars.get(1).setType(Type.LETTER_TYPE);
        vars.get(2).setType(Type.WORD_TYPE);

        c = new Configuration();

        c.add(new Answer(AnswerIdentifier.Lambda()));

        poly2 = new Polynomial();
        poly2.add(new Answer(tl_answer_7));

        g.addRule(nt_answer_Eq_1, new Rule(c, varSet, poly2, args1, conditions));
        //////////////////////////////////////////////////
        vars = new ArrayList<>();
        varSet = new VariableSet();
        args1 = new ArrayList<>();
        conditions = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Variable v = new Variable();
            vars.add(v);
            varSet.put(v);
        }

        args1.add(new Polynomial(vars.get(0)));
        poly1 = new Polynomial();
        poly1.add(vars.get(1));
        poly1.add(vars.get(2));
        args1.add(poly1);
        vars.get(1).setType(Type.LETTER_TYPE);
        vars.get(2).setType(Type.WORD_TYPE);

        c = new Configuration();

        poly2 = new Polynomial();
        args2 = new ArrayList<>();
        poly3 = new Polynomial();
        poly3.add(vars.get(1));
        args2.add(poly3);
        poly2.add(new Answer(nt_answer_Not_1, args2));
        c.add(new Pair(poly2, vars.get(3)));

        poly4 = new Polynomial();
        args3 = new ArrayList<>();
        poly5 = new Polynomial();
        poly5.add(new Answer(nt_answer_Letter_0));
        args3.add(poly5);
        poly4.add(new Answer(nt_answer_Star_1, args3));
        c.add(new Pair(poly4, vars.get(4)));

        poly6 = new Polynomial();
        poly6.add(new Answer(tl_answer_7));

        g.addRule(nt_answer_Eq_1, new Rule(c, varSet, poly6, args1, conditions));
        //////////////////////////////////////////////////
        vars = new ArrayList<>();
        varSet = new VariableSet();
        args1 = new ArrayList<>();
        conditions = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Variable v = new Variable();
            vars.add(v);
            varSet.put(v);
        }

        args1.add(new Polynomial(vars.get(0)));
        poly1 = new Polynomial();
        poly1.add(vars.get(1));
        poly1.add(vars.get(2));
        args1.add(poly1);
        vars.get(1).setType(Type.LETTER_TYPE);
        vars.get(2).setType(Type.WORD_TYPE);

        c = new Configuration();

        poly2 = new Polynomial();
        poly2.add(vars.get(1));
        c.add(new Pair(poly2, vars.get(3)));

        poly3 = new Polynomial();
        args2 = new ArrayList<>();
        poly4 = new Polynomial();
        poly4.add(vars.get(2));
        args2.add(poly4);
        poly3.add(new Answer(nt_answer_Eq_1, args2));
        c.add(new Pair(poly3, vars.get(4)));

        poly5 = new Polynomial();
        poly5.add(vars.get(4));

        g.addRule(nt_answer_Eq_1, new Rule(c, varSet, poly5, args1, conditions));
        //////////////////////////////////////////////////
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
        poly1 = new Polynomial();
        poly1.add(vars.get(1));
        args1.add(poly1);
        vars.get(1).setType(Type.LETTER_TYPE);
        vars.get(2).setType(Type.LETTER_TYPE);
        conditions.add(new VariableCondition(vars.get(1), vars.get(2), VariableCondition.VariableConditionType.NE));

        c = new Configuration();

        poly2 = new Polynomial();
        poly2.add(vars.get(2));
        c.add(new Pair(poly2, vars.get(3)));

        poly3 = new Polynomial();
        poly3.add(new Answer(AnswerIdentifier.Lambda()));

        g.addRule(nt_answer_Not_1, new Rule(c, varSet, poly3, args1, conditions));
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
        poly1 = new Polynomial();
        poly1.add(vars.get(1));
        args1.add(poly1);

        c = new Configuration();

        c.add(new Answer(AnswerIdentifier.Lambda()));

        poly2 = new Polynomial();
        poly2.add(new Answer(AnswerIdentifier.Lambda()));

        g.addRule(nt_answer_Star_1, new Rule(c, varSet, poly2, args1, conditions));
        //////////////////////////////////////////////////
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
        poly1 = new Polynomial();
        poly1.add(vars.get(1));
        args1.add(poly1);

        c = new Configuration();

        poly2 = new Polynomial();
        poly2.add(vars.get(1));
        c.add(new Pair(poly2, vars.get(2)));

        poly3 = new Polynomial();
        args2 = new ArrayList<>();
        poly4 = new Polynomial();
        poly4.add(vars.get(1));
        args2.add(poly4);
        poly3.add(new Answer(nt_answer_Star_1, args2));
        c.add(new Pair(poly3, vars.get(3)));

        poly5 = new Polynomial();
        poly5.add(vars.get(2));
        poly5.add(vars.get(3));

        g.addRule(nt_answer_Star_1, new Rule(c, varSet, poly5, args1, conditions));
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
        vars.get(1).setType(Type.LETTER_TYPE);

        c = new Configuration();

        poly1 = new Polynomial();
        poly1.add(vars.get(1));
        c.add(new Pair(poly1, vars.get(2)));

        poly2 = new Polynomial();
        poly2.add(vars.get(2));

        g.addRule(nt_answer_Echo_0, new Rule(c, varSet, poly2, args1, conditions));
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
        vars.get(1).setType(Type.LETTER_TYPE);

        c = new Configuration();

        poly1 = new Polynomial();
        poly1.add(vars.get(1));
        c.add(new Pair(poly1, vars.get(2)));

        poly2 = new Polynomial();
        poly2.add(new Answer(AnswerIdentifier.Lambda()));

        g.addRule(nt_answer_Letter_0, new Rule(c, varSet, poly2, args1, conditions));
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

        c.add(new Answer(tl_answer_6));

        poly1 = new Polynomial();
        poly1.add(new Answer(AnswerIdentifier.Lambda()));

        g.addRule(nt_answer_True_0, new Rule(c, varSet, poly1, args1, conditions));
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

        c.add(new Answer(tl_answer_7));

        poly1 = new Polynomial();
        poly1.add(new Answer(AnswerIdentifier.Lambda()));

        g.addRule(nt_answer_False_0, new Rule(c, varSet, poly1, args1, conditions));
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
            g = new DerefExample().CreateRAG();
        } catch (Exception e) {
            System.err.println("Could no create grammar!");
            e.printStackTrace(System.err);
        }
        TestHarness.runGrammar(g, args[0]);
    }
}