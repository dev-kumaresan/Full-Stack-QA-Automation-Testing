package task.types;
public class DefaultDataTypes {

	byte a;
	boolean c;
	char d;
	short e;
	int f;
	long g;
	float h;
	double i;
	String j;
	static int b = 10;

	public void dataTypes() {
		System.out.println(a);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);

	}

	public static void main(String[] args) {

		DefaultDataTypes DDT = new DefaultDataTypes();
		DDT.dataTypes();
		System.out.println(b);

	}

}
