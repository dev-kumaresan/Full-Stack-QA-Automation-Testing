package task.patterns;

public class RATraiangleNumber {

	public static void main(String[] args) {
		int n = 7;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		
		System.out.print("\n");
		int n1 = 5;
		for (int i = 1; i <= n1; i++) {
		for (int j = 1; j <= n1 - i; j++) {
		System.out.print("  ");
		}
		for (int k = 1; k <= i; k++) {
		System.out.print(" *  ");
		}
		System.out.println("");
		}
		
		
		System.out.print("\n");
		int n3 = 5;
	    for (int i = 1; i <= n3; i++) 
	    {
	    for (int j = 1; j <= i; j++) 
	    {
	      System.out.print("* ");
	    }
	    System.out.println();
	    }

	}
}
