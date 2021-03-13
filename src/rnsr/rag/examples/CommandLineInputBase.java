package rnsr.rag.examples;

import rnsr.rag.grammar.Grammar;
import rnsr.rag.grammar.ParseResult;
import rnsr.rag.grammar.exception.ArgumentMismatchException;
import rnsr.rag.grammar.exception.RuleFunctionException;
import rnsr.rag.grammar.exception.VariableNotFoundException;
import rnsr.rag.parser.Parser;
import rnsr.rag.parser.exception.ParseException;

import java.util.Set;

/**
 * Provides a common main() method
 */
public abstract class CommandLineInputBase
{

	public abstract Grammar CreateRAG() throws	ArgumentMismatchException,
												RuleFunctionException,
												VariableNotFoundException;
	
	protected static void performTest(CommandLineInputBase obj, String input)
	{
		// Create grammar and parser
		Grammar g = null;
		try
		{
			g = obj.CreateRAG();
		}
		catch (Exception e)
		{
			System.err.println("Could not create grammar!");
			e.printStackTrace(System.err);
		}
		
		Parser p = new Parser(g);
		
		// Parse user input
		try
		{
			Set<ParseResult> results = p.parse(input);
			System.out.println("Input parsed OK");
			
			int counter = 1;
			for (ParseResult result : results) {
				System.out.print(counter);
				System.out.print(": \n");
				System.out.print(result.toString());
				counter++;
			}
		}
		catch (ParseException e)
		{
			e.printStackTrace(System.err);
			System.exit(0);
		}
	}
	
}
