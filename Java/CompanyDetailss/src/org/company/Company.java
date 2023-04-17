package org.company;

import org.client.Client;

public class Company extends Client {

	public void companyName() {
		System.out.println("Company name : xyz company");
	}

	public static void main(String[] args) {
		Company C = new Company();
		C.companyName();
		C.clientName();
	}

}
