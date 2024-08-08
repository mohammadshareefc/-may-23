//Create a class Student with private attributes for name and age.
//
//Use a constructor to initialize these attributes and provide public getter methods to access them.
//
//In the main method, an instance of Student is created and the student's details are printed.
import java.util.Scanner;

class Student {
    // Private attributes
    private String name;
    private int age;

    // Constructor to initialize the attributes
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }
}

public class W2attt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        // Create Student object
        Student student = new Student(name, age);

        // Print student details
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());

        scanner.close();
    }
}
