package rnsr.rag.grammar;

/**
 * Identifies a (Terminal) Answer
 */
public class AnswerIdentifier
{
	
	// Value of the empty terminal string, lambda(?)
	private static final String c_LambdaValue = "";
	
	private String m_identifier = null;
	private int m_arity = 0;
	private boolean m_isTerminal = true;
	
	/**
	 * Default Constructor
	 */
	public AnswerIdentifier() { }
	
	/**
	 * Constructs a new Terminal Answer Identifier
	 * @param identifier the terminal value of the answer
	 */
	public AnswerIdentifier(String identifier)
	{
		this.m_identifier = identifier;
	}
	
	/**
	 * Constructs a new Terminal Answer Identifier
	 * @param identifier - The name that identifies this answer
	 * @param arity - The arity of the answer
	 */
	public AnswerIdentifier(String identifier, int arity)
	{
		this.m_identifier = identifier;
		this.m_arity = arity;
		this.m_isTerminal = false;
	}
	
	/**
	 * Returns an Identifier which represents the empty terminal string, lambda(?)
	 */
	public static AnswerIdentifier Lambda()
	{
		return new AnswerIdentifier(c_LambdaValue);
	}
	
	/**
	 * Returns the name which identifies this answer, or the terminal string which this answer represents
	 */
	public String Identifier()
	{
		return this.m_identifier;
	}
	
	
	public int Arity()
	{
		return this.m_arity;
	}
	
	
	public boolean Terminal()
	{
		return this.m_isTerminal;
	}

	public AnswerIdentifier clone() {
		AnswerIdentifier ai = new AnswerIdentifier();
		ai.m_identifier = this.m_identifier;
		ai.m_arity = this.m_arity;
		ai.m_isTerminal = this.m_isTerminal;
		return ai;
	}
	
	public boolean equals(AnswerIdentifier id)
	{
		return (
				id.m_identifier.equals(this.m_identifier) &&
				id.m_arity == this.m_arity &&
				id.m_isTerminal == this.m_isTerminal
			);
	}
	
}
