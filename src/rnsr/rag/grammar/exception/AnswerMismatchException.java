package rnsr.rag.grammar.exception;

public	class	AnswerMismatchException
		extends	Exception
{
	/**
	 * Default Constructor
	 */
	public AnswerMismatchException() { super(); }
	
	/**
	 * Constructs a new exception object with the specified error message
	 */
	public AnswerMismatchException(String message) { super(message); }

	/**
	 * Constructs a new exception object with the specified cause
	 */
	public AnswerMismatchException(Throwable cause) { super(cause); }
	
	/**
	 * Constructs a new exception object with the specified error message and cause
	 */
	public AnswerMismatchException(String message, Throwable cause) { super(message, cause); }
}
