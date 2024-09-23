package mainpractice_12;

import java.util.Scanner;

public class Bep_14 {
	public static void main (String args[]) {
		Scanner sh = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array :");
		int n = sh.nextInt();
		if(n<2) {
			System.out.println("Array must have at least two elements. ");
			return;
		}
		int[] array = new int[n];
		System.out.println("Enter the elements of the array :");
		for(int i=0; i<n ; i++) {
			array[i] = sh.nextInt();
		}
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++) {
			if(array[i]>largest) {
				secondLargest = largest;
				largest = array[i];
						
			}else if(array[i] > secondLargest && array[i] !=largest) {
				secondLargest = array[i];
			}
		}
		if(secondLargest == Integer.MIN_VALUE) {
			System.out.println(" There is no Second-largest elements(all elements are the same).");
			
		}else {
			System.out.println("The second-largest element in the array is :" +secondLargest);
			sh.close();
		}
	}

}
