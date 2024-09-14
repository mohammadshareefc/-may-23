package mainpractice_12;

import java.util.Scanner;

public class Bep_12 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your number of terms :");
		int num = sc.nextInt();
		
		int first=0 , second=1;
		
		if(num <= 0) {
			System.out.println("Please enter a positive number : ");
			
		}else if(num <=1){
			System.out.println("Fibonacci series :" + first);
		}else {
			System.out.print("Fibonacci Series :" + first+","+second);
			for(int i=3; i<=num;i++) {
				int next= first+second;
				System.out.print(" , " +next);
				first = second;
				second = next;
			}
			System.out.println();
			sc.close();
		}
	}

}
