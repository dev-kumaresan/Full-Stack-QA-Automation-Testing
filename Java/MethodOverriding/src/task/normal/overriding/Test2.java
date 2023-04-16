package task.normal.overriding;

public class Test2 extends NormalOverridingTest {
	public static void methodOne() {
		this.methodOne();
		System.out.println("Method two");
	}

	public static void main(String[] args) {
		Test2.methodOne();

	}

}
