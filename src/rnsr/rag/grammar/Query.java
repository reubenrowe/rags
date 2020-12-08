package rnsr.rag.grammar;

import rnsr.rag.grammar.exception.CloneException;
import rnsr.rag.grammar.exception.VariableNotBoundException;
import rnsr.rag.grammar.exception.VariableNotFoundException;
import rnsr.rag.grammar.interfaces.IContextClonable;
import rnsr.rag.grammar.interfaces.IPolynomialTerm;
import rnsr.rag.grammar.interfaces.IResolvable;
import rnsr.rag.parser.Parser;
import rnsr.rag.parser.exception.ParseException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Represents a query in a recursive adaptive grammar
 */
public	class		Query
		implements	IPolynomialTerm, IResolvable<Query>, IContextClonable<Query>
{

	private Polynomial m_metaSyntax = null;
	private Polynomial m_syntax = null;
	
	/**
	 * Default Constructor
	 */
	public Query() { }
	
	/**
	 * Constructs a Query from the given arguments
	 * @param metasyntax - the metasyntactic value used to associate the value of this query with the syntax
	 * @param syntax - the syntactic value associated with the metasyntax of the query
	 */
	public Query(Polynomial metasyntax, Polynomial syntax)
	{
		this.m_metaSyntax = metasyntax;
		this.m_syntax = syntax;
	}
	
	/**
	 * The metasyntactic value used to parse this query
	 */
	public Polynomial Metasyntax()
	{
		return this.m_metaSyntax;
	}
	
	/**
	 * The syntax used to parse this query
	 */
	public Polynomial Syntax()
	{
		return this.m_syntax;
	}
	
	/**
	 * IContextClonable method - clones this Query
	 */
	public Query clone(ContextMapping context) throws CloneException
	{
		return new Query(this.m_metaSyntax.clone(context), this.m_syntax.clone(context));
	}

	/**
	 * IResolvable method - resolves any variables in the Query to their bound terms
	 */
	public Query resolve(VariableSet vars) throws VariableNotBoundException, VariableNotFoundException
	{
		return new Query(this.m_metaSyntax.resolve(vars), this.m_syntax.resolve(vars));
	}
	
	/**
	 * Overload method to check the equality of Queries
	 */
	public boolean equals(Query q)
	{
		return ((this.m_metaSyntax.equals(q.Metasyntax())) && (this.m_syntax.equals(q.Syntax())));
	}
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		
		sb.append("Query(");
		sb.append(this.m_metaSyntax.toString());
		sb.append(", ");
		sb.append(this.m_syntax.toString());
		sb.append(")");
		
		return sb.toString();
	}

	public Set<ExtendedAnswer> resolveQueries(Parser parser) {
		ArrayList<Set<ExtendedAnswer>> metaSyntaxPolyAnswers = new ArrayList<>();
		ArrayList<Set<ExtendedAnswer>> syntaxPolyAnswers = new ArrayList<>();
		for (IPolynomialTerm p: m_metaSyntax) metaSyntaxPolyAnswers.add(p.resolveQueries(parser));
		for (IPolynomialTerm p: m_syntax) syntaxPolyAnswers.add(p.resolveQueries(parser));

		ArrayList<ExtendedAnswer> possiblePolynomialsMetaSyntax = permutations(metaSyntaxPolyAnswers);
		ArrayList<ExtendedAnswer> possiblePolynomialsSyntax = permutations(syntaxPolyAnswers);

		// Get all of the extended answer sets for all possible queries
		Set<ExtendedAnswer> queriesReturnSet = new HashSet<>();
		for (Polynomial p1: possiblePolynomialsMetaSyntax) {
			for (Polynomial p2: possiblePolynomialsSyntax) {
				try {
					queriesReturnSet.addAll(parser.parse(new Query(p1, p2)));
				} catch (ParseException e) {
					throw new Error(e);
				}
			}
		}

		return queriesReturnSet;
	}

	public ArrayList<ExtendedAnswer> permutations(ArrayList<Set<ExtendedAnswer>> polyAnswers) {
		ArrayList<ExtendedAnswer> perms = new ArrayList<>();

		// Creating an empty list for every permutation of the Answers possible
		int sum = 1;
		for (Set<ExtendedAnswer> possibleAnswerSet: polyAnswers) sum *= possibleAnswerSet.size();
		for (int i = 0; i < sum; i++) perms.add(new ExtendedAnswer());

		// Filling the list of permutations of Answer
		for (int i = 0; i < perms.size(); i++) {
			ArrayList<IPolynomialTerm> currentPossibilityPool = perms.get(i);
			for (int j = 0; j < sum; j++) {
				perms.get(j).add(currentPossibilityPool.get(j % currentPossibilityPool.size()));
			}
		}

		return perms;
	}

	public Object clone() {
		Query q = new Query();
		q.m_metaSyntax = (Polynomial) this.m_metaSyntax.clone();
		q.m_syntax = (Polynomial) this.m_syntax.clone();
		return q;
	}

}
