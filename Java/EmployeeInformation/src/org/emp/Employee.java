package org.emp;

import org.company.Company;
import org.client.Client;
import org.project.Project;

public class Employee {
	public void empName() {
		System.out.println("Emp Name : Kumar");
	}

	public static void main(String[] args) {

		Employee E = new Employee();
		Company C = new Company();
		Client cl = new Client();
		Project P = new Project();
		E.empName();
		C.companyName();
		cl.clientName();
		P.projectName();
	}

}
