package main_practice;

import java.util.Scanner;

public class Beg_08 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a positive integer:");
		int number = sc.nextInt();
		int sum = 0;
		while (number > 0) {
			sum+= number%10;
			number/=10;
		}
		System.out.println("The sum of digits is:" +sum);
	}

}
