package mainpractice_12;

import java.util.Scanner;

public class Bep_13 {
	public static void main (String args[]) {
		Scanner mm = new Scanner(System.in);
		
		System.out.print("Enter the number of elements in the array: ");
		int n = mm.nextInt();
		int [] array = new int [n];
		System.out.println("Enter the elements of the array");
		for(int i=0; i<n;i++) {
			array[i]=mm.nextInt();
			}
		int largest= array[0];
		
		for(int i=1; i<n;i++) {
			if(array[i]>largest) {
				largest = array[i];
			}
		}
		System.out.println("The largest element in the array is: " +largest);
		mm.close();
	}
	
}
