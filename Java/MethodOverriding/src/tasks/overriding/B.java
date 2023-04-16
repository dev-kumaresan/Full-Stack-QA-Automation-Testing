package tasks.overriding;

public class B extends A {

	public  static void areasInChennai() {

		System.out.println("Areas in Chennai Starts with 'B' ");

		System.out.println("Besant Nagar");
		System.out.println("Basin Bridge");
		System.out.println("Beemannapettai");
		
	}

	public static void main(String[] args) {
		
		B.areasInChennai();
		A.areasInChennai();
		

	}

}
