package task.types;

public class ReturnDataTypes {
	int a = 2, b = 5;
	boolean boo;
	char ch;
	byte by;
	short sh;
	long lo;
	float f = 1.2f, l = 1.3f;
	double d = 45.678, e = 89.728;

	public int integerMethod() {
		int c = a + b;
		System.out.println(c); // first time print
		return c + 10;
	}

	public boolean booMethod() {
		boo = true;
		System.out.println(boo);
		return boo;
	}

	public char chMethod() {
		ch = 'a';
		return ch;
	}

	public byte byMethod() {
		by = 20;
		return by;
	}

	public short shMethod() {
		sh = 8474;
		return sh;
	}

	public long loMethod() {
		lo = 1234567890;
		return lo;
	}

	public float flMethod() {
		float t = f + l;
		return t;
	}

	public double dbMethod() {
		double g = d - e;
		return g;
	}

	public static void main(String[] args) {
		ReturnDataTypes RDT = new ReturnDataTypes(); // int
		RDT.integerMethod();
		System.out.println(RDT.integerMethod()); // print whole method also return statement

		RDT.booMethod();
		System.out.println(RDT.booMethod()); // boolean

		RDT.chMethod();
		System.out.println(RDT.chMethod()); // character

		RDT.byMethod();
		System.out.println(RDT.byMethod()); // byte

		RDT.shMethod();
		System.out.println(RDT.shMethod()); // short

		RDT.loMethod();
		System.out.println(RDT.loMethod()); // long

		RDT.flMethod();
		System.out.println(RDT.flMethod()); // float

		RDT.dbMethod();
		System.out.println(RDT.dbMethod()); // double
	}

}
