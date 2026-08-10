package co1;

import java.util.Scanner;

public class MenuDrivenCalculator {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Display menu
        System.out.println("Menu Driven Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        // Read user's choice
        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        // Read two numbers
        System.out.print("Enter A: ");
        double a = sc.nextDouble();

        System.out.print("Enter B: ");
        double b = sc.nextDouble();

        // Perform operation using switch
        switch (choice) {

            case 1:
                System.out.println("Result = " + (a + b));
                break;

            case 2:
                System.out.println("Result = " + (a - b));
                break;

            case 3:
                System.out.println("Result = " + (a * b));
                break;

            case 4:
                if (b != 0) {
                    System.out.println("Result = " + (a / b));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;

            default:
                System.out.println("Invalid choice.");
        }

        // Close Scanner
        sc.close();
    }
}