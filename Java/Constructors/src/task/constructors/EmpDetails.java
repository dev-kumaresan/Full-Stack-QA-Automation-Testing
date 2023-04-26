package task.constructors;

public class EmpDetails {
	EmpDetails() {
		System.out.println("Display Employee Details :- ");
	}

	EmpDetails(String Emp_name, String Emp_city) {
		this(1234567890l);
		System.out.println("Emp Name : " + Emp_name);
		System.out.println("Emp City : " + Emp_city);
	}

	EmpDetails(long Emp_Phone) {
		this(10000);
		System.out.println("Emp_Phone : " + Emp_Phone);
	}

	EmpDetails(int Emp_salary) {

		System.out.println("Emp_Salary : " + Emp_salary);
	}

	EmpDetails(char Emp_gender) {
		this();
		System.out.println("Emp Gender : " + Emp_gender);

	}

	EmpDetails(double grading_points) {
		System.out.println("Grading Point : " + grading_points); // Update Details in another class using super keyword
	}

	public static void main(String[] args) {
		EmpDetails ED = new EmpDetails('M');
		EmpDetails ED1 = new EmpDetails("Kumaresan", "Pudukkottai");

	}

}
