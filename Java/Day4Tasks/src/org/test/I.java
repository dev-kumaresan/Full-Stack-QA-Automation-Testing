package org.test;

public class I extends H {
	public I() {
		super(12);
		System.out.println("Default const...");
	}

	public static void main(String[] args) {
		I a = new I();
	}

}


