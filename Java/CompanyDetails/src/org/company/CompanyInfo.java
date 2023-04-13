package org.company;

public class CompanyInfo {

	public void companyName() {
		System.out.println("Company Name : abc company");
	}

	public void companyId() {
		System.out.println("Company Id : 123");
	}

	public void companyAddress() {
		System.out.println("Company Address : abc colony");
	}

	public static void main(String[] args) {
		CompanyInfo CI = new CompanyInfo();
		CI.companyName();
		CI.companyId();
		CI.companyAddress();
	}

}
