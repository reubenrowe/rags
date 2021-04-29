import rnsr.rag.TestHarness;
import rnsr.rag.grammar.*;
import rnsr.rag.grammar.exception.ArgumentMismatchException;
import rnsr.rag.grammar.exception.RuleFunctionException;
import rnsr.rag.grammar.exception.VariableNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import rnsr.rag.grammar.types.Type;
public class OperationalSemanticsRAGSS {
	public Grammar CreateRAG() throws ArgumentMismatchException, RuleFunctionException, VariableNotFoundException {
		AnswerIdentifier nt_answer_Or_0 = new AnswerIdentifier("Or", 0);
		AnswerIdentifier nt_answer_Echo_0 = new AnswerIdentifier("Echo", 0);
		AnswerIdentifier nt_answer_False_0 = new AnswerIdentifier("False", 0);
		AnswerIdentifier nt_answer_Star_1 = new AnswerIdentifier("Star", 1);
		AnswerIdentifier nt_answer_Boolean_0 = new AnswerIdentifier("Boolean", 0);
		AnswerIdentifier nt_answer_Not_1 = new AnswerIdentifier("Not", 1);
		AnswerIdentifier nt_answer_String_0 = new AnswerIdentifier("String", 0);
		AnswerIdentifier nt_answer_Not_0 = new AnswerIdentifier("Not", 0);
		AnswerIdentifier nt_answer___and_0 = new AnswerIdentifier("__and", 0);
		AnswerIdentifier nt_answer___or_0 = new AnswerIdentifier("__or", 0);
		AnswerIdentifier nt_answer_Eq_1 = new AnswerIdentifier("Eq", 1);
		AnswerIdentifier nt_answer_Letter_0 = new AnswerIdentifier("Letter", 0);
		AnswerIdentifier nt_answer_Term_0 = new AnswerIdentifier("Term", 0);
		AnswerIdentifier nt_answer___not_0 = new AnswerIdentifier("__not", 0);
		AnswerIdentifier nt_answer_True_0 = new AnswerIdentifier("True", 0);
		AnswerIdentifier nt_answer_And_0 = new AnswerIdentifier("And", 0);
		AnswerIdentifier tl_answer_6 = new AnswerIdentifier("and(");
		AnswerIdentifier tl_answer_7 = new AnswerIdentifier("T");
		AnswerIdentifier tl_answer_5 = new AnswerIdentifier("False");
		AnswerIdentifier tl_answer_9 = new AnswerIdentifier("str(");
		AnswerIdentifier tl_answer_3 = new AnswerIdentifier(",");
		AnswerIdentifier tl_answer_4 = new AnswerIdentifier("True");
		AnswerIdentifier tl_answer_1 = new AnswerIdentifier(")");
		AnswerIdentifier tl_answer_0 = new AnswerIdentifier("not(");
		AnswerIdentifier tl_answer_2 = new AnswerIdentifier("or(");
		AnswerIdentifier tl_answer_8 = new AnswerIdentifier("F");
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

		c.add(new Answer(tl_answer_0));

		poly1 = new Polynomial();
		poly1.add(new Answer(nt_answer_Term_0));
		c.add(new Pair(poly1, vars.get(1)));

		c.add(new Answer(tl_answer_1));

		poly2 = new Polynomial();
		Polynomial poly3 = new Polynomial();
		poly3.add(new Answer(nt_answer___not_0));
		Polynomial poly4 = new Polynomial();
		Polynomial poly5 = new Polynomial();
		poly5.add(new Answer(nt_answer_Term_0));
		Polynomial poly6 = new Polynomial();
		poly6.add(vars.get(1));
		poly4.add(new Query(poly5, poly6));
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
		poly1.add(new Answer(nt_answer_Boolean_0));
		c.add(new Pair(poly1, vars.get(1)));

		c.add(new Answer(tl_answer_3));

		poly2 = new Polynomial();
		poly2.add(new Answer(nt_answer_Boolean_0));
		c.add(new Pair(poly2, vars.get(2)));

		c.add(new Answer(tl_answer_1));

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
		for (int i = 0; i < 5; i++) {
			Variable v = new Variable();
			vars.add(v);
			varSet.put(v);
		}

		args1.add(new Polynomial(vars.get(0)));

		c = new Configuration();

		c.add(new Answer(tl_answer_2));

		poly1 = new Polynomial();
		poly1.add(new Answer(nt_answer_Boolean_0));
		c.add(new Pair(poly1, vars.get(1)));

		c.add(new Answer(tl_answer_3));

		poly2 = new Polynomial();
		poly2.add(new Answer(nt_answer_Term_0));
		c.add(new Pair(poly2, vars.get(2)));

		poly3 = new Polynomial();
		poly4 = new Polynomial();
		poly4.add(new Answer(nt_answer_False_0));
		poly5 = new Polynomial();
		poly6 = new Polynomial();
		ArrayList<Polynomial> args2 = new ArrayList<>();
		Polynomial poly7 = new Polynomial();
		poly7.add(new Answer(tl_answer_4));
		args2.add(poly7);
		poly6.add(new Answer(nt_answer_Eq_1, args2));
		Polynomial poly8 = new Polynomial();
		poly8.add(vars.get(2));
		poly5.add(new Query(poly6, poly8));
		poly3.add(new Query(poly4, poly5));
		c.add(new Pair(poly3, vars.get(3)));

		Polynomial poly9 = new Polynomial();
		Polynomial poly10 = new Polynomial();
		poly10.add(new Answer(nt_answer_False_0));
		Polynomial poly11 = new Polynomial();
		Polynomial poly12 = new Polynomial();
		ArrayList<Polynomial> args3 = new ArrayList<>();
		Polynomial poly13 = new Polynomial();
		poly13.add(new Answer(tl_answer_5));
		args3.add(poly13);
		poly12.add(new Answer(nt_answer_Eq_1, args3));
		Polynomial poly14 = new Polynomial();
		poly14.add(vars.get(2));
		poly11.add(new Query(poly12, poly14));
		poly9.add(new Query(poly10, poly11));
		c.add(new Pair(poly9, vars.get(4)));

		c.add(new Answer(tl_answer_1));

		Polynomial poly15 = new Polynomial();
		Polynomial poly16 = new Polynomial();
		poly16.add(new Answer(nt_answer_Term_0));
		Polynomial poly17 = new Polynomial();
		poly17.add(new Answer(tl_answer_2));
		poly17.add(vars.get(1));
		poly17.add(new Answer(tl_answer_3));
		Polynomial poly18 = new Polynomial();
		poly18.add(new Answer(nt_answer_Term_0));
		Polynomial poly19 = new Polynomial();
		poly19.add(vars.get(2));
		poly17.add(new Query(poly18, poly19));
		poly17.add(new Answer(tl_answer_1));
		poly15.add(new Query(poly16, poly17));

		g.addRule(nt_answer_Or_0, new Rule(c, varSet, poly15, args1, conditions));
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

		c = new Configuration();

		c.add(new Answer(tl_answer_2));

		poly1 = new Polynomial();
		poly1.add(new Answer(nt_answer_Term_0));
		c.add(new Pair(poly1, vars.get(1)));

		poly2 = new Polynomial();
		poly3 = new Polynomial();
		poly3.add(new Answer(nt_answer_False_0));
		poly4 = new Polynomial();
		poly5 = new Polynomial();
		args2 = new ArrayList<>();
		poly6 = new Polynomial();
		poly6.add(new Answer(tl_answer_4));
		args2.add(poly6);
		poly5.add(new Answer(nt_answer_Eq_1, args2));
		poly7 = new Polynomial();
		poly7.add(vars.get(1));
		poly4.add(new Query(poly5, poly7));
		poly2.add(new Query(poly3, poly4));
		c.add(new Pair(poly2, vars.get(2)));

		poly8 = new Polynomial();
		poly9 = new Polynomial();
		poly9.add(new Answer(nt_answer_False_0));
		poly10 = new Polynomial();
		poly11 = new Polynomial();
		args3 = new ArrayList<>();
		poly12 = new Polynomial();
		poly12.add(new Answer(tl_answer_5));
		args3.add(poly12);
		poly11.add(new Answer(nt_answer_Eq_1, args3));
		poly13 = new Polynomial();
		poly13.add(vars.get(1));
		poly10.add(new Query(poly11, poly13));
		poly8.add(new Query(poly9, poly10));
		c.add(new Pair(poly8, vars.get(3)));

		c.add(new Answer(tl_answer_3));

		poly14 = new Polynomial();
		poly14.add(new Answer(nt_answer_Term_0));
		c.add(new Pair(poly14, vars.get(4)));

		poly15 = new Polynomial();
		poly16 = new Polynomial();
		poly16.add(new Answer(nt_answer_False_0));
		poly17 = new Polynomial();
		poly18 = new Polynomial();
		ArrayList<Polynomial> args4 = new ArrayList<>();
		poly19 = new Polynomial();
		poly19.add(new Answer(tl_answer_4));
		args4.add(poly19);
		poly18.add(new Answer(nt_answer_Eq_1, args4));
		Polynomial poly20 = new Polynomial();
		poly20.add(vars.get(4));
		poly17.add(new Query(poly18, poly20));
		poly15.add(new Query(poly16, poly17));
		c.add(new Pair(poly15, vars.get(5)));

		Polynomial poly21 = new Polynomial();
		Polynomial poly22 = new Polynomial();
		poly22.add(new Answer(nt_answer_False_0));
		Polynomial poly23 = new Polynomial();
		Polynomial poly24 = new Polynomial();
		ArrayList<Polynomial> args5 = new ArrayList<>();
		Polynomial poly25 = new Polynomial();
		poly25.add(new Answer(tl_answer_5));
		args5.add(poly25);
		poly24.add(new Answer(nt_answer_Eq_1, args5));
		Polynomial poly26 = new Polynomial();
		poly26.add(vars.get(4));
		poly23.add(new Query(poly24, poly26));
		poly21.add(new Query(poly22, poly23));
		c.add(new Pair(poly21, vars.get(6)));

		c.add(new Answer(tl_answer_1));

		Polynomial poly27 = new Polynomial();
		Polynomial poly28 = new Polynomial();
		poly28.add(new Answer(nt_answer_Term_0));
		Polynomial poly29 = new Polynomial();
		poly29.add(new Answer(tl_answer_2));
		Polynomial poly30 = new Polynomial();
		poly30.add(new Answer(nt_answer_Term_0));
		Polynomial poly31 = new Polynomial();
		poly31.add(vars.get(1));
		poly29.add(new Query(poly30, poly31));
		poly29.add(new Answer(tl_answer_3));
		poly29.add(vars.get(4));
		poly29.add(new Answer(tl_answer_1));
		poly27.add(new Query(poly28, poly29));

		g.addRule(nt_answer_Or_0, new Rule(c, varSet, poly27, args1, conditions));
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

		c.add(new Answer(tl_answer_6));

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
		poly6 = new Polynomial();
		poly6.add(new Answer(nt_answer_Term_0));
		poly7 = new Polynomial();
		poly7.add(vars.get(1));
		poly5.add(new Query(poly6, poly7));
		poly8 = new Polynomial();
		poly8.add(new Answer(nt_answer_Term_0));
		poly9 = new Polynomial();
		poly9.add(vars.get(2));
		poly5.add(new Query(poly8, poly9));
		poly3.add(new Query(poly4, poly5));

		g.addRule(nt_answer_And_0, new Rule(c, varSet, poly3, args1, conditions));
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
		poly1.add(new Answer(tl_answer_4));

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

		c.add(new Answer(tl_answer_5));

		poly1 = new Polynomial();
		poly1.add(new Answer(tl_answer_5));

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

		c.add(new Answer(tl_answer_4));

		poly1 = new Polynomial();
		poly1.add(new Answer(tl_answer_5));

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

		c.add(new Answer(tl_answer_5));

		poly1 = new Polynomial();
		poly1.add(new Answer(tl_answer_4));

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

		c.add(new Answer(tl_answer_4));

		c.add(new Answer(tl_answer_4));

		poly1 = new Polynomial();
		poly1.add(new Answer(tl_answer_4));

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

		c.add(new Answer(tl_answer_4));

		c.add(new Answer(tl_answer_5));

		poly1 = new Polynomial();
		poly1.add(new Answer(tl_answer_4));

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

		c.add(new Answer(tl_answer_5));

		c.add(new Answer(tl_answer_4));

		poly1 = new Polynomial();
		poly1.add(new Answer(tl_answer_4));

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

		c.add(new Answer(tl_answer_5));

		c.add(new Answer(tl_answer_5));

		poly1 = new Polynomial();
		poly1.add(new Answer(tl_answer_5));

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

		c.add(new Answer(tl_answer_4));

		c.add(new Answer(tl_answer_4));

		poly1 = new Polynomial();
		poly1.add(new Answer(tl_answer_4));

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

		c.add(new Answer(tl_answer_4));

		c.add(new Answer(tl_answer_5));

		poly1 = new Polynomial();
		poly1.add(new Answer(tl_answer_5));

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

		c.add(new Answer(tl_answer_5));

		c.add(new Answer(tl_answer_4));

		poly1 = new Polynomial();
		poly1.add(new Answer(tl_answer_5));

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

		c.add(new Answer(tl_answer_5));

		c.add(new Answer(tl_answer_5));

		poly1 = new Polynomial();
		poly1.add(new Answer(tl_answer_5));

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
		poly1 = new Polynomial();
		poly1.add(new Answer(AnswerIdentifier.Lambda()));
		args1.add(poly1);

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
		poly5.add(new Answer(tl_answer_8));

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
		poly2.add(new Answer(tl_answer_8));

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
		poly6.add(new Answer(tl_answer_8));

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

		c.add(new Answer(tl_answer_7));

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

		c.add(new Answer(tl_answer_8));

		poly1 = new Polynomial();
		poly1.add(new Answer(AnswerIdentifier.Lambda()));

		g.addRule(nt_answer_False_0, new Rule(c, varSet, poly1, args1, conditions));
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
		args2 = new ArrayList<>();
		poly2 = new Polynomial();
		poly2.add(new Answer(nt_answer_Echo_0));
		args2.add(poly2);
		poly1.add(new Answer(nt_answer_Star_1, args2));
		c.add(new Pair(poly1, vars.get(1)));

		c.add(new Answer(tl_answer_1));

		poly3 = new Polynomial();
		poly3.add(new Answer(tl_answer_9));
		poly3.add(vars.get(1));
		poly3.add(new Answer(tl_answer_1));

		g.addRule(nt_answer_String_0, new Rule(c, varSet, poly3, args1, conditions));
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
			g = new OperationalSemanticsRAGSS().CreateRAG();
		} catch (Exception e) {
			System.err.println("Could no create grammar!");
			e.printStackTrace(System.err);
		}
		TestHarness.runGrammar(g, args[0]);
	}
}