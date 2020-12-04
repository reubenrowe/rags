package rnsr.rag.examples;

import rnsr.rag.grammar.*;
import rnsr.rag.grammar.exception.ArgumentMismatchException;
import rnsr.rag.grammar.exception.RuleFunctionException;
import rnsr.rag.grammar.exception.VariableNotFoundException;

import java.util.ArrayList;

/**
 * This test class creates a RAG that generates a language in which variables
 * can be declared and assigned each other's values. It also enforces two
 * context-sensitive rules:
 * 
 * 1. A variable can only be used in assignments if it has first been declared.
 * 2. A variable cannot be declared more than once.
 */
public	class		DeclarationAndAssignmentExample
		extends		CommandLineInputBase
{

	private String m_alphabet = "abcdefghijklmnopqrstuvwxyz";
	
	/**
	 * Creates the grammar
	 */
	public Grammar CreateRAG() throws	ArgumentMismatchException,
										RuleFunctionException,
										VariableNotFoundException
	{
		AnswerIdentifier id_prog = new AnswerIdentifier("prog", 0);
		Grammar g = new Grammar(id_prog);

		ArrayList<AnswerIdentifier> alphabetTerminalIds = new ArrayList<AnswerIdentifier>();
		ArrayList<AnswerIdentifier> notLetIdentifiers = new ArrayList<AnswerIdentifier>();
		for (int i = 0; i < this.m_alphabet.length(); i++)
		{
			String character = this.m_alphabet.substring(i, i + 1);
			alphabetTerminalIds.add(new AnswerIdentifier(character));
			notLetIdentifiers.add(new AnswerIdentifier("notlet_" + character, 0));
		}
		
		/* ********** RULE PRODUCTIONS ********** */
		
		// Declare variables for reuse
		ArrayList<Variable> vars;
		ArrayList<Variable> args;
		ArrayList<Polynomial> answerArgs;
		Answer a;
		VariableSet varSet;
		Configuration c;
		Polynomial poly;
		ArrayList<Polynomial> polys;
		RuleSet ruleSet;
		
		// union(a, b) : <v0, v1> -> <a, v1>
		AnswerIdentifier id_union = new AnswerIdentifier("union", 2);
		vars = new ArrayList<Variable>();
		varSet = new VariableSet();
		for (int i = 0; i < 4; i++)
		{
			Variable v = new Variable();
			vars.add(i, v);
			varSet.put(v);
		}
		
		args = new ArrayList<Variable>();
		args.add(vars.get(0));	// union
		args.add(vars.get(1));	// a
		args.add(vars.get(2));	// b
		
		c = new Configuration();
		c.add(new Pair(new Polynomial(vars.get(1)), vars.get(3)));
		
		g.addRule(id_union, new Rule(c, varSet, new Polynomial(vars.get(3)), args));
		
		// union(a, b) : <v0, v1> -> <b, v1>
		vars = new ArrayList<Variable>();
		varSet = new VariableSet();
		for (int i = 0; i < 4; i++)
		{
			Variable v = new Variable();
			vars.add(i, v);
			varSet.put(v);
		}
		
		args = new ArrayList<Variable>();
		args.add(vars.get(0));	// union
		args.add(vars.get(1));	// a
		args.add(vars.get(2));	// b
		
		c = new Configuration();
		c.add(new Pair(new Polynomial(vars.get(2)), vars.get(3)));
		
		g.addRule(id_union, new Rule(c, varSet, new Polynomial(vars.get(3)), args));
		
		// map(a, b) : <v0, b> -> <a, v1>
		AnswerIdentifier id_map = new AnswerIdentifier("map", 2);
		vars = new ArrayList<Variable>();
		varSet = new VariableSet();
		for (int i = 0; i < 4; i++)
		{
			Variable v = new Variable();
			vars.add(i, v);
			varSet.put(v);
		}
		
		args = new ArrayList<Variable>();
		args.add(vars.get(0));	// map
		args.add(vars.get(1));	// a
		args.add(vars.get(2));	// b
		
		c = new Configuration();
		c.add(new Pair(new Polynomial(args.get(1)), vars.get(3)));
		
		g.addRule(id_map, new Rule(c, varSet, new Polynomial(args.get(2)), args));
		
		// Ø : {}
		AnswerIdentifier id_empty = new AnswerIdentifier("empty", 0); 
		g.addEmptyRuleSet(id_empty);
		
		// star(a) : <v0, λ> -> λ
		AnswerIdentifier id_star = new AnswerIdentifier("star", 1);
		vars = new ArrayList<Variable>();
		varSet = new VariableSet();

		for (int i = 0; i < 2; i++)
		{
			Variable v = new Variable();
			vars.add(i, v);
			varSet.put(v);
		}
		
		args = new ArrayList<Variable>();
		args.add(vars.get(0));	// star
		args.add(vars.get(1));	// a
		
		c = new Configuration();
		c.add(new Answer(AnswerIdentifier.Lambda()));
		
		g.addRule(id_star, new Rule(c, varSet, new Polynomial(new Answer(AnswerIdentifier.Lambda())), args));
		
		// star(a) : <v0, v1v2> -> <a, v1> <star(a), v2>
		vars = new ArrayList<Variable>();
		varSet = new VariableSet();
		for (int i = 0; i < 4; i++)
		{
			Variable v = new Variable();
			vars.add(i, v);
			varSet.put(v);
		}
		
		args = new ArrayList<Variable>();
		args.add(vars.get(0));	// star
		args.add(vars.get(1));	// a
		
		c = new Configuration();
		c.add(new Pair(
				new Polynomial(args.get(1)), vars.get(2)
			));
		c.add(new Pair(
				new Polynomial(args.get(0)), vars.get(3)
			));
		
		poly = new Polynomial();
		poly.add(vars.get(2));
		poly.add(vars.get(3));
		
		g.addRule(id_star, new Rule(c, varSet, poly, args));
		
		// letter : For all z in alphabet <v0, λ> -> z
		AnswerIdentifier id_letter = new AnswerIdentifier("letter", 0);
		ruleSet = new RuleSet();
		
		// Create Rules for each letter of the alphabet
		for (int i = 0; i < alphabetTerminalIds.size(); i++)
		{
			vars = new ArrayList<Variable>();
			args = new ArrayList<Variable>();
			varSet = new VariableSet();
			
			Variable v = new Variable();
			vars.add(v);
			varSet.put(v);
			args.add(v);
			
			c = new Configuration();
			c.add(new Answer(alphabetTerminalIds.get(i)));
			
			ruleSet.add(new Rule(c, varSet, new Polynomial(new Answer(AnswerIdentifier.Lambda())), args));
		}
		
		g.addRuleSet(id_letter, ruleSet);
		
		// echo : for all z in alphabet <v0, z> -> z
		AnswerIdentifier id_echo = new AnswerIdentifier("echo", 0);
		ruleSet = new RuleSet();
		
		// Create Rules for each letter of the alphabet
		for (int i = 0; i < alphabetTerminalIds.size(); i++)
		{
			vars = new ArrayList<Variable>();
			args = new ArrayList<Variable>();
			varSet = new VariableSet();
			
			Variable v = new Variable();
			vars.add(v);
			varSet.put(v);
			args.add(v);
			
			c = new Configuration();
			c.add(new Answer(alphabetTerminalIds.get(i)));
			
			ruleSet.add(new Rule(c, varSet, new Polynomial(new Answer(alphabetTerminalIds.get(i))), args));
		}
		
		g.addRuleSet(id_echo, ruleSet);
		
		// for all z in alphabet, notlet_z : for all y in alphabet - {z} <v0, λ> -> y
		for (int i = 0; i < notLetIdentifiers.size(); i++)
		{
			ruleSet = new RuleSet();
			
			for (int j = 0; j < alphabetTerminalIds.size(); j++)
			{
				if (i != j)
				{
					vars = new ArrayList<Variable>();
					args = new ArrayList<Variable>();
					varSet = new VariableSet();
					
					Variable v = new Variable();
					vars.add(v);
					varSet.put(v);
					args.add(v);
					
					c = new Configuration();
					c.add(new Answer(alphabetTerminalIds.get(j)));
					
					ruleSet.add(new Rule(c, varSet, new Polynomial(new Answer(AnswerIdentifier.Lambda())), args));
				}
			}
			
			g.addRuleSet(notLetIdentifiers.get(i), ruleSet);
		}
		
		// notlet : for all z in alphabet <v0, notlet_z> -> z
		AnswerIdentifier id_notlet = new AnswerIdentifier("notlet", 0);
		ruleSet = new RuleSet();
		
		for (int i = 0; i < alphabetTerminalIds.size(); i++)
		{
			vars = new ArrayList<Variable>();
			args = new ArrayList<Variable>();
			varSet = new VariableSet();
			
			Variable v = new Variable();
			vars.add(v);
			varSet.put(v);
			args.add(v);
			
			c = new Configuration();
			c.add(new Answer(alphabetTerminalIds.get(i)));
			
			ruleSet.add(new Rule(c, varSet, new Polynomial(new Answer(notLetIdentifiers.get(i))), args));
		}
		
		g.addRuleSet(id_notlet, ruleSet);
		
		// not : <v0, letter star(letter)> -> λ
		AnswerIdentifier id_not = new AnswerIdentifier("not", 0);
		vars = new ArrayList<Variable>();
		varSet = new VariableSet();
		args = new ArrayList<Variable>();
		
		for (int i = 0; i < 1; i++)
		{
			Variable v = new Variable();
			vars.add(v);
			varSet.put(v);
			args.add(v);
		}
		
		c = new Configuration();
		c.add(new Answer(AnswerIdentifier.Lambda()));
		
		poly = new Polynomial();
		poly.add(new Answer(id_letter));
		
		a = new Answer(id_star);
		answerArgs = new ArrayList<Polynomial>();
		answerArgs.add(new Polynomial(new Answer(id_letter)));
		a.setArguments(answerArgs);
		
		poly.add(a);
		
		g.addRule(id_not, new Rule(c, varSet, poly, args));
		
		// not : <v0, union(λ, union((notlet : v1) star(letter), v1 (not : v2)))> -> <echo, v1> <star(echo), v2>
		vars = new ArrayList<Variable>();
		varSet = new VariableSet();
		args = new ArrayList<Variable>();

		for (int i = 0; i < 3; i++)
		{
			Variable v = new Variable();
			vars.add(v);
			varSet.put(v);
		}
		
		args.add(vars.get(0));
		
		c = new Configuration();
		c.add(new Pair(new Polynomial(new Answer(id_echo)), vars.get(1)));
		
		answerArgs = new ArrayList<Polynomial>();
		answerArgs.add(new Polynomial(new Answer(id_echo)));
		
		c.add(new Pair(new Polynomial(new Answer(id_star, answerArgs)), vars.get(2)));
		
		polys = new ArrayList<Polynomial>();

		// polys[0] = (notlet : v1) start(letter)
		poly = new Polynomial();
		poly.add(new Query(new Polynomial(new Answer(id_notlet)), new Polynomial(vars.get(1))));
		answerArgs = new ArrayList<Polynomial>();
		answerArgs.add(new Polynomial(new Answer(id_letter)));
		poly.add(new Answer(id_star, answerArgs));
		polys.add(poly);
		
		// polys[1] = v1 (not : v2)
		poly = new Polynomial();
		poly.add(vars.get(1));
		poly.add(new Query(new Polynomial(new Answer(id_not)), new Polynomial(vars.get(2))));
		polys.add(poly);
		
		// polys[2] = union(polys[0], polys[1])
		poly = new Polynomial();
		poly.add(new Answer(id_union, new ArrayList<Polynomial>(polys.subList(0, 2))));
		polys.add(poly);
		
		// polys[3] = union(λ, polys[2])
		poly = new Polynomial();
		answerArgs = new ArrayList<Polynomial>();
		answerArgs.add(new Polynomial(new Answer(AnswerIdentifier.Lambda())));
		answerArgs.add(polys.get(2));
		poly.add(new Answer(id_union, answerArgs));
		polys.add(poly);
		
		g.addRule(id_not, new Rule(c, varSet, polys.get(3), args));
		
		// def : <v0, λ> -> def
		AnswerIdentifier id_def = new AnswerIdentifier("def", 0);
		vars = new ArrayList<Variable>();
		varSet = new VariableSet();
		args = new ArrayList<Variable>();
		
		for (int i = 0; i < 1; i++)
		{
			Variable v = new Variable();
			vars.add(v);
			varSet.put(v);
			args.add(v);
		}
		
		c = new Configuration();
		c.add(new Answer(id_def));
		
		g.addRule(id_def, new Rule(c, varSet, new Polynomial(new Answer(AnswerIdentifier.Lambda())), args));
		
		// undef : <v0, λ> -> undef
		AnswerIdentifier id_undef = new AnswerIdentifier("undef", 0);
		vars = new ArrayList<Variable>();
		varSet = new VariableSet();
		args = new ArrayList<Variable>();
		
		for (int i = 0; i < 1; i++)
		{
			Variable v = new Variable();
			vars.add(v);
			varSet.put(v);
			args.add(v);
		}
		
		c = new Configuration();
		c.add(new Answer(id_undef));
		
		g.addRule(id_undef, new Rule(c, varSet, new Polynomial(new Answer(AnswerIdentifier.Lambda())), args));
		
		// make_env : <v0, union(map(undef, (not : v1)), map(def, v1))> -> <star(echo), v1>
		AnswerIdentifier id_make_env = new AnswerIdentifier("make_env", 0);
		vars = new ArrayList<Variable>();
		varSet = new VariableSet();
		args = new ArrayList<Variable>();
		
		for (int i = 0; i < 2; i++)
		{
			Variable v = new Variable();
			vars.add(v);
			varSet.put(v);
		}

		args.add(vars.get(0));

		c = new Configuration();
		
		poly = new Polynomial();
		answerArgs = new ArrayList<Polynomial>();
		answerArgs.add(new Polynomial(new Answer(id_echo)));
		poly.add(new Answer(id_star, answerArgs));
		
		c.add(new Pair(poly, vars.get(1)));
		
		polys = new ArrayList<Polynomial>();

		// map(undef, (not : v1))
		answerArgs = new ArrayList<Polynomial>();
		answerArgs.add(new Polynomial(new Answer(id_undef)));
		answerArgs.add(new Polynomial(new Query(
				new Polynomial(new Answer(id_not)),
				new Polynomial(vars.get(1))
			)));
		polys.add(new Polynomial(new Answer(id_map, answerArgs)));

		// map(def, v1)
		answerArgs = new ArrayList<Polynomial>();
		answerArgs.add(new Polynomial(new Answer(id_def)));
		answerArgs.add(new Polynomial(vars.get(1)));
		polys.add(new Polynomial(new Answer(id_map, answerArgs)));
		
		g.addRule(id_make_env, new Rule(c, varSet, new Polynomial(new Answer(id_union, polys)), args));
		
		// and(a, b) : <v0, (a : v1) (b : v1)> -> <star(echo), v1>
		AnswerIdentifier id_and = new AnswerIdentifier("and", 2);
		vars = new ArrayList<Variable>();
		varSet = new VariableSet();
		args = new ArrayList<Variable>();
		
		for (int i = 0; i < 4; i++)
		{
			Variable v = new Variable();
			vars.add(v);
			varSet.put(v);
		}
		
		args.add(vars.get(0));	// and
		args.add(vars.get(1));	// a
		args.add(vars.get(2));	// b
		
		c = new Configuration();
		answerArgs = new ArrayList<Polynomial>();
		answerArgs.add(new Polynomial(new Answer(id_echo)));
		
		c.add(new Pair(
				new Polynomial(new Answer(id_star, answerArgs)),
				vars.get(3)
			));
		
		poly = new Polynomial();
		poly.add(new Query(
				new Polynomial(args.get(1)),
				new Polynomial(vars.get(3))				
			));
		poly.add(new Query(
				new Polynomial(args.get(2)),
				new Polynomial(vars.get(3))				
			));
		
		g.addRule(id_and, new Rule(c, varSet, poly, args));
		
		// combine(a, b) : <v0, and((a : undef), (b : undef))> -> undef
		AnswerIdentifier id_combine = new AnswerIdentifier("combine", 2);
		vars = new ArrayList<Variable>();
		varSet = new VariableSet();
		args = new ArrayList<Variable>();
		
		for (int i = 0; i < 3; i++)
		{
			Variable v = new Variable();
			vars.add(v);
			varSet.put(v);
			args.add(v);
		}
		
		c = new Configuration();
		c.add(new Answer(id_undef));
		
		answerArgs = new ArrayList<Polynomial>();
		answerArgs.add(new Polynomial(new Query(
				new Polynomial(args.get(1)),
				new Polynomial(new Answer(id_undef))
			)));
		answerArgs.add(new Polynomial(new Query(
				new Polynomial(args.get(2)),
				new Polynomial(new Answer(id_undef))
			)));
		
		g.addRule(id_combine, new Rule(c, varSet, new Polynomial(new Answer(id_and, answerArgs)), args));		
				
		// combine(a, b) : <v0, union((a : def), (b : def))> -> def
		vars = new ArrayList<Variable>();
		varSet = new VariableSet();
		args = new ArrayList<Variable>();
		
		for (int i = 0; i < 3; i++)
		{
			Variable v = new Variable();
			vars.add(v);
			varSet.put(v);
			args.add(v);
		}
		
		c = new Configuration();
		c.add(new Answer(id_def));
		
		answerArgs = new ArrayList<Polynomial>();
		answerArgs.add(new Polynomial(new Query(
				new Polynomial(args.get(1)),
				new Polynomial(new Answer(id_def))
			)));
		answerArgs.add(new Polynomial(new Query(
				new Polynomial(args.get(2)),
				new Polynomial(new Answer(id_def))
			)));
		
		g.addRule(id_combine, new Rule(c, varSet, new Polynomial(new Answer(id_union, answerArgs)), args));		
		
		// decl(e) : <v0, combine(e, (make_env : v1))> -> "int " <echo star(echo), v1> <(e : undef) : v1, v2> ";"
		AnswerIdentifier id_decl = new AnswerIdentifier("decl", 1);
		vars = new ArrayList<Variable>();
		varSet = new VariableSet();
		args = new ArrayList<Variable>();
		
		for (int i = 0; i < 4; i++)
		{
			Variable v = new Variable();
			vars.add(v);
			varSet.put(v);
		}
		
		args.add(vars.get(0));	// decl
		args.add(vars.get(1));	// e
		
		c = new Configuration();
		c.add(new Answer(new AnswerIdentifier("int")));
		
		answerArgs = new ArrayList<Polynomial>();
		answerArgs.add(new Polynomial(new Answer(id_echo)));
		
		poly = new Polynomial();
		poly.add(new Answer(id_echo));
		poly.add(new Answer(id_star, answerArgs));
		
		c.add(new Pair(poly, vars.get(2)));
		
		c.add(new Pair(
				new Polynomial(new Query(
						new Polynomial(new Query(new Polynomial(args.get(1)), new Polynomial(new Answer(id_undef)))),
						new Polynomial(vars.get(2))
					)),
				vars.get(3)
			));
		
		c.add(new Answer(new AnswerIdentifier(";")));
		
		answerArgs = new ArrayList<Polynomial>();
		answerArgs.add(new Polynomial(args.get(1)));
		answerArgs.add(new Polynomial(new Query(
				new Polynomial(new Answer(id_make_env)),
				new Polynomial(vars.get(2))
			)));
		
		g.addRule(id_decl, new Rule(c, varSet, new Polynomial(new Answer(id_combine, answerArgs)), args));
		
		// decl_list(e) : <v0, e> -> λ
		AnswerIdentifier id_decl_list = new AnswerIdentifier("decl_list", 1);
		vars = new ArrayList<Variable>();
		varSet = new VariableSet();
		args = new ArrayList<Variable>();
		
		for (int i = 0; i < 2; i++)
		{
			Variable v = new Variable();
			vars.add(v);
			varSet.put(v);
			args.add(v);
		}
		
		c = new Configuration();
		c.add(new Answer(AnswerIdentifier.Lambda()));
		
		g.addRule(id_decl_list, new Rule(c, varSet, new Polynomial(args.get(1)), args));
		
		// decl_list(e) : <v0, v2> -> <decl(e), v1> <decl_list(v1), v2>
		vars = new ArrayList<Variable>();
		varSet = new VariableSet();
		args = new ArrayList<Variable>();
		
		for (int i = 0; i < 4; i++)
		{
			Variable v = new Variable();
			vars.add(v);
			varSet.put(v);
		}
		
		args.add(vars.get(0));	// decl_list
		args.add(vars.get(1));	// e
		
		c = new Configuration();
		
		answerArgs = new ArrayList<Polynomial>();
		answerArgs.add(new Polynomial(args.get(1)));
		
		c.add(new Pair(new Polynomial(new Answer(id_decl, answerArgs)), vars.get(2)));

		answerArgs = new ArrayList<Polynomial>();
		answerArgs.add(new Polynomial(vars.get(2)));
		
		c.add(new Pair(new Polynomial(new Answer(id_decl_list, answerArgs)), vars.get(3)));
		
		g.addRule(id_decl_list, new Rule(c, varSet, new Polynomial(vars.get(3)), args));
		
		// stmt(e) : <v0, λ> -> <e : def, v1> " = " <e : def, v2> ";"
		AnswerIdentifier id_stmt = new AnswerIdentifier("stmt", 1);
		vars = new ArrayList<Variable>();
		varSet = new VariableSet();
		args = new ArrayList<Variable>();
		
		for (int i = 0; i < 4; i++)
		{
			Variable v = new Variable();
			vars.add(v);
			varSet.put(v);
		}
		
		args.add(vars.get(0));	// stmt
		args.add(vars.get(1));	// e
		
		c = new Configuration();

		c.add(new Pair(new Polynomial(new Query(new Polynomial(args.get(1)), new Polynomial(new Answer(id_def)))), vars.get(2)));
		c.add(new Answer(new AnswerIdentifier(" = ")));
		c.add(new Pair(new Polynomial(new Query(new Polynomial(args.get(1)), new Polynomial(new Answer(id_def)))), vars.get(3)));
		c.add(new Answer(new AnswerIdentifier(";")));
		
		g.addRule(id_stmt, new Rule(c, varSet, new Polynomial(new Answer(AnswerIdentifier.Lambda())), args));

		// prog : <v0, λ> -> "{" <decl_list(union(map(undef, star(letter)), map(def, Ø))), v1> <star(stmt(v1)), v2> "}"
		vars = new ArrayList<Variable>();
		varSet = new VariableSet();
		args = new ArrayList<Variable>();
		
		for (int i = 0; i < 3; i++)
		{
			Variable v = new Variable();
			vars.add(v);
			varSet.put(v);
		}
		
		args.add(vars.get(0));	// prog

		c = new Configuration();
		
		c.add(new Answer(new AnswerIdentifier("{")));
		
		polys = new ArrayList<Polynomial>();
		polys.add(new Polynomial(new Answer(id_def)));		// def
		polys.add(new Polynomial(new Answer(id_empty)));	// Ø
		polys.add(new Polynomial(new Answer(id_letter)));	// letter
		polys.add(new Polynomial(new Answer(id_undef)));	// undef
		polys.add(new Polynomial(new Answer(id_star, new ArrayList<Polynomial>(polys.subList(2, 3)))));		// star(letter)
		polys.add(new Polynomial(new Answer(id_map, new ArrayList<Polynomial>(polys.subList(3, 5)))));		// map(undef, star(letter))
		polys.add(new Polynomial(new Answer(id_map, new ArrayList<Polynomial>(polys.subList(0, 2)))));		// map(def, Ø)
		polys.add(new Polynomial(new Answer(id_union, new ArrayList<Polynomial>(polys.subList(5, 7)))));	// union(map(undef, star(letter)), map(def, Ø))
		
		c.add(new Pair(new Polynomial(new Answer(id_decl_list, new ArrayList<Polynomial>(polys.subList(7, 8)))), vars.get(1)));
		
		polys = new ArrayList<Polynomial>();
		polys.add(new Polynomial(vars.get(1)));
		
		answerArgs = new ArrayList<Polynomial>();
		answerArgs.add(new Polynomial(new Answer(id_stmt, polys)));
		
		c.add(new Pair(new Polynomial(new Answer(id_star, answerArgs)), vars.get(2)));
		
		c.add(new Answer(new AnswerIdentifier("}")));
		
		g.addRule(id_prog, new Rule(c, varSet, new Polynomial(new Answer(AnswerIdentifier.Lambda())), args));

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
		performTest(new DeclarationAndAssignmentExample(), args[0]);
	}
	
}
