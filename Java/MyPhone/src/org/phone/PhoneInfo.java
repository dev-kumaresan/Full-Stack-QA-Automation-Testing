package org.phone;

public class PhoneInfo {

	public void phoneName() {
		System.out.println("Phone Name : Realme ");
	}

	public void phoneMieiNum() {
		System.out.println("Phone imei Num : 00412001345661102 ");
	}

	public void camera() {
		System.out.println("Phone Camera: wide-angle ");
	}

	public void storage() {
		System.out.println("Phone Storage : 128GB ");
	}

	public void osName() {
		System.out.println("Phone OS Name : Lollipop ");
	}

	public static void main(String[] args) {
		PhoneInfo PI = new PhoneInfo();
		PI.phoneName();
		PI.phoneMieiNum();
		PI.camera();
		PI.storage();
		PI.osName();

	}

}
