package test.inheritance.problem1;

public class B extends A {

	public void compute() {
		System.out.println(c);
	}

	public static void main(String[] args) {

		B b = new B();
		b.add();
		b.compute();
		b.same();
		A a = new A();
		a.same();
	}

	public void same() {
		System.out.println("Method in class B");
	}

}
