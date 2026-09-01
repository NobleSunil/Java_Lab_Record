package co2;
import java.util.Scanner;

public class StudentDetails {

    // Instance variables
    String name;
    int age;

    // Parameterized constructor
    StudentDetails(String name, int age) {

        // 'this' refers to the current object's instance variables
        this.name = name;
        this.age = age;
    }

    // Method to display student details
    void display() {
        System.out.println("Student Name : " + name);
        System.out.println("Age          : " + age);
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Read student details
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        // Create StudentDetails object
        StudentDetails student = new StudentDetails(name, age);

        // Display details
        student.display();

        // Close Scanner
        sc.close();
    }
}