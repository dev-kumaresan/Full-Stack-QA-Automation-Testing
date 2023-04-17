package task.scanner.getdetails;

import java.util.Scanner;

public class StudentDetailss {

	public static void main(String[] args) {

		String studentName, studentEmail, studentDept, studentGender, studentCity;
		int studentID;
		long studentPhoneno;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Student ID : ");
		studentID = s.nextInt();
		System.out.println("Enter Student Name : ");
		studentName = s.next();
		System.out.println("Enter Student Email : ");
		studentEmail = s.next();
		System.out.println("Enter Student Phone no : ");
		studentPhoneno = s.nextLong();
		System.out.println("Enter Student Dept  : ");
		studentDept = s.next();
		System.out.println("Enter Student Gender (Male / Female) : ");
		studentGender = s.next();
		System.out.println("Enter Student City : ");
		studentCity = s.next();

		System.out.println("The Student Id is : " + studentID);
		System.out.println("The Student Name is : " + studentName);
		System.out.println("The Student Email is : " + studentEmail);
		System.out.println("The Student Phone no is : " + studentPhoneno);
		System.out.println("The Student Dept is : " + studentDept);
		System.out.println("The Student Gender is : " + studentGender);
		System.out.println("The Student City is : " + studentCity);
	}

}
