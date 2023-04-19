package org.phone;

public class Phone {

	public void phoneInfo() {
		System.out.println("Display Phone Details :- ");
	}

	public void phoneInfo(String PhoneName) {
		System.out.println("Brand Name : " + PhoneName);
	}

	public void phoneInfo(double PhoneVersion) {
		System.out.println("Brand Version : " + PhoneVersion);
	}

	public void phoneInfo(int Launch_year) {
		System.out.println("The Phone Launched in : " + Launch_year);
	}

	public static void main(String[] args) {
		Phone P = new Phone();
		P.phoneInfo();
		P.phoneInfo("Nokia");
		P.phoneInfo(8.3);
		P.phoneInfo(2020);
	}

}
