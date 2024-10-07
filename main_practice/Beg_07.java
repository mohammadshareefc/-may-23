package main_practice;

import java.util.Scanner;

public class Beg_07 {
public static void main(String arg[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the first number: ");
    int num1 = sc.nextInt();
    
    System.out.print("Enter the second number: ");
    int num2 = sc.nextInt();
    
    System.out.print("Enter the third number: ");
    int num3 = sc.nextInt();
    
    int greatest;
    
    if(num1>= num2 && num1>=num3) {
    	greatest = num1;
    }else if(num2 >= num1 && num2>= num3) {
    	greatest = num2;
    }else {
    	greatest = num3;
    }
    System.out.println("The greatest of the three numbers is: " + greatest);
}
}
