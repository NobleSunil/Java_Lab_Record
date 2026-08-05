package co1;

import java.util.Scanner;

public class StudentMarkCalculator {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Read marks of three subjects
        System.out.print("Enter Mark 1: ");
        double mark1 = sc.nextDouble();

        System.out.print("Enter Mark 2: ");
        double mark2 = sc.nextDouble();

        System.out.print("Enter Mark 3: ");
        double mark3 = sc.nextDouble();

        // Calculate total and average
        double total = mark1 + mark2 + mark3;
        double average = total / 3;

        // Display total and average
        System.out.println("\nTotal Marks   = " + total);
        System.out.println("Average Marks = " + average);

        // Check whether average is above 50
        if (average > 50) {
            System.out.println("Result : Above 50 Average");
        } else {
            System.out.println("Result : Below 50 Average");
        }

        // Close Scanner
        sc.close();
    }
}
