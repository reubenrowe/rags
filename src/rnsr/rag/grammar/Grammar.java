package rnsr.rag.grammar;

import rnsr.rag.grammar.exception.RuleFunctionException;
import rnsr.rag.grammar.exception.VariableNotFoundException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

/**
 * This class represents a recursive adaptive grammar, and implements its rule function
 */
public class Grammar
{
	/**
	 * The mapping from Answers to Rules
	 */
	private Hashtable<AnswerIdentifier, RuleSet> m_ruleMap = new Hashtable<AnswerIdentifier, RuleSet>();
	
	/**
	 * The start symbol of this grammar
	 */
	private Answer m_startSymbol = null;
	
	/**
	 * Whether this grammar will accept Rule productions bound to Answers not already in the rule map
	 */
	private boolean m_answerSetSpecified = false;
	
	/**
	 * Default Constructor
	 */
	public Grammar() { }
	
	/**
	 * Constructs a new Recursive Adaptive Grammar with the specified start symbol
	 * @param startSymbol - the start symbol the grammar
	 */
	public Grammar(Answer startSymbol)
	{
		this.m_startSymbol = startSymbol;
	}
	
	/**
	 * Constructs a new Recursive Adaptive Grammar which will only accept rules for the give set of answers
	 * @param identifierList - The list of Answers which this RAG supports
	 * @param startSymbol - the start symbol the grammar
	 */
	public Grammar(HashSet<AnswerIdentifier> identifierList, Answer startSymbol)
	{
		Iterator<AnswerIdentifier> i = identifierList.iterator();
		while (i.hasNext())
		{
			AnswerIdentifier id = i.next();
			
			// Rules can only exist for non-terminal answers
			if (!id.Terminal())
			{
				this.m_ruleMap.put(id, new RuleSet());
			}
		}
		
		this.m_answerSetSpecified = true;
		this.m_startSymbol = startSymbol;
	}
	
	/**
	 * Answer object representing the start symbol of this grammar
	 */
	public Answer StartSymbol()
	{
		return this.m_startSymbol;
	}
	
	/**
	 * Adds a Rule Production to this RAG and associates it with the specified Answer
	 * @param bindingAnswer - The answer which will trigger this rule in a derivation 
	 * @param rule - The Rule production
	 */
	public void addRule(AnswerIdentifier bindingAnswer, Rule rule) throws RuleFunctionException
	{
		// Rules can only exist for non-terminal answers
		if (bindingAnswer.Terminal())
		{
			throw new RuleFunctionException("Rules can only be bound to Nonterminal answers!");
		}
		
		if (!this.m_ruleMap.containsKey(bindingAnswer))
		{
			if (this.m_answerSetSpecified)
			{
				throw new RuleFunctionException("Answer unknown to this grammar - cannot associate Rule productions with this Answer");
			}
			else
			{
				this.m_ruleMap.put(bindingAnswer, new RuleSet());
			}
		}
		
		this.m_ruleMap.get(bindingAnswer).add(rule);
	}
	
	/**
	 * Adds a set of Rule productions to this RAG and associates them with the specified Answer
	 * @param bindingAnswer - The answer which will trigger this rule in a derivation 
	 * @param ruleset - The set of Rule productions
	 */
	public void addRuleSet(AnswerIdentifier bindingAnswer, RuleSet ruleset) throws RuleFunctionException
	{
		// Rules can only exist for non-terminal answers
		if (bindingAnswer.Terminal())
		{
			throw new RuleFunctionException("Rules can only be bound to Nonterminal answers!");
		}
		
		if (!this.m_ruleMap.containsKey(bindingAnswer))
		{
			if (this.m_answerSetSpecified)
			{
				throw new RuleFunctionException("Answer unknown to this grammar - cannot associate Rule productions with this Answer");
			}
			else
			{
				this.m_ruleMap.put(bindingAnswer, new RuleSet());
			}
		}
		
		this.m_ruleMap.get(bindingAnswer).addAll(ruleset);
	}
	
	/**
	 * Adds an empty set of Rule productions to this RAG and associates them with the specified Answer
	 * @param bindingAnswer - The answer which will trigger this rule in a derivation 
	 */
	public void addEmptyRuleSet(AnswerIdentifier bindingAnswer) throws RuleFunctionException
	{
		// Rules can only exist for non-terminal answers
		if (bindingAnswer.Terminal())
		{
			throw new RuleFunctionException("Rules can only be bound to Nonterminal answers!");
		}
		
		if (!this.m_ruleMap.containsKey(bindingAnswer))
		{
			if (this.m_answerSetSpecified)
			{
				throw new RuleFunctionException("Answer unknown to this grammar - cannot associate Rule productions with this Answer");
			}
			else
			{
				this.m_ruleMap.put(bindingAnswer, new RuleSet());
			}
		}
	}
	
	/**
	 * Gets the set of Rule productions that are associated with the given Answer
	 * @param bindingAnswer - The Answer for which to retrieve Rule productions
	 */
	public RuleSet lookupRuleSet(AnswerIdentifier bindingAnswer)
	{
		// Get specific rules
		RuleSet s = this.m_ruleMap.get(bindingAnswer);
		
		if (s == null)
		{
			s = new RuleSet();
		}
		
		// If the trigger is a Terminal Answer, we also need to generate a predicate rule for it
		if (bindingAnswer.Terminal()) {
			Configuration c = new Configuration();
			c.add(new Answer(bindingAnswer));
			
			VariableSet v = new VariableSet();
			Variable v0 = new Variable();
			v.put(v0);
			
			ArrayList<Polynomial> args = new ArrayList<>();
			args.add(new Polynomial(v0));
			
			Polynomial result = new Polynomial(new Answer(bindingAnswer));
			
			try {
				Rule r = new Rule(c, v, result, args);
				s.add(r);
			}
			catch (VariableNotFoundException e) {
				// If this is thrown something is seriously wrong, as we have just added the variable in question
				throw new Error(e);
			}
		}
		
		return s; 
	}
}