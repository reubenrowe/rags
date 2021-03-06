package rnsr.rag.parser;

import java.util.Set;

import rnsr.rag.grammar.Answer;
import rnsr.rag.grammar.AnswerIdentifier;
import rnsr.rag.grammar.CandidateSet;
import rnsr.rag.grammar.Configuration;
import rnsr.rag.grammar.ExtendedAnswer;
import rnsr.rag.grammar.Grammar;
import rnsr.rag.grammar.Pair;
import rnsr.rag.grammar.Polynomial;
import rnsr.rag.grammar.Query;
import rnsr.rag.grammar.SententialForm;
import rnsr.rag.grammar.Variable;
import rnsr.rag.grammar.VariableSet;

import rnsr.rag.grammar.exception.CloneException;
import rnsr.rag.grammar.exception.InvalidTermException;
import rnsr.rag.grammar.exception.TermResolutionException;
import rnsr.rag.grammar.exception.VariableNotBoundException;
import rnsr.rag.grammar.exception.VariableNotFoundException;

import rnsr.rag.parser.exception.ParseException;

/**
 * This class implements a general parser for a left-to-right recursive adaptive grammar (RAG)
 */
public class Parser
{

	private Grammar m_grammar = null;
	
	/**
	 * Default Constructor
	 */
	public Parser() { }
	
	/**
	 * Constructs a new parser based on the specified recursive adaptive grammar
	 * @param g - The grammar which this parser will use
	 */
	public Parser(Grammar g)
	{
		this.m_grammar = g;
	}

	/**
	 * Returns the grammar that this parser is based on
	 */
	public Grammar Grammar()
	{
		return this.m_grammar;
	}
	
	/**
	 * Parses the given input according to the grammar specified in this parser object
	 * @param input - the input to be parsed
	 * @return a set containing the (possibly multiple) sematic values computed by the parsing process
	 * @throws ParseException
	 */
	public Set<ExtendedAnswer> parse(String input) throws ParseException
	{
		// Check that we have a grammar to work from
		if (this.m_grammar == null)
		{
			throw new ParseException("There is no grammar to parse by!");
		}
		
		// Check we have a start symbol
		Answer startSymbol = this.m_grammar.StartSymbol();
		if (startSymbol == null)
		{
			throw new ParseException("There is no start symbol!");
		}
		
		// Construct the initial query
		Polynomial parseInput = new Polynomial();
		parseInput.add(new Answer(new AnswerIdentifier(input)));
		Polynomial metaSyntax = new Polynomial();
		metaSyntax.add(startSymbol);
		Query initialQuery = new Query(metaSyntax, parseInput);
		
		// Parse the query
		Set<ExtendedAnswer> resultSet = this.parse(initialQuery);
		
		// If result set is empty, this is an error
		if (resultSet.size() == 0)
		{
			StringBuilder sb = new StringBuilder();
			sb.append("Error parsing ");
			sb.append(initialQuery.toString());
			sb.append("\n");
			sb.append("The result set is empty!");
			throw new ParseException(sb.toString());
		}
	
		return resultSet;
	}
	
	public Set<ExtendedAnswer> parse(Query q) throws ParseException
	{
		// Set up initial sentential form and initialise candidate set
		Variable value = new Variable();
		
		Polynomial result = new Polynomial();
		result.add(value);

		VariableSet varset = new VariableSet();
		varset.put(value);
		
		Pair startPair = new Pair(q.Metasyntax(), value);
		
		Configuration c = new Configuration();
		c.add(startPair);
		
		CandidateSet candidate = new CandidateSet(new SententialForm(c, varset, result));
		
		// Get input
		ExtendedAnswer input = null;
		try
		{
			input = q.Syntax().toExtendedAnswer();
		}
		catch (InvalidTermException e)
		{
			throw new ParseException("Error parsing Query - Query syntax contains invalid terms!", e);
		}
		
		do
		{
			candidate.removeEmptyForms();

			while (candidate.CanApplyRules())
			{
				try
				{
					candidate.fork(this);
				}
				catch (InvalidTermException e)
				{
					throw new ParseException("Problem when trying to fork candidate set", e);
				}
				catch (TermResolutionException e)
				{
					throw new ParseException("Problem when trying to fork candidate set", e);
				}
				catch (VariableNotBoundException e)
				{
					throw new ParseException("Problem when trying to fork candidate set", e);
				}
				catch (VariableNotFoundException e)
				{
					throw new ParseException("Problem when trying to fork candidate set", e);
				}
				catch (CloneException e)
				{
					throw new ParseException("Problem when trying to fork candidate set", e);
				}
				
				candidate.advance(new Answer(AnswerIdentifier.Lambda()));
			}
			
			if (!input.isEmpty())
			{
				// consume one token from the input and use it to advance the candidate set,
				// discarding any non-matching forms
				candidate.advance(input.removeHeadToken(), true);
			}
			
			/* We are not throwing an exception, in case the query not 
			 * succeeding is a valid operation of the grammar
			 
			// Check that we still have candidate forms left - if there are none, this is an error
			if (candidate.isEmpty())
			{
				StringBuilder sb = new StringBuilder();
				
				sb.append("No candidate forms left! Remaining input: ");
				sb.append(input.toString());
				
				throw new ParseException(sb.toString());
			}
			
			*/
		}
		while (!input.isEmpty() && !candidate.isEmpty());
		
		// Do a final pass to advance past any trailing lambda derivations
		while (candidate.CanApplyRules())
		{
			try
			{
				candidate.fork(this);
			}
			catch (InvalidTermException e)
			{
				throw new ParseException("Problem when trying to fork candidate set", e);
			}
			catch (TermResolutionException e)
			{
				throw new ParseException("Problem when trying to fork candidate set", e);
			}
			catch (VariableNotBoundException e)
			{
				throw new ParseException("Problem when trying to fork candidate set", e);
			}
			catch (VariableNotFoundException e)
			{
				throw new ParseException("Problem when trying to fork candidate set", e);
			}
			catch (CloneException e)
			{
				throw new ParseException("Problem when trying to fork candidate set", e);
			}
			
			candidate.advance(new Answer(AnswerIdentifier.Lambda()));
		}
		
		// discard any non-empty forms that are left - they cannot match the input at this point!
		candidate.removeNonEmptyForms();
		
		// Return result set
		Set<ExtendedAnswer> resultSet = null;
		try
		{
			resultSet = candidate.ResultSet();
		}
		catch (VariableNotBoundException e)
		{
			throw new ParseException(e);
		}
		catch (VariableNotFoundException e)
		{
			throw new ParseException(e);
		}
		catch (InvalidTermException e)
		{
			throw new ParseException(e);
		}
		
		/* We are not throwing an exception, in case the query not 
		 * succeeding is a valid operation of the grammar
		 
		// If result set is empty, this is an error
		if (resultSet.size() == 0)
		{
			StringBuilder sb = new StringBuilder();
			sb.append("Error parsing ");
			sb.append(q.toString());
			sb.append("\n");
			sb.append("The result set is empty!");
			throw new ParseException(sb.toString());
		}
		
		*/

		return resultSet;
	}
}
