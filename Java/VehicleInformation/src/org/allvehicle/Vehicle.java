package org.allvehicle;

import org.twowheeler.TwoWheeler;
import org.threewheeler.ThreeWheeler;
import org.fourwheeler.FourWheeler;

public class Vehicle {

	public void vehicleNecessary() {
		System.out.println("Vehicle : purpose of travelling");
	}

	public static void main(String[] args) {
		Vehicle V = new Vehicle();
		TwoWheeler TW = new TwoWheeler();
		ThreeWheeler THW = new ThreeWheeler();
		FourWheeler FW = new FourWheeler();
		V.vehicleNecessary();
		TW.bike();
		TW.cycle();
		THW.auto();
		FW.car();
		FW.bus();
		FW.lorry();

	}

}
