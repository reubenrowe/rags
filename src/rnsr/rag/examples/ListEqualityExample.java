package rnsr.rag.examples;
import rnsr.rag.grammar.*;
import rnsr.rag.grammar.exception.ArgumentMismatchException;
import rnsr.rag.grammar.exception.RuleFunctionException;
import rnsr.rag.grammar.exception.VariableNotFoundException;
import rnsr.rag.grammar.types.Type;

import java.util.ArrayList;
public class ListEqualityExample extends CommandLineInputBase {
    public Grammar CreateRAG() throws ArgumentMismatchException, RuleFunctionException, VariableNotFoundException {
        AnswerIdentifier nt_answer_Cons_2 = new AnswerIdentifier("Cons", 2);
        AnswerIdentifier nt_answer_MemOf_1 = new AnswerIdentifier("MemOf", 1);
        AnswerIdentifier nt_answer_Or_0 = new AnswerIdentifier("Or", 0);
        AnswerIdentifier nt_answer_Letter_0 = new AnswerIdentifier("Letter", 0);
        AnswerIdentifier nt_answer_Echo_0 = new AnswerIdentifier("Echo", 0);
        AnswerIdentifier nt_answer_Star_1 = new AnswerIdentifier("Star", 1);
        AnswerIdentifier nt_answer_Not_1 = new AnswerIdentifier("Not", 1);
        AnswerIdentifier nt_answer_Nil_0 = new AnswerIdentifier("Nil", 0);
        AnswerIdentifier nt_answer_Eq_1 = new AnswerIdentifier("Eq", 1);
        AnswerIdentifier tl_answer_3 = new AnswerIdentifier("T");
        AnswerIdentifier tl_answer_0 = new AnswerIdentifier("One");
        AnswerIdentifier tl_answer_4 = new AnswerIdentifier("F");
        AnswerIdentifier tl_answer_1 = new AnswerIdentifier("Two");
        AnswerIdentifier tl_answer_2 = new AnswerIdentifier("Three");
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
        ArrayList<Polynomial> args3 = new ArrayList<>();
        Polynomial poly4 = new Polynomial();
        poly4.add(new Answer(tl_answer_1));
        args3.add(poly4);
        Polynomial poly5 = new Polynomial();
        ArrayList<Polynomial> args4 = new ArrayList<>();
        Polynomial poly6 = new Polynomial();
        poly6.add(new Answer(tl_answer_2));
        args4.add(poly6);
        Polynomial poly7 = new Polynomial();
        poly7.add(new Answer(nt_answer_Nil_0));
        args4.add(poly7);
        poly5.add(new Answer(nt_answer_Cons_2, args4));
        args3.add(poly5);
        poly3.add(new Answer(nt_answer_Cons_2, args3));
        args2.add(poly3);
        poly1.add(new Answer(nt_answer_Cons_2, args2));
        args1.add(poly1);
        Grammar g = new Grammar(new Answer(nt_answer_MemOf_1, args1));
        ////////////////////////////////////////////////////
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
        poly2.add(new Answer(tl_answer_3));

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
        poly5.add(new Answer(tl_answer_4));

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
        poly2.add(new Answer(tl_answer_4));

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
        poly6.add(new Answer(tl_answer_4));

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
        for (int i = 0; i < 1; i++) {
            Variable v = new Variable();
            vars.add(v);
            varSet.put(v);
        }

        args1.add(new Polynomial(vars.get(0)));

        c = new Configuration();

        c.add(new Answer(tl_answer_4));

        c.add(new Answer(tl_answer_4));

        poly1 = new Polynomial();
        poly1.add(new Answer(tl_answer_4));

        g.addRule(nt_answer_Or_0, new Rule(c, varSet, poly1, args1, conditions));
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

        c.add(new Answer(tl_answer_3));

        c.add(new Answer(tl_answer_4));

        poly1 = new Polynomial();
        poly1.add(new Answer(tl_answer_3));

        g.addRule(nt_answer_Or_0, new Rule(c, varSet, poly1, args1, conditions));
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

        c.add(new Answer(tl_answer_3));

        poly1 = new Polynomial();
        poly1.add(new Answer(tl_answer_3));

        g.addRule(nt_answer_Or_0, new Rule(c, varSet, poly1, args1, conditions));
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

        c.add(new Answer(tl_answer_3));

        c.add(new Answer(tl_answer_3));

        poly1 = new Polynomial();
        poly1.add(new Answer(tl_answer_3));

        g.addRule(nt_answer_Or_0, new Rule(c, varSet, poly1, args1, conditions));
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
        poly1.add(new Answer(nt_answer_Nil_0));
        args1.add(poly1);

        c = new Configuration();

        poly2 = new Polynomial();
        args2 = new ArrayList<>();
        poly3 = new Polynomial();
        poly3.add(new Answer(nt_answer_Letter_0));
        args2.add(poly3);
        poly2.add(new Answer(nt_answer_Star_1, args2));
        c.add(new Pair(poly2, vars.get(1)));

        poly4 = new Polynomial();
        poly4.add(new Answer(tl_answer_4));

        g.addRule(nt_answer_MemOf_1, new Rule(c, varSet, poly4, args1, conditions));
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
        args2 = new ArrayList<>();
        poly2 = new Polynomial();
        poly2.add(vars.get(1));
        args2.add(poly2);
        poly3 = new Polynomial();
        poly3.add(vars.get(2));
        args2.add(poly3);
        poly1.add(new Answer(nt_answer_Cons_2, args2));
        args1.add(poly1);
        vars.get(1).setType(Type.WORD_TYPE);
        vars.get(2).setType(Type.ANSWER_TYPE);

        c = new Configuration();

        poly4 = new Polynomial();
        args2 = new ArrayList<>();
        poly5 = new Polynomial();
        poly5.add(new Answer(nt_answer_Echo_0));
        args2.add(poly5);
        poly4.add(new Answer(nt_answer_Star_1, args2));
        c.add(new Pair(poly4, vars.get(3)));

        poly6 = new Polynomial();
        poly7 = new Polynomial();
        poly7.add(new Answer(nt_answer_Or_0));
        Polynomial poly8 = new Polynomial();
        Polynomial poly9 = new Polynomial();
        args3 = new ArrayList<>();
        Polynomial poly10 = new Polynomial();
        poly10.add(vars.get(1));
        args3.add(poly10);
        poly9.add(new Answer(nt_answer_Eq_1, args3));
        Polynomial poly11 = new Polynomial();
        poly11.add(vars.get(3));
        poly8.add(new Query(poly9, poly11));
        Polynomial poly12 = new Polynomial();
        args4 = new ArrayList<>();
        Polynomial poly13 = new Polynomial();
        poly13.add(vars.get(2));
        args4.add(poly13);
        poly12.add(new Answer(nt_answer_MemOf_1, args4));
        Polynomial poly14 = new Polynomial();
        poly14.add(vars.get(3));
        poly8.add(new Query(poly12, poly14));
        poly6.add(new Query(poly7, poly8));

        g.addRule(nt_answer_MemOf_1, new Rule(c, varSet, poly6, args1, conditions));
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
        poly2.add(new Answer(AnswerIdentifier.Lambda()));

        g.addRule(nt_answer_Letter_0, new Rule(c, varSet, poly2, args1, conditions));
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
        return g;
    }
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("ERROR: Expecting some input to parse!");
            System.exit(-1);
        }
        performTest(new ListEqualityExample(), args[0]);
    }
}