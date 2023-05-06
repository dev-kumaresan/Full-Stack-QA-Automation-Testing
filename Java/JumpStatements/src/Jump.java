import java.util.Scanner;

public class Jump {

	public void Continue() {
		for (int i = 0; i < 10; i++) {
			if (i == 6)
				continue;
			System.out.println(i);

		}

	}

	public void Break() {
		for (int i = 0; i < 10; i++) {
			if (i == 6)
				break;
			System.out.println(i);

		}

	}

	public static void main(String[] args) {

		Jump J = new Jump();
		int option;
		System.out.println("1.continue");
		System.out.println("2.break");
		System.out.println("Enter Option to perform");
		Scanner s = new Scanner(System.in);
		option = s.nextInt();
		switch (option) {
		case 1:
			J.Continue();
			break;
		case 2:
			J.Break();
			break;
		default:
			System.out.println("Option Wrong !");
		}

	}
}