package rnsr.rag.grammar;

import rnsr.rag.grammar.exception.*;
import rnsr.rag.grammar.interfaces.IConfigurationTerm;
import rnsr.rag.grammar.interfaces.IPolynomialTerm;
import rnsr.rag.parser.Parser;
import rnsr.rag.parser.exception.ParseException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public	class		CandidateSet
		extends		HashSet<SententialForm>
{

	/**
	 * Default Constructor
	 */
	public CandidateSet() { }
	
	/**
	 * Constructs a new CandidateSet and initialises it with the given sentential form
	 */
	public CandidateSet(SententialForm initialForm)
	{
		this.add(initialForm);
	}
	
	/**
	 * Removes any empty sentential forms contained in the set
	 */
	public void removeEmptyForms()
	{
		Iterator<SententialForm> i = this.iterator();
		while (i.hasNext())
		{
			SententialForm form = i.next();
			
			if (form.m_configuration.isEmpty())
			{
				i.remove();
			}
		}
	}

	/**
	 * Removes any non empty sentential forms contained in this set
	 */
	public void removeNonEmptyForms()
	{
		Iterator<SententialForm> i = this.iterator();
		while (i.hasNext())
		{
			SententialForm form = i.next();
			
			if (!form.m_configuration.isEmpty())
			{
				i.remove();
			}
		}
	}
	
	/**
	 * Forks all the sentential forms contained in this set
	 */
	public void fork(Parser parser) throws	InvalidTermException,
											TermResolutionException,
											VariableNotBoundException,
											VariableNotFoundException,
											CloneException,
											ParseException
	{
		CandidateSet tempSet = new CandidateSet();

		Iterator<SententialForm> i = this.iterator();
		while (i.hasNext()) {

			// Get the next sentential form in the candidate set
			SententialForm currentForm = i.next();

			// Remove it from the original list
			i.remove();

			// Normalise the sentential form, to make sure that we have something that we can apply a rule to
			currentForm.normalise();

			// Get the head of the sentential form
			IConfigurationTerm head = currentForm.Head();

			if (head == null || head instanceof Answer) {
				// This form survives "as is" to the next round
				tempSet.add(currentForm);
			} else if (head != null && head instanceof Pair) {
				Pair headPair = (Pair) head;
				Polynomial p = headPair.Left();
				
				// If the polynomial contains more than one term, then this is an error
				// as we expect the sentential form normalise() operation to split the concatenation for us
				if (p.size() > 1)
				{
					// throw an error here as this is a problem with the algorithm, not the parse
					throw new Error("Length of polynomial more than expected!");
				}

				IPolynomialTerm t = p.get(0);
				
				// If the term in the polynomial is a variable, then this is an error
				// as we expect the sentential form normalise() operation to resolve the variable for us
				if (t instanceof Variable)
				{
					if (((Variable) t).isConstrained()) {
						tempSet.add(currentForm);
					}
					// throw an error here as this is a problem with the algorithm, not the parse
					else throw new Error("Polynomial Term type different than expected: found Variable!");
				}

				// If the term is a query then we first need to parse it
				else if (t instanceof Query)
				{
					// Resolve any variables in the Query arguments
					Query resolvedQuery = null;
					try
					{
						resolvedQuery = ((Query) t).resolve(currentForm.Variables());
					}
					catch (VariableNotBoundException e)
					{
						throw new TermResolutionException(e);
					}
					catch (VariableNotFoundException e)
					{
						throw new TermResolutionException(e);
					}

					// Parse the query
					Set<ParseResult> realResults = parser.parse(resolvedQuery);
					Set<ExtendedAnswer> results = new HashSet<>();
					for (ParseResult pr: realResults) results.add(pr.getResult());

					// For each result in the parse, create a rule and apply it to the current sentential form
					for (ExtendedAnswer result : results)
					{
						// Construct the replacement rule
						InstantiatedRule r = InstantiatedRule.constructQueryReplacementRule(result, headPair.Right());

						// Apply the rule
						SententialForm clone = currentForm.cloneObject();
						clone.applyRule(r);
						tempSet.add(clone);
					}
				}

				// If the term is an answer, get and apply the appropriate rules
				else if (t instanceof Answer)
				{

					// Get the applicable rules
					RuleSet ruleSet = parser.Grammar().lookupRuleSet(((Answer) t).Identifier());

					// Loop through each rule returned and apply it.
					for (Rule r : ruleSet)
					{
						try {
							tempSet.add(currentForm.applyRule(r));
						} catch (UnificationLambdaException e) {
							continue; // Rule arg requires lambda, but non-empty arg given
						}

					}

				}
			}
		}
		this.addAll(tempSet);
	}
	
	/**
	 * Advances all the sentential forms in this set that match the given answer
	 * @param input - the answer to use for the advance operation
	 */
	public void advance(Answer input)
	{
		this.advance(input, false);
	}
	
	/**
	 * Advances all the sentential forms in this set, and optionally discards any forms that do not match
	 * @param input - the answer to use for the advance operation
	 * @param discardNonMatching - flag to indicate whether non-matching forms should be discarded
	 */
	public void advance(Answer input, boolean discardNonMatching)
	{
		ArrayList<SententialForm> toRemove = new ArrayList<>();
		Iterator<SententialForm> i = this.iterator();
		while (i.hasNext())
		{
			SententialForm current = i.next();
			IConfigurationTerm headTerm = current.Head();
			if ((headTerm != null) && (headTerm instanceof Answer) && (((Answer) headTerm).match(input)))
			{
				try
				{

					current.consumeToken(input);
				}
				catch (AnswerMismatchException e)
				{
					// Throw an error: we have used the match() method, so this exception shouldn't be thrown
					throw new Error(e);
				}
			} else if (headTerm instanceof Pair && discardNonMatching) {
				Variable unbound = (Variable) ((Pair) headTerm).Left().get(0);
				try {
					//System.out.println("/////////////");
					//System.out.println("BEFORE : " + current);
					unbound.resolveForConstraints(input.Identifier().Identifier(), current, this);
					try {
						current.consumeToken(input);
					} catch (AnswerMismatchException e) {
						//this.remove(current);
						toRemove.add(current);
					}
					//this.remove(current);
					//this.advance(input, true);

				} catch (CloneException e) {
					throw new Error(e);
				}

			} else if (discardNonMatching)
			{
				if (!(headTerm == null && input.Identifier().Identifier().isBlank()))
					i.remove();
			}
		}
		for (SententialForm sf: toRemove) this.remove(sf);
	}
	
	/**
	 * Returns the result from each sentential form contained in this set
	 */
	public HashSet<ParseResult> ResultSet() throws	VariableNotBoundException,
														VariableNotFoundException,
														InvalidTermException
	{
		HashSet<ParseResult> resultSet = new HashSet<>();

		for (SententialForm form : this) {
			if (!form.checkVariableConditions()) continue;
			//System.out.println("DERIV: \n" + form.buildDerivation());
			resultSet.add(new ParseResult(form.Result().resolve(form.Variables()).toExtendedAnswer(), form.buildDerivation(), null));
		}

		return resultSet;
	}
	
	/**
	 * Returns a flag indicating whether this set contains any sentential forms to which grammar rules can be applied
	 */
	public boolean CanApplyRules()
	{
		for (SententialForm form : this)
		{
			IConfigurationTerm t = form.Head();
			if (t != null && (t instanceof Pair))
			{
				Polynomial p =  ((Pair) t).Left();
				if (p.size() == 1 && p.get(0) instanceof Variable && ((Variable) p.get(0)).isConstrained()) continue;
				return true;
			}
		}
		
		return false;
	}

}
