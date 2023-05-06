package task.programs;

import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {

		Scanner getnumber = new Scanner(System.in);
		System.out.println("Enter a number to find odd/even :- ");
		int number = getnumber.nextInt();
		if (number % 2 == 0) {
			System.out.println("Your number is even");
		} else {
			System.out.println("Your number is odd");
		}
	}

}
