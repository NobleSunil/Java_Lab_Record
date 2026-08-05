package co1;

import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Read student details
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        // Consume the leftover newline
        sc.nextLine();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        System.out.print("Enter Percentage: ");
        double percentage = sc.nextDouble();

        // Display student details
        System.out.println("\nStudent Details");
        System.out.println("----------------");
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + rollNo);
        System.out.println("Course     : " + course);
        System.out.println("Percentage : " + percentage);

        // Close Scanner
        sc.close();
    }
}