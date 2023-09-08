package task.exceptions;
import java.util.Scanner;

public class ex4 {

	public static void main(String [] args) {
		try {	int voters_age;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter voters age : ");
		voters_age = s.nextInt();
			if(voters_age >= 18)
			{
				System.out.println("Valid to vote");
			}
			else
			{
				throw new Throwable("Voters not valid");
			}
		}
		catch(Throwable e)
			
		{
			e.printStackTrace();
			
			
		}
	}

}