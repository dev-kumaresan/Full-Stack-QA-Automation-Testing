package workout;
import java.util.Scanner;


public class MaxAndMin {

	public static void main(String[] args) {
		int a[] = new int[100];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int n = s.nextInt();
		System.out.println("Enter the numbers : ");
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		int max = a[0];
		int min = a[0];
		for (int i = 0; i < n; i++) {
			if (a[i] > max) {
				max = a[i];
			}
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("Max number : " + max);
		System.out.println("Min number : " + min);



	}

}
