package rnsr.rag.parser.exception;

/**
 * Represents a general Parsing exception
 */
public	class		ParseException
		extends		Exception
{

	/**
	 * Default Constructor
	 */
	public ParseException() { super(); }
	
	/**
	 * Constructs a new exception object with the specified error message
	 */
	public ParseException(String message) { super(message); }
	
	/**
	 * Constructs a new exception object with the specified cause
	 */
	public ParseException(Throwable cause) { super(cause); }
	
	/**
	 * Constructs a new exception object with the specified error message and cause
	 */
	public ParseException(String message, Throwable cause) { super(message, cause); }
}
