package org.emp;

public class Employee {

	public void empId() {
		System.out.println("Perform empId() in different arguments");
	}

	public void empId(byte year) {
		System.out.println("The Employee id with year : " + year);
	}

	public void empId(String course) {
		System.out.println("The Employee id with course : " + course);
	}

	public void empId(int reg_no) {
		System.out.println("The Employee id with registration no : " + reg_no);
	}

	public static void main(String[] args) {
		Employee E = new Employee();
		E.empId();
		E.empId((byte) 23);
		E.empId("MCA");
		E.empId(105);

	}

}
