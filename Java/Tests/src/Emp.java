
public class Emp {
	int a;
	static int b;

	public void fun1() {
		System.out.println("This is fun1");
		
	}

	public static void fun2() {
		System.out.println("This is fun2");
	}

	public static void main(String[] args) {
		Emp E = new Emp();
		E.a = 10;
		System.out.println(E.a);
		b = 20;
		System.out.println(b);
		E.fun1();
		fun2();

	}

}
