import java.util.*;

public class W7_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Element to remove
        System.out.print("Enter the element to remove: ");
        int elementToRemove = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Removing element and printing result
        System.out.println("Original Array: " + Arrays.toString(array));
        array = removeAll(array, elementToRemove);
        System.out.println("Array after removing " + elementToRemove + ": " + Arrays.toString(array));
    }

    // Method to remove all occurrences of an element from an array
    public static int[] removeAll(int[] array, int elementToRemove) {
        // Count occurrences of the element to remove
        int count = 0;
        for (int num : array) {
            if (num == elementToRemove) {
                count++;
            }
        }

        // Create a new array with the remaining elements
        int[] newArray = new int[array.length - count];
        int index = 0;
        for (int num : array) {
            if (num != elementToRemove) {
                newArray[index++] = num;
            }
        }

        return newArray;
    }
}
