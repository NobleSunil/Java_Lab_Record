package co2;

import java.util.Scanner;

public class ReturnStudentObject {

    // Instance variables
    String name;
    int mark;

    // Constructor to initialize student details
    ReturnStudentObject(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    // Method that creates and returns a Student object
    static ReturnStudentObject createStudent(String name, int mark) {
        ReturnStudentObject student = new ReturnStudentObject(name, mark);
        return student;
    }

    // Method to display student details
    void display() {
        System.out.println("Student Name : " + name);
        System.out.println("Mark         : " + mark);
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Read student details
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Mark: ");
        int mark = sc.nextInt();

        // Call method and store the returned object
        ReturnStudentObject student = createStudent(name, mark);

        // Display returned object's details
        student.display();

        // Close Scanner
        sc.close();
    }
}