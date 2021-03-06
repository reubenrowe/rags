package rnsr.rag.grammar;

import java.util.ArrayList;

import rnsr.rag.grammar.exception.CloneException;
import rnsr.rag.grammar.exception.VariableNotFoundException;

/**
 * A Rule production for a rescursive adaptive grammar (RAG)
 */
public	class		Rule
		extends		SententialFormBase
{

	private ArrayList<Variable> m_arguments = null;
	
	/**
	 * Default Constructor
	 */
	public Rule() { }
	
	/**
	 * Constructs a new Rule object
	 * @param configuration - The configuration of terms represented by this rule form
	 * @param variables - the variable map used by this rule form
	 * @param result - the sematic value of this rule form
	 */
	public Rule(Configuration configuration, VariableSet variables, Polynomial result)
	{
		this.m_configuration = configuration;
		this.m_variables = variables;
		this.m_result = result;
	}
	
	/**
	 * Constructs a new Rule object
	 * @param configuration - The configuration of terms represented by this rule form
	 * @param variables - the variable map used by this rule form
	 * @param result - the sematic value of this rule form
	 * @param args - the argument list for this rule form
	 */
	public Rule(Configuration configuration, VariableSet variables, Polynomial result, ArrayList<Variable> args) throws VariableNotFoundException
	{
		this(configuration, variables, result);
		this.setArguments(args);
	}
	
	/**
	 * Sets the argument list for this rule
	 */
	public void setArguments(ArrayList<Variable> args) throws VariableNotFoundException
	{
		// Check that all the variables in the specified list are present in the variable set for this rule
		for (Variable v : args)
		{
			if (!this.m_variables.containsKey(v))
			{
				throw new VariableNotFoundException("Argument not present in variable set!");
			}
		}
		
		// Set the argument list
		this.m_arguments = args;		
	}
	
	/**
	 * Creates an instance of this rule form
	 * @param answer - the answer to instantiate the rule with
	 */
	public InstantiatedRule instantiate(Answer answer) throws	CloneException,
																VariableNotFoundException
	{
		// Create a new variable set and context mapping
		VariableSet newVars = new VariableSet();
		ContextMapping cloneContext = new ContextMapping();
		for (Variable v : this.m_variables.keySet())
		{
			Variable newVar = new Variable();
			cloneContext.put(v, newVar);
			newVars.put(newVar);
		}
		
		// Clone the rule derivative and result
		Configuration clonedDerivative = this.m_configuration.clone(cloneContext);
		Polynomial clonedResult = this.m_result.clone(cloneContext);
		
		// Construct the instantiated rule
		InstantiatedRule r = new InstantiatedRule(clonedDerivative, newVars, clonedResult);
		
		// Bind variables
		r.bind(cloneContext.get(this.m_arguments.get(0)), new Polynomial(answer));
		
		for (int i = 0; i < answer.Identifier().Arity(); i++)
		{
			r.bind(cloneContext.get(this.m_arguments.get(i + 1)), answer.Arguments().get(i));
		}
		
		return r;
	}
	
}
