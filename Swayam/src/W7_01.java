import java.util.Scanner;

public class W7_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter text
        System.out.println("Enter some text:");
        String text = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Call the method to find the longest word
        String longestWord = findLongestWord(text);

        // Print the longest word found
        System.out.println("The longest word in the text is: " + longestWord);
    }

    // Method to find the longest word in a given text
    public static String findLongestWord(String text) {
        String[] words = text.split("\\s+"); // Split text into words based on whitespace
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }
}

