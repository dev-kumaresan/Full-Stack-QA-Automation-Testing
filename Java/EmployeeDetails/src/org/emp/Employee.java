package org.emp;

public class Employee {

	public void empId() {
		System.out.println("Emp Id : 101");
	}

	public void empName() {
		System.out.println("Emp Name : Kumaresan L");
	}

	public void empDOB() {
		System.out.println("Emp DOB : 13.10.1998");
	}

	public void empPhone() {
		System.out.println("Emp Phone : 8610450571");
	}

	public void empEmail() {
		System.out.println("Emp Email : dev.kumaresanl@gmail.com");
	}

	public void empAddress() {
		System.out.println("Emp Address : Alangudi,pudukkottai");
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.empId();
		e.empName();
		e.empDOB();
		e.empPhone();
		e.empEmail();
		e.empAddress();

	}

}
