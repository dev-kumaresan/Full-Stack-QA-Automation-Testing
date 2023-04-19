package org.company;

public class CompanyInfo {
	public void companyName() {
		System.out.println("List the company details :- ");
	}

	public void companyName(String company_name) {
		System.out.println("The Company Name is : " + company_name);
	}

	public void companyName(int company_branch) {
		System.out.println("The companies in chennai city : " + company_branch);
	}

	public void companyName(double company_percentage) {
		System.out.println("The yearly turnover percentage is : " + company_percentage + "%");
	}

	public static void main(String[] args) {
		CompanyInfo CI = new CompanyInfo();
		CI.companyName();
		CI.companyName("abc company");
		CI.companyName(102);
		CI.companyName(10.58);

	}

}
