package rnsr.rag.grammar;

import rnsr.rag.derivation.DerivationLambda;
import rnsr.rag.derivation.DerivationNonTerminal;
import rnsr.rag.derivation.DerivationTerm;
import rnsr.rag.derivation.DerivationTerminal;
import rnsr.rag.derivation.Interface.IDerivationTerm;
import rnsr.rag.grammar.exception.*;
import rnsr.rag.grammar.interfaces.IConfigurationTerm;
import rnsr.rag.grammar.interfaces.IContextClonable;
import rnsr.rag.grammar.interfaces.IPolynomialTerm;
import rnsr.rag.grammar.interfaces.IResolvable;
import rnsr.rag.parser.Parser;
import rnsr.rag.util.UnificationSetting;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Represents an answer (terminal or nonterminal) in a recursive adaptive grammar 
 */
public	class		Answer
		implements	IPolynomialTerm,
					IConfigurationTerm,
					IResolvable<Answer>,
					IContextClonable<Answer>
{

	/**
	 * The AnswerIdentifier that defines the type of this answer
	 */
	private AnswerIdentifier m_identifier = null;
	
	/**
	 * The arguments of this answer
	 */
	private ArrayList<Polynomial> m_arguments = new ArrayList<>();

	/**
	 * Default Constructor
	 */
	public Answer() { }
	
	/**
	 * Constructs an answer using an AnswerIdentifier
	 * @param id - the identifier that defines this answer
	 */
	public Answer(AnswerIdentifier id)
	{
		this.m_identifier = id;
	}

	/**
	 * Constructs and answer from an answer identifier and a set of arguments
	 * @param id - the identifier that defines this answer
	 * @param args - the arguments belonging to this answer
	 * @throws ArgumentMismatchException when the number of supplied arguments doesn't match the arity of the identifier
	 */
	public Answer(AnswerIdentifier id, ArrayList<Polynomial> args) throws ArgumentMismatchException
	{
		this.m_identifier = id;
		this.setArguments(args);
	}

	/**
	 * Sets the arguments of this answer
	 * @param args - the set of arguments
	 */
	public void setArguments(ArrayList<Polynomial> args) throws ArgumentMismatchException
	{
		if (args.size() != this.m_identifier.Arity())
		{
			StringBuilder sb = new StringBuilder();
			sb.append("Expected ");
			sb.append(this.m_identifier.Arity());
			sb.append(" arguments - found ");
			sb.append(args.size());
			
			throw new ArgumentMismatchException(sb.toString());
		}
		
		this.m_arguments = args;
	}
	
	/**
	 * Returns the AnswerIdentifier object that identifies the type of this Answer
	 */
	public AnswerIdentifier Identifier()
	{
		return this.m_identifier;
	}
	
	/**
	 * Returns the arguments of this answer
	 */
	public ArrayList<Polynomial> Arguments()
	{
		return this.m_arguments;
	}
	
	/**
	 * Compares this answer to the one provided. Also returns true if the specified answer partially
	 * matches this answer (i.e. if the specified answer is a substring of this answer)
	 * @param answer - the answer object to compare to
	 */
	public boolean match(Answer answer)
	{
		if (this.m_identifier.Terminal() && answer.Identifier().Terminal() &&
			!answer.Identifier().equals(AnswerIdentifier.Lambda()) &&
			this.m_identifier.Identifier().startsWith(answer.Identifier().Identifier()))
		{
			return true;
		}
		else
		{
			return this.equals(answer);
		}
	}
	
	/**
	 * IContextClonable method - clones this answer object
	 */
	public Answer clone(ContextMapping context) throws CloneException
	{

		Answer clone = new Answer(this.m_identifier);
		
		if (this.m_arguments != null && this.m_arguments.size() != 0)
		{
			ArrayList<Polynomial> clonedArgs = new ArrayList<Polynomial>();
			for (Polynomial arg : this.m_arguments)
			{
				clonedArgs.add(arg.clone(context));
			}
			
			try
			{
				clone.setArguments(clonedArgs);
			}
			catch (ArgumentMismatchException e)
			{
				throw new CloneException(e);
			}
		}
		
		return clone;
	}

	/**
	 * IResolvable method - resolves any variables in the Answer to their bound terms
	 */
	public Answer resolve(VariableSet vars) throws VariableNotBoundException, VariableNotFoundException
	{
		Answer resolvedAnswer = new Answer(this.m_identifier);
		
		if (this.m_arguments != null)
		{
			ArrayList<Polynomial> resolvedArgs = new ArrayList<Polynomial>();
			for (Polynomial arg : this.m_arguments)
			{
				resolvedArgs.add(arg.resolve(vars));
			}
			try
			{
				resolvedAnswer.setArguments(resolvedArgs);
			}
			catch (ArgumentMismatchException e)
			{
				// This should never happen as we are using the argument and identifier of a correctly set up answer
				throw new Error(e);
			}
		}
		
		return resolvedAnswer;
	}
	
	/**
	 * Overridden method to return a string representation of this answer
	 */	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();

		if (!this.m_identifier.Terminal())
		{
			sb.append(this.m_identifier.Identifier());
			if (this.m_arguments.size() > 0)
			{
				sb.append("[");
			
				boolean first = true;
				for (Polynomial arg : this.m_arguments)
				{
					if (!first)
					{
						sb.append(", ");
					}
					
					sb.append(arg.toString());
					
					first = false;
				}
				
				sb.append("]");
			}
		} else {
			if (this.m_identifier.equals(AnswerIdentifier.Lambda())) sb.append("#");
			else sb.append("\"" + this.m_identifier.Identifier() + "\"");
		}
		
		return sb.toString();
	}


	public HashSet<SubQueryResult> resolveInnerQueries(Parser parser) {
		try {
			HashSet<SubQueryResult> possibleAnswers = new HashSet<>();
			if (m_arguments == null || m_arguments.size() <= 0) {
				possibleAnswers.add(new SubQueryResult(new Polynomial(this).toExtendedAnswer(), new ArrayList<>()));
				return possibleAnswers;

			}
			return handleArguments2(parser);
		} catch (InvalidTermException | ArgumentMismatchException e) {
			throw new Error(e);
		}
	}

	public HashSet<SubQueryResult> handleArguments2(Parser parser) throws ArgumentMismatchException {

		HashSet<SubQueryResult> answerResultSet = new HashSet<>();
		ArrayList<ArrayList<SubQueryResult>> argPolynomialListList = new ArrayList<>();

		// List of (list of polynomial permutations) for every polynomial argument
		ArrayList<ArrayList<SubQueryResult>> argAnswerListList = new ArrayList<>();
		for (Polynomial p: m_arguments) argAnswerListList.add(handleSingleArg2(p, parser));

		int sum = 1;
		for (ArrayList<SubQueryResult> answerSet: argAnswerListList) sum *= answerSet.size();
		for (int i = 0; i < sum; i++) argPolynomialListList.add(new ArrayList<>());

		for (int i = 0; i < argAnswerListList.size(); i++) {	// For every polynomial argument
			ArrayList<SubQueryResult> currentArgAnswers = argAnswerListList.get(i);		// Get the possible permutations for that argument
			for (int j = 0; j < argPolynomialListList.size(); j++) {
				argPolynomialListList.get(j).add(currentArgAnswers.get(j % currentArgAnswers.size()));
			}
		}

		for (ArrayList<SubQueryResult> argList: argPolynomialListList) {
			ArrayList<Polynomial> eaList = new ArrayList<>();
			for (SubQueryResult sq: argList) eaList.add(sq.getResult());

			Answer newA = new Answer(this.m_identifier, eaList);
			ExtendedAnswer newEA = new ExtendedAnswer(newA);

			ArrayList<SubQuery> sqList = new ArrayList<>();
			for (SubQueryResult sq: argList) sqList.addAll(sq.getSubQueries());
			SubQueryResult newRes = new SubQueryResult(newEA, sqList);
			answerResultSet.add(newRes);
		}
		return answerResultSet;

	}

	public ArrayList<SubQueryResult> handleSingleArg2(Polynomial p, Parser parser) {
		ArrayList<HashSet<SubQueryResult>> resultSets = new ArrayList<>();
		for (IPolynomialTerm pt: p) resultSets.add(pt.resolveInnerQueries(parser));
		HashSet<SubQueryResult> permsSet = SubQueryResult.subQueryResultsPermutations(resultSets);
		return new ArrayList<>(permsSet);
	}


	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


	/**
	 * Overload method to check for equality of answers
	 */
	public boolean equals(Answer a)
	{
		if (this.m_identifier.equals(a.Identifier()))
		{
			// If there are arguments, then we need to check them first
			if (this.m_identifier.Arity() > 0)
			{
				for (int i = 0; i < this.m_identifier.Arity(); i++)
				{
					if (!this.m_arguments.get(i).equals(a.Arguments().get(i)))
					{
						return false;
					}
				}
				
				// If we get here, then all the arguments are equal
				return true;
			}
			
			// Otherwise, we can just return true
			else
			{
				return true;
			}
		}
		
		// If not, then we can immediately return false
		else
		{
			return false;
		}
	}

	/**
	 * Equals method over objects to comply with HashSet contains method.
	 * @param o The object to check equality with
	 * @return Boolean indicating equality
	 */
	@Override
	public boolean equals(Object o) {
		return o != null && o instanceof Answer && ((Answer) o).equals(this);
	}

	/**
	 * Equals method over objects to comply with HashSet contains method.
	 * @return Integer hash code
	 */
	@Override
	public int hashCode() {
		return this.m_identifier.Identifier().hashCode() + ((this.m_arguments != null) ? this.m_arguments.size() : 0);
	}

	public UnificationSetting unify(Polynomial other) throws UnificationLambdaException, PolynomialUnificationException, CloneException {

		VariableSet newBindings;

		IPolynomialTerm firstTerm = other.remove(0);

		if (!(firstTerm instanceof Answer)) throw new UnificationLambdaException(); // Can only unify answer with answer

		if (firstTerm instanceof Variable) {

		}

		Answer otherAns = (Answer) firstTerm;

		if (!this.m_identifier.equals(otherAns.Identifier()) || (this.Arguments().size() != otherAns.Arguments().size()))
			throw new UnificationLambdaException(); // Not equal answer IDs or args counts, cannot unify

		newBindings = this.matchTo(otherAns);
		return new UnificationSetting(newBindings, other);

	}

	public VariableSet matchTo(Answer other) throws PolynomialUnificationException, UnificationLambdaException, CloneException {
		VariableSet newBindings = new VariableSet();
		if (this.Arguments() == null) return newBindings;
		for (int i = 0; i < this.Arguments().size(); i++) {
			newBindings.putAll(this.Arguments().get(i).unify(other.Arguments().get(i)));
		}
		return newBindings;
	}

	public Polynomial resolveInnerVariables(VariableSet sfBindings) {
		Answer newAns = new Answer();
		newAns.m_identifier = this.m_identifier;
		if (this.m_arguments != null) {
			newAns.m_arguments = new ArrayList<>();
			for (Polynomial p: this.m_arguments) {
				p.resolveVariablesInPolynomial(sfBindings);
				newAns.m_arguments.add(p);
			}
		}
		return new Polynomial(newAns);
	}

	public VariableSet usedVariables() {
		VariableSet vs = new VariableSet();
		for (Polynomial p: this.m_arguments) vs.putAll(p.usedVariables());
		return vs;
	}

	public IDerivationTerm getDerivationObject() {
		if (this.m_identifier.Terminal()) {
			if (m_identifier.equals(AnswerIdentifier.Lambda())) return new DerivationLambda();
			return new DerivationTerminal(m_identifier.Identifier());
		} else {
			ArrayList<DerivationTerm> derivationArgs = new ArrayList<>();
			for (Polynomial p: m_arguments) derivationArgs.add(p.getDerivationObject());
			return new DerivationNonTerminal(m_identifier.Identifier(), derivationArgs);
		}
	}

}
