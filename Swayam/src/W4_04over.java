// Define the superclass
class Large {
    public void Print() {
        System.out.println("This is large");
    }
}

// Define the subclass Medium that extends Large
class Medium extends Large {
    @Override
    public void Print() {
        // Correct use of super to call the superclass method
        super.Print();  
        System.out.println("This is medium");
    }
}

// Define the subclass Small that extends Medium
class Small extends Medium {
    @Override
    public void Print() {
        // Call the superclass method
        super.Print(); 
        System.out.println("This is small");
    }
}

// Define the interface ExtraLarge
interface ExtraLarge {
    // Interface fields are implicitly public, static, and final
    String extra = "This is extra-large";

    // Interface methods are implicitly public and abstract
    void display();
}

// Implement the ExtraLarge interface in W04_P4
public class W4_04over implements ExtraLarge {
    public static void main(String[] args) {
        Small s = new Small();
        s.Print(); // Call the Print method of Small

        // Create an instance of W04_P4 and call display()
        W4_04over q = new W4_04over();
        q.display();
    }

    @Override
    public void display() {
        // Implement the display method
        System.out.print(extra);
    }
}
