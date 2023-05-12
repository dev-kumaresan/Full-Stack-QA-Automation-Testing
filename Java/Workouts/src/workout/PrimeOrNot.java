package workout;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = input.nextInt();
		boolean isPrime = false;
		for (int i = 2; i <= number / 2; ++i) {
			if (number % i == 0) {
				isPrime = true;
				break;
			}
		}
		if (!isPrime) {
			System.out.println(number + " is a prime");
		} else {
			System.out.println(number + " is not prime");
		}

	}

}
