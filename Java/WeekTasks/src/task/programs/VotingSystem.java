package task.programs;

import java.util.Scanner;

public class VotingSystem {

	public static void main(String[] args) {
		Scanner getage = new Scanner(System.in);
		System.out.println("Enter age for vote :- ");
		int voters_age = getage.nextInt();
		if (voters_age >= 18) {
			System.out.println("You are eligible to vote *");
		} else {
			System.out.println("You are not eligible to vote");
		}
	}
}
