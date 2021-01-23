package rnsr.rag.examples;

import rnsr.rag.grammar.*;
import rnsr.rag.grammar.exception.RuleFunctionException;
import rnsr.rag.grammar.exception.VariableNotFoundException;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * This class creates a RAG for the language {www | w in Z*} where the alphabet Z = {'z'}.
 * It uses this RAG to parse the user input.
 */
public	class		TripleStringExample
		extends		CommandLineInputBase
{

	/**
	 * Creates the grammar
	 */
	public Grammar CreateRAG() throws	RuleFunctionException,
										VariableNotFoundException
	{
		// Construct Answer Identifier set
		AnswerIdentifier answer_z = new AnswerIdentifier("z");
		AnswerIdentifier answer_S = new AnswerIdentifier("S", 0);
		AnswerIdentifier answer_W = new AnswerIdentifier("W", 0);
		AnswerIdentifier answer_C = new AnswerIdentifier("C", 0);

		HashSet<AnswerIdentifier> answerSet = new HashSet<AnswerIdentifier>();
		answerSet.add(answer_z);
		answerSet.add(answer_S);
		answerSet.add(answer_W);
		answerSet.add(answer_C);
		
		Grammar g = new Grammar(answerSet, answer_S);
		
		/* ********** RULE PRODUCTIONS ********** */
		
		// Declare variables for reuse
		ArrayList<Variable> vars;
		ArrayList<Variable> args;
		VariableSet varSet;
		Configuration c;
		Polynomial poly;
		
		// S : <v0, v3> -> <W, v1> <v1, v2> <v1, v3>
		vars = new ArrayList<Variable>();
		varSet = new VariableSet();
		for (int i = 0; i <= 3; i++)
		{
			Variable v = new Variable();
			vars.add(i, v);
			varSet.put(v);
		}
		
		args = new ArrayList<Variable>();
		args.add(vars.get(0));

		c = new Configuration();
		c.add(new Pair(
				new Polynomial(new Answer(answer_W)),
				vars.get(1)
			));
		c.add(new Pair(
				new Polynomial(vars.get(1)),
				vars.get(2)
			));
		c.add(new Pair(
				new Polynomial(vars.get(1)),
				vars.get(3)
			));

		g.addRule(answer_S,
				new Rule(c, varSet, new Polynomial(vars.get(3)), args)
			);
		
		// W : <v0, λ> -> λ
		vars = new ArrayList<Variable>();
		varSet = new VariableSet();
		for (int i = 0; i <= 0; i++)
		{
			Variable v = new Variable();
			vars.add(i, v);
			varSet.put(v);
		}
		
		args = new ArrayList<Variable>();
		args.add(vars.get(0));
		
		c = new Configuration();
		c.add(new Answer(AnswerIdentifier.Lambda()));
		
		g.addRule(answer_W, new Rule(c, varSet, new Polynomial(new Answer(AnswerIdentifier.Lambda())), args));
		
		// W : <v0, v1v2> -> <C, v1> <v0, v2>
		vars = new ArrayList<Variable>();
		varSet = new VariableSet();
		for (int i = 0; i <= 2; i++)
		{
			Variable v = new Variable();
			vars.add(i, v);
			varSet.put(v);
		}
		
		args = new ArrayList<Variable>();
		args.add(vars.get(0));
		
		c = new Configuration();
		c.add(new Pair(
				new Polynomial(new Answer(answer_C)), vars.get(1)
			));
		c.add(new Pair(
				new Polynomial(vars.get(0)),
				vars.get(2)
			));
		
		poly = new Polynomial();
		poly.add(vars.get(1));
		poly.add(vars.get(
				2));
		
		g.addRule(answer_W, new Rule(c, varSet, poly, args));
		
		// C : <v0, z> -> z
		vars = new ArrayList<Variable>();
		varSet = new VariableSet();
		for (int i = 0; i <= 0; i++)
		{
			Variable v = new Variable();
			vars.add(i, v);
			varSet.put(v);
		}
		
		args = new ArrayList<Variable>();
		args.add(vars.get(0));
		
		c = new Configuration();
		c.add(new Answer(answer_z));
		
		g.addRule(answer_C, new Rule(c, varSet, new Polynomial(new Answer(answer_z)), args));
		
		/* ************************************** */
		
		return g;
	}
	
	public static void main(String[] args)
	{
		// Sanity checks
		if (args.length == 0)
		{
			System.err.println("Expecting some input to parse!");
			System.exit(0);
		}
		
		performTest(new TripleStringExample(), args[0]);
	}
}