package main_practice;

import java.util.Scanner;

public class Beg_09 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a positibe integer: ");
		int num = sc.nextInt();
		int reversednum = 0;
		
		while(num !=0) {
			int digit = num % 10;
			reversednum = reversednum *10+digit;
			num /=10;
		}
		System.out.println("The reversed number is: "+reversednum);
	}

}
