package rnsr.rag.grammar;

import rnsr.rag.grammar.exception.VariableNotFoundException;

/**
 * This is the base class for all objects based upon a configuration.
 * It encapsulates the basic functionality of the configuration and
 * the context in which it operates
 */
public abstract class SententialFormBase
{
	/**
	 * The configuration of terms contained in the sentential form
	 */
	protected Configuration m_configuration = null;
	
	/**
	 * The mapping from variables used in the sentential form to answers
	 */
	protected VariableSet m_variables = null;
	
	/**
	 * The semantic value of this sentential form
	 */
	protected Polynomial m_result = null;
	
	/**
	 * The sematic value of this sentential form
	 */
	public Polynomial Result()
	{
		return this.m_result;
	}
	
	/**
	 * Binds the given polynomial to the specified variable
	 * @param v - The variable to bind to
	 * @param polynomial - The value to bind
	 * @throws VariableBindingException
	 */
	protected void bind(Variable v, Polynomial polynomial) throws VariableNotFoundException
	{
		if (!this.m_variables.containsKey(v))
		{
			throw new VariableNotFoundException("The variable you have tried to bind to is not present in the variable set of the sentential form!");
		}
		
		this.m_variables.put(v, polynomial);
	}
}
