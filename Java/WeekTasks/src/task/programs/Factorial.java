package task.programs;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int fact = 1;
		Scanner get = new Scanner(System.in);
		System.out.println("Input : ");
		int n = get.nextInt();
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println(fact);

	}

}
