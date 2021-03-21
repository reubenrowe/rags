package rnsr.rag.examples;
import rnsr.rag.grammar.*;
import rnsr.rag.grammar.exception.ArgumentMismatchException;
import rnsr.rag.grammar.exception.RuleFunctionException;
import rnsr.rag.grammar.exception.VariableNotFoundException;
import rnsr.rag.grammar.types.Type;

import java.util.ArrayList;
public class DeclarationExample extends CommandLineInputBase {
    public Grammar CreateRAG() throws ArgumentMismatchException, RuleFunctionException, VariableNotFoundException {
        AnswerIdentifier nt_answer_Echo_0 = new AnswerIdentifier("Echo", 0);
        AnswerIdentifier nt_answer_Prog_0 = new AnswerIdentifier("Prog", 0);
        AnswerIdentifier nt_answer_Star_1 = new AnswerIdentifier("Star", 1);
        AnswerIdentifier nt_answer_Notlet_1 = new AnswerIdentifier("Notlet", 1);
        AnswerIdentifier nt_answer_Combine_2 = new AnswerIdentifier("Combine", 2);
        AnswerIdentifier nt_answer_Def_0 = new AnswerIdentifier("Def", 0);
        AnswerIdentifier nt_answer_Decl_1 = new AnswerIdentifier("Decl", 1);
        AnswerIdentifier nt_answer_Not_0 = new AnswerIdentifier("Not", 0);
        AnswerIdentifier nt_answer_DeclList_1 = new AnswerIdentifier("DeclList", 1);
        AnswerIdentifier nt_answer_Union_2 = new AnswerIdentifier("Union", 2);
        AnswerIdentifier nt_answer_Stmt_1 = new AnswerIdentifier("Stmt", 1);
        AnswerIdentifier nt_answer_Letter_0 = new AnswerIdentifier("Letter", 0);
        AnswerIdentifier nt_answer_Map_2 = new AnswerIdentifier("Map", 2);
        AnswerIdentifier nt_answer_EmptySet_0 = new AnswerIdentifier("EmptySet", 0);
        AnswerIdentifier nt_answer_Undef_0 = new AnswerIdentifier("Undef", 0);
        AnswerIdentifier nt_answer_MakeEnv_0 = new AnswerIdentifier("MakeEnv", 0);
        AnswerIdentifier nt_answer_And_2 = new AnswerIdentifier("And", 2);
        AnswerIdentifier nt_answer_letter_0 = new AnswerIdentifier("letter", 0);
        AnswerIdentifier answer_EmptySet = new AnswerIdentifier("Empty", 0);
        AnswerIdentifier tl_answer_4 = new AnswerIdentifier("}");
        AnswerIdentifier tl_answer_1 = new AnswerIdentifier(";");
        AnswerIdentifier tl_answer_3 = new AnswerIdentifier("{");
        AnswerIdentifier tl_answer_0 = new AnswerIdentifier("int ");
        AnswerIdentifier tl_answer_2 = new AnswerIdentifier(" = ");
        ArrayList<Variable> vars;
        ArrayList<VariableCondition> conditions;
        VariableSet varSet;
        Configuration c;
        ////////////////////////////////////////////////////
        ArrayList<Polynomial> args1;
        Grammar g = new Grammar(new Answer(nt_answer_Prog_0));
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
        Polynomial poly1 = new Polynomial();
        poly1.add(vars.get(1));
        args1.add(poly1);
        Polynomial poly2 = new Polynomial();
        poly2.add(vars.get(2));
        args1.add(poly2);

        c = new Configuration();

        Polynomial poly3 = new Polynomial();
        ArrayList<Polynomial> args2 = new ArrayList<>();
        Polynomial poly4 = new Polynomial();
        poly4.add(new Answer(nt_answer_Echo_0));
        args2.add(poly4);
        poly3.add(new Answer(nt_answer_Star_1, args2));
        c.add(new Pair(poly3, vars.get(3)));

        Polynomial poly5 = new Polynomial();
        Polynomial poly6 = new Polynomial();
        poly6.add(vars.get(1));
        Polynomial poly7 = new Polynomial();
        poly7.add(vars.get(3));
        poly5.add(new Query(poly6, poly7));
        Polynomial poly8 = new Polynomial();
        poly8.add(vars.get(2));
        Polynomial poly9 = new Polynomial();
        poly9.add(vars.get(3));
        poly5.add(new Query(poly8, poly9));

        g.addRule(nt_answer_And_2, new Rule(c, varSet, poly5, args1, conditions));
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
        args1.add(poly1);
        poly2 = new Polynomial();
        poly2.add(vars.get(2));
        args1.add(poly2);

        c = new Configuration();

        c.add(new Answer(nt_answer_Undef_0));

        poly3 = new Polynomial();
        args2 = new ArrayList<>();
        poly4 = new Polynomial();
        poly5 = new Polynomial();
        poly5.add(vars.get(1));
        poly6 = new Polynomial();
        poly6.add(new Answer(nt_answer_Undef_0));
        poly4.add(new Query(poly5, poly6));
        args2.add(poly4);
        poly7 = new Polynomial();
        poly8 = new Polynomial();
        poly8.add(vars.get(2));
        poly9 = new Polynomial();
        poly9.add(new Answer(nt_answer_Undef_0));
        poly7.add(new Query(poly8, poly9));
        args2.add(poly7);
        poly3.add(new Answer(nt_answer_And_2, args2));

        g.addRule(nt_answer_Combine_2, new Rule(c, varSet, poly3, args1, conditions));
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
        args1.add(poly1);
        poly2 = new Polynomial();
        poly2.add(vars.get(2));
        args1.add(poly2);

        c = new Configuration();

        c.add(new Answer(nt_answer_Def_0));

        poly3 = new Polynomial();
        args2 = new ArrayList<>();
        poly4 = new Polynomial();
        poly5 = new Polynomial();
        poly5.add(vars.get(1));
        poly6 = new Polynomial();
        poly6.add(new Answer(nt_answer_Def_0));
        poly4.add(new Query(poly5, poly6));
        args2.add(poly4);
        poly7 = new Polynomial();
        poly8 = new Polynomial();
        poly8.add(vars.get(2));
        poly9 = new Polynomial();
        poly9.add(new Answer(nt_answer_Def_0));
        poly7.add(new Query(poly8, poly9));
        args2.add(poly7);
        poly3.add(new Answer(nt_answer_Union_2, args2));

        g.addRule(nt_answer_Combine_2, new Rule(c, varSet, poly3, args1, conditions));
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
        poly2.add(vars.get(1));

        g.addRule(nt_answer_DeclList_1, new Rule(c, varSet, poly2, args1, conditions));
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
        args2 = new ArrayList<>();
        poly3 = new Polynomial();
        poly3.add(vars.get(1));
        args2.add(poly3);
        poly2.add(new Answer(nt_answer_Decl_1, args2));
        c.add(new Pair(poly2, vars.get(2)));

        poly4 = new Polynomial();
        ArrayList<Polynomial> args3 = new ArrayList<>();
        poly5 = new Polynomial();
        poly5.add(vars.get(2));
        args3.add(poly5);
        poly4.add(new Answer(nt_answer_DeclList_1, args3));
        c.add(new Pair(poly4, vars.get(3)));

        poly6 = new Polynomial();
        poly6.add(vars.get(3));

        g.addRule(nt_answer_DeclList_1, new Rule(c, varSet, poly6, args1, conditions));
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

        c.add(new Answer(tl_answer_0));

        poly2 = new Polynomial();
        poly2.add(new Answer(nt_answer_Echo_0));
        args2 = new ArrayList<>();
        poly3 = new Polynomial();
        poly3.add(new Answer(nt_answer_Echo_0));
        args2.add(poly3);
        poly2.add(new Answer(nt_answer_Star_1, args2));
        c.add(new Pair(poly2, vars.get(2)));

        poly4 = new Polynomial();
        poly5 = new Polynomial();
        poly6 = new Polynomial();
        poly6.add(vars.get(1));
        poly7 = new Polynomial();
        poly7.add(new Answer(nt_answer_Undef_0));
        poly5.add(new Query(poly6, poly7));
        poly8 = new Polynomial();
        poly8.add(vars.get(2));
        poly4.add(new Query(poly5, poly8));
        c.add(new Pair(poly4, vars.get(3)));

        c.add(new Answer(tl_answer_1));

        poly9 = new Polynomial();
        args3 = new ArrayList<>();
        Polynomial poly10 = new Polynomial();
        poly10.add(vars.get(1));
        args3.add(poly10);
        Polynomial poly11 = new Polynomial();
        Polynomial poly12 = new Polynomial();
        poly12.add(new Answer(nt_answer_MakeEnv_0));
        Polynomial poly13 = new Polynomial();
        poly13.add(vars.get(2));
        poly11.add(new Query(poly12, poly13));
        args3.add(poly11);
        poly9.add(new Answer(nt_answer_Combine_2, args3));

        g.addRule(nt_answer_Decl_1, new Rule(c, varSet, poly9, args1, conditions));
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
        poly3 = new Polynomial();
        poly3.add(vars.get(1));
        poly4 = new Polynomial();
        poly4.add(new Answer(nt_answer_Def_0));
        poly2.add(new Query(poly3, poly4));
        c.add(new Pair(poly2, vars.get(2)));

        c.add(new Answer(tl_answer_2));

        poly5 = new Polynomial();
        poly6 = new Polynomial();
        poly6.add(vars.get(1));
        poly7 = new Polynomial();
        poly7.add(new Answer(nt_answer_Def_0));
        poly5.add(new Query(poly6, poly7));
        c.add(new Pair(poly5, vars.get(3)));

        c.add(new Answer(tl_answer_1));

        poly8 = new Polynomial();
        poly8.add(new Answer(AnswerIdentifier.Lambda()));

        g.addRule(nt_answer_Stmt_1, new Rule(c, varSet, poly8, args1, conditions));
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

        c.add(new Answer(tl_answer_3));

        poly1 = new Polynomial();
        args2 = new ArrayList<>();
        poly2 = new Polynomial();
        args3 = new ArrayList<>();
        poly3 = new Polynomial();
        ArrayList<Polynomial> args4 = new ArrayList<>();
        poly4 = new Polynomial();
        poly4.add(new Answer(nt_answer_Undef_0));
        args4.add(poly4);
        poly5 = new Polynomial();
        ArrayList<Polynomial> args5 = new ArrayList<>();
        poly6 = new Polynomial();
        poly6.add(new Answer(nt_answer_Letter_0));
        args5.add(poly6);
        poly5.add(new Answer(nt_answer_Star_1, args5));
        args4.add(poly5);
        poly3.add(new Answer(nt_answer_Map_2, args4));
        args3.add(poly3);
        poly7 = new Polynomial();
        ArrayList<Polynomial> args6 = new ArrayList<>();
        poly8 = new Polynomial();
        poly8.add(new Answer(nt_answer_Def_0));
        args6.add(poly8);
        poly9 = new Polynomial();
        poly9.add(new Answer(nt_answer_EmptySet_0));
        args6.add(poly9);
        poly7.add(new Answer(nt_answer_Map_2, args6));
        args3.add(poly7);
        poly2.add(new Answer(nt_answer_Union_2, args3));
        args2.add(poly2);
        poly1.add(new Answer(nt_answer_DeclList_1, args2));
        c.add(new Pair(poly1, vars.get(1)));

        poly10 = new Polynomial();
        ArrayList<Polynomial> args7 = new ArrayList<>();
        poly11 = new Polynomial();
        ArrayList<Polynomial> args8 = new ArrayList<>();
        poly12 = new Polynomial();
        poly12.add(vars.get(1));
        args8.add(poly12);
        poly11.add(new Answer(nt_answer_Stmt_1, args8));
        args7.add(poly11);
        poly10.add(new Answer(nt_answer_Star_1, args7));
        c.add(new Pair(poly10, vars.get(2)));

        c.add(new Answer(tl_answer_4));

        poly13 = new Polynomial();
        poly13.add(new Answer(AnswerIdentifier.Lambda()));

        g.addRule(nt_answer_Prog_0, new Rule(c, varSet, poly13, args1, conditions));
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
        args2 = new ArrayList<>();
        poly2 = new Polynomial();
        poly2.add(new Answer(nt_answer_Echo_0));
        args2.add(poly2);
        poly1.add(new Answer(nt_answer_Star_1, args2));
        c.add(new Pair(poly1, vars.get(1)));

        poly3 = new Polynomial();
        args3 = new ArrayList<>();
        poly4 = new Polynomial();
        args4 = new ArrayList<>();
        poly5 = new Polynomial();
        poly5.add(new Answer(nt_answer_Undef_0));
        args4.add(poly5);
        poly6 = new Polynomial();
        poly7 = new Polynomial();
        poly7.add(new Answer(nt_answer_Not_0));
        poly8 = new Polynomial();
        poly8.add(vars.get(1));
        poly6.add(new Query(poly7, poly8));
        args4.add(poly6);
        poly4.add(new Answer(nt_answer_Map_2, args4));
        args3.add(poly4);
        poly9 = new Polynomial();
        args5 = new ArrayList<>();
        poly10 = new Polynomial();
        poly10.add(new Answer(nt_answer_Def_0));
        args5.add(poly10);
        poly11 = new Polynomial();
        poly11.add(vars.get(1));
        args5.add(poly11);
        poly9.add(new Answer(nt_answer_Map_2, args5));
        args3.add(poly9);
        poly3.add(new Answer(nt_answer_Union_2, args3));

        g.addRule(nt_answer_MakeEnv_0, new Rule(c, varSet, poly3, args1, conditions));
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

        c.add(new Answer(nt_answer_Undef_0));

        poly1 = new Polynomial();
        poly1.add(new Answer(AnswerIdentifier.Lambda()));

        g.addRule(nt_answer_Undef_0, new Rule(c, varSet, poly1, args1, conditions));
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

        c.add(new Answer(nt_answer_Def_0));

        poly1 = new Polynomial();
        poly1.add(new Answer(AnswerIdentifier.Lambda()));

        g.addRule(nt_answer_Def_0, new Rule(c, varSet, poly1, args1, conditions));
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

        g.addRule(nt_answer_Notlet_1, new Rule(c, varSet, poly3, args1, conditions));
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
        poly1.add(new Answer(nt_answer_Letter_0));
        args2 = new ArrayList<>();
        poly2 = new Polynomial();
        poly2.add(new Answer(nt_answer_letter_0));
        args2.add(poly2);
        poly1.add(new Answer(nt_answer_Star_1, args2));

        g.addRule(nt_answer_Not_0, new Rule(c, varSet, poly1, args1, conditions));
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
        poly1.add(new Answer(nt_answer_Echo_0));
        c.add(new Pair(poly1, vars.get(1)));

        poly2 = new Polynomial();
        args2 = new ArrayList<>();
        poly3 = new Polynomial();
        poly3.add(new Answer(nt_answer_Echo_0));
        args2.add(poly3);
        poly2.add(new Answer(nt_answer_Star_1, args2));
        c.add(new Pair(poly2, vars.get(2)));

        poly4 = new Polynomial();
        args3 = new ArrayList<>();
        poly5 = new Polynomial();
        poly5.add(new Answer(AnswerIdentifier.Lambda()));
        args3.add(poly5);
        poly6 = new Polynomial();
        args4 = new ArrayList<>();
        poly7 = new Polynomial();
        args5 = new ArrayList<>();
        poly8 = new Polynomial();
        poly8.add(vars.get(1));
        args5.add(poly8);
        poly7.add(new Answer(nt_answer_Notlet_1, args5));
        args6 = new ArrayList<>();
        poly9 = new Polynomial();
        poly9.add(new Answer(nt_answer_Letter_0));
        args6.add(poly9);
        poly7.add(new Answer(nt_answer_Star_1, args6));
        args4.add(poly7);
        poly10 = new Polynomial();
        poly10.add(vars.get(1));
        poly11 = new Polynomial();
        poly11.add(new Answer(nt_answer_Not_0));
        poly12 = new Polynomial();
        poly12.add(vars.get(2));
        poly10.add(new Query(poly11, poly12));
        args4.add(poly10);
        poly6.add(new Answer(nt_answer_Union_2, args4));
        args3.add(poly6);
        poly4.add(new Answer(nt_answer_Union_2, args3));

        g.addRule(nt_answer_Not_0, new Rule(c, varSet, poly4, args1, conditions));
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
        poly2 = new Polynomial();
        poly2.add(vars.get(2));
        args1.add(poly2);

        c = new Configuration();

        poly3 = new Polynomial();
        poly3.add(vars.get(1));
        c.add(new Pair(poly3, vars.get(3)));

        poly4 = new Polynomial();
        poly4.add(vars.get(3));

        g.addRule(nt_answer_Union_2, new Rule(c, varSet, poly4, args1, conditions));
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
        poly2 = new Polynomial();
        poly2.add(vars.get(2));
        args1.add(poly2);

        c = new Configuration();

        poly3 = new Polynomial();
        poly3.add(vars.get(2));
        c.add(new Pair(poly3, vars.get(3)));

        poly4 = new Polynomial();
        poly4.add(vars.get(3));

        g.addRule(nt_answer_Union_2, new Rule(c, varSet, poly4, args1, conditions));
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
        poly2 = new Polynomial();
        poly2.add(vars.get(2));
        args1.add(poly2);

        c = new Configuration();

        poly3 = new Polynomial();
        poly3.add(vars.get(1));
        c.add(new Pair(poly3, vars.get(3)));

        poly4 = new Polynomial();
        poly4.add(vars.get(2));

        g.addRule(nt_answer_Map_2, new Rule(c, varSet, poly4, args1, conditions));
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

        c.add(new Answer(answer_EmptySet));
        poly1 = new Polynomial();
        poly1.add(new Answer(AnswerIdentifier.Lambda()));

        g.addRule(nt_answer_EmptySet_0, new Rule(c, varSet, poly1, args1, conditions));
        //////////////////////////////////////////////////
        return g;
    }
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("ERROR: Expecting some input to parse!");
            System.exit(-1);
        }
        performTest(new DeclarationExample(), args[0]);
    }
}