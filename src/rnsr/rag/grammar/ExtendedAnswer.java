package rnsr.rag.grammar;

import rnsr.rag.grammar.interfaces.IPolynomialTerm;
import rnsr.rag.parser.Parser;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Represents a concatenation (string) of Answers
 */
public	class		ExtendedAnswer
		extends		Polynomial
{

	public ExtendedAnswer() {
		super();
	}

	public ExtendedAnswer(IPolynomialTerm pt) {
		super(pt);
	}
	/**
	 * Removes and returns the leftmost answer in this answer string.
	 * Nonterminal answers are returned as is. Terminal answers are
	 * returned one character at a time. 
	 */
	public Answer removeHeadToken()
	{

		Answer a = (Answer) this.remove(0);
		
		if (a.Identifier().Terminal())
		{
			String terminalStr = a.Identifier().Identifier();
			
			if (terminalStr.length() > 1)
			{
				AnswerIdentifier newId = new AnswerIdentifier(terminalStr.substring(1));
				this.add(0, new Answer(newId));
			}
			
			AnswerIdentifier returnId = null;
			if (terminalStr.length() == 0)
			{
				returnId = AnswerIdentifier.Lambda();
			}
			else
			{
				returnId = new AnswerIdentifier(terminalStr.substring(0, 1));
			}
			
			return new Answer(returnId);
		}
		
		else
		{
			return a;
		}
	}

	public Set<ExtendedAnswer> getEASetFromQueryResolve(Parser parser) {
		ArrayList<Set<ExtendedAnswer>> subEaSetList = new ArrayList<>();
		for (IPolynomialTerm pt: this)
			subEaSetList.add(pt.resolveQueries(parser));
		return extendedAnswerPermutations(subEaSetList);
	}

	private Set<ExtendedAnswer> extendedAnswerPermutations(ArrayList<Set<ExtendedAnswer>> polyAnswers) {
		ArrayList<ArrayList<ExtendedAnswer>> eaListList = new ArrayList<>();
		for (Set<ExtendedAnswer> eaSet: polyAnswers) eaListList.add(new ArrayList<>(eaSet));

		ArrayList<ExtendedAnswer> perms = new ArrayList<>();

		// Creating an empty list for every permutation of the Answers possible
		int sum = 1;
		for (Set<ExtendedAnswer> possibleAnswerSet: polyAnswers) sum *= possibleAnswerSet.size();
		for (int i = 0; i < sum; i++) perms.add(new ExtendedAnswer());

		// Filling the list of permutations of Answers
		for (int i = 0; i < eaListList.size(); i++) {
			ArrayList<ExtendedAnswer> currentPossibilityPool = eaListList.get(i);
			for (int j = 0; j < sum; j++) {
				perms.get(j).addAll(currentPossibilityPool.get(j % currentPossibilityPool.size()));
			}
		}

		return new HashSet<>(perms);
	}


}