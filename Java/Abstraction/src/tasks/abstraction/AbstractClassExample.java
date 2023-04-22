package tasks.abstraction;

public abstract class AbstractClassExample {
	final int a = 5; // final variable
	static int b=10; // static variable;
	int c,d;
	public abstract void studentMarkDetails(); // ABSTRACT METHOD

	public void studentDetails() { // NON-ABSTRACT METHOD
		System.out.println("Student Name : Kumaresan L");
		System.out.println(a);
		System.out.println(b);
	}
}
