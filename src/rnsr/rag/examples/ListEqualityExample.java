package rnsr.rag.examples;

import rnsr.rag.grammar.*;
import rnsr.rag.grammar.exception.ArgumentMismatchException;
import rnsr.rag.grammar.exception.RuleFunctionException;
import rnsr.rag.grammar.exception.VariableNotFoundException;
import rnsr.rag.grammar.types.Type;

import java.util.ArrayList;

public class ListEqualityExample extends CommandLineInputBase {

    public Grammar CreateRAG() throws ArgumentMismatchException, RuleFunctionException, VariableNotFoundException {

        // Construct Answer Identifier set
        AnswerIdentifier not = new AnswerIdentifier("not", 1);
        AnswerIdentifier eq_1 = new AnswerIdentifier("eq", 1);
        AnswerIdentifier id_star = new AnswerIdentifier("star", 1);
        AnswerIdentifier letter = new AnswerIdentifier("letter", 0);
        AnswerIdentifier echo = new AnswerIdentifier("echo", 0);
        AnswerIdentifier or = new AnswerIdentifier("or", 0);
        AnswerIdentifier memOf = new AnswerIdentifier("memOf", 1);

        AnswerIdentifier start = new AnswerIdentifier("start", 0);

        AnswerIdentifier true_terminal = new AnswerIdentifier("TRUE");
        AnswerIdentifier false_terminal = new AnswerIdentifier("FALSE");
        AnswerIdentifier nil_terminal = new AnswerIdentifier("nil");

        Grammar g = new Grammar(start);


        /* ********** RULE PRODUCTIONS ********** */


        ArrayList<Variable> vars;
        ArrayList<Polynomial> args;
        VariableSet varSet;
        Configuration c;
        Polynomial poly;
        ArrayList<VariableCondition> conditions;
        ArrayList<Polynomial> answerArgs;


        // 1
        // <start, _v1> -> <eq("test"), _v1>
        vars = new ArrayList<>();
        varSet = new VariableSet();
        for (int i = 0; i <= 1; i++) {
            Variable v = new Variable();
            vars.add(i, v);
            varSet.put(v);
        }

        vars.get(0).setTag("_v0 in 1");
        vars.get(1).setTag("_v1 in 1");

        args = new ArrayList<>();
        args.add(new Polynomial(vars.get(0)));
        c = new Configuration();
        answerArgs = new ArrayList<>();
        answerArgs.add(new Polynomial(new Answer(new AnswerIdentifier("test"))));
        c.add(new Pair(new Polynomial(new Answer(eq_1, answerArgs)), vars.get(1)));
        g.addRule(start, new Rule(c, varSet, new Polynomial(vars.get(1)), args));


        // 2
        // <eq(#), T> -> #
        vars = new ArrayList<>();
        varSet = new VariableSet();
        for (int i = 0; i <= 0; i++) {
            Variable v = new Variable();
            vars.add(i, v);
            varSet.put(v);
        }

        vars.get(0).setTag("_v0 in 2");

        args = new ArrayList<>();
        args.add(new Polynomial(vars.get(0)));
        args.add(new Polynomial(new Answer(AnswerIdentifier.Lambda())));
        c = new Configuration();
        c.add(new Answer(AnswerIdentifier.Lambda()));
        g.addRule(eq_1, new Rule(c, varSet, new Polynomial(new Answer(true_terminal)), args));

        // 3
        // <eq(#), F> -> <letter, _v1> <star(letter), _v2>
        vars = new ArrayList<>();
        varSet = new VariableSet();
        for (int i = 0; i <= 2; i++) {
            Variable v = new Variable();
            vars.add(i, v);
            varSet.put(v);
        }

        vars.get(0).setTag("_v0 in 3");
        vars.get(1).setTag("_v1 in 3");
        vars.get(2).setTag("_v2 in 3");

        args = new ArrayList<>();
        args.add(new Polynomial(vars.get(0)));
        args.add(new Polynomial(new Answer(AnswerIdentifier.Lambda())));
        c = new Configuration();
        c.add(new Pair(new Polynomial(new Answer(letter)), vars.get(1)));
        answerArgs = new ArrayList<>();
        answerArgs.add(new Polynomial(new Answer(letter)));
        c.add(new Pair(new Polynomial(new Answer(id_star, answerArgs)), vars.get(2)));
        g.addRule(eq_1, new Rule(c, varSet, new Polynomial(new Answer(false_terminal)), args));


        // 4
        // _z: LETTER, _t: WORD; <eq(_z_t), F> -> #
        vars = new ArrayList<>();
        varSet = new VariableSet();
        for (int i = 0; i <= 2; i++) {
            Variable v = new Variable();
            vars.add(i, v);
            varSet.put(v);
        }
        vars.get(1).setType(Type.LETTER_TYPE);
        vars.get(2).setType(Type.WORD_TYPE);

        vars.get(0).setTag("_v0 in 4");
        vars.get(1).setTag("_z in 4");
        vars.get(2).setTag("_t in 4");

        args = new ArrayList<>();
        args.add(new Polynomial(vars.get(0)));
        poly = new Polynomial();
        poly.add(vars.get(1));
        poly.add(vars.get(2));
        args.add(poly);
        c = new Configuration();
        c.add(new Answer(AnswerIdentifier.Lambda()));
        g.addRule(eq_1, new Rule(c, varSet, new Polynomial(new Answer(false_terminal)), args));


        // 5
        // _z: LETTER, _t: WORD; <eq(_z_t), F> -> <not(_z), _v1> <star(letter), _v2>
        vars = new ArrayList<>();
        varSet = new VariableSet();
        for (int i = 0; i <= 4; i++) {
            Variable v = new Variable();
            vars.add(i, v);
            varSet.put(v);
        }

        vars.get(1).setType(Type.LETTER_TYPE);
        vars.get(2).setType(Type.WORD_TYPE);

        vars.get(0).setTag("_v0 in 5");
        vars.get(1).setTag("_z in 5");
        vars.get(2).setTag("_t in 5");
        vars.get(3).setTag("_v1 in 5");
        vars.get(4).setTag("_v1 in 5");

        args = new ArrayList<>();
        args.add(new Polynomial(vars.get(0)));
        poly = new Polynomial();
        poly.add(vars.get(1));
        poly.add(vars.get(2));
        args.add(poly);

        c = new Configuration();
        answerArgs = new ArrayList<>();
        answerArgs.add(new Polynomial(vars.get(1)));
        c.add(new Pair(new Polynomial(new Answer(not, answerArgs)), vars.get(3)));
        answerArgs = new ArrayList<>();
        answerArgs.add(new Polynomial(new Answer(letter)));
        c.add(new Pair(new Polynomial(new Answer(id_star, answerArgs)), vars.get(4)));
        g.addRule(eq_1, new Rule(c, varSet, new Polynomial(new Answer(false_terminal)), args));


        // 6
        // _z: LETTER, _t: WORD; <eq(_z_t), _v2> -> <_z, _v1> <eq(_t), _v2>
        vars = new ArrayList<>();
        varSet = new VariableSet();
        for (int i = 0; i <= 4; i++) {
            Variable v = new Variable();
            vars.add(i, v);
            varSet.put(v);
        }

        vars.get(1).setType(Type.LETTER_TYPE);
        vars.get(2).setType(Type.WORD_TYPE);

        vars.get(0).setTag("_v0 in 6");
        vars.get(1).setTag("_z in 6");
        vars.get(2).setTag("_t in 6");
        vars.get(3).setTag("_v1 in 6");
        vars.get(4).setTag("_v2 in 6");

        args = new ArrayList<>();
        args.add(new Polynomial(vars.get(0)));
        poly = new Polynomial();
        poly.add(vars.get(1));
        poly.add(vars.get(2));
        args.add(poly);
        c = new Configuration();
        c.add(new Pair(new Polynomial(vars.get(1)), vars.get(3)));
        answerArgs = new ArrayList<>();
        answerArgs.add(new Polynomial(vars.get(2)));
        c.add(new Pair(new Polynomial(new Answer(eq_1, answerArgs)), vars.get(4)));
        g.addRule(eq_1, new Rule(c, varSet, new Polynomial(vars.get(4)), args));


        // <or, F> -> F F
        vars = new ArrayList<>();
        varSet = new VariableSet();
        for (int i = 0; i <= 0; i++) {
            Variable v = new Variable();
            vars.add(i, v);
            varSet.put(v);
        }
        args = new ArrayList<>();
        args.add(new Polynomial(vars.get(0)));
        c = new Configuration();
        c.add(new Answer(false_terminal));
        c.add(new Answer(false_terminal));
        g.addRule(or, new Rule(c, varSet, new Polynomial(new Answer(false_terminal)), args));


        // <or, T> -> F T
        vars = new ArrayList<>();
        varSet = new VariableSet();
        for (int i = 0; i <= 0; i++) {
            Variable v = new Variable();
            vars.add(i, v);
            varSet.put(v);
        }
        args = new ArrayList<>();
        args.add(new Polynomial(vars.get(0)));
        c = new Configuration();
        c.add(new Answer(false_terminal));
        c.add(new Answer(true_terminal));
        g.addRule(or, new Rule(c, varSet, new Polynomial(new Answer(true_terminal)), args));


        // <or, T> -> T F
        vars = new ArrayList<>();
        varSet = new VariableSet();
        for (int i = 0; i <= 0; i++) {
            Variable v = new Variable();
            vars.add(i, v);
            varSet.put(v);
        }
        args = new ArrayList<>();
        args.add(new Polynomial(vars.get(0)));
        c = new Configuration();
        c.add(new Answer(true_terminal));
        c.add(new Answer(false_terminal));
        g.addRule(or, new Rule(c, varSet, new Polynomial(new Answer(true_terminal)), args));


        // <or, T> -> T T
        vars = new ArrayList<>();
        varSet = new VariableSet();
        for (int i = 0; i <= 0; i++) {
            Variable v = new Variable();
            vars.add(i, v);
            varSet.put(v);
        }
        args = new ArrayList<>();
        args.add(new Polynomial(vars.get(0)));
        c = new Configuration();
        c.add(new Answer(true_terminal));
        c.add(new Answer(true_terminal));
        g.addRule(or, new Rule(c, varSet, new Polynomial(new Answer(true_terminal)), args));


        // <memOf(nil), F> -> <star(letter), _v1>
        vars = new ArrayList<>();
        varSet = new VariableSet();
        for (int i = 0; i <= 1; i++) {
            Variable v = new Variable();
            vars.add(i, v);
            varSet.put(v);
        }
        args = new ArrayList<>();
        args.add(new Polynomial(vars.get(0)));
        args.add(new Polynomial(new Answer(nil_terminal)));
        c = new Configuration();
        answerArgs = new ArrayList<>();
        answerArgs.add(new Polynomial(new Answer(letter)));
        c.add(new Pair(new Polynomial(new Answer(id_star, answerArgs)), vars.get(1)));
        g.addRule(memOf, new Rule(c, varSet, new Polynomial(new Answer(false_terminal)), args));


        // <memOf(cons(_x, _xs)), (or ? (eq(_x) ? _v1) (memOf(_xs) ? _v1))> -> <star(echo), _v1>
        /*
        vars = new ArrayList<>();
        varSet = new VariableSet();
        for (int i = 0; i <= 1; i++) {
            Variable v = new Variable();
            vars.add(i, v);
            varSet.put(v);
        }
        args = new ArrayList<>();
        args.add(new Polynomial(vars.get(0)));

        Query q1 = new Query();
        Query q2 = new Query();
        Query q3 = new Query();

        args.add(new Polynomial());

        c = new Configuration();
        answerArgs = new ArrayList<>();
        answerArgs.add(new Polynomial(new Answer(echo)));
        c.add(new Pair(new Polynomial(new Answer(id_star, answerArgs)), vars.get(1)));

        g.addRule(memOf, new Rule(c, varSet, new Polynomial(new Answer(false_terminal)), args));
        */

        /* ***************** ADD ONS **********************/

        // Star 1
        // <star(_a), λ> -> λ
        vars = new ArrayList<Variable>();
        varSet = new VariableSet();
        for (int i = 0; i <= 1; i++) {
            Variable v = new Variable();
            vars.add(i, v);
            varSet.put(v);
        }

        vars.get(0).setTag("_v0 in Star 1");
        vars.get(1).setTag("_a in Star 1");

        args = new ArrayList<Polynomial>();
        args.add(new Polynomial(vars.get(0)));	// star
        args.add(new Polynomial(vars.get(1)));	// a
        c = new Configuration();
        c.add(new Answer(AnswerIdentifier.Lambda()));
        g.addRule(id_star, new Rule(c, varSet, new Polynomial(new Answer(AnswerIdentifier.Lambda())), args));

        // Star 2
        // <star(_a), _v1_v2> -> <a, _v1> <star(_a), _v2>
        vars = new ArrayList<Variable>();
        varSet = new VariableSet();
        for (int i = 0; i <= 3; i++) {
            Variable v = new Variable();
            vars.add(i, v);
            varSet.put(v);
        }

        vars.get(0).setTag("_v0 in Star 2");
        vars.get(1).setTag("_a in Star 2");
        vars.get(2).setTag("_v1 in Star 2");
        vars.get(3).setTag("_v2 in Star 2");

        args = new ArrayList<Polynomial>();
        args.add(new Polynomial(vars.get(0)));	// star
        args.add(new Polynomial(vars.get(1)));	// a
        c = new Configuration();
        c.add(new Pair(args.get(1), vars.get(2)));

        answerArgs = new ArrayList<>();
        answerArgs.add(new Polynomial(vars.get(1)));
        c.add(new Pair(new Polynomial(new Answer(id_star, answerArgs)), vars.get(3)));

        poly = new Polynomial();
        poly.add(vars.get(2));
        poly.add(vars.get(3));
        g.addRule(id_star, new Rule(c, varSet, poly, args));

        // LetterType
        // _z: LETTER; <letter, #> -> <_z, _v1>
        vars = new ArrayList<Variable>();
        varSet = new VariableSet();
        for (int i = 0; i <= 2; i++) {
            Variable v = new Variable();
            vars.add(i, v);
            varSet.put(v);
        }

        vars.get(0).setTag("_v0 in LetterType");
        vars.get(1).setTag("_z in LetterType");
        vars.get(2).setTag("_v1 in LetterType");

        vars.get(1).setType(Type.LETTER_TYPE);
        args = new ArrayList<Polynomial>();
        args.add(new Polynomial(vars.get(0)));	// v0
        args.add(new Polynomial(vars.get(1)));	// z
        c = new Configuration();
        c.add(new Pair(new Polynomial(vars.get(1)), vars.get(2)));
        g.addRule(letter, new Rule(c, varSet, new Polynomial(new Answer(AnswerIdentifier.Lambda())), args));

        // Echo
        // _z: LETTER; <echo, _v1> -> <_z, _v1>
        vars = new ArrayList<Variable>();
        varSet = new VariableSet();
        for (int i = 0; i <= 2; i++) {
            Variable v = new Variable();
            vars.add(i, v);
            varSet.put(v);
        }

        vars.get(0).setTag("_v0 in Echo");
        vars.get(1).setTag("_z in Echo");
        vars.get(2).setTag("_v1 in Echo");

        vars.get(1).setType(Type.LETTER_TYPE);
        args = new ArrayList<Polynomial>();
        args.add(new Polynomial(vars.get(0)));	// star
        args.add(new Polynomial(vars.get(1)));	// a
        c = new Configuration();
        c.add(new Pair(new Polynomial(vars.get(1)), vars.get(2)));
        g.addRule(echo, new Rule(c, varSet, new Polynomial(vars.get(2)), args));


        // Not
        // _z1: LETTER, _z2: LETTER; <not(_z1) #> -> <_z2, _v1>
        vars = new ArrayList<Variable>();
        varSet = new VariableSet();
        for (int i = 0; i <= 3; i++) {
            Variable v = new Variable();
            vars.add(i, v);
            varSet.put(v);
        }

        vars.get(0).setTag("_v0 in Not");
        vars.get(1).setTag("_z1 in Not");
        vars.get(2).setTag("_z2 in Not");
        vars.get(3).setTag("_v1 in Not");

        vars.get(2).setType(Type.LETTER_TYPE);
        vars.get(2).setType(Type.LETTER_TYPE);

        conditions = new ArrayList<>();
        conditions.add(new VariableCondition(vars.get(1), vars.get(2), VariableCondition.VariableConditionType.NE));

        args = new ArrayList<Polynomial>();
        args.add(new Polynomial(vars.get(0))); // _v0
        args.add(new Polynomial(vars.get(1))); // _z1

        c = new Configuration();
        c.add(new Pair(new Polynomial(vars.get(2)), vars.get(3)));
        g.addRule(not, new Rule(c, varSet, new Polynomial(new Answer(AnswerIdentifier.Lambda())), args, conditions));

        /* ****************************************/



        return g;

    }

    public static void main(String[] args) {
        // Sanity checks
        if (args.length == 0) {
            System.err.println("Expecting some input to parse!");
            System.exit(0);
        }
        performTest(new ListEqualityExample(), args[0]);
    }

}
