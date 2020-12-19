package rnsr.rag.grammar;

import rnsr.rag.grammar.exception.CloneException;
import rnsr.rag.grammar.interfaces.IConfigurationTerm;
import rnsr.rag.grammar.interfaces.IContextClonable;

/**
 * Represents a pair in the configuration algebra of a recursive adaptive grammar
 */
public	class		Pair
		implements	IConfigurationTerm, IContextClonable<Pair>
{

	private Polynomial m_left = null;
	private Variable m_right = null;
	
	/**
	 * Default Constructor
	 */
	public Pair() { }
	
	/**
	 * Constructs a pair
	 * @param left - the polynomial representing the metasytactic value of the pair
	 * @param right - the variable which holds the (snthesized) semantics of the pair
	 */
	public Pair(Polynomial left, Variable right)
	{
		this.m_left = left;
		this.m_right = right;
	}
	
	/**
	 * The metasyntactic value of the pair
	 */
	public Polynomial Left()
	{
		return this.m_left;
	}
	
	/**
	 * The variable placeholder for the sematic value synthesized by this pair
	 */
	public Variable Right()
	{
		return this.m_right;
	}
	
	/**
	 * IContextClonable method - clones this Pair
	 */
	public Pair clone(ContextMapping context) throws CloneException
	{
		return new Pair(this.m_left.clone(context), this.m_right.clone(context));
	}

	@Override
	public String toString() {
		return "<" + m_left + ", " + m_right + ">";
	}

}