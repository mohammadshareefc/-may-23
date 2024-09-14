package mainpractice_12;

import java.util.Scanner;

public class Bep_04 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter your number ");
		int number=sc.nextInt();
		
		if(number % 2==0) {
			System.out.println(number+" is  an even number.");
		}else {
			System.out.println(number+" is  an odd number. ");
		}
	}

}
