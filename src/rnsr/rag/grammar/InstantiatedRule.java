package rnsr.rag.grammar;

import java.util.ArrayList;

/**
 * An instance of a rule form which can be applied directly to a sentential form
 */
public	class		InstantiatedRule
		extends		SententialFormBase
{

	/**
	 * Default Constructor
	 */
	public InstantiatedRule() { }
	
	/**
	 * Constructs a new rule instance object
	 * @param configuration - The configuration of terms represented by this rule instance
	 * @param variables - the variable map used by this rule instance
	 * @param result - the sematic value of this rule instance
	 */
	public InstantiatedRule(Configuration configuration, VariableSet variables, Polynomial result, ArrayList<VariableCondition> conditions)
	{
		this.m_configuration = configuration;
		this.m_variables = variables;
		this.m_result = result;
		this.m_conditions = conditions;
	}
	
	/**
	 * Returns the derivate of this rule application
	 */
	public Configuration Derivative()
	{
		return this.m_configuration;
	}
	
	/**
	 * Returns the variables used in this rule instance
	 */
	public VariableSet Variables()
	{
		return this.m_variables;
	}

	/**
	 * Constructs an instantiated rule from the results of a Query parse which
	 * can be used to advance the parse of a configuration containing the original query
	 */
	public static InstantiatedRule constructQueryReplacementRule(ExtendedAnswer queryResult, Variable v)
	{

		Pair p = new Pair(queryResult, v);
		
		Configuration c = new Configuration();
		c.add(p);

		VariableSet vars = new VariableSet();
		vars.put(v);

		return new InstantiatedRule(c, vars, new Polynomial(v), null);
	}
}
