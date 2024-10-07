package main_practice;

import java.util.Scanner;

public class Beg_05 {
	public static void main (String arg[]) {
		Scanner sm = new Scanner(System.in);
		System.out.print("ENter a non-negative integer: ");
		int num = sm.nextInt();
		
		if (num < 0) {
			System.out.println("Factorial is not defined for negative numbers.");
		}else {
			long factorial =1;
			for(int i=1; i<=num; i++) {
				factorial *= i;
			}
			System.out.println("The factorial of " +num+" is:" + factorial);
		}
	}

}
