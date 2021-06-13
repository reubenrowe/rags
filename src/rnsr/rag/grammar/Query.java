package rnsr.rag.grammar;

import rnsr.rag.derivation.DerivationTerm;
import rnsr.rag.derivation.DerivationQuery;
import rnsr.rag.derivation.DerivationSequence;
import rnsr.rag.grammar.exception.CloneException;
import rnsr.rag.grammar.exception.VariableNotBoundException;
import rnsr.rag.grammar.exception.VariableNotFoundException;
import rnsr.rag.grammar.interfaces.IContextClonable;
import rnsr.rag.grammar.interfaces.IPolynomialTerm;
import rnsr.rag.grammar.interfaces.IResolvable;
import rnsr.rag.parser.Parser;
import rnsr.rag.parser.exception.ParseException;
import rnsr.rag.util.UnificationSetting;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Represents a query in a recursive adaptive grammar
 */
public	class		Query
		implements	IPolynomialTerm, IResolvable<Query>, IContextClonable<Query>
{

	public static int count = 0;

	private Polynomial m_metaSyntax = null;
	private Polynomial m_syntax = null;
	private int id;
	
	/**
	 * Default Constructor
	 */
	public Query() { this(null, null); }
	
	/**
	 * Constructs a Query from the given arguments
	 * @param metasyntax - the metasyntactic value used to associate the value of this query with the syntax
	 * @param syntax - the syntactic value associated with the metasyntax of the query
	 */
	public Query(Polynomial metasyntax, Polynomial syntax)
	{
		this(metasyntax, syntax, count++);
	}

	public Query(Polynomial metasyntax, Polynomial syntax, int id)
	{
		this.m_metaSyntax = metasyntax;
		this.m_syntax = syntax;
		this.id = id;
	}

	public int getId() {
		return id;
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
		int clonedID = context.getQueryMapping(this.id);
		int newID = (clonedID == -1) ? count++ : clonedID;
		return new Query(this.m_metaSyntax.clone(context), this.m_syntax.clone(context), newID);
	}

	/**
	 * IResolvable method - resolves any variables in the Query to their bound terms
	 */
	public Query resolve(VariableSet vars) throws VariableNotBoundException, VariableNotFoundException
	{
		return new Query(this.m_metaSyntax.resolve(vars), this.m_syntax.resolve(vars), id);
	}
	
	/**
	 * Overload method to check the equality of Queries
	 */
	public boolean equals(Query q)
	{
		return ((this.m_metaSyntax.equals(q.Metasyntax())) && (this.m_syntax.equals(q.Syntax())));
	}

	/**
	 * Overridden method to return a string representation of this query
	 */
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("(");
		sb.append(this.m_metaSyntax);
		sb.append(" ? ");
		sb.append(this.m_syntax);
		sb.append(")");
		return sb.toString();
	}

	public HashSet<SubQueryResult> resolveInnerQueries(Parser parser) {

		ArrayList<HashSet<SubQueryResult>> metaSyntaxPolyAnswers = new ArrayList<>();
		ArrayList<HashSet<SubQueryResult>> syntaxPolyAnswers = new ArrayList<>();

		for (IPolynomialTerm p: m_metaSyntax) metaSyntaxPolyAnswers.add(p.resolveInnerQueries(parser));
		for (IPolynomialTerm p: m_syntax) syntaxPolyAnswers.add(p.resolveInnerQueries(parser));

		Set<SubQueryResult> possiblePolynomialsMetaSyntax = SubQueryResult.subQueryResultsPermutations(metaSyntaxPolyAnswers);
		Set<SubQueryResult> possiblePolynomialsSyntax = SubQueryResult.subQueryResultsPermutations(syntaxPolyAnswers);

		HashSet<SubQueryResult> queryResults = new HashSet<>();

		for (SubQueryResult sqr1: possiblePolynomialsMetaSyntax) {
			for (SubQueryResult sqr2: possiblePolynomialsSyntax) {
				try {

					Polynomial p1 = sqr1.getResult();
					Polynomial p2 = sqr2.getResult();
					Query q = new Query(p1, p2, id);
					HashSet<ParseResult> realResults = (HashSet<ParseResult>) parser.parse(q);

					for (ParseResult pr: realResults) {
						DerivationSequence ds = pr.getDerivationSequence();

						ArrayList<SubQuery> sqList = new ArrayList<>();

						sqList.addAll(sqr1.getSubQueries());
						sqList.addAll(sqr2.getSubQueries());
						sqList.add(new SubQuery(id, ds, pr.getResult()));

						SubQueryResult sqr = new SubQueryResult(pr.getResult(), sqList);
						queryResults.add(sqr);

					}

				} catch (ParseException e) {
					throw new Error(e);
				}
			}
		}

		return queryResults;

	}

	public UnificationSetting unify(Polynomial other) {
		return null;
	}

	public Polynomial resolveInnerVariables(VariableSet sfBindings) {
		Polynomial p1 = this.m_metaSyntax.resolveVariablesInPolynomial(sfBindings);
		Polynomial p2 = this.m_syntax.resolveVariablesInPolynomial(sfBindings);
		return new Polynomial(new Query(p1, p2, id));
	}

	public VariableSet usedVariables() {
		VariableSet vs = new VariableSet();
		vs.putAll(this.m_metaSyntax.usedVariables());
		vs.putAll(this.m_syntax.usedVariables());
		return vs;
	}

	public DerivationQuery getDerivationObject() {
		DerivationTerm left = new DerivationTerm();
		left.add(m_metaSyntax.getDerivationObject());
		DerivationTerm right = new DerivationTerm();
		right.add(m_syntax.getDerivationObject());
		return new DerivationQuery(m_metaSyntax.getDerivationObject(), m_syntax.getDerivationObject(), id);
	}

	public ArrayList<Integer> findQueryIDs() {
		ArrayList<Integer> ids = new ArrayList<>();
		ids.add(this.id);
		for (IPolynomialTerm pt1: this.m_metaSyntax) ids.addAll(pt1.findQueryIDs());
		for (IPolynomialTerm pt2: this.m_syntax) ids.addAll(pt2.findQueryIDs());
		return ids;
	}

	public static int generateQueryID() {
		return count++;
	}

}
