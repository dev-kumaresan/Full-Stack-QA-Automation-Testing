package task.scanner.getdetails;

import java.util.Scanner;

public class StudentDetails {
		public static void main(String[] args) {

		String studentId, studentName;
		int Mark1, Mark2, Mark3, Mark4, Mark5, total;
		double average;

		Scanner gd = new Scanner(System.in);

		System.out.println("Enter Student Id : ");
		studentId = gd.next();
		System.out.println("Enter Student Name : ");
		studentName = gd.next();

		System.out.println("Enter Mark1");
		Mark1 = gd.nextInt();
		System.out.println("Enter Mark2");
		Mark2 = gd.nextInt();
		System.out.println("Enter Mark3");
		Mark3 = gd.nextInt();
		System.out.println("Enter Mark4");
		Mark4 = gd.nextInt();
		System.out.println("Enter Mark5");
		Mark5 = gd.nextInt();
		
		total = Mark1 + Mark2 + Mark3 + Mark4 + Mark5;
		average = total / 5.0;

		System.out.println("Student ID : " + studentId);
		System.out.println("Student Name : " + studentName);
		System.out.println("Mark1 : " + Mark1);
		System.out.println("Mark2 : " + Mark2);
		System.out.println("Mark3 : " + Mark3);
		System.out.println("Mark4 : " + Mark4);
		System.out.println("Mark5 : " + Mark5);
		System.out.println("Total : " + total);
		System.out.println("Average : " + average);

	}

}
