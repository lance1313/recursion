package ctec.view;

import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;

import ctec.controller.RecursionController;

public class RecursionPanel extends JPanel
{
	private RecursionController baseController;
	private JButton fibonacciButton;
	private JButton factorialButton;
	private JTextField inputField;
	private JTextArea displayArea;
	private SpringLayout baseLayout;
	
	public RecursionPanel(RecursionController baseController)
	{
		this.baseController= baseController;
		baseLayout = new SpringLayout();
		fibonacciButton = new JButton("Get fib sequence for this number.");
		
		factorialButton = new JButton("Get N");
		
	
		inputField = new JTextField(20);
		
		
		displayArea = new JTextArea(10,20);
		
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(fibonacciButton);
		this.add(displayArea);
		this.add(factorialButton);
		this.add(inputField);
		this.setBackground(Color.BLUE);
		displayArea.setWrapStyleWord(true);
		displayArea.setLineWrap(true);
		displayArea.setEditable(false);
		displayArea.setText(baseController.getCalculatedValue());
		
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, fibonacciButton, 65, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, factorialButton, 178, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, factorialButton, 6, SpringLayout.SOUTH, displayArea);
		baseLayout.putConstraint(SpringLayout.WEST, inputField, 0, SpringLayout.WEST, fibonacciButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, inputField, -6, SpringLayout.NORTH, fibonacciButton);
		baseLayout.putConstraint(SpringLayout.WEST, fibonacciButton, 97, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, displayArea, 6, SpringLayout.SOUTH, fibonacciButton);
		baseLayout.putConstraint(SpringLayout.WEST, displayArea, 50, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, displayArea, -50, SpringLayout.EAST, this);
		
	}
	
	private void setupListeners()
	{
		fibonacciButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent click)
			{
				String userInput = inputField.getText();
				if(checkInput(userInput))
				{
					displayArea.setText(baseController.doFibonacci(userInput));
				}
				
			}
		});
		
		factorialButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String userInput = inputField.getText();
				if(checkInput(userInput))
				{
					displayArea.append(baseController.doFactorial(userInput));
				}
			}
			
			
		});
		
	}
	
	private boolean checkInput(String input)
	{
		boolean isNumber = false;
		
		try
		{
			Double.parseDouble(input);
			isNumber = true;
		}
		catch(Exception numberException)
		{
			displayArea.setText("Typ in a number.");
			
		}
		return isNumber;
		
	}
	

}
