package tasks.abstraction;

public abstract class AbstractClassExample implements A, B {

	final int a = 5; // final variable
	static int b = 10; // static variable;
	int c, d;
	protected int f = 12; // Protected member
	private int e = 110; // private member

	public abstract void studentMarkDetails(); // ABSTRACT METHOD

	public void stud2() {
		System.out.println("Student2 Name : Gowtham");
		System.out.println(e); // private member print
	}

	public void stud3() {
		System.out.println("Student3 Name : Dinesh ");
	}

	public void studentDetails() { // NON-ABSTRACT METHOD
		System.out.println("Student Name : Kumaresan L");
		System.out.println(a);
		System.out.println(b);
	}
}