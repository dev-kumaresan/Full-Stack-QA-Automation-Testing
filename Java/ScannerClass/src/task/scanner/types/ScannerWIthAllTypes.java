package task.scanner.types;

import java.util.Scanner;

public class ScannerWIthAllTypes {

	public static void main(String[] args) {
		String name, full_name;
		int age;
		char gender;
		float percentage;
		long aadhar;
		double mark;
		short ref_no;
		byte batch_no;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Name : ");
		name = s.next();
		s.nextLine();
		System.out.println("Enter your full name (with initial) : ");
		full_name = s.nextLine();
		System.out.println("Enter Your Age : ");
		age = s.nextInt();
//		System.out.println("Enter Your Gender");
//		gender = s.nextChar();
		System.out.println("Enter your percentage : ");
		percentage = s.nextFloat();
		System.out.println("Enter your aadhar no : ");
		aadhar = s.nextLong();
		System.out.println("Enter your mark : ");
		mark = s.nextDouble();
		System.out.println("Enter your ref no : ");
		ref_no = s.nextShort();
		System.out.println("Enter your batch no : ");
		batch_no = s.nextByte();

		System.out.println("Your name is : " + name);
		System.out.println("Your full name is : " + full_name);
		s.nextLine();
		System.out.println("Your age is : " + age);
//        System.out.println("Your Gender is : "+gender);
		System.out.println("Your Percentage is : " + percentage);
		System.out.println("Your aadhar is : " + aadhar);
		System.out.println("Your mark is : " + mark);
		System.out.println("Your ref no is : " + ref_no);
		System.out.println("Your batch bo is : " + batch_no);

	}

}
