package rnsr.rag.grammar.exception;

public	class		VariableNotFoundException
		extends		Exception
{

	/**
	 * Default Constructor
	 */
	public VariableNotFoundException() { super(); }
	
	/**
	 * Constructs a new exception object with the specified error message
	 */
	public VariableNotFoundException(String message) { super(message); }
	
	/**
	 * Constructs a new exception object with the specified cause
	 */
	public VariableNotFoundException(Throwable cause) { super(cause); }
	
	/**
	 * Constructs a new exception object with the specified error message and cause
	 */
	public VariableNotFoundException(String message, Throwable cause) { super(message, cause); }
}
