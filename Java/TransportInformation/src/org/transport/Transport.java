package org.transport;

import org.road.Road;
import org.air.Air;
import org.water.Water;

public class Transport {

	public void transportForm() {
		System.out.println("Transports divided into : Road, Air, Water");
	}

	public static void main(String[] args) {

		Transport T = new Transport();
		Road R = new Road();
		Air A = new Air();
		Water W = new Water();
		T.transportForm();
		R.bike();
		R.cycle();
		R.bus();
		R.car();
		A.aeroPlane();
		A.heliCopter();
		W.boat();
		W.ship();
	}

}
