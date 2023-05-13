package aiite.smalltasks;

import java.util.Scanner;

public class MatrixAlignment {
	public static void main(String[] args) {
		double average[][] = new double[3][3];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter average marks to show: ");
		for (int i = 0; i < average.length; i++) {
			for (int j = 0; j < average.length; j++) {
				average[i][j] = in.nextDouble();	// get user input using Scanner
			}
		}
		System.out.println("\nIn Matrix format :\n");
		for (int i = 0; i < average.length; i++) {
			for (int j = 0; j < average.length; j++) {
				System.out.print(average[i][j] + "\t\t"); // using alignment
			}
			System.out.print("\n\n"); // Move to the next line in each iteration 
		}
	}
}
