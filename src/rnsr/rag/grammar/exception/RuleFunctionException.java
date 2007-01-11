package rnsr.rag.grammar.exception;

public	class	RuleFunctionException
		extends	Exception
{
	/**
	 * Default Constructor
	 */
	public RuleFunctionException() { super(); }
	
	/**
	 * Constructs a new exception object with the specified error message
	 */
	public RuleFunctionException(String message) { super(message); }

	/**
	 * Constructs a new exception object with the specified cause
	 */
	public RuleFunctionException(Throwable cause) { super(cause); }
	
	/**
	 * Constructs a new exception object with the specified error message and cause
	 */
	public RuleFunctionException(String message, Throwable cause) { super(message, cause); }
}
