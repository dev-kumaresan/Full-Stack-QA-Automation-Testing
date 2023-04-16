package tasks.staticmethod;

public class StaticMethodOverloading {
	public static void userOne() {
		System.out.println("Get the Data for User 1 :- ");
	}

	public static void userOne(String name, int age) {
		System.out.println("User 1 Name is " + name);
		System.out.println("User 1 Age is " + age);
	}

	public static void userOne(double ug_percentage, String qualification) {
		System.out.println("User 1 UG Percentage is : " + ug_percentage);
		System.out.println("User Qualification is : " + qualification);
	}

	public static void main(String[] args) {

		userOne();
		userOne("Kumaresan", 24);
		userOne(74.4, "BCA");
	}

}
