package main_practice;

import java.util.Scanner;

public class Beg_04 {
	public static void main(String arg[]) {
		Scanner dog = new Scanner(System.in);
		System.out.print("Enter a number:");
		int number = dog.nextInt();
		
		if(number % 2==0) {
			System.out.println(number + "is even. ");
		}else {
			System.out.println(number +" is odd. ");
		}
		dog.close();
	}

}
