package mainpractice_12;

import java.util.Scanner;

public class Bep_03 {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter your First number :");
		int num1 = sc.nextInt();
		
		System.out.print("Enter your Second number :");
		int num2 = sc.nextInt();
		
		System.out.println("Before Swapping: num1 = "+num1+", num2=" +num2);
		
		int temp=num1;
		
		num1=num2;
		num2=temp;
		
		System.out.println("After Swapping: num1=" +num1+", num2=" +num2);
		sc.close();
	}

}
