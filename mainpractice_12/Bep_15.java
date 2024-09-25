package mainpractice_12;

import java.util.Scanner;

public class Bep_15 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
		int n = sc.nextInt();
		int[]array = new int[n];
		System.out.println("Enter the elements of the array: ");
		for(int i=0; i<n;i++) {
			array[i]=sc.nextInt();
		}
		bubbleSort(array);
		System.out.println("Sorted array: ");
		for(int i=0; i<n ;i++) {
			System.out.println(array[i]+ " ");
		}
		sc.close();
	}
	public static void bubbleSort(int[] array) {
		int n = array.length;
		for(int i = 0; i<n - 1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j]  = array[j+1];
					array[j+1]=temp;
				}
			}
		}
	}

}
