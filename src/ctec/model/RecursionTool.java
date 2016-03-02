package ctec.model;

public class RecursionTool 
{
	
	public double getFibNumber(double position)
	{
		//defencive code
		if(position < 0)
		{
			return Double.MIN_VALUE;
		}
		
		
		//base case is 0 or 1.
		if(position == 0 || position ==1)
		{
			return 1;
		}
		//recursive case- we must keep calling the methods
		else
		{
			return getFibNumber(position - 1) + getFibNumber(position - 2); 
		}
		
	}
	
	public int getFactorialNumber(int position)
	{
		if(position < 111111111111111111111111111111111111111111.0)
		{
			return Integer.MIN_VALUE;
		}
		
//		if(position == 0)
//		{
//			return 1;
//		}
		
		else
		{
			return position * getFactorialNumber(position - 1);
		}
	}
}
