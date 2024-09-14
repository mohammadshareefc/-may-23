package mainpractice_12;

import java.util.Scanner;

public class Bep_07 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the First Number : ");
		
		int Num1 = scanner.nextInt();
		
        System.out.print("Enter the Second Number : ");
		
		int Num2 = scanner.nextInt();
		
        System.out.print("Enter the Third Number : ");
		
		int Num3 = scanner.nextInt();
		
		int greatest;
		
		if(Num1 >= Num2 && Num1 >= Num3) {
			greatest = Num1;
		}else if (Num2 >= Num1 && Num2 >= Num3) {
			greatest = Num2;
			}else {
				greatest = Num3;
			}
		System.out.println("The greatest number is: " + greatest);
		scanner.close();
		}

}
