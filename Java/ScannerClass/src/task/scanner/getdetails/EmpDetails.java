package task.scanner.getdetails;

import java.util.Scanner;

public class EmpDetails {

	public static void main(String[] args) {
		int empId, empSalary;
		String empName, empEmail, empGender, empCity;
		long empPhoneNo;

		Scanner gd = new Scanner(System.in);

		System.out.println("Enter employee id : ");
		empId = gd.nextInt();
		System.out.println("Enter employee Name : ");
		empName = gd.next();
		System.out.println("Enter employee Email : ");
		empEmail = gd.next();
		System.out.println("Enter employee Phone No : ");
		empPhoneNo = gd.nextLong();
		System.out.println("Enter employee salary : ");
		empSalary = gd.nextInt();
		System.out.println("Enter employee gender (male / female : ");
		empGender = gd.next();
		System.out.println("Enter employee city : ");
		empCity = gd.next();

		System.out.println("Employee id is : " + empId);
		System.out.println("Employee name is : " + empName);
		System.out.println("Employee Email is : " + empEmail);
		System.out.println("Employee Phone No is : " + empPhoneNo);
		System.out.println("Employee salary is : " + empSalary);
		System.out.println("Employee gender is : " + empGender);
		System.out.println("Employee city is : " + empCity);

	}

}
