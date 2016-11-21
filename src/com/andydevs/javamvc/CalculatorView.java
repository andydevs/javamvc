/**
 * This is a simple program written in Java that demonstrates the Model-View-Controller (MVC) application design pattern.
 *
 * @author  Anshul Kharbanda
 * @version 1.0.0
 */
package com.andydevs.javamvc;

// Imports
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.andydevs.javamvc.CalculatorController;

/**
 * This is the View component of the MVC application.
 * It displays information to the user and handles user inputs.
 * In this app, the View retrieves the input and Operation data 
 * from the user, and displays the output
 *
 * @author  Anshul Kharbanda
 * @version 1.0.0
 */
public class CalculatorView extends JFrame
{
	// -------------------------- SWING COMPONENTS --------------------------

	/**
	 * Handles inputting the A value
	 */
	private JTextField a;

	/**
	 * Handles inputting the B value
	 */
	private JTextField b;

	/**
	 * Handles inputting the oper value
	 */
	private JComboBox oper;

	/**
	 * Handles displaying the output
	 */
	private JLabel x;

	/**
	 * Executes when pressed
	 */
	private JButton exe;

	// ----------------------------- CONTROLLER -----------------------------

	/**
	 * The controller for the view
	 */
	private CalculatorController controller;

	// ---------------------------- CONSTRUCTOR -----------------------------

	/**
	 * Creates a Calculator view
	 */
	public CalculatorView() 
	{
		// Initialize Frame
		super("Calculator!");
		setSize(325,125);
		setLayout(new FlowLayout());
		addWindowListener(new CloseWindowAdapter());

		// Config Input and Output Fields
		a = new JTextField();
		b = new JTextField();
		x = new JLabel("Output: " + 0);

		// Config execute operation
		exe = new JButton("Execute");
		exe.addActionListener(new ExecuteActionListener());

		// Configure Combo Box
		DefaultComboBoxModel operations = new DefaultComboBoxModel();
		operations.addElement(CalculatorModel.Operation.ADD);
		operations.addElement(CalculatorModel.Operation.SUBTRACT);
		operations.addElement(CalculatorModel.Operation.MULTIPLY);
		operations.addElement(CalculatorModel.Operation.DIVIDE);
		oper = new JComboBox(operations);
		oper.setSelectedIndex(0);

		// Add Elements to frame
		add(a); add(b);
		add(oper); add(exe);
		add(x);

		// Set Visibility
		setVisible(true);

		// Set controller
		controller = new CalculatorController();
	}

	// ---------------------------- OPERATIONS ------------------------------

	/**
	 * Sets the output of the View
	 *
	 * @param val the output of the View
	 */
	public void setOutput(String val)
	{
		x.setText("Output: " + val);
	}

	/**
	 * Returns the A value
	 *
	 * @return the A value
	 *
	 * @throws Exception if number is parsed incorrectly
	 */
	public int getA() throws Exception
	{
		if (a.getText().equals(null) || a.getText().equals("")) return 0;
		else return Integer.parseInt(a.getText());
	}

	/**
	 * Returns the B value
	 *
	 * @return the B value
	 *
	 * @throws Exception if number is parsed incorrectly
	 */
	public int getB() throws Exception
	{
		if (b.getText().equals(null) || b.getText().equals("")) return 0;
		else return Integer.parseInt(b.getText());
	}

	/**
	 * Returns the selected operation
	 *
	 * @return the selected operation
	 */
	public CalculatorModel.Operation getOper()
	{
		return (CalculatorModel.Operation)oper.getSelectedItem();
	}

	// -------------------------- EVENT LISTENERS ---------------------------

	/**
	 * Handels the exiting of the program
	 * 
	 * @author  Anshul Kharbanda
	 * @created 11 - 20 - 2016
	 */
	private class CloseWindowAdapter extends WindowAdapter 
	{
		/**
		 * Exits the program when the window closes
		 *
		 * @param windowEvent the event that triggered the window close
		 */
		public void windowClosing(WindowEvent windowEvent) 
		{
			System.exit(0);
		}
	}

	/**
	 * Handles running execute function in controller
	 *
	 * @author  Anshul Kharbanda
	 * @created 11 - 21 - 2016
	 */
	private class ExecuteActionListener implements ActionListener
	{
		/**
		 * Runs execute
		 *
		 * @param event the action event called
		 */
		public void actionPerformed(ActionEvent event)
		{
			try
			{
				setOutput(String.valueOf(controller.execute(getA(), getB(), getOper())));
			}
			catch(Exception e)
			{
				setOutput("ERROR");
			}
		}
	}
}