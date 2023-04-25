package org.univ;

public class College extends University {

	public void ug() {
		System.out.println("This is ug method in college class");
	}

	public void pg() {
		System.out.println("This is pg method in college class");

	}

	public static void main(String[] args) {
		College C = new College();
		C.ug();
		C.pg();
		University U = new University();
		U.ug();
		U.pg();
	}

}
