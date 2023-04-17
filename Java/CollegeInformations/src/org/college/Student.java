package org.college;

public class Student extends College {

	public void studentName() {
		System.out.println("Student Name : Kumaresan L");
	}

	public void studentDept() {
		System.out.println("Student Department : MCA");
	}

	public void studentId() {
		System.out.println("Student ID : 19MCA005");
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.studentName();
		s.studentDept();
		s.studentId();
		s.HostelName();
		s.deptName();

	}

}
