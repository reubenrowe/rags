package rnsr.rag.examples;

import rnsr.rag.TestHarness;
import rnsr.rag.grammar.*;
import rnsr.rag.grammar.exception.ArgumentMismatchException;
import rnsr.rag.grammar.exception.RuleFunctionException;
import rnsr.rag.grammar.exception.VariableNotFoundException;
import rnsr.rag.grammar.types.Type;

import java.util.ArrayList;
public class OperationalSemanticsRAGBS {
	public Grammar CreateRAG() throws ArgumentMismatchException, RuleFunctionException, VariableNotFoundException {
		AnswerIdentifier nt_answer_Or_0 = new AnswerIdentifier("Or", 0);
		AnswerIdentifier nt_answer_Get_2 = new AnswerIdentifier("Get", 2);
		AnswerIdentifier nt_answer_Echo_0 = new AnswerIdentifier("Echo", 0);
		AnswerIdentifier nt_answer_False_0 = new AnswerIdentifier("False", 0);
		AnswerIdentifier nt_answer___mul_0 = new AnswerIdentifier("__mul", 0);
		AnswerIdentifier nt_answer_Sequence_2 = new AnswerIdentifier("Sequence", 2);
		AnswerIdentifier nt_answer_Boolean_2 = new AnswerIdentifier("Boolean", 2);
		AnswerIdentifier nt_answer_Int_0 = new AnswerIdentifier("Int", 0);
		AnswerIdentifier nt_answer_Boolean_0 = new AnswerIdentifier("Boolean", 0);
		AnswerIdentifier nt_answer_Map_3 = new AnswerIdentifier("Map", 3);
		AnswerIdentifier nt_answer___and_0 = new AnswerIdentifier("__and", 0);
		AnswerIdentifier nt_answer_Test_0 = new AnswerIdentifier("Test", 0);
		AnswerIdentifier nt_answer_Eq_1 = new AnswerIdentifier("Eq", 1);
		AnswerIdentifier nt_answer_Letter_0 = new AnswerIdentifier("Letter", 0);
		AnswerIdentifier nt_answer___not_0 = new AnswerIdentifier("__not", 0);
		AnswerIdentifier nt_answer_True_0 = new AnswerIdentifier("True", 0);
		AnswerIdentifier nt_answer_ID_0 = new AnswerIdentifier("ID", 0);
		AnswerIdentifier nt_answer_And_0 = new AnswerIdentifier("And", 0);
		AnswerIdentifier nt_answer_Add_0 = new AnswerIdentifier("Add", 0);
		AnswerIdentifier nt_answer_Set_2 = new AnswerIdentifier("Set", 2);
		AnswerIdentifier nt_answer_Star_1 = new AnswerIdentifier("Star", 1);
		AnswerIdentifier nt_answer___if_2 = new AnswerIdentifier("__if", 2);
		AnswerIdentifier nt_answer_Not_1 = new AnswerIdentifier("Not", 1);
		AnswerIdentifier nt_answer_Not_0 = new AnswerIdentifier("Not", 0);
		AnswerIdentifier nt_answer___or_0 = new AnswerIdentifier("__or", 0);
		AnswerIdentifier nt_answer___add_0 = new AnswerIdentifier("__add", 0);
		AnswerIdentifier nt_answer_Term_2 = new AnswerIdentifier("Term", 2);
		AnswerIdentifier nt_answer___state_2 = new AnswerIdentifier("__state", 2);
		AnswerIdentifier nt_answer___set_2 = new AnswerIdentifier("__set", 2);
		AnswerIdentifier nt_answer_Mul_0 = new AnswerIdentifier("Mul", 0);
		AnswerIdentifier nt_answer_Term_0 = new AnswerIdentifier("Term", 0);
		AnswerIdentifier nt_answer_If_0 = new AnswerIdentifier("If", 0);
		AnswerIdentifier nt_answer___get_1 = new AnswerIdentifier("__get", 1);
		AnswerIdentifier tl_answer_11 = new AnswerIdentifier("and(");
		AnswerIdentifier tl_answer_13 = new AnswerIdentifier("mul(");
		AnswerIdentifier tl_answer_15 = new AnswerIdentifier("True");
		AnswerIdentifier tl_answer_4 = new AnswerIdentifier("theta");
		AnswerIdentifier tl_answer_14 = new AnswerIdentifier("if(");
		AnswerIdentifier tl_answer_3 = new AnswerIdentifier("sequence(");
		AnswerIdentifier tl_answer_9 = new AnswerIdentifier("not(");
		AnswerIdentifier tl_answer_10 = new AnswerIdentifier("or(");
		AnswerIdentifier tl_answer_0 = new AnswerIdentifier("testEq(");
		AnswerIdentifier tl_answer_21 = new AnswerIdentifier("4");
		AnswerIdentifier tl_answer_22 = new AnswerIdentifier("T");
		AnswerIdentifier tl_answer_8 = new AnswerIdentifier("get(");
		AnswerIdentifier tl_answer_16 = new AnswerIdentifier("False");
		AnswerIdentifier tl_answer_20 = new AnswerIdentifier("3");
		AnswerIdentifier tl_answer_6 = new AnswerIdentifier("set(");
		AnswerIdentifier tl_answer_19 = new AnswerIdentifier("2");
		AnswerIdentifier tl_answer_12 = new AnswerIdentifier("add(");
		AnswerIdentifier tl_answer_18 = new AnswerIdentifier("1");
		AnswerIdentifier tl_answer_17 = new AnswerIdentifier("0");
		AnswerIdentifier tl_answer_5 = new AnswerIdentifier("sigma");
		AnswerIdentifier tl_answer_7 = new AnswerIdentifier("__done");
		AnswerIdentifier tl_answer_1 = new AnswerIdentifier(",");
		AnswerIdentifier tl_answer_2 = new AnswerIdentifier(")");
		AnswerIdentifier tl_answer_23 = new AnswerIdentifier("F");
		ArrayList<Variable> vars;
		ArrayList<VariableCondition> conditions;
		VariableSet varSet;
		Configuration c;
		////////////////////////////////////////////////////
		ArrayList<Polynomial> args1;
		Grammar g = new Grammar(new Answer(nt_answer_Test_0));
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

		c.add(new Answer(tl_answer_0));

		Polynomial poly1 = new Polynomial();
		poly1.add(new Answer(nt_answer_ID_0));
		c.add(new Pair(poly1, vars.get(1)));

		c.add(new Answer(tl_answer_1));

		Polynomial poly2 = new Polynomial();
		poly2.add(new Answer(nt_answer_ID_0));
		c.add(new Pair(poly2, vars.get(2)));

		c.add(new Answer(tl_answer_2));

		Polynomial poly3 = new Polynomial();
		Polynomial poly4 = new Polynomial();
		ArrayList<Polynomial> args2 = new ArrayList<>();
		Polynomial poly5 = new Polynomial();
		poly5.add(vars.get(1));
		args2.add(poly5);
		poly4.add(new Answer(nt_answer_Eq_1, args2));
		Polynomial poly6 = new Polynomial();
		poly6.add(vars.get(2));
		poly3.add(new Query(poly4, poly6));

		g.addRule(nt_answer_Test_0, new Rule(c, varSet, poly3, args1, conditions));
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
		args2 = new ArrayList<>();
		poly4 = new Polynomial();
		poly4.add(vars.get(1));
		args2.add(poly4);
		poly5 = new Polynomial();
		poly5.add(vars.get(2));
		args2.add(poly5);
		poly3.add(new Answer(nt_answer_Boolean_2, args2));
		c.add(new Pair(poly3, vars.get(3)));

		poly6 = new Polynomial();
		poly6.add(vars.get(3));

		g.addRule(nt_answer_Term_2, new Rule(c, varSet, poly6, args1, conditions));
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
		poly3.add(new Answer(nt_answer_Int_0));
		c.add(new Pair(poly3, vars.get(3)));

		poly4 = new Polynomial();
		poly4.add(vars.get(3));

		g.addRule(nt_answer_Term_2, new Rule(c, varSet, poly4, args1, conditions));
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
		poly3.add(new Answer(nt_answer_Not_0));
		c.add(new Pair(poly3, vars.get(3)));

		poly4 = new Polynomial();
		poly4.add(vars.get(3));

		g.addRule(nt_answer_Term_2, new Rule(c, varSet, poly4, args1, conditions));
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
		poly3.add(new Answer(nt_answer_Or_0));
		c.add(new Pair(poly3, vars.get(3)));

		poly4 = new Polynomial();
		poly4.add(vars.get(3));

		g.addRule(nt_answer_Term_2, new Rule(c, varSet, poly4, args1, conditions));
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
		poly3.add(new Answer(nt_answer_And_0));
		c.add(new Pair(poly3, vars.get(3)));

		poly4 = new Polynomial();
		poly4.add(vars.get(3));

		g.addRule(nt_answer_Term_2, new Rule(c, varSet, poly4, args1, conditions));
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
		poly3.add(new Answer(nt_answer_Add_0));
		c.add(new Pair(poly3, vars.get(3)));

		poly4 = new Polynomial();
		poly4.add(vars.get(3));

		g.addRule(nt_answer_Term_2, new Rule(c, varSet, poly4, args1, conditions));
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
		poly3.add(new Answer(nt_answer_Mul_0));
		c.add(new Pair(poly3, vars.get(3)));

		poly4 = new Polynomial();
		poly4.add(vars.get(3));

		g.addRule(nt_answer_Term_2, new Rule(c, varSet, poly4, args1, conditions));
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
		poly3.add(new Answer(nt_answer_If_0));
		c.add(new Pair(poly3, vars.get(3)));

		poly4 = new Polynomial();
		poly4.add(vars.get(3));

		g.addRule(nt_answer_Term_2, new Rule(c, varSet, poly4, args1, conditions));
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
		args2 = new ArrayList<>();
		poly4 = new Polynomial();
		poly4.add(vars.get(1));
		args2.add(poly4);
		poly5 = new Polynomial();
		poly5.add(vars.get(2));
		args2.add(poly5);
		poly3.add(new Answer(nt_answer_Sequence_2, args2));
		c.add(new Pair(poly3, vars.get(3)));

		poly6 = new Polynomial();
		poly6.add(vars.get(3));

		g.addRule(nt_answer_Term_2, new Rule(c, varSet, poly6, args1, conditions));
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
		args2 = new ArrayList<>();
		poly4 = new Polynomial();
		poly4.add(vars.get(1));
		args2.add(poly4);
		poly5 = new Polynomial();
		poly5.add(vars.get(2));
		args2.add(poly5);
		poly3.add(new Answer(nt_answer_Set_2, args2));
		c.add(new Pair(poly3, vars.get(3)));

		poly6 = new Polynomial();
		poly6.add(vars.get(3));

		g.addRule(nt_answer_Term_2, new Rule(c, varSet, poly6, args1, conditions));
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
		args2 = new ArrayList<>();
		poly4 = new Polynomial();
		poly4.add(vars.get(1));
		args2.add(poly4);
		poly5 = new Polynomial();
		poly5.add(vars.get(2));
		args2.add(poly5);
		poly3.add(new Answer(nt_answer_Get_2, args2));
		c.add(new Pair(poly3, vars.get(3)));

		poly6 = new Polynomial();
		poly6.add(vars.get(3));

		g.addRule(nt_answer_Term_2, new Rule(c, varSet, poly6, args1, conditions));
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
		args1.add(poly1);
		poly2 = new Polynomial();
		poly2.add(vars.get(2));
		args1.add(poly2);

		c = new Configuration();

		c.add(new Answer(tl_answer_3));

		poly3 = new Polynomial();
		args2 = new ArrayList<>();
		poly4 = new Polynomial();
		poly4.add(vars.get(1));
		args2.add(poly4);
		poly5 = new Polynomial();
		poly5.add(vars.get(2));
		args2.add(poly5);
		poly3.add(new Answer(nt_answer_Term_2, args2));
		c.add(new Pair(poly3, vars.get(3)));

		c.add(new Answer(tl_answer_1));

		poly6 = new Polynomial();
		ArrayList<Polynomial> args3 = new ArrayList<>();
		Polynomial poly7 = new Polynomial();
		Polynomial poly8 = new Polynomial();
		poly8.add(vars.get(3));
		Polynomial poly9 = new Polynomial();
		poly9.add(new Answer(tl_answer_4));
		poly7.add(new Query(poly8, poly9));
		args3.add(poly7);
		Polynomial poly10 = new Polynomial();
		Polynomial poly11 = new Polynomial();
		poly11.add(vars.get(3));
		Polynomial poly12 = new Polynomial();
		poly12.add(new Answer(tl_answer_5));
		poly10.add(new Query(poly11, poly12));
		args3.add(poly10);
		poly6.add(new Answer(nt_answer_Term_2, args3));
		c.add(new Pair(poly6, vars.get(4)));

		c.add(new Answer(tl_answer_2));

		Polynomial poly13 = new Polynomial();
		poly13.add(vars.get(4));

		g.addRule(nt_answer_Sequence_2, new Rule(c, varSet, poly13, args1, conditions));
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

		c.add(new Answer(tl_answer_4));

		poly3 = new Polynomial();
		poly3.add(vars.get(1));

		g.addRule(nt_answer___state_2, new Rule(c, varSet, poly3, args1, conditions));
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

		c.add(new Answer(tl_answer_5));

		poly3 = new Polynomial();
		poly3.add(vars.get(2));

		g.addRule(nt_answer___state_2, new Rule(c, varSet, poly3, args1, conditions));
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
		args1.add(poly1);
		poly2 = new Polynomial();
		poly2.add(vars.get(2));
		args1.add(poly2);

		c = new Configuration();

		c.add(new Answer(tl_answer_6));

		poly3 = new Polynomial();
		poly3.add(new Answer(nt_answer_ID_0));
		c.add(new Pair(poly3, vars.get(3)));

		c.add(new Answer(tl_answer_1));

		poly4 = new Polynomial();
		args2 = new ArrayList<>();
		poly5 = new Polynomial();
		poly5.add(vars.get(1));
		args2.add(poly5);
		poly6 = new Polynomial();
		poly6.add(vars.get(2));
		args2.add(poly6);
		poly4.add(new Answer(nt_answer_Term_2, args2));
		c.add(new Pair(poly4, vars.get(4)));

		c.add(new Answer(tl_answer_2));

		poly7 = new Polynomial();
		args3 = new ArrayList<>();
		poly8 = new Polynomial();
		poly8.add(new Answer(tl_answer_7));
		args3.add(poly8);
		poly9 = new Polynomial();
		poly10 = new Polynomial();
		ArrayList<Polynomial> args4 = new ArrayList<>();
		poly11 = new Polynomial();
		poly11.add(vars.get(2));
		args4.add(poly11);
		poly12 = new Polynomial();
		poly13 = new Polynomial();
		poly13.add(vars.get(4));
		Polynomial poly14 = new Polynomial();
		poly14.add(new Answer(tl_answer_4));
		poly12.add(new Query(poly13, poly14));
		args4.add(poly12);
		poly10.add(new Answer(nt_answer___set_2, args4));
		Polynomial poly15 = new Polynomial();
		poly15.add(vars.get(3));
		poly9.add(new Query(poly10, poly15));
		args3.add(poly9);
		poly7.add(new Answer(nt_answer___state_2, args3));

		g.addRule(nt_answer_Set_2, new Rule(c, varSet, poly7, args1, conditions));
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

		c.add(new Answer(tl_answer_8));

		poly3 = new Polynomial();
		poly3.add(new Answer(nt_answer_ID_0));
		c.add(new Pair(poly3, vars.get(3)));

		c.add(new Answer(tl_answer_2));

		poly4 = new Polynomial();
		args2 = new ArrayList<>();
		poly5 = new Polynomial();
		poly6 = new Polynomial();
		args3 = new ArrayList<>();
		poly7 = new Polynomial();
		poly7.add(vars.get(2));
		args3.add(poly7);
		poly6.add(new Answer(nt_answer___get_1, args3));
		poly8 = new Polynomial();
		poly8.add(vars.get(3));
		poly5.add(new Query(poly6, poly8));
		args2.add(poly5);
		poly9 = new Polynomial();
		poly9.add(vars.get(2));
		args2.add(poly9);
		poly4.add(new Answer(nt_answer___state_2, args2));

		g.addRule(nt_answer_Get_2, new Rule(c, varSet, poly4, args1, conditions));
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

		c.add(new Answer(tl_answer_9));

		poly1 = new Polynomial();
		poly1.add(new Answer(nt_answer_Term_0));
		c.add(new Pair(poly1, vars.get(1)));

		c.add(new Answer(tl_answer_2));

		poly2 = new Polynomial();
		poly3 = new Polynomial();
		poly3.add(new Answer(nt_answer___not_0));
		poly4 = new Polynomial();
		poly4.add(vars.get(1));
		poly2.add(new Query(poly3, poly4));

		g.addRule(nt_answer_Not_0, new Rule(c, varSet, poly2, args1, conditions));
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

		c.add(new Answer(tl_answer_10));

		poly1 = new Polynomial();
		poly1.add(new Answer(nt_answer_Term_0));
		c.add(new Pair(poly1, vars.get(1)));

		c.add(new Answer(tl_answer_1));

		poly2 = new Polynomial();
		poly2.add(new Answer(nt_answer_Term_0));
		c.add(new Pair(poly2, vars.get(2)));

		c.add(new Answer(tl_answer_2));

		poly3 = new Polynomial();
		poly4 = new Polynomial();
		poly4.add(new Answer(nt_answer___or_0));
		poly5 = new Polynomial();
		poly5.add(vars.get(1));
		poly5.add(vars.get(2));
		poly3.add(new Query(poly4, poly5));

		g.addRule(nt_answer_Or_0, new Rule(c, varSet, poly3, args1, conditions));
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

		c.add(new Answer(tl_answer_11));

		poly1 = new Polynomial();
		poly1.add(new Answer(nt_answer_Term_0));
		c.add(new Pair(poly1, vars.get(1)));

		c.add(new Answer(tl_answer_1));

		poly2 = new Polynomial();
		poly2.add(new Answer(nt_answer_Term_0));
		c.add(new Pair(poly2, vars.get(2)));

		c.add(new Answer(tl_answer_2));

		poly3 = new Polynomial();
		poly4 = new Polynomial();
		poly4.add(new Answer(nt_answer___and_0));
		poly5 = new Polynomial();
		poly5.add(vars.get(1));
		poly5.add(vars.get(2));
		poly3.add(new Query(poly4, poly5));

		g.addRule(nt_answer_And_0, new Rule(c, varSet, poly3, args1, conditions));
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

		c.add(new Answer(tl_answer_12));

		poly1 = new Polynomial();
		poly1.add(new Answer(nt_answer_Term_0));
		c.add(new Pair(poly1, vars.get(1)));

		c.add(new Answer(tl_answer_1));

		poly2 = new Polynomial();
		poly2.add(new Answer(nt_answer_Term_0));
		c.add(new Pair(poly2, vars.get(2)));

		c.add(new Answer(tl_answer_2));

		poly3 = new Polynomial();
		poly4 = new Polynomial();
		poly4.add(new Answer(nt_answer___add_0));
		poly5 = new Polynomial();
		poly5.add(vars.get(1));
		poly5.add(vars.get(2));
		poly3.add(new Query(poly4, poly5));

		g.addRule(nt_answer_Add_0, new Rule(c, varSet, poly3, args1, conditions));
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

		c.add(new Answer(tl_answer_13));

		poly1 = new Polynomial();
		poly1.add(new Answer(nt_answer_Term_0));
		c.add(new Pair(poly1, vars.get(1)));

		c.add(new Answer(tl_answer_1));

		poly2 = new Polynomial();
		poly2.add(new Answer(nt_answer_Term_0));
		c.add(new Pair(poly2, vars.get(2)));

		c.add(new Answer(tl_answer_2));

		poly3 = new Polynomial();
		poly4 = new Polynomial();
		poly4.add(new Answer(nt_answer___mul_0));
		poly5 = new Polynomial();
		poly5.add(vars.get(1));
		poly5.add(vars.get(2));
		poly3.add(new Query(poly4, poly5));

		g.addRule(nt_answer_Mul_0, new Rule(c, varSet, poly3, args1, conditions));
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

		c = new Configuration();

		c.add(new Answer(tl_answer_14));

		poly1 = new Polynomial();
		poly1.add(new Answer(nt_answer_Term_0));
		c.add(new Pair(poly1, vars.get(1)));

		c.add(new Answer(tl_answer_1));

		poly2 = new Polynomial();
		poly2.add(new Answer(nt_answer_Term_0));
		c.add(new Pair(poly2, vars.get(2)));

		c.add(new Answer(tl_answer_1));

		poly3 = new Polynomial();
		poly3.add(new Answer(nt_answer_Term_0));
		c.add(new Pair(poly3, vars.get(3)));

		c.add(new Answer(tl_answer_2));

		poly4 = new Polynomial();
		poly5 = new Polynomial();
		poly5.add(new Answer(nt_answer_Boolean_0));
		poly6 = new Polynomial();
		poly6.add(vars.get(1));
		poly4.add(new Query(poly5, poly6));
		c.add(new Pair(poly4, vars.get(4)));

		poly7 = new Polynomial();
		poly8 = new Polynomial();
		args2 = new ArrayList<>();
		poly9 = new Polynomial();
		poly9.add(vars.get(2));
		args2.add(poly9);
		poly10 = new Polynomial();
		poly10.add(vars.get(3));
		args2.add(poly10);
		poly8.add(new Answer(nt_answer___if_2, args2));
		poly11 = new Polynomial();
		poly11.add(vars.get(1));
		poly7.add(new Query(poly8, poly11));

		g.addRule(nt_answer_If_0, new Rule(c, varSet, poly7, args1, conditions));
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

		c.add(new Answer(tl_answer_15));

		poly3 = new Polynomial();
		args2 = new ArrayList<>();
		poly4 = new Polynomial();
		poly4.add(new Answer(tl_answer_15));
		args2.add(poly4);
		poly5 = new Polynomial();
		poly5.add(vars.get(2));
		args2.add(poly5);
		poly3.add(new Answer(nt_answer___state_2, args2));

		g.addRule(nt_answer_Boolean_2, new Rule(c, varSet, poly3, args1, conditions));
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

		c.add(new Answer(tl_answer_16));

		poly3 = new Polynomial();
		args2 = new ArrayList<>();
		poly4 = new Polynomial();
		poly4.add(new Answer(tl_answer_16));
		args2.add(poly4);
		poly5 = new Polynomial();
		poly5.add(vars.get(2));
		args2.add(poly5);
		poly3.add(new Answer(nt_answer___state_2, args2));

		g.addRule(nt_answer_Boolean_2, new Rule(c, varSet, poly3, args1, conditions));
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

		c.add(new Answer(tl_answer_17));

		poly1 = new Polynomial();
		poly1.add(new Answer(tl_answer_17));

		g.addRule(nt_answer_Int_0, new Rule(c, varSet, poly1, args1, conditions));
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

		c.add(new Answer(tl_answer_18));

		poly1 = new Polynomial();
		poly1.add(new Answer(tl_answer_18));

		g.addRule(nt_answer_Int_0, new Rule(c, varSet, poly1, args1, conditions));
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

		c.add(new Answer(tl_answer_19));

		poly1 = new Polynomial();
		poly1.add(new Answer(tl_answer_19));

		g.addRule(nt_answer_Int_0, new Rule(c, varSet, poly1, args1, conditions));
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
		poly3.add(vars.get(1));

		g.addRule(nt_answer_ID_0, new Rule(c, varSet, poly3, args1, conditions));
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

		c.add(new Answer(tl_answer_15));

		poly1 = new Polynomial();
		poly1.add(new Answer(tl_answer_16));

		g.addRule(nt_answer___not_0, new Rule(c, varSet, poly1, args1, conditions));
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

		c.add(new Answer(tl_answer_16));

		poly1 = new Polynomial();
		poly1.add(new Answer(tl_answer_15));

		g.addRule(nt_answer___not_0, new Rule(c, varSet, poly1, args1, conditions));
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

		c.add(new Answer(tl_answer_15));

		c.add(new Answer(tl_answer_15));

		poly1 = new Polynomial();
		poly1.add(new Answer(tl_answer_15));

		g.addRule(nt_answer___or_0, new Rule(c, varSet, poly1, args1, conditions));
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

		c.add(new Answer(tl_answer_15));

		c.add(new Answer(tl_answer_16));

		poly1 = new Polynomial();
		poly1.add(new Answer(tl_answer_15));

		g.addRule(nt_answer___or_0, new Rule(c, varSet, poly1, args1, conditions));
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

		c.add(new Answer(tl_answer_16));

		c.add(new Answer(tl_answer_15));

		poly1 = new Polynomial();
		poly1.add(new Answer(tl_answer_15));

		g.addRule(nt_answer___or_0, new Rule(c, varSet, poly1, args1, conditions));
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

		c.add(new Answer(tl_answer_16));

		c.add(new Answer(tl_answer_16));

		poly1 = new Polynomial();
		poly1.add(new Answer(tl_answer_16));

		g.addRule(nt_answer___or_0, new Rule(c, varSet, poly1, args1, conditions));
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

		c.add(new Answer(tl_answer_15));

		c.add(new Answer(tl_answer_15));

		poly1 = new Polynomial();
		poly1.add(new Answer(tl_answer_15));

		g.addRule(nt_answer___and_0, new Rule(c, varSet, poly1, args1, conditions));
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

		c.add(new Answer(tl_answer_15));

		c.add(new Answer(tl_answer_16));

		poly1 = new Polynomial();
		poly1.add(new Answer(tl_answer_16));

		g.addRule(nt_answer___and_0, new Rule(c, varSet, poly1, args1, conditions));
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

		c.add(new Answer(tl_answer_16));

		c.add(new Answer(tl_answer_15));

		poly1 = new Polynomial();
		poly1.add(new Answer(tl_answer_16));

		g.addRule(nt_answer___and_0, new Rule(c, varSet, poly1, args1, conditions));
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

		c.add(new Answer(tl_answer_16));

		c.add(new Answer(tl_answer_16));

		poly1 = new Polynomial();
		poly1.add(new Answer(tl_answer_16));

		g.addRule(nt_answer___and_0, new Rule(c, varSet, poly1, args1, conditions));
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

		c.add(new Answer(tl_answer_15));

		poly3 = new Polynomial();
		poly3.add(vars.get(1));

		g.addRule(nt_answer___if_2, new Rule(c, varSet, poly3, args1, conditions));
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

		c.add(new Answer(tl_answer_16));

		poly3 = new Polynomial();
		poly3.add(vars.get(2));

		g.addRule(nt_answer___if_2, new Rule(c, varSet, poly3, args1, conditions));
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

		c.add(new Answer(tl_answer_17));

		c.add(new Answer(tl_answer_17));

		poly1 = new Polynomial();
		poly1.add(new Answer(tl_answer_17));

		g.addRule(nt_answer___add_0, new Rule(c, varSet, poly1, args1, conditions));
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

		c.add(new Answer(tl_answer_17));

		c.add(new Answer(tl_answer_18));

		poly1 = new Polynomial();
		poly1.add(new Answer(tl_answer_18));

		g.addRule(nt_answer___add_0, new Rule(c, varSet, poly1, args1, conditions));
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

		c.add(new Answer(tl_answer_17));

		c.add(new Answer(tl_answer_19));

		poly1 = new Polynomial();
		poly1.add(new Answer(tl_answer_19));

		g.addRule(nt_answer___add_0, new Rule(c, varSet, poly1, args1, conditions));
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

		c.add(new Answer(tl_answer_18));

		c.add(new Answer(tl_answer_17));

		poly1 = new Polynomial();
		poly1.add(new Answer(tl_answer_18));

		g.addRule(nt_answer___add_0, new Rule(c, varSet, poly1, args1, conditions));
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

		c.add(new Answer(tl_answer_18));

		c.add(new Answer(tl_answer_18));

		poly1 = new Polynomial();
		poly1.add(new Answer(tl_answer_19));

		g.addRule(nt_answer___add_0, new Rule(c, varSet, poly1, args1, conditions));
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

		c.add(new Answer(tl_answer_18));

		c.add(new Answer(tl_answer_19));

		poly1 = new Polynomial();
		poly1.add(new Answer(tl_answer_20));

		g.addRule(nt_answer___add_0, new Rule(c, varSet, poly1, args1, conditions));
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

		c.add(new Answer(tl_answer_19));

		c.add(new Answer(tl_answer_17));

		poly1 = new Polynomial();
		poly1.add(new Answer(tl_answer_19));

		g.addRule(nt_answer___add_0, new Rule(c, varSet, poly1, args1, conditions));
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

		c.add(new Answer(tl_answer_19));

		c.add(new Answer(tl_answer_18));

		poly1 = new Polynomial();
		poly1.add(new Answer(tl_answer_20));

		g.addRule(nt_answer___add_0, new Rule(c, varSet, poly1, args1, conditions));
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

		c.add(new Answer(tl_answer_19));

		c.add(new Answer(tl_answer_19));

		poly1 = new Polynomial();
		poly1.add(new Answer(tl_answer_21));

		g.addRule(nt_answer___add_0, new Rule(c, varSet, poly1, args1, conditions));
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

		c.add(new Answer(tl_answer_17));

		c.add(new Answer(tl_answer_17));

		poly1 = new Polynomial();
		poly1.add(new Answer(tl_answer_17));

		g.addRule(nt_answer___mul_0, new Rule(c, varSet, poly1, args1, conditions));
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

		c.add(new Answer(tl_answer_17));

		c.add(new Answer(tl_answer_18));

		poly1 = new Polynomial();
		poly1.add(new Answer(tl_answer_17));

		g.addRule(nt_answer___mul_0, new Rule(c, varSet, poly1, args1, conditions));
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

		c.add(new Answer(tl_answer_17));

		c.add(new Answer(tl_answer_19));

		poly1 = new Polynomial();
		poly1.add(new Answer(tl_answer_17));

		g.addRule(nt_answer___mul_0, new Rule(c, varSet, poly1, args1, conditions));
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

		c.add(new Answer(tl_answer_18));

		c.add(new Answer(tl_answer_17));

		poly1 = new Polynomial();
		poly1.add(new Answer(tl_answer_17));

		g.addRule(nt_answer___mul_0, new Rule(c, varSet, poly1, args1, conditions));
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

		c.add(new Answer(tl_answer_18));

		c.add(new Answer(tl_answer_18));

		poly1 = new Polynomial();
		poly1.add(new Answer(tl_answer_18));

		g.addRule(nt_answer___mul_0, new Rule(c, varSet, poly1, args1, conditions));
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

		c.add(new Answer(tl_answer_18));

		c.add(new Answer(tl_answer_19));

		poly1 = new Polynomial();
		poly1.add(new Answer(tl_answer_19));

		g.addRule(nt_answer___mul_0, new Rule(c, varSet, poly1, args1, conditions));
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

		c.add(new Answer(tl_answer_19));

		c.add(new Answer(tl_answer_17));

		poly1 = new Polynomial();
		poly1.add(new Answer(tl_answer_17));

		g.addRule(nt_answer___mul_0, new Rule(c, varSet, poly1, args1, conditions));
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

		c.add(new Answer(tl_answer_19));

		c.add(new Answer(tl_answer_18));

		poly1 = new Polynomial();
		poly1.add(new Answer(tl_answer_19));

		g.addRule(nt_answer___mul_0, new Rule(c, varSet, poly1, args1, conditions));
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

		c.add(new Answer(tl_answer_19));

		c.add(new Answer(tl_answer_19));

		poly1 = new Polynomial();
		poly1.add(new Answer(tl_answer_21));

		g.addRule(nt_answer___mul_0, new Rule(c, varSet, poly1, args1, conditions));
		//////////////////////////////////////////////////
		vars = new ArrayList<>();
		varSet = new VariableSet();
		args1 = new ArrayList<>();
		conditions = new ArrayList<>();
		for (int i = 0; i < 7; i++) {
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
		poly5 = new Polynomial();
		poly5.add(vars.get(4));
		args1.add(poly5);

		c = new Configuration();

		poly6 = new Polynomial();
		poly6.add(new Answer(nt_answer_ID_0));
		c.add(new Pair(poly6, vars.get(5)));

		poly7 = new Polynomial();
		poly8 = new Polynomial();
		poly8.add(new Answer(nt_answer_True_0));
		poly9 = new Polynomial();
		poly10 = new Polynomial();
		args2 = new ArrayList<>();
		poly11 = new Polynomial();
		poly11.add(vars.get(1));
		args2.add(poly11);
		poly10.add(new Answer(nt_answer_Eq_1, args2));
		poly12 = new Polynomial();
		poly12.add(vars.get(5));
		poly9.add(new Query(poly10, poly12));
		poly7.add(new Query(poly8, poly9));
		c.add(new Pair(poly7, vars.get(6)));

		poly13 = new Polynomial();
		args3 = new ArrayList<>();
		poly14 = new Polynomial();
		poly14.add(vars.get(1));
		args3.add(poly14);
		poly15 = new Polynomial();
		poly15.add(vars.get(4));
		args3.add(poly15);
		Polynomial poly16 = new Polynomial();
		poly16.add(vars.get(3));
		args3.add(poly16);
		poly13.add(new Answer(nt_answer_Map_3, args3));

		g.addRule(nt_answer___set_2, new Rule(c, varSet, poly13, args1, conditions));
		//////////////////////////////////////////////////
		vars = new ArrayList<>();
		varSet = new VariableSet();
		args1 = new ArrayList<>();
		conditions = new ArrayList<>();
		for (int i = 0; i < 7; i++) {
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
		poly5 = new Polynomial();
		poly5.add(vars.get(4));
		args1.add(poly5);

		c = new Configuration();

		poly6 = new Polynomial();
		poly6.add(new Answer(nt_answer_ID_0));
		c.add(new Pair(poly6, vars.get(5)));

		poly7 = new Polynomial();
		poly8 = new Polynomial();
		poly8.add(new Answer(nt_answer_False_0));
		poly9 = new Polynomial();
		poly10 = new Polynomial();
		args2 = new ArrayList<>();
		poly11 = new Polynomial();
		poly11.add(vars.get(1));
		args2.add(poly11);
		poly10.add(new Answer(nt_answer_Eq_1, args2));
		poly12 = new Polynomial();
		poly12.add(vars.get(5));
		poly9.add(new Query(poly10, poly12));
		poly7.add(new Query(poly8, poly9));
		c.add(new Pair(poly7, vars.get(6)));

		poly13 = new Polynomial();
		args3 = new ArrayList<>();
		poly14 = new Polynomial();
		poly14.add(vars.get(1));
		args3.add(poly14);
		poly15 = new Polynomial();
		poly15.add(vars.get(2));
		args3.add(poly15);
		poly16 = new Polynomial();
		Polynomial poly17 = new Polynomial();
		args4 = new ArrayList<>();
		Polynomial poly18 = new Polynomial();
		poly18.add(vars.get(3));
		args4.add(poly18);
		Polynomial poly19 = new Polynomial();
		poly19.add(vars.get(4));
		args4.add(poly19);
		poly17.add(new Answer(nt_answer___set_2, args4));
		Polynomial poly20 = new Polynomial();
		poly20.add(vars.get(5));
		poly16.add(new Query(poly17, poly20));
		args3.add(poly16);
		poly13.add(new Answer(nt_answer_Map_3, args3));

		g.addRule(nt_answer___set_2, new Rule(c, varSet, poly13, args1, conditions));
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
		poly2 = new Polynomial();
		poly2.add(vars.get(1));
		args1.add(poly2);

		c = new Configuration();

		poly3 = new Polynomial();
		poly3.add(new Answer(nt_answer_ID_0));
		c.add(new Pair(poly3, vars.get(2)));

		poly4 = new Polynomial();
		args2 = new ArrayList<>();
		poly5 = new Polynomial();
		poly5.add(vars.get(2));
		args2.add(poly5);
		poly6 = new Polynomial();
		poly6.add(vars.get(1));
		args2.add(poly6);
		poly7 = new Polynomial();
		poly7.add(new Answer(AnswerIdentifier.Lambda()));
		args2.add(poly7);
		poly4.add(new Answer(nt_answer_Map_3, args2));

		g.addRule(nt_answer___set_2, new Rule(c, varSet, poly4, args1, conditions));
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
		poly5.add(new Answer(nt_answer_ID_0));
		c.add(new Pair(poly5, vars.get(4)));

		poly6 = new Polynomial();
		poly7 = new Polynomial();
		poly7.add(new Answer(nt_answer_True_0));
		poly8 = new Polynomial();
		poly9 = new Polynomial();
		args2 = new ArrayList<>();
		poly10 = new Polynomial();
		poly10.add(vars.get(1));
		args2.add(poly10);
		poly9.add(new Answer(nt_answer_Eq_1, args2));
		poly11 = new Polynomial();
		poly11.add(vars.get(4));
		poly8.add(new Query(poly9, poly11));
		poly6.add(new Query(poly7, poly8));
		c.add(new Pair(poly6, vars.get(5)));

		poly12 = new Polynomial();
		poly12.add(vars.get(2));

		g.addRule(nt_answer___get_1, new Rule(c, varSet, poly12, args1, conditions));
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
		poly5.add(new Answer(nt_answer_ID_0));
		c.add(new Pair(poly5, vars.get(4)));

		poly6 = new Polynomial();
		poly7 = new Polynomial();
		poly7.add(new Answer(nt_answer_False_0));
		poly8 = new Polynomial();
		poly9 = new Polynomial();
		args2 = new ArrayList<>();
		poly10 = new Polynomial();
		poly10.add(vars.get(1));
		args2.add(poly10);
		poly9.add(new Answer(nt_answer_Eq_1, args2));
		poly11 = new Polynomial();
		poly11.add(vars.get(4));
		poly8.add(new Query(poly9, poly11));
		poly6.add(new Query(poly7, poly8));
		c.add(new Pair(poly6, vars.get(5)));

		poly12 = new Polynomial();
		poly13 = new Polynomial();
		args3 = new ArrayList<>();
		poly14 = new Polynomial();
		poly14.add(vars.get(3));
		args3.add(poly14);
		poly13.add(new Answer(nt_answer___get_1, args3));
		poly15 = new Polynomial();
		poly15.add(vars.get(4));
		poly12.add(new Query(poly13, poly15));

		g.addRule(nt_answer___get_1, new Rule(c, varSet, poly12, args1, conditions));
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
		poly2.add(new Answer(nt_answer_ID_0));
		c.add(new Pair(poly2, vars.get(1)));

		poly3 = new Polynomial();
		poly3.add(new Answer(AnswerIdentifier.Lambda()));

		g.addRule(nt_answer___get_1, new Rule(c, varSet, poly3, args1, conditions));
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
		poly2.add(new Answer(tl_answer_22));

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
		poly5.add(new Answer(tl_answer_23));

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
		poly2.add(new Answer(tl_answer_23));

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
		poly6.add(new Answer(tl_answer_23));

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

		c.add(new Answer(tl_answer_22));

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

		c.add(new Answer(tl_answer_23));

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
			g = new OperationalSemanticsRAGBS().CreateRAG();
		} catch (Exception e) {
			System.err.println("Could no create grammar!");
			e.printStackTrace(System.err);
		}
		TestHarness.runGrammar(g, args[0]);
	}
}