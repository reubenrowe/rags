package rnsr.rag.grammar;

import rnsr.rag.grammar.exception.CloneException;
import rnsr.rag.grammar.interfaces.IContextClonable;
import rnsr.rag.grammar.interfaces.IPolynomialTerm;
import rnsr.rag.parser.Parser;

import java.util.HashSet;

/**
 * Represents a variable in a RAG polynomial expression
 */
public	class		Variable
		implements	IPolynomialTerm, IContextClonable<Variable>
{

	private int index;
	private HashSet<String> possibleValues;

	public Variable(HashSet<String> possibleValues) {
		this.possibleValues = possibleValues;
	}
	
	public Variable() {
		this(null);
	}

	/**
	 * IContextClonable method - clones this Variable
	 */
	public Variable clone(ContextMapping context) throws CloneException
	{
		if (context.containsKey(this))
		{
			return context.get(this);
		}
		else
		{
			throw new CloneException("Variable cannot be found in context!");
		}
	}


	/**
	 * Overload method to check the equality of variables. NB. This method just calls the
	 * superclass (Object) method as variables are only equal if they reference the same object
	 */
	public boolean equals(Variable v)
	{
		return super.equals(v);
	}
	
	public String toString()
	{
		// TODO : Implement a better naming scheme for variables
		//return "v" + index;
		return "v";
	}

	public HashSet<ExtendedAnswer> resolveQueries(Parser parser) {
		return new HashSet<>();
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getIndex() {
		return index;
	}

}
