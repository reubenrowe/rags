package rnsr.rag.grammar.exception;

public	class		VariableNotBoundException
		extends		Exception
{
	/**
	 * Default Constructor
	 */
	public VariableNotBoundException() { super(); }
	
	/**
	 * Constructs a new exception object with the specified error message
	 */
	public VariableNotBoundException(String message) { super(message); }

	/**
	 * Constructs a new exception object with the specified cause
	 */
	public VariableNotBoundException(Throwable cause) { super(cause); }
	
	/**
	 * Constructs a new exception object with the specified error message and cause
	 */
	public VariableNotBoundException(String message, Throwable cause) { super(message, cause); }
}
