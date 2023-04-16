package task.normal.overriding;

public class Test2 extends NormalOverridingTest {
	public void methodOne() {
		super.methodOne();
		System.out.println("Method two");
	}

	public static void main(String[] args) {
		Test2 t = new Test2();
		t.methodOne();

	}

}
