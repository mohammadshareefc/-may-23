package main_practice;

import java.util.Scanner;

public class Beg_11 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of terms in the Fibonacci Series :" );
		int terms = sc.nextInt();
		int num1 = 0, num2 =1;
		System.out.println("Fibonacci Series up to "+ terms + " terms");
		
		for(int i = 1;i<= terms; i++) {
			System.out.print(num1 + " ");
			int nextnum = num1+num2;
			num1 = num2;
			num2 = nextnum;
		}
	}

}
