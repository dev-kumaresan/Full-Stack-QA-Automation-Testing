package tasks.abstraction;

public class StudentMarks extends AbstractClassExample {

	public void studentMarkDetails() {
		System.out.println("Total : 394/500 in 10th class");
		System.out.println(AbstractClassExample.b = 11); // inherit static variable and print
		System.out.println(a + 10); // inherit final variable and modify the value
		System.out.println(f); // protected variable print
	}

	public void studentAddress() {
		System.out.println("City : Pudukkottai");
	}

	public static void main(String[] args) {
		StudentMarks SM = new StudentMarks();
		SM.studentDetails();
		SM.studentMarkDetails();
		SM.studentAddress();
		SM.stud2(); // calling interface A here
		SM.stud3(); // calling interface B here
		SM.DefaultOverride(); // default method override

	}

}
