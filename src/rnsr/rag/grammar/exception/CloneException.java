package rnsr.rag.grammar.exception;

public	class	CloneException
		extends	Exception
{

	/**
	 * Default Constructor
	 */
	public CloneException() { super(); }
	
	/**
	 * Constructs a new exception object with the specified error message
	 */
	public CloneException(String message) { super(message); }
	
	/**
	 * Constructs a new exception object with the specified cause
	 */
	public CloneException(Throwable cause) { super(cause); }
	
	/**
	 * Constructs a new exception object with the specified error message and cause
	 */
	public CloneException(String message, Throwable cause) { super(message, cause); }
}
