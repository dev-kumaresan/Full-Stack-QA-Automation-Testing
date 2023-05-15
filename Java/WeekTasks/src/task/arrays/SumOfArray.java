package task.arrays;

public class SumOfArray {

	public static void main(String[] args) {

		int j, temp;
		int a[] = { 10, 10, 20, 50, 60, 80, 60, 50 };

		for (int i = 0; i < a.length; i++) {
			for (j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("After removed :- ");
		System.out.print(a[0]+"\t");
		for (int i = 1; i < a.length; i++) {
			if (a[i] == a[i - 1]) {
				continue;
			} else {
				System.out.print(a[i] + "\t");
			}
		}

//		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, sum = 0;
//		double average = 0;
//		for (int i = 0; i < a.length; i++) {
//			sum = sum + a[i];
//
//		}
//		average = (double)sum / a.length;
//		System.out.println("The average of numbers is : " + average);

//		for (int i = 0; i < a.length; i++) {
//			sum = sum + a[i];
//		}
//		System.out.println("The sum of numbers is : " + sum);

	}

}
