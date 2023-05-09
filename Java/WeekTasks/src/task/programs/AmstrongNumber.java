package task.programs;
import java.util.Scanner;
public class AmstrongNumber {

	public static void main(String[] args) {
	       int num = 153, number, temp, total = 0;

	        number = num;
	        while (number != 0)
	        {
	            temp = number % 10;
	            total = total + temp*temp*temp;
	            number /= 10;
	        }

	        if(total == num)
	        {
	            System.out.println(num + " is an Armstrong number");
	        }
	        else
	        {
	            System.out.println(num + " is not an Armstrong number");
	        }

	    
	        
//int originalNum, digit, cubeSum = 0,num;
//        
//        System.out.println("Enter the number:");
//        Scanner sc = new Scanner(System. in );
//        num = sc.nextInt();
//        originalNum = num;
//        while (num!= 0)
//        {
//            digit = num % 10;
//            cubeSum += Math.pow(digit, 3);
//            num /= 10;
//        }
//        if(cubeSum == originalNum)
//            System.out.println(originalNum+ " is an Armstrong number");
//        else
//            System.out.println(originalNum+ " is not an Armstrong number");
//		
	}

}
