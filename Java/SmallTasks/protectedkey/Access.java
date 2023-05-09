package tasks.protectedkey;

public class Access extends Protected {

	public void numberPrint() {
		System.out.println(a);
	}

	public static void main(String[] args) {

		Access a = new Access();
		a.numberPrint();
	}

}
