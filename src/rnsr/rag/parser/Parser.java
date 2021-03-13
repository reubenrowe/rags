package rnsr.rag.parser;

import rnsr.rag.grammar.*;
import rnsr.rag.grammar.exception.*;
import rnsr.rag.parser.exception.ParseException;
import rnsr.rag.util.TraceHandler;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * This class implements a general parser for a left-to-right recursive adaptive grammar (RAG)
 */
public class Parser
{

	private int depth = 0;

	private Grammar m_grammar = null;

	private TraceHandler traceHandler = new TraceHandler();
	
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
	public Set<ParseResult> parse(String input) throws ParseException
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

		// Open trace file
		traceHandler.openFile();

		// Construct the initial query
		Polynomial parseInput = new Polynomial();
		parseInput.add(new Answer(new AnswerIdentifier(input)));
		Polynomial metaSyntax = new Polynomial();
		metaSyntax.add(startSymbol);
		Query initialQuery = new Query(metaSyntax, parseInput);
		
		// Parse the query
		Set<ParseResult> resultSet = this.parse(initialQuery);

		// Close trace file
		traceHandler.closeFile();

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
	
	public Set<ParseResult> parse(Query q) throws ParseException
	{

		// Query begin trace
		printCSQueryBegin(q);
		depth++;

		// Set up initial sentential form and initialise candidate set
		Variable value = new Variable();
		
		Polynomial result = new Polynomial();
		result.add(value);

		VariableSet varSet = new VariableSet();
		varSet.put(value);
		
		Pair startPair = new Pair(q.Metasyntax(), value);
		
		Configuration c = new Configuration();
		c.add(startPair);

		SententialForm firstSF = new SententialForm(c, varSet, result, new ArrayList<>(), null);
		firstSF.setTag();
		CandidateSet candidate = new CandidateSet(firstSF);

		
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
					printCSFork(candidate);
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
				Answer a = input.removeHeadToken();
				//candidate.advance(a, !a.Identifier().Identifier().isBlank());		// ignores whitespace
				candidate.advance(a, true);
				printCSAdvance(input, a, candidate);
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
			h
			
			*/
		}
		while (!input.isEmpty() && !candidate.isEmpty());

		// Do a final pass to advance past any trailing lambda derivations
		while (candidate.CanApplyRules())
		{
			try
			{
				candidate.fork(this);
				printCSFork(candidate);
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
		printCSRemoveNonEmpty(candidate);

		// Return result set
		Set<ParseResult> resultSet = null;
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

		Set<ParseResult> realResults = new HashSet<>();
		Set<ExtendedAnswer> eaSet = new HashSet<>();
		for (ParseResult res: resultSet) {
			Set<ExtendedAnswer> eas = res.getResult().getEASetFromInnerQueryResolution(this);
			for (ExtendedAnswer ea: eas) {
				realResults.add(new ParseResult(ea, res.getDerivation()));
				eaSet.add(ea);
			}
		}

		depth--;
		printCSFinished(q, eaSet);
		return realResults;

	}

	private void printCSQueryBegin(Query q) {
		StringBuilder trace = new StringBuilder();
		String buf = formatTraceBuffer();
		trace.append(buf + "Doing Query: " + q + "\n");
		traceHandler.printTraceToFile(trace.toString());
	}

	private void printCSFinished(Query q, Set<ExtendedAnswer> results) {
		StringBuilder trace = new StringBuilder();
		String buf = formatTraceBuffer();
		trace.append(buf + "Return:\n");
		for (ExtendedAnswer ea: results)
			trace.append(buf + "\t" + ea + "\n");
		if (results.size() <= 0) trace.append(buf + "\tEMPTY\n");
		traceHandler.printTraceToFile(trace.toString());
	}

	private void printCSAdvance(ExtendedAnswer input, Answer a, CandidateSet cs) {
		StringBuilder trace = new StringBuilder();
		String buf = formatTraceBuffer();
		//trace.append(buf + "New input: '" + input + "' (removed '" + a + "')\n");
		trace.append(buf + "Removed: " + a + " from input - New input: " + input + "\n");
		trace.append(getCSFormatted(buf, "pruning", cs));
		traceHandler.printTraceToFile(trace.toString());
	}

	private void printCSFork(CandidateSet cs) {
		StringBuilder trace = new StringBuilder();
		String buf = formatTraceBuffer();
		trace.append(getCSFormatted(buf, "fork", cs));
		traceHandler.printTraceToFile(trace.toString());
	}

	private void printCSRemoveNonEmpty(CandidateSet cs) {
		StringBuilder trace = new StringBuilder();
		String buf = formatTraceBuffer();
		trace.append(getCSFormatted(buf, "remove non-empty", cs));
		traceHandler.printTraceToFile(trace.toString());
	}

	private String getCSFormatted(String buf, String action, CandidateSet cs) {
		StringBuilder trace = new StringBuilder();
		trace.append(buf + "After " + action + " CS:\n");
		for (SententialForm sf: cs)
			trace.append(buf + "\t" + sf + "\n");
		if (cs.size() <= 0) trace.append(buf + "\tEMPTY\n");
		return trace.toString();
	}

	private String formatTraceBuffer() {
		String buf = "";
		for (int i = 0; i < depth; i++) buf += "\t";
		return buf;
	}

}
