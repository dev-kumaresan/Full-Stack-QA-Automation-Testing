package workout;

import java.util.Scanner;

public class Fibonacci {
	int fn = 0, sn = 1, tn;

	public void fs() {

		while (fn <= 100) {				// limit given in compile time
			System.out.print(fn + " ");    
			tn = fn + sn;
			fn = sn;
			sn = tn;

		}
		
	}

	public void fsgl() {
		 fn = 0;
	     sn = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("\nEnter the input :- ");
		int n = input.nextInt();             // limit given in run time
		while (fn <= n) {
			System.out.print(fn + " ");
			tn = fn + sn;
			fn = sn;
			sn = tn;

		}
	}
	public void fsb()
	{
		fn=0;
		sn=1;
		tn = fn+sn;
		Scanner s  = new Scanner(System.in);
		System.out.println("\nEnter the start :- ");  // fs from start to end
		int start = s.nextInt();
		System.out.println("Enter the end :- ");
		int end = s.nextInt();
		while(tn<=end)
		{
			if(tn>=start)
			{
				System.out.print(tn+" ");
			}
			fn =sn;
			sn=tn;
			tn=fn+sn;
		}
		
	}

	public static void main(String[] args) {

		Fibonacci fsp = new Fibonacci();
		fsp.fs();
		fsp.fsgl();
		fsp.fsb();
	}
}
