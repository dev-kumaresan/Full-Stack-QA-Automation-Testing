package aiite.smalltasks;

public class MultipleExc {

	public static void main(String[] args) {
		try
		{
			String name = "Kumaresan";
			System.out.println(name.charAt(10));
			
			int a=100,b=0;
			System.out.println(a/b);
		}
//		catch(ArithmeticException | StringIndexOutOfBoundsException e)
//		{
//			System.out.println(e.getMessage());
//		}
		catch(ArithmeticException e1)
		{
			System.out.println(e1.getMessage());
		}
		catch(StringIndexOutOfBoundsException e2)
		
		{
			System.out.println(e2.getMessage());
		}

	}

}
