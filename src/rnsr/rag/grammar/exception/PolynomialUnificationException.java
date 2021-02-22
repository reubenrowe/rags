package rnsr.rag.grammar.exception;

public	class PolynomialUnificationException
		extends	Exception
{
	/**
	 * Default Constructor
	 */
	public PolynomialUnificationException() { super(); }

	/**
	 * Constructs a new exception object with the specified error message
	 */
	public PolynomialUnificationException(String message) { super(message); }

	/**
	 * Constructs a new exception object with the specified cause
	 */
	public PolynomialUnificationException(Throwable cause) { super(cause); }

	/**
	 * Constructs a new exception object with the specified error message and cause
	 */
	public PolynomialUnificationException(String message, Throwable cause) { super(message, cause); }
}
