package rnsr.rag.grammar;

import rnsr.rag.derivation.DerivationConfiguration;
import rnsr.rag.derivation.DerivationSequence;
import rnsr.rag.grammar.exception.*;
import rnsr.rag.grammar.interfaces.IClonable;
import rnsr.rag.grammar.interfaces.IConfigurationTerm;
import rnsr.rag.grammar.interfaces.IConsumable;
import rnsr.rag.grammar.interfaces.IPolynomialTerm;

import java.util.ArrayList;

/**
 * Represents a RAG sentential form (i.e. a configuration and a 
 * semantic value encapsulated with variable context information)
 */
public	class		SententialForm
		extends		SententialFormBase
		implements	IClonable<SententialForm>, IConsumable
{

	private static int count = 0;
	private int childCount = 0;
	private String tag = "";

	private SententialForm previous;

	private DerivationSequence derivationSequence;

	/**
	 * Constructs a new Sentential Form object
	 * @param configuration - The configuration of terms represented by this sentential form
	 * @param variables - the variable map used by this sentential form
	 * @param result - the sematic value of this sentential form
	 */
	public SententialForm(Configuration configuration, VariableSet variables, Polynomial result, ArrayList<VariableCondition> conditions, SententialForm previous) {
		this.m_configuration = configuration;
		this.m_variables = variables;
		this.m_result = result;
		this.m_conditions = conditions;
		this.previous = previous;
		this.derivationSequence = new DerivationSequence(variables);
	}
	
	/**
	 * Returns the head term of the configuration represented by this sentential form
	 */
	public IConfigurationTerm Head()
	{
		IConfigurationTerm t = null;
		
		if (this.m_configuration.size() > 0)
		{
			t = this.m_configuration.get(0);
		}
		
		return t;
	}

	/**
	 * Returns the variable set used by this sentential form
	 */
	public VariableSet Variables()
	{
		return this.m_variables;
	}

	/**
	 * Normlises the head of this sentential form.<br/>
	 * If the head element is a pair, the first term of polynomial contained in its left-hand side is
	 * split off into a separate pair, and any variables resolved.
	 */
	public void normalise() throws VariableNotBoundException, VariableNotFoundException
	{
		// If the polynomial is a concatenation
		if (Head() instanceof Pair)
		{
			if (((Pair) Head()).Left().size() > 1)
			{
				// remove the head pair, as we will be creating new pairs to replace it
				Pair head = (Pair) this.m_configuration.remove(0);

				// Create a new pair out of the left-most term (resolving variables if necessary)
				Polynomial p = head.Left();
				IPolynomialTerm leftTerm = p.remove(0);
				Polynomial newPolynomial = new Polynomial();
				if (leftTerm instanceof Variable)
				{
					if (!this.m_variables.containsKey(((Variable) leftTerm)))
					{
						throw new VariableNotFoundException();
					}

					newPolynomial = this.m_variables.get((Variable) leftTerm);

					if (newPolynomial.Empty())
					{
						throw new VariableNotBoundException();
					}
				}
				else
				{
					newPolynomial.add(leftTerm);
				}

				Variable v1 = new Variable();
				this.m_variables.put(v1);
				Pair newHead = new Pair(newPolynomial, v1);

				// Put the remainder of the polynomial in a new Pair
				Variable v2 = new Variable();
				this.m_variables.put(v2);
				Pair replacement = new Pair(p, v2);

				// Insert the replacement and new Pairs at the head of the configuration
				this.m_configuration.add(0, replacement);
				this.m_configuration.add(0, newHead);

				// Bind the old result to a concatenation of the new pairs' results
				Polynomial combinedResult = new Polynomial();
				combinedResult.add(v1);
				combinedResult.add(v2);
				this.bind(head.Right(), combinedResult);

				// Now recursively call normalise() in case the head term requires further resolution
				normalise();
			}

			// If the term is a variable, we need to resolve
			else if (((Pair) Head()).Left().get(0) instanceof Variable)
			{
				// remove the head pair, as we will be creating new pairs to replace it
				Pair head = (Pair) this.m_configuration.remove(0);

				// Resolve the variable in this pair's polynomial
				Variable v = (Variable) head.Left().get(0);
				if (!this.m_variables.containsKey(v)) {
					throw new VariableNotFoundException();
				}

				Polynomial resolved = (Polynomial) this.m_variables.get(v).clone();

				if (resolved.Empty()) {
					this.m_configuration.add(0, head);
					if (v.isConstrained()) return; // If the variable is unbound, but is typed, we leave binding to later
					throw new VariableNotBoundException();
				}

				// Create new pair with resolved variable
				Pair newPair = new Pair(resolved, head.Right());

				// Insert new pair into configuration
				this.m_configuration.add(0, newPair);

				// Now recursively call normalise() in case the head term requires further resolution
				normalise();
			}
		}
	}
	
	/**
	 * Applies the given rule to the pair at the head of this sentential form
	 * @param ruleInstance - The rule instance to apply
	 */
	public void applyRule(InstantiatedRule ruleInstance) throws InvalidTermException, VariableNotFoundException
	{
		// Remove the head term of the sentential form
		IConfigurationTerm t = this.m_configuration.remove(0);

		// Check the the head term is a pair (if it isn't, throw an exception)
		if (!(t instanceof Pair))
		{
			throw new InvalidTermException("Term at the head of this sentential form is not a pair!");
		}

		// Push the rule configuration on to the head of the sentential form
		this.m_configuration.addAll(0, ruleInstance.Derivative());

		// Append the rule instance variables to the sentential form
		this.m_variables.putAll(ruleInstance.Variables());

		// Append conditions on variables to the sentential form
		if (ruleInstance.m_conditions != null)
			this.m_conditions.addAll(ruleInstance.m_conditions);

		// Bind the result of the rule instance to the binding variable of the replaced term
		this.bind(((Pair) t).Right(), ruleInstance.Result());
	}

	/**
	 * Instantiates the given rule using a clone of this sentential form and then
	 * applies the rule to the cloned form, returning the result
	 */
	public SententialForm applyRule(Rule rule) throws CloneException,
			InvalidTermException,
			VariableNotFoundException,
			UnificationLambdaException {
		// Clone the sentential form
		ContextMapping ct = new ContextMapping();
		SententialForm clone = this.cloneObject(ct);

		// Get the head term
		IConfigurationTerm head = clone.Head();
		
		if (head == null)
		{
			throw new InvalidTermException("This sentential form is empty!");
		}
		
		if (!(head instanceof Pair))
		{
			throw new InvalidTermException("Term at the head of this sentential form is not a pair!");
		}

		Pair headPair = (Pair) head;
		Polynomial p = headPair.Left();
		IPolynomialTerm t = p.get(0);
		
		if (!(t instanceof Answer))
		{
			throw new InvalidTermException("Polynomial term contained in the head pair is not an Answer!");
		}
		
		InstantiatedRule ruleInstance = rule.instantiate(((Answer) t), clone.m_variables);
		clone.applyRule(ruleInstance);
		
		return clone;
	}

	public SententialForm cloneObject() throws CloneException {
		return cloneObject(new ContextMapping());
	}

	/**
	 * IClonable method - clones this sentential form
	 */
	public SententialForm cloneObject(ContextMapping cloneContext) throws CloneException {

		// Create a new variable set and context mapping
		for (Variable v : this.m_variables.keySet()) {
			Variable vNew = new Variable(v.getType());
			vNew.setTag(v.getTag());    // FOR DEBUGGING
			cloneContext.put(v, vNew);
		}
		
		// Clone the configuration and result
		Polynomial clonedResult = this.m_result.clone(cloneContext);
		Configuration clonedConfiguration = this.m_configuration.clone(cloneContext);
		
		// Create the new variable set and populate with clones of variable bindings
		VariableSet newVars = new VariableSet();

		for (Variable v : this.m_variables.keySet()) {
			Polynomial p = this.m_variables.get(v);
			newVars.put(cloneContext.get(v), p.clone(cloneContext));
		}

		ArrayList<VariableCondition> newConditions = new ArrayList<>();

		// Clone conditions
		for (VariableCondition cond: m_conditions) {
			Variable vLeftOld = cond.getFirstVariable();
			Variable vRightOld = cond.getSecondVariable();
			VariableCondition.VariableConditionType vCondOld = cond.getConditionType();
			newConditions.add(new VariableCondition(cloneContext.get(vLeftOld), cloneContext.get(vRightOld), vCondOld));
		}
		
		// Create and return a new Sentential form using the cloned components
		SententialForm cloneSF = new SententialForm(clonedConfiguration, newVars, clonedResult, newConditions, this);
		cloneSF.setTag(this.tag + "." + ++childCount);

		return cloneSF;
	}

	public boolean checkVariableConditions() {
		for (VariableCondition cond: m_conditions) {
			Polynomial p1 = m_variables.get(cond.getFirstVariable());
			Polynomial p2 = m_variables.get(cond.getSecondVariable());
			switch (cond.getConditionType()) {
				case NE:
					if (p1.equals(p2)) return false;
					else continue;
			}
		}
		return true;
	}
	
	/**
	 * IConsumable method - consumes the head token of this sentential form
	 * if it matches the given answer. Throws an exception otherwise.
	 */
	public void consumeToken(Answer answer) throws AnswerMismatchException
	{

		// Simply call the consumeToken() method on the inner configuration
		this.m_configuration.consumeToken(answer);
	}


	public String buildDerivation() {
		//this.removeRedundantVariables();
		return (this.previous == null) ? this.toString() : this.previous.buildDerivation() + "\n" + this;
	}


	public void removeRedundantVariables() {
		VariableSet usedVariables = this.m_configuration.usedVariables();
		usedVariables.putAll(this.m_result.usedVariables());
		this.flattenVariables(usedVariables);
		VariableSet newVars = new VariableSet();
		for (Variable v: this.m_variables.keySet()) {
			if (usedVariables.containsKey(v)) newVars.put(v, this.m_variables.get(v));
		}
		this.m_variables = newVars;
	}

	public void flattenVariables(VariableSet usedVariables) {
		for (Variable v: usedVariables.keySet()) {
			Polynomial p = this.m_variables.get(v);
			if (!p.onlyVariable()) continue;
			Variable boundTo = (Variable) p.get(0);
			while (this.m_variables.get(boundTo).onlyVariable())
				boundTo = (Variable) this.m_variables.get(boundTo).get(0);
			this.m_variables.put(v, this.m_variables.get(boundTo));
		}
	}


	public String toString() {
		String s = this.tag + " : " + m_configuration + ", ";
		s += ("Variable count: " + m_variables.size() + ", ");
		//s+= m_variables + ", ";
		s += "Result \"" + m_result + "\", ";
		s += "Bindings: " + m_variables;
		return s;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public void setTag() {
		this.tag = String.valueOf(++count);
	}


	public void addDerivationStep(DerivationConfiguration c) {
		this.derivationSequence.add(c);
	}

}