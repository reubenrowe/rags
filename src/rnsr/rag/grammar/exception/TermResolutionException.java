package rnsr.rag.grammar.exception;

public	class	TermResolutionException
		extends	Exception
{
	/**
	 * Default Constructor
	 */
	public TermResolutionException() { super(); }
	
	/**
	 * Constructs a new exception object with the specified error message
	 */
	public TermResolutionException(String message) { super(message); }

	/**
	 * Constructs a new exception object with the specified cause
	 */
	public TermResolutionException(Throwable cause) { super(cause); }
	
	/**
	 * Constructs a new exception object with the specified error message and cause
	 */
	public TermResolutionException(String message, Throwable cause) { super(message, cause); }
}
