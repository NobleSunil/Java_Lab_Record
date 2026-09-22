package co3;

// Parent class
class Student {

    // Protected members can be accessed by the child class
    protected String name;
    protected int rollNumber;

    // Constructor
    Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    // Method to display student details
    void displayStudent() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}

// Child class inherits Student
class PGStudent extends Student {

    // Additional property of PG student
    String specialization;

    // Constructor
    PGStudent(String name, int rollNumber, String specialization) {

        // Call parent constructor
        super(name, rollNumber);

        this.specialization = specialization;
    }

    // Display PG student details
    void displayPGStudent() {

        // Accessing protected members inherited from Student
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Specialization: " + specialization);
    }
}

// Main class
public class StudentPGStudent {

    public static void main(String[] args) {

        // Create PGStudent object
        PGStudent student = new PGStudent(
                "Noble",
                101,
                "Data Science"
        );

        // Display details
        student.displayPGStudent();
    }
}