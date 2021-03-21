package rnsr.rag.examples;
import rnsr.rag.grammar.*;
import rnsr.rag.grammar.exception.ArgumentMismatchException;
import rnsr.rag.grammar.exception.RuleFunctionException;
import rnsr.rag.grammar.exception.VariableNotFoundException;
import rnsr.rag.grammar.types.Type;

import java.util.ArrayList;
public class TripleStringExample extends CommandLineInputBase {
	public Grammar CreateRAG() throws ArgumentMismatchException, RuleFunctionException, VariableNotFoundException {
		AnswerIdentifier nt_answer_S_0 = new AnswerIdentifier("S", 0);
		AnswerIdentifier nt_answer_C_0 = new AnswerIdentifier("C", 0);
		AnswerIdentifier nt_answer_W_0 = new AnswerIdentifier("W", 0);
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
		poly1.add(new Answer(nt_answer_W_0));
		c.add(new Pair(poly1, vars.get(1)));

		Polynomial poly2 = new Polynomial();
		poly2.add(vars.get(1));
		c.add(new Pair(poly2, vars.get(2)));

		Polynomial poly3 = new Polynomial();
		poly3.add(vars.get(1));
		c.add(new Pair(poly3, vars.get(3)));

		Polynomial poly4 = new Polynomial();
		poly4.add(vars.get(3));

		g.addRule(nt_answer_S_0, new Rule(c, varSet, poly4, args1, conditions));
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

		g.addRule(nt_answer_W_0, new Rule(c, varSet, poly1, args1, conditions));
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
		poly1.add(new Answer(nt_answer_C_0));
		c.add(new Pair(poly1, vars.get(1)));

		poly2 = new Polynomial();
		poly2.add(new Answer(nt_answer_W_0));
		c.add(new Pair(poly2, vars.get(2)));

		poly3 = new Polynomial();
		poly3.add(vars.get(1));
		poly3.add(vars.get(2));

		g.addRule(nt_answer_W_0, new Rule(c, varSet, poly3, args1, conditions));
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

		g.addRule(nt_answer_C_0, new Rule(c, varSet, poly2, args1, conditions));
		//////////////////////////////////////////////////
		return g;
	}
	public static void main(String[] args) {
		if (args.length == 0) {
			System.err.println("ERROR: Expecting some input to parse!");
			System.exit(-1);
		}
		performTest(new TripleStringExample(), args[0]);
	}
}