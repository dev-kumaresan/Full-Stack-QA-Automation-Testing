package org.bike;

public class Ktm implements Bike {

	public static void main(String[] args) {

		Ktm K = new Ktm();
		K.cost();
		K.speed();
	}

	@Override
	public void cost() {
		System.out.println("The bike cost is 1,50,0000");

	}

	@Override
	public void speed() {
		System.out.println("The speed of the bike is 120km speed per hour");

	}

}
