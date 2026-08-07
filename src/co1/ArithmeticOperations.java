package co1;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Read two integers
        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();

        // Perform arithmetic operations
        System.out.println("\nAddition       = " + (num1 + num2));
        System.out.println("Subtraction    = " + (num1 - num2));
        System.out.println("Multiplication = " + (num1 * num2));
        System.out.println("Division       = " + (num1 / num2));
        System.out.println("Modulus        = " + (num1 % num2));

        // Close Scanner
        sc.close();
    }
}
