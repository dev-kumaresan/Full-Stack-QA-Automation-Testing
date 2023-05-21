package workout;

import java.util.Scanner;

public class SignChanger {

	public void positiveToNegative(int value) {
		if (value < 0) {
			System.err.println("The number must be in positive");
		} else {
			value = value - (value * 2);  // 5-(5*2)
			System.out.println(value);
		}
	}

	public void negativeToPositive(int value) {
		if (value > 0) {
			System.err.println("The number must be in negative");
		} else {
			value = value + (-value * 2);   // -5+(-(-5)*2)
			System.out.println(value);
		}
		
		
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a positive number : ");
		int input1 = s.nextInt();
		SignChanger sc = new SignChanger();
		sc.positiveToNegative(input1);
		System.out.println("Enter a negative number : ");
		int input2 = s.nextInt();
		sc.negativeToPositive(input2);
		 

	}

}
