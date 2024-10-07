//Write the appropriate code to read 3 integer inputs from keyboard and find their sum.

import java.util.Scanner;

public class W10_01 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int sum = num1+num2+num3;
		System.out.println(sum);
		sc.close();
	}

}
