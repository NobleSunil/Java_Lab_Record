package co2;

import java.util.Scanner;

public class StudentObjectMethod {

    // Instance variables
    String name;
    int rollNo;

    // Constructor to initialize student details
    StudentObjectMethod(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Method that accepts a StudentObjectMethod object
    static void displayStudent(StudentObjectMethod student) {

        // Display student details using the object
        System.out.println("\nStudent Details");
        System.out.println("----------------");
        System.out.println("Student Name : " + student.name);
        System.out.println("Roll No      : " + student.rollNo);
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Read student details
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();

        // Create Student object
        StudentObjectMethod student = new StudentObjectMethod(name, rollNo);

        // Pass the object to the method
        displayStudent(student);

        // Close Scanner
        sc.close();
    }
}