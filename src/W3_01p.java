// Base class
class Department {
    public void getCourses() {
        System.out.println("These are the department's courses.");
    }
}

// Subclass for Computer Science
class ComputerScience extends Department {
    @Override
    public void getCourses() {
        System.out.println("Courses offered by the Computer Science Department: Data Structures, Algorithms, Operating Systems.");
    }
}

// Subclass for Mechanical Engineering
class MechanicalEngineering extends Department {
    @Override
    public void getCourses() {
        System.out.println("Courses offered by the Mechanical Engineering Department: Thermodynamics, Fluid Mechanics, Material Science.");
    }
}

// Main class to test the functionality
public class W3_01p {
    public static void main(String[] args) {
        // Create an object of the base class Department
        Department dept = new Department();
        dept.getCourses();

        // Create an object of the ComputerScience class
        ComputerScience cs = new ComputerScience();
        cs.getCourses();

        // Create an object of the MechanicalEngineering class
        MechanicalEngineering me = new MechanicalEngineering();
        me.getCourses();
    }
}
