public class Middlepatteren {
    public static void main(String[] args) {
        String word = "PROGRAM";  // Replace with any odd-length word
        int middleIndex = word.length() / 2;

        // Start from the middle and expand outwards
        for (int i = 0; i <= middleIndex; i++) {
            // Substring from the middle minus i to middle plus i
            String pattern = word.substring(middleIndex - i, middleIndex + i + 1);
            System.out.println(pattern);
        }
    }
}
