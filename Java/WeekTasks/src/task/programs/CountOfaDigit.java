package task.programs;

import java.util.Scanner;

public class CountOfaDigit {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number :- ");
		long digit = s.nextLong();
		int count = 0;
		while (digit > 0) {
			digit = digit / 10;
			count++;
		}
		System.out.println("The given number count is : " + count);

	}

}
