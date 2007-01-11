package rnsr.rag.grammar.exception;

public	class	InvalidTermException
		extends	Exception
{
	/**
	 * Default Constructor
	 */
	public InvalidTermException() { super(); }
	
	/**
	 * Constructs a new exception object with the specified error message
	 */
	public InvalidTermException(String message) { super(message); }
	
	/**
	 * Constructs a new exception object with the specified cause
	 */
	public InvalidTermException(Throwable cause) { super(cause); }
	
	/**
	 * Constructs a new exception object with the specified error message and cause
	 */
	public InvalidTermException(String message, Throwable cause) { super(message, cause); }
}
