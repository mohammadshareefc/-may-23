
import java.util.Scanner;

// Base class ElectronicsProduct
class ElectronicsProduct {
    // Attributes for the product ID, name, and price
    private String productId;
    private String name;
    private double price;

    // Constructor to initialize the ElectronicsProduct object
    public ElectronicsProduct(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Method to apply a discount to the product price
    public void applyDiscount(double discountPercentage) {
        // Calculate the discount amount
        double discountAmount = price * discountPercentage / 100;
        // Subtract the discount amount from the original price
        price -= discountAmount;
    }

    // Method to calculate the final price after discount
    public double getFinalPrice() {
        // Return the current price which may have been discounted
        return price;
    }

    // Getter for product ID
    public String getProductId() {
        return productId;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }
}

// Subclass WashingMachine
class WashingMachine extends ElectronicsProduct {
    private int warrantyPeriod; // Additional attribute for warranty period

    // Constructor to initialize the WashingMachine object
    public WashingMachine(String productId, String name, double price, int warrantyPeriod) {
        super(productId, name, price); // Call the superclass constructor
        this.warrantyPeriod = warrantyPeriod; // Initialize the warranty period
    }

    // Method to extend the warranty period
    public void extendWarranty(int additionalMonths) {
        warrantyPeriod += additionalMonths; // Add the additional months to the current warranty period
    }

    // Getter for warranty period
    public int getWarrantyPeriod() {
        return warrantyPeriod; // Return the current warranty period
    }
}

// Main class
public class W9_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input product details
        System.out.println("Enter product details:");
        String productId = in.nextLine();     
        String name = in.nextLine();
        double price = in.nextDouble(); // Use double for price
        int warrantyPeriod = in.nextInt();
        int discountPercentage = in.nextInt();

        // Create a WashingMachine object
        WashingMachine washingMachine = new WashingMachine(productId, name, price, warrantyPeriod);

        // Apply a discount and display the final price
        washingMachine.applyDiscount(discountPercentage);
        System.out.println("Product ID: " + washingMachine.getProductId());
        System.out.println("Name: " + washingMachine.getName());
        System.out.printf("Price after discount: $%.2f%n", washingMachine.getFinalPrice());
        System.out.println("Warranty period: " + washingMachine.getWarrantyPeriod() + " months");

        // Extend the warranty period and display the new warranty period
        washingMachine.extendWarranty(12);
        System.out.print("Warranty period after extension: " + washingMachine.getWarrantyPeriod() + " months");
        
        in.close(); // Close the scanner
    }
}
