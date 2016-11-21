/**
 * This is a simple program written in Java that demonstrates the Model-View-Controller (MVC) application design pattern.
 *
 * @author  Anshul Kharbanda
 * @version 1.0.0
 */
package com.andydevs.javamvc;

// Imports
import com.andydevs.javamvc.CalculatorController;

/**
 * Runs the calculator program
 *
 * @author  Anshul Kharbanda
 * @version 1.0.0
 */
public class Main 
{
	/**
	 * The main method of the program
	 *
	 * @param args the command line arguments
	 */
	public static void main(String[] args) { new CalculatorView(); }
}