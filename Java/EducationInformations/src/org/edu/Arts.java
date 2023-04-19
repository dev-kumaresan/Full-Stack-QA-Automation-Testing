package org.edu;

public class Arts extends Education {

	public void bSc() {
		
		System.out.println("This is b.sc method in Arts class");
	}

	public void bEd() {
		System.out.println("This is bEd method in Arts class");
	}

	public void bA() {
		System.out.println("This is bA method in Arts class");
	}

	public void bBA() {
		System.out.println("This is bBA method in Arts class");
	}

	public void ug() {
		System.out.println("This is ug method in Arts class");
	}

	public void pg() {
		System.out.println("This is pg method in Arts class");
	}

	public static void main(String[] args) {
		Arts A = new Arts();
		A.bSc();
		A.bEd();
		A.bA();
		A.bBA();
		A.ug();
		A.pg();
		Education ob = new Education();
		ob.ug();
		ob.pg();

	}

}
