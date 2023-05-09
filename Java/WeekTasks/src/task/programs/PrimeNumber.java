package task.programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number :- ");
		int num = s.nextInt();
	    boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) {
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	    {
	      System.out.println(num + " is a prime number.");
	    }
	    else {
	      System.out.println(num + " is not a prime number.");
	    }
	  

	}

}
