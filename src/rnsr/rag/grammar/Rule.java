package rnsr.rag.grammar;

import rnsr.rag.grammar.exception.CloneException;
import rnsr.rag.grammar.exception.PolynomialUnificationException;
import rnsr.rag.grammar.exception.VariableNotFoundException;
import rnsr.rag.grammar.interfaces.IPolynomialTerm;

import java.util.ArrayList;

/**
 * A Rule production for a rescursive adaptive grammar (RAG)
 */
public	class		Rule
		extends		SententialFormBase
{

	private ArrayList<Polynomial> m_arguments = null;

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
	public Rule(Configuration configuration, VariableSet variables, Polynomial result)  throws VariableNotFoundException
	{
		this(configuration, variables, result, null, null);
	}

	/**
	 * Constructs a new Rule object
	 * @param configuration - The configuration of terms represented by this rule form
	 * @param variables - the variable map used by this rule form
	 * @param result - the sematic value of this rule form
	 * @param args - the argument list for this rule form
	 * @throws VariableNotFoundException
	 */
	public Rule(Configuration configuration, VariableSet variables, Polynomial result, ArrayList<Polynomial> args) throws VariableNotFoundException
	{
		this(configuration, variables, result, args, null);
	}

	/**
	 * Constructs a new Rule object
	 * @param configuration - The configuration of terms represented by this rule form
	 * @param variables - the variable map used by this rule form
	 * @param result - the sematic value of this rule form
	 * @param args - the argument list for this rule form
	 * @param conditions - list of conditions on the variables contained in this rule
	 */
	public Rule(Configuration configuration, VariableSet variables, Polynomial result, ArrayList<Polynomial> args, ArrayList<VariableCondition> conditions) throws VariableNotFoundException
	{
		//this(configuration, variables, result);
		this.m_configuration = configuration;
		this.m_variables = variables;
		this.m_result = result;
		this.m_conditions = conditions;
		this.setArguments(args);
	}
	
	/**
	 * Sets the argument list for this rule
	 */
	public void setArguments(ArrayList<Polynomial> args) throws VariableNotFoundException
	{
		// Check that all the variables in the specified list are present in the variable set for this rule
		for (Polynomial p : args) {
			for (IPolynomialTerm pt: p) {
				if (!(pt instanceof Variable)) continue;
				Variable v = (Variable) pt;
				if (!this.m_variables.containsKey(v)) {
					throw new VariableNotFoundException("Argument not present in variable set!");
				}
			}
		}
		
		// Set the argument list
		this.m_arguments = args;		
	}
	
	/**
	 * Creates an instance of this rule form
	 * @param answer - the answer to instantiate the rule with
	 */
	public InstantiatedRule instantiate(Answer answer, VariableSet sfBindings) throws	CloneException,
																VariableNotFoundException
	{

		// Create a new variable set and context mapping
		VariableSet newVars = new VariableSet();
		ContextMapping cloneContext = new ContextMapping();
		for (Variable v : this.m_variables.keySet())
		{
			Variable newV = new Variable(v.getType());
			newV.setTag(v.getTag());
			cloneContext.put(v, newV);
			newVars.put(newV, this.m_variables.get(v));
		}

		// Clone the rule derivative, result and conditions
		Configuration clonedDerivative = this.m_configuration.clone(cloneContext);
		Polynomial clonedResult = this.m_result.clone(cloneContext);

		// Clone variable conditions
		ArrayList<VariableCondition> newConds = new ArrayList<>();
		if (m_conditions != null) {
			for (VariableCondition vc : m_conditions) {
				Variable v1 = cloneContext.get(vc.getFirstVariable());
				Variable v2 = cloneContext.get(vc.getSecondVariable());
				VariableCondition newCond = new VariableCondition(v1, v2, vc.getConditionType());
				newConds.add(newCond);
			}
		}

		// Unification of polynomial parameters to Polynomial arguments
		for (int i = 0; i < answer.Identifier().Arity(); i++) {

			//r.bind(cloneContext.get(this.m_arguments.get(i + 1)), answer.Arguments().get(i));	// OLD CODE - LEAVE HERE TEMP
			try {
				//answer - the polynomial holding the answer to match the variable(s) to
				//m_args.get(i+1) - the polynomial holding the variable(s) in arg i

				Polynomial newAnswerArgs = answer.Arguments().get(i).resolveVariablesInPolynomial(sfBindings);
				VariableSet unifyBindings = m_arguments.get(i+1).unify(newAnswerArgs);

				for (Variable v: unifyBindings.keySet()) { // Because variables inside of arguments aren't their cloned partners
					//newVars.put(v, unifyBindings.get(v));
					newVars.put(cloneContext.get(v), unifyBindings.get(v));
				}
				//newVars.putAll(unifyBindings);

			} catch (PolynomialUnificationException e) {
				e.printStackTrace();	// Temporary lazy exception handling
			}

		}

		// Construct the instantiated rule
		InstantiatedRule r = new InstantiatedRule(clonedDerivative, newVars, clonedResult, newConds);

		// Binding v_0 to answer
		r.bind(cloneContext.get(m_arguments.get(0).get(0)), new Polynomial(answer));
		
		return r;
	}

	public ArrayList<VariableCondition> getConditions() {
		return m_conditions;
	}

	public String toString() {
		return "RULE - c: " + m_configuration + ", res: " + m_result;
	}
	
}
