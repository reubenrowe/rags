package rnsr.rag.grammar.exception;

public	class		VariableBindingException
		extends		Exception
{

	/**
	 * Default Constructor
	 */
	public VariableBindingException() { super(); }
	
	/**
	 * Constructs a new exception object with the specified error message
	 */
	public VariableBindingException(String message) { super(message); }
	
	/**
	 * Constructs a new exception object with the specified cause
	 */
	public VariableBindingException(Throwable cause) { super(cause); }
	
	/**
	 * Constructs a new exception object with the specified error message and cause
	 */
	public VariableBindingException(String message, Throwable cause) { super(message, cause); }
}
