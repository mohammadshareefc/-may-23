package main_practice;

import java.util.Scanner;

public class Beg_13 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of elements in the array: ");
		int size = sc.nextInt();
		int[] array = new int [size];
		System.out.println("Enter" +size+"elements: ");
		for(int i=0;i<size;i++) {
			array[i] =sc.nextInt();
			}
		int largest = Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;
		
		for(int i=0; i<size; i++) {
			if(array[i]>largest) {
				secondlargest = largest;
			}else if(array[i]> secondlargest && array[i] != largest) {
				secondlargest = array[i];
			}
		}
		if(secondlargest == Integer.MIN_VALUE) {
			System.out.println("There is no second largest elenment in the array: ");
		}else {
			System.out.println("The second largest element in the array is:" +secondlargest);
		}
	}

}
