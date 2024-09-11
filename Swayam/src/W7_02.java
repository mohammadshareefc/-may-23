import java.util.Scanner;

class W7_02 {
    public static void main(String[] args) {
        int rows, cols;
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter total rows (odd number):");
        rows = sc.nextInt();
        System.out.println("Enter total columns (odd number):");
        cols = sc.nextInt();
        
        // Close Scanner class
        sc.close();
        
        // Call swastika() method that will design Swastika for the specified rows and cols
        swastika(rows, cols);
    }

    static void swastika(int rows, int cols) {
        // Check if rows and cols are odd numbers
        if (rows % 2 == 0 || cols % 2 == 0) {
            System.out.println("Both rows and columns must be odd numbers.");
            return;
        }
        
        // Print the Swastika pattern
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Top-left corner
                if (i < rows / 2) {
                    if (j < cols / 2) {
                        if (i == 0 || j == 0) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    } else {
                        if (i == 0 || i == rows / 2) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                } else {
                    // Bottom-left corner
                    if (j < cols / 2) {
                        if (i == rows - 1 || j == 0) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    } else {
                        // Bottom-right corner
                        if (i == rows - 1 || j == cols - 1 || i == rows / 2) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}
