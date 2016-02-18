package ctec.controller;

import ctec.model.RecursionTool;
import ctec.view.RecursionFrame;

public class RecursionController 
{
	private RecursionTool mathTool;
	private RecursionFrame baseFrame;
	private String calculatedValue;
	
	public RecursionController()
	{
		mathTool = new RecursionTool();
		baseFrame = new RecursionFrame(this);
	}
	

	public void start() 
	{
		calculatedValue = Double.toString(mathTool.getFibNumber(0));
		
	}
	
	public String getCalculatedValue()
	{
		return calculatedValue;
	}
	
	public String doFibonacci(String inputValue)
	{
		calculatedValue = "The Fibbonaci sequence number of" + inputValue +" is"
				+ Double.toString(mathTool.getFibNumber(Double.parseDouble(inputValue)));
		return calculatedValue;
	}
	
	public String doFactorial(String inputValue)
	{
		calculatedValue = "The factorial sequence number of" + inputValue +" is"
				+ Double.toString(mathTool.getFactorialNumber(Double.parseDouble(inputValue)));
		return calculatedValue;
	}
	

}
