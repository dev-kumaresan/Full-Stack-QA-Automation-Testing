package aiite.smalltasks;

import java.util.Scanner;

public class DiscountProgramme {
	int age, time;

	public static void main(String[] args) {

		DiscountProgramme dp = new DiscountProgramme();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Age : ");
		dp.age = input.nextInt();
		System.out.println("Enter time : ");
		dp.time = input.nextInt();
		if (dp.age > 60) {
			if (dp.time >= 2) // 2pm
			{
				if (dp.time <= 5) // 5pm
				{
					System.out.println("10% discount is applied !");
				} else {
					System.out.println("No discount applied !");
				}
			} 
			else {
				System.out.println("No discount applied !");
			}
		} 
		else {
			System.out.println("No discount applied !");
		}
	}

}
