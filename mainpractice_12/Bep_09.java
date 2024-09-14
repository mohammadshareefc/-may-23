package mainpractice_12;

import java.util.Scanner;

public class Bep_09 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter your number :");
		
		int num = sc.nextInt();
		int reversed = 0;
		int tem = num;
		while (tem != 0) {
			int digit = tem % 10;
			reversed = reversed*10+digit;
			tem = tem/10;
		}
		System.out.println(" The reverse number of " +num+ " is : " + reversed);
		sc.close();
	}

}
