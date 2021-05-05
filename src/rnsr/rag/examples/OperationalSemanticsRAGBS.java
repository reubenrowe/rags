package rnsr.rag.examples;

import rnsr.rag.TestHarness;
import rnsr.rag.grammar.*;
import rnsr.rag.grammar.exception.ArgumentMismatchException;
import rnsr.rag.grammar.exception.RuleFunctionException;
import rnsr.rag.grammar.exception.VariableNotFoundException;

import java.util.ArrayList;
public class OperationalSemanticsRAGBS {
	public Grammar CreateRAG() throws ArgumentMismatchException, RuleFunctionException, VariableNotFoundException {
		AnswerIdentifier nt_answer_Or_0 = new AnswerIdentifier("Or", 0);
		AnswerIdentifier nt_answer___isFalse_0 = new AnswerIdentifier("__isFalse", 0);
		AnswerIdentifier nt_answer_Term_0 = new AnswerIdentifier("Term", 0);
		AnswerIdentifier nt_answer___if_2 = new AnswerIdentifier("__if", 2);
		AnswerIdentifier nt_answer_Boolean_0 = new AnswerIdentifier("Boolean", 0);
		AnswerIdentifier nt_answer___not_0 = new AnswerIdentifier("__not", 0);
		AnswerIdentifier nt_answer_Not_0 = new AnswerIdentifier("Not", 0);
		AnswerIdentifier nt_answer___isTrue_0 = new AnswerIdentifier("__isTrue", 0);
		AnswerIdentifier nt_answer_If_0 = new AnswerIdentifier("If", 0);
		AnswerIdentifier nt_answer___and_0 = new AnswerIdentifier("__and", 0);
		AnswerIdentifier nt_answer_And_0 = new AnswerIdentifier("And", 0);
		AnswerIdentifier nt_answer___or_0 = new AnswerIdentifier("__or", 0);
		AnswerIdentifier tl_answer_4 = new AnswerIdentifier("and(");
		AnswerIdentifier tl_answer_7 = new AnswerIdentifier("False");
		AnswerIdentifier tl_answer_3 = new AnswerIdentifier(",");
		AnswerIdentifier tl_answer_6 = new AnswerIdentifier("True");
		AnswerIdentifier tl_answer_5 = new AnswerIdentifier("if(");
		AnswerIdentifier tl_answer_1 = new AnswerIdentifier(")");
		AnswerIdentifier tl_answer_0 = new AnswerIdentifier("not(");
		AnswerIdentifier tl_answer_2 = new AnswerIdentifier("or(");
		ArrayList<Variable> vars;
		ArrayList<VariableCondition> conditions;
		VariableSet varSet;
		Configuration c;
		////////////////////////////////////////////////////
		ArrayList<Polynomial> args1;
		Grammar g = new Grammar(new Answer(nt_answer_Term_0));
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
		poly1.add(new Answer(nt_answer_Boolean_0));
		c.add(new Pair(poly1, vars.get(1)));

		Polynomial poly2 = new Polynomial();
		poly2.add(vars.get(1));

		g.addRule(nt_answer_Term_0, new Rule(c, varSet, poly2, args1, conditions));
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
		poly1.add(new Answer(nt_answer_Not_0));
		c.add(new Pair(poly1, vars.get(1)));

		poly2 = new Polynomial();
		poly2.add(vars.get(1));

		g.addRule(nt_answer_Term_0, new Rule(c, varSet, poly2, args1, conditions));
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
		poly1.add(new Answer(nt_answer_Or_0));
		c.add(new Pair(poly1, vars.get(1)));

		poly2 = new Polynomial();
		poly2.add(vars.get(1));

		g.addRule(nt_answer_Term_0, new Rule(c, varSet, poly2, args1, conditions));
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
		poly1.add(new Answer(nt_answer_And_0));
		c.add(new Pair(poly1, vars.get(1)));

		poly2 = new Polynomial();
		poly2.add(vars.get(1));

		g.addRule(nt_answer_Term_0, new Rule(c, varSet, poly2, args1, conditions));
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
		poly1.add(new Answer(nt_answer_If_0));
		c.add(new Pair(poly1, vars.get(1)));

		poly2 = new Polynomial();
		poly2.add(vars.get(1));

		g.addRule(nt_answer_Term_0, new Rule(c, varSet, poly2, args1, conditions));
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
		poly1.add(new Answer(nt_answer_Term_0));
		c.add(new Pair(poly1, vars.get(1)));

		c.add(new Answer(tl_answer_1));

		poly2 = new Polynomial();
		Polynomial poly3 = new Polynomial();
		poly3.add(new Answer(nt_answer___not_0));
		Polynomial poly4 = new Polynomial();
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

		c.add(new Answer(tl_answer_2));

		poly1 = new Polynomial();
		poly1.add(new Answer(nt_answer_Term_0));
		c.add(new Pair(poly1, vars.get(1)));

		c.add(new Answer(tl_answer_3));

		poly2 = new Polynomial();
		poly2.add(new Answer(nt_answer_Term_0));
		c.add(new Pair(poly2, vars.get(2)));

		c.add(new Answer(tl_answer_1));

		poly3 = new Polynomial();
		poly4 = new Polynomial();
		poly4.add(new Answer(nt_answer___or_0));
		Polynomial poly5 = new Polynomial();
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

		c.add(new Answer(tl_answer_4));

		poly1 = new Polynomial();
		poly1.add(new Answer(nt_answer_Term_0));
		c.add(new Pair(poly1, vars.get(1)));

		c.add(new Answer(tl_answer_3));

		poly2 = new Polynomial();
		poly2.add(new Answer(nt_answer_Term_0));
		c.add(new Pair(poly2, vars.get(2)));

		c.add(new Answer(tl_answer_1));

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
		for (int i = 0; i < 4; i++) {
			Variable v = new Variable();
			vars.add(v);
			varSet.put(v);
		}

		args1.add(new Polynomial(vars.get(0)));

		c = new Configuration();

		c.add(new Answer(tl_answer_5));

		poly1 = new Polynomial();
		poly1.add(new Answer(nt_answer_Term_0));
		c.add(new Pair(poly1, vars.get(1)));

		c.add(new Answer(tl_answer_3));

		poly2 = new Polynomial();
		poly2.add(new Answer(nt_answer_Term_0));
		c.add(new Pair(poly2, vars.get(2)));

		c.add(new Answer(tl_answer_3));

		poly3 = new Polynomial();
		poly3.add(new Answer(nt_answer_Term_0));
		c.add(new Pair(poly3, vars.get(3)));

		c.add(new Answer(tl_answer_1));

		poly4 = new Polynomial();
		poly5 = new Polynomial();
		ArrayList<Polynomial> args2 = new ArrayList<>();
		Polynomial poly6 = new Polynomial();
		poly6.add(vars.get(2));
		args2.add(poly6);
		Polynomial poly7 = new Polynomial();
		poly7.add(vars.get(3));
		args2.add(poly7);
		poly5.add(new Answer(nt_answer___if_2, args2));
		Polynomial poly8 = new Polynomial();
		poly8.add(vars.get(1));
		poly4.add(new Query(poly5, poly8));

		g.addRule(nt_answer_If_0, new Rule(c, varSet, poly4, args1, conditions));
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
		poly1.add(new Answer(tl_answer_6));

		g.addRule(nt_answer_Boolean_0, new Rule(c, varSet, poly1, args1, conditions));
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
		poly1.add(new Answer(tl_answer_7));

		g.addRule(nt_answer_Boolean_0, new Rule(c, varSet, poly1, args1, conditions));
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

		g.addRule(nt_answer___isTrue_0, new Rule(c, varSet, poly1, args1, conditions));
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

		g.addRule(nt_answer___isFalse_0, new Rule(c, varSet, poly1, args1, conditions));
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
		poly1.add(new Answer(tl_answer_7));

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

		c.add(new Answer(tl_answer_7));

		poly1 = new Polynomial();
		poly1.add(new Answer(tl_answer_6));

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

		c.add(new Answer(tl_answer_6));

		c.add(new Answer(tl_answer_6));

		poly1 = new Polynomial();
		poly1.add(new Answer(tl_answer_6));

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

		c.add(new Answer(tl_answer_6));

		c.add(new Answer(tl_answer_7));

		poly1 = new Polynomial();
		poly1.add(new Answer(tl_answer_6));

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

		c.add(new Answer(tl_answer_7));

		c.add(new Answer(tl_answer_6));

		poly1 = new Polynomial();
		poly1.add(new Answer(tl_answer_6));

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

		c.add(new Answer(tl_answer_7));

		c.add(new Answer(tl_answer_7));

		poly1 = new Polynomial();
		poly1.add(new Answer(tl_answer_7));

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

		c.add(new Answer(tl_answer_6));

		c.add(new Answer(tl_answer_6));

		poly1 = new Polynomial();
		poly1.add(new Answer(tl_answer_6));

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

		c.add(new Answer(tl_answer_6));

		c.add(new Answer(tl_answer_7));

		poly1 = new Polynomial();
		poly1.add(new Answer(tl_answer_7));

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

		c.add(new Answer(tl_answer_7));

		c.add(new Answer(tl_answer_6));

		poly1 = new Polynomial();
		poly1.add(new Answer(tl_answer_7));

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

		c.add(new Answer(tl_answer_7));

		c.add(new Answer(tl_answer_7));

		poly1 = new Polynomial();
		poly1.add(new Answer(tl_answer_7));

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

		c.add(new Answer(tl_answer_6));

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

		c.add(new Answer(tl_answer_7));

		poly3 = new Polynomial();
		poly3.add(vars.get(2));

		g.addRule(nt_answer___if_2, new Rule(c, varSet, poly3, args1, conditions));
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