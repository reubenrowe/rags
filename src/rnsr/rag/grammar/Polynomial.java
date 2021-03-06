package rnsr.rag.grammar;

import java.util.ArrayList;

import rnsr.rag.grammar.interfaces.IContextClonable;
import rnsr.rag.grammar.interfaces.IPolynomialTerm;
import rnsr.rag.grammar.interfaces.IResolvable;

import rnsr.rag.grammar.exception.CloneException;
import rnsr.rag.grammar.exception.InvalidTermException;
import rnsr.rag.grammar.exception.VariableNotBoundException;
import rnsr.rag.grammar.exception.VariableNotFoundException;

/**
 * Represents a RAG polynomial expression
 */
public	class		Polynomial
		extends		ArrayList<IPolynomialTerm>
		implements	IContextClonable<Polynomial>, IResolvable<Polynomial>
{

	/**
	 * Default constructor
	 */
	public Polynomial() { super(); }
	
	/**
	 * Constructs a new Polynomial containing only the specified term
	 * @param t the term with which to initially populate the polynomial
	 */
	public Polynomial(IPolynomialTerm t)
	{
		super();
		this.add(t);
	}
	
	/**
	 * IContextClonable method - clones this polynomial
	 */
	public Polynomial clone(ContextMapping context) throws CloneException
	{
		Polynomial clone = new Polynomial();
		
		for (IPolynomialTerm t : this)
		{
			clone.add((IPolynomialTerm) ((IContextClonable) t).clone(context));
		}
		
		return clone;
	}

	/**
	 * Converts this Polynomial into an ExtendedAnswer
	 * @throws InvalidTermException if it encounters a raw Variable within the Polynomial
	 */
	public ExtendedAnswer toExtendedAnswer() throws InvalidTermException
	{
		ExtendedAnswer xAnswer = new ExtendedAnswer();
		boolean hasLambdas = false;
		
		for (IPolynomialTerm t : this)
		{
			if (t instanceof Variable)
			{
				throw new InvalidTermException();
			}
			else if (t instanceof Answer)
			{
				if (((Answer) t).Identifier().equals(AnswerIdentifier.Lambda()))
				{
					hasLambdas = true;
				}
				else
				{
					xAnswer.add(t);
				}
			}
			else
			{
				xAnswer.add(t);
			}
		}
		
		if (xAnswer.isEmpty() && hasLambdas)
		{
			xAnswer.add(new Answer(AnswerIdentifier.Lambda()));
		}
		
		return xAnswer;
	}

	/**
	 * IResolvable method - resolves any variables in the Polynomial to their bound terms
	 */
	public Polynomial resolve(VariableSet vars) throws VariableNotBoundException, VariableNotFoundException
	{
		Polynomial resolvedPolynomial = new Polynomial();
		
		for (IPolynomialTerm t : this)
		{
			if (t instanceof Variable)
			{
				if (!vars.containsKey(t))
				{
					throw new VariableNotFoundException();
				}
				else
				{
					Polynomial p = vars.get(t);
					
					if (p.Empty())
					{
						throw new VariableNotBoundException();
					}
					else
					{
						resolvedPolynomial.addAll(p.resolve(vars));
					}
				}
			}
			else
			{
				resolvedPolynomial.add((IPolynomialTerm) ((IResolvable) t).resolve(vars));
			}
		}
		
		return resolvedPolynomial;
	}
	
	/**
	 * Indicates whether this polynomial contains any terms or not
	 */
	public boolean Empty()
	{
		return (this.size() == 0);
	}
	
	/**
	 * Overload method to check the equality of polynomials.
	 * This method performs an pair-wise equality check on each of the elements of the two polynomials
	 */
	public boolean equals(Polynomial p)
	{
		// First check the lengths
		if (this.size() != p.size())
		{
			return false;
		}
		
		for (int i = 0; i < this.size(); i++)
		{
			IPolynomialTerm t1 = this.get(i);
			IPolynomialTerm t2 = p.get(i);
			
			if      ((t1 instanceof Variable) && (t2 instanceof Variable))
			{
				if (!((Variable) t1).equals((Variable) t2))
				{
					return false;
				}
			}
			else if ((t1 instanceof Answer) && (t2 instanceof Answer))
			{
				if (!((Answer) t1).equals((Answer) t2))
				{
					return false;
				}
			}
			else if ((t1 instanceof Query) && (t2 instanceof Query))
			{
				if (!((Query) t1).equals((Query) t2))
				{
					return false;
				}
			}
			
			// Otherwise, the two terms are not of the same type, so the polynomials are not equal
			else
			{
				return false;
			}
		}
		
		// If we get here, then all the elements of this polynomial are equal, ergo so is the polynomial
		return true;
	}
	
	
	/**
	 * Overridden method to return a string representation of this polynomial
	 */
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		
		for (IPolynomialTerm t : this)
		{
			if ((sb.length() > 0) && !(t instanceof Answer && ((Answer) t).Identifier().Terminal()))
			{
				sb.append(" ");
			}
			sb.append(t.toString());
		}
		
		return sb.toString();
	}
	
}
