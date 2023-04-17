package org.edu;

public class Education extends Medicine {

	public void ug() {
		System.out.println("UG courses");
	}

	public void pg() {
		System.out.println("PG courses currently hidden !");
	}

	public static void main(String[] args) {
		Education E = new Education();
		E.pg();
		E.ug();
		E.bsc();
		E.bEd();
		E.bA();
		E.bBA();
		E.bE();
		E.bTech();
		E.physio();
		E.dental();
		E.mbbs();
	}

}
