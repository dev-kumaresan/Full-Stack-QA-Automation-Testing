package org.bank;

public class AxisBank extends BankInfo {

	public void deposit() {
		System.out.println("Override deposit method here");
	}

	public static void main(String[] args) {
		AxisBank AB = new AxisBank();
		AB.deposit();
		AB.saving();
		AB.fixed();

		BankInfo BI = new BankInfo();
		BI.deposit();
	}

}
