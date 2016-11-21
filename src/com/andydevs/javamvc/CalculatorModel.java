/**
 * This is a simple program written in Java that demonstrates the Model-View-Controller (MVC) application design pattern.
 *
 * @author  Anshul Kharbanda
 * @version 1.0.0
 */
package com.andydevs.javamvc;

/**
 * This is the Model component of the MVC application.
 * the model handles storage and retrieval of data, as well
 * as data operations. In this app, the model stores integer
 * data and implements the calculator operations.
 *
 * @author  Anshul Kharbanda
 * @version 1.0.0
 */
public class CalculatorModel
{
	/**
	 * Operations available to the calculator
	 */
	public static enum Operation
	{ ADD, SUBTRACT, MULTIPLY, DIVIDE; }

	/**
	 * The a value
	 */
	private int a;

	/**
	 * The b value
	 */
	private int b;

	/**
	 * The set operation
	 */
	private Operation oper;

	/**
	 * Sets the a value
	 *
	 * @param v the value of a to set
	 */
	public void setA(int v) { a = v; }

	/**
	 * Sets the b value
	 *
	 * @param v the value of b to set
	 */
	public void setB(int v) { b = v; }

	/**
	 * Sets the operation
	 *
	 * @param v the operation to set
	 */
	public void setOper(Operation v) { oper = v; }

	/**
	 * Returns the result of the operation on a and b
	 *
	 * @return the result of the operation on a and b
	 */ 
	public int getResult()
	{
		switch (oper)
		{
			case ADD:      return a + b;
			case SUBTRACT: return a - b;
			case MULTIPLY: return a * b;
			case DIVIDE:   return a / b;
			default:       return 0;
		}
	}
}