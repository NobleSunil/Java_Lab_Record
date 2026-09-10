package co2;

import java.util.Scanner;

public class Factorial {

    // Recursive method to calculate factorial
    static int factorial(int n) {

        // Base condition
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive call
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Read number
        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        // Calculate factorial
        int result = factorial(number);

        // Display result
        System.out.println("Factorial = " + result);

        // Close Scanner
        sc.close();
    }
}