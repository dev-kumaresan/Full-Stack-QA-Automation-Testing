package org.add;

public class AlRightTech {

	public void AlRightOmr() {
		System.out.println("Overload the method AIRightOmr");
	}

	public void AlRightOmr(int overload) {
		System.out.println(+overload + " time(s) Overloaded.");
	}

	public static void main(String[] args) {

		AlRightTech ART = new AlRightTech();
		ART.AlRightOmr();
		ART.AlRightOmr(1);

	}

}
