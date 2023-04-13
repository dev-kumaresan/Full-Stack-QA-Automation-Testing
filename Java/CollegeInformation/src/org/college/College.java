package org.college;

public class College {

	public void collegeName() {
		System.out.println("College name : psg college");
	}

	public void collegeCode() {
		System.out.println("College code : 12345");
	}

	public void collegeBank() {
		System.out.println("College Bank : Canara Bank");
	}

	public static void main(String[] args) {
		College C = new College();
		Student S = new Student();
		Hostel H = new Hostel();
		Dept D = new Dept();
		C.collegeName();
		C.collegeCode();
		C.collegeBank();
		S.studentName();
		S.studentDept();
		S.studentID();
		D.deptName();

	}

}
