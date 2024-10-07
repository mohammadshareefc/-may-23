package main_practice;

import java.util.Scanner;

public class Beg_03 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number:");
		int num1 = sc.nextInt();
		System.out.print("Enter the second number:");
		int num2 = sc.nextInt();
		
		System.out.println("Before swapping : num1 =" + num1+", num2 ="+num2);
		
		int shareef = num1;
		num1 = num2;
		num2 = shareef;
		
		System.out.println("After swapping : num1 =" + num1+", num2 =" +num2);
		sc.close();
		
	}

}
