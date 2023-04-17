package org.bank;

public class BankInfo extends AxisBank {

	public void saving() {
		System.out.println("The rate of interest (3 month once) for saving account is  10% of your balance");
	}

	public void fixed() {
		System.out.println("The rate of interest if F.D is 0.75%");
	}

	public static void main(String[] args) {
		BankInfo BI = new BankInfo();
		BI.saving();
		BI.fixed();
		BI.deposit();
	}

}
