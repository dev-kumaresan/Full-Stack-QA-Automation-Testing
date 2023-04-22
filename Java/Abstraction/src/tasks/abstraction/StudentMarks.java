package tasks.abstraction;

public class StudentMarks extends AbstractClassExample {
	public void studentMarkDetails() {
		System.out.println("Total : 394/500 in 10th class");
	}

	public void studentAddress() {
		System.out.println("City : Pudukkottai");
	}

	public static void main(String[] args) {
		StudentMarks SM = new StudentMarks();
		SM.studentDetails();
		SM.studentMarkDetails();
		SM.studentAddress();

	}

}
