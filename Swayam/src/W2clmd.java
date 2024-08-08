// This is the class named Former
class Former {
    // This is a method in class Former
    public void display() {
        System.out.println("This is Former Class.");
    }
}

// This is the class named Latter
class Latter {
    // This is a method in class Latter
    public void display() {
        System.out.println("This is Latter Class.");
    }
}

public class W2clmd {
    public static void main(String[] args) {
        // Create an object of the Former class
        Former formerObj = new Former();
        // Call the display method of the Former class
        formerObj.display();

        // Create an object of the Latter class
        Latter latterObj = new Latter();
        // Call the display method of the Latter class
        latterObj.display();
    }
}
