package Started_Raja;

import java.util.Scanner;

public class Fac {
	public static void main (String arg[]) {
		Scanner raja = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = raja.nextInt();
		long factorial = 1;
		
		if(num < 0) {
			System.out.println("Factorial is not defined for negative numbers.");
			
		}else {
			for(int i =1 ; i<=num;i++) {
				factorial *= i;
			}
			System.out.println("The factorial of " + num +" is: " + factorial);
		}
	}

}
