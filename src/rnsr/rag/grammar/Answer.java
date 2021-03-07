package rnsr.rag.grammar;

import rnsr.rag.grammar.exception.*;
import rnsr.rag.grammar.interfaces.IConfigurationTerm;
import rnsr.rag.grammar.interfaces.IContextClonable;
import rnsr.rag.grammar.interfaces.IPolynomialTerm;
import rnsr.rag.grammar.interfaces.IResolvable;
import rnsr.rag.parser.Parser;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

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
	private ArrayList<Polynomial> m_arguments = null;

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
		
		sb.append(this.m_identifier.Identifier());
		
		if (!this.m_identifier.Terminal())
		{
			if (this.m_arguments != null)
			{
				sb.append("(");
			
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
				
				sb.append(")");
			}
		}
		
		return sb.toString();
	}

	/**
	 * Derives a set of extended answers from an answer object by resolving inner-queries
	 * @param parser The Parser object we pass to sub-queries for resolution
	 * @return The set of extended answers derived from resolving queries within a single extended answer
	 */
	public Set<ExtendedAnswer> resolveQueries(Parser parser) {
		try {
			Set<ExtendedAnswer> possibleAnswers = new HashSet<>();
			if (m_arguments == null || m_arguments.size() <= 0) {
				possibleAnswers.add(new Polynomial(this).toExtendedAnswer());
				return possibleAnswers;
			}

			return handleArguments(possibleAnswers, parser);
		} catch (InvalidTermException | ArgumentMismatchException e) {
			throw new Error(e);
		}
	}

	/**
	 * Generates a set of extended answers representing every possible permutation of answer arguments to the original
	 * answer, after resolving inner-argument queries.
	 * @param possibleAnswerSet The set we add all possible answer forms to
	 * @param parser The Parser object we pass to sub-queries for resolution
	 * @return The set we add all possible answer forms
	 * @throws ArgumentMismatchException Thrown when the number of supplied arguments doesn't match the arity of the identifier
	 */

	public Set<ExtendedAnswer> handleArguments(Set<ExtendedAnswer> possibleAnswerSet, Parser parser) throws ArgumentMismatchException {

		ArrayList<ArrayList<ExtendedAnswer>> argAnswerListList = new ArrayList<>();
		ArrayList<ArrayList<Polynomial>> argPolynomialListList = new ArrayList<>();

		// List of (list of polynomial permutations) for every polynomial argument
		for (Polynomial p: m_arguments) { argAnswerListList.add(handleSingleArg(p, parser)); }

		int sum = 1;
		for (ArrayList<ExtendedAnswer> answerSet: argAnswerListList) sum *= answerSet.size();
		for (int i = 0; i < sum; i++) argPolynomialListList.add(new ArrayList<>());

		for (int i = 0; i < argAnswerListList.size(); i++) {	// For every polynomial argument
			ArrayList<ExtendedAnswer> currentArgAnswers = argAnswerListList.get(i);		// Get the possible permutations for that argument
			for (int j = 0; j < argPolynomialListList.size(); j++) {
				//argPolynomialListList.get(j).add(currentArgAnswers.get(j % currentArgAnswers.get(i).size()));
				argPolynomialListList.get(j).add(currentArgAnswers.get(j % currentArgAnswers.size()));
			}
		}

		for (ArrayList<Polynomial> argList: argPolynomialListList) {
			Answer a = new Answer(this.m_identifier, argList);
			possibleAnswerSet.add(new ExtendedAnswer(a));
		}

		return possibleAnswerSet;
	}

	/**
	 * Generates a list of extended answers by resolving the inner-queries of each polynomial term in an answer argument
	 * @param p The polynomial whose terms we expand
	 * @param parser The Parser object we pass to sub-queries for resolution
	 * @return List of extended answers representing the expanded form of each polynomial term
	 */
	public ArrayList<ExtendedAnswer> handleSingleArg(Polynomial p, Parser parser) {
		ArrayList<Set<ExtendedAnswer>> termSets = new ArrayList<>();
		for (IPolynomialTerm ipt: p) termSets.add(ipt.resolveQueries(parser));
		Set<ExtendedAnswer> permsSet = ExtendedAnswer.extendedAnswerPermutations(termSets);
		return new ArrayList<>(permsSet);
	}

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

	public UnificationSetting unify(Polynomial poly) throws CloneException {
		VariableSet newBindings = new VariableSet();

		IPolynomialTerm firstTerm = poly.get(0);
		if (!(firstTerm instanceof Answer)) return new UnificationSetting(newBindings, poly);
		Answer otherAns = (Answer) firstTerm;

		if (otherAns.equals(this)) {
			if (otherAns.m_identifier.Terminal() || (this.m_arguments == null && otherAns.m_arguments == null)) {
				Polynomial newRemainder = poly.clone(new ContextMapping());
				newRemainder.remove(0);
				return new UnificationSetting(newBindings, newRemainder);
			} else if (this.m_arguments.size() == otherAns.m_arguments.size()) {
				for (int i = 0; i < this.m_arguments.size(); i++) {
					try {
						newBindings.putAll(this.m_arguments.get(i).unify(otherAns.m_arguments.get(i)));
					} catch (PolynomialUnificationException e) {
						e.printStackTrace();
					}
				}
				Polynomial newRemainder = poly.clone(new ContextMapping());
				newRemainder.remove(0);
				return new UnificationSetting(newBindings, newRemainder);
			} else {
				// Not equal number of arguments
				return new UnificationSetting(newBindings, poly);
			}
		} else {
			return new UnificationSetting(newBindings, poly);
		}

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

}
