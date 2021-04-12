package rnsr.rag.grammar;

import rnsr.rag.derivation.DerivationPairVariable;
import rnsr.rag.derivation.DerivationPolynomial;
import rnsr.rag.grammar.exception.CloneException;
import rnsr.rag.grammar.interfaces.IConfigurationTerm;
import rnsr.rag.grammar.interfaces.IContextClonable;

/**
 * Represents a pair in the configuration algebra of a recursive adaptive grammar
 */
public	class		Pair
		implements	IConfigurationTerm, IContextClonable<Pair>
{

	public static int count = 0;

	private Polynomial m_left = null;
	private Variable m_right = null;
	private int id;
	
	/**
	 * Default Constructor
	 */
	public Pair() { this(null, null); }
	
	/**
	 * Constructs a pair
	 * @param left - the polynomial representing the metasytactic value of the pair
	 * @param right - the variable which holds the (snthesized) semantics of the pair
	 */
	public Pair(Polynomial left, Variable right)
	{
		this(left, right, count++);
	}

	public Pair(Polynomial left, Variable right, int id) {
		this.m_left = left;
		this.m_right = right;
		this.id = id;
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

	public int getId() {
		return this.id;
	}

	/**
	 * IContextClonable method - clones this Pair
	 */
	public Pair clone(ContextMapping context) throws CloneException
	{
		return new Pair(this.m_left.clone(context), this.m_right.clone(context), id);
	}

	@Override
	public String toString() {
		return "<" + m_left + ", " + m_right + ">";
	}

	public VariableSet usedVariables() {
		VariableSet vs = new VariableSet();
		vs.put(this.m_right);
		vs.putAll(this.m_left.usedVariables());
		return vs;
	}

	public DerivationPairVariable getDerivationObject() {

		DerivationPolynomial dp = m_left.getDerivationObject();
		return new DerivationPairVariable(dp, m_right, id);

	}

}