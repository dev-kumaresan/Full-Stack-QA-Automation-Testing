package org.network;

public class Wifi {

	public void wifiName() {
		System.out.println("Wifi Name : HackerankXYZ");
	}

	public static void main(String[] args) {

		Wifi W = new Wifi();
		MobileData MD = new MobileData();
		Lan L = new Lan();
		Wireless WL = new Wireless();
		W.wifiName();
		MD.dataName();
		L.lanName();
		WL.modemName();
	}

}
