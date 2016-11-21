/**
 * This is a simple program written in Java that demonstrates the Model-View-Controller (MVC) application design pattern.
 *
 * @author  Anshul Kharbanda
 * @version 1.0.0
 */
package com.andydevs.javamvc;

// Imports
import com.andydevs.javamvc.CalculatorModel;

/**
 * This is the Controller component of the MVC application.
 * It defines the commands which manipulate the Model and 
 * are called by the View. In this application, the Controller
 * contains one execute command which performs a Model operation
 * with the given data.
 *
 * @author  Anshul Kharbanda
 * @version 1.0.0
 */
public class CalculatorController
{
	/**
	 * The model being accessed
	 */
	private CalculatorModel model;

	/**
	 * Creates a CalculatorController
	 */
	public CalculatorController()
	{
		model = new CalculatorModel();
	}

	/**
	 * Executes a calculate command with the given arguments
	 *
	 * @param a    the first input
	 * @param b    the second input
	 * @param oper the operation
	 *
	 * @return the output of the calculate command
	 */
	public int execute(int a, int b, CalculatorModel.Operation oper)
	{
		model.setA(a);
		model.setB(b);
		model.setOper(oper);
		return model.getResult();
	}
}