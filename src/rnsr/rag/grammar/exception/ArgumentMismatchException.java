package rnsr.rag.grammar.exception;

public	class		ArgumentMismatchException
		extends		Exception
{
	/**
	 * Default Constructor
	 */
	public ArgumentMismatchException() { super(); }
	
	/**
	 * Constructs a new exception object with the specified error message
	 */
	public ArgumentMismatchException(String message) { super(message); }

	/**
	 * Constructs a new exception object with the specified cause
	 */
	public ArgumentMismatchException(Throwable cause) { super(cause); }
	
	/**
	 * Constructs a new exception object with the specified error message and cause
	 */
	public ArgumentMismatchException(String message, Throwable cause) { super(message, cause); }
}
