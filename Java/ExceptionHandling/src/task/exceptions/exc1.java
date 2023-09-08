package task.exceptions;
//exc1.java 

public class exc1 {

	public void divide(int a,int b) throws ArithmeticException
	{
		try
		{
			int c;
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("divide error");
		}
	}

}
