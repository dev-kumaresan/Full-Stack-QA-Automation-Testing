package workout;

public class Sample {
	private Sample(int a, int b) {
		int c, d;
		c = a + b;
		System.out.println(c);
	}

	private Sample() {
		this(1, 2);
		System.out.println("This is constructor with private");
	}

	public static void main(String[] args) {
		Sample ob = new Sample();

	}

}
