package rnsr.rag.grammar.exception;

public	class UnificationLambdaException
		extends	Exception
{
	/**
	 * Default Constructor
	 */
	public UnificationLambdaException() { super(); }

	/**
	 * Constructs a new exception object with the specified error message
	 */
	public UnificationLambdaException(String message) { super(message); }

	/**
	 * Constructs a new exception object with the specified cause
	 */
	public UnificationLambdaException(Throwable cause) { super(cause); }

	/**
	 * Constructs a new exception object with the specified error message and cause
	 */
	public UnificationLambdaException(String message, Throwable cause) { super(message, cause); }
}
