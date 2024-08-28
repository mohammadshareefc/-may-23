import java.util.Scanner;

// Define a custom exception for when there are no vowels in the string
class NoVowelsException extends Exception {
    public NoVowelsException(String message) {
        super(message);
    }
}

public class W5_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = input.nextLine();

        try {
            // Call the checkVowels method to determine if the string contains vowels
            checkVowels(text);
            System.out.println("String contains vowels.");
        } catch (NoVowelsException e) {
            // Handle the exception if no vowels are found
            System.out.println("Error: " + e.getMessage());
        } finally {
            input.close();
        }
    }

    // Method to check if the string contains vowels
    public static void checkVowels(String text) throws NoVowelsException {
        // Define a string containing all vowels
        String vowels = "AEIOUaeiou";
        boolean hasVowel = false;

        // Iterate over each character in the text
        for (char c : text.toCharArray()) {
            // Check if the character is a vowel
            if (vowels.indexOf(c) != -1) {
                hasVowel = true;
                break;
            }
        }

        // If no vowel is found, throw the custom exception
        if (!hasVowel) {
            throw new NoVowelsException("The string contains no vowels.");
        }
    }
}
