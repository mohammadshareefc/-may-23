import java.util.Scanner;

public class W9_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = in.nextInt();
        
        int longestZeroSequence = findLongestZeroSequence(n);
        System.out.println("Length of the longest sequence of zeros: " + longestZeroSequence);

        in.close();
    }

    public static int findLongestZeroSequence(int n) {
        // Convert the integer to its binary representation
        String binaryString = Integer.toBinaryString(n);
        System.out.println("Binary representation: " + binaryString); // For debugging

        int maxCount = 0; // To store the maximum length of zeros found
        int currentCount = 0; // To count current sequence of zeros

        // Iterate through the binary string
        for (char c : binaryString.toCharArray()) {
            if (c == '0') {
                currentCount++; // Increment current count of zeros
            } else {
                // If we hit a '1', check if the current sequence is the longest
                maxCount = Math.max(maxCount, currentCount);
                currentCount = 0; // Reset the current count
            }
        }

        // Check once more at the end in case the string ends with zeros
        maxCount = Math.max(maxCount, currentCount);

        return maxCount; // Return the longest sequence of zeros
    }
}

