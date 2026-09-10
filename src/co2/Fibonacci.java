package co2;

import java.util.Scanner;

public class Fibonacci {

    // Recursive method to find nth Fibonacci number
    static int fibonacci(int n) {

        // Base conditions
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        // Recursive calls
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Read position
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        // Calculate Fibonacci number
        int result = fibonacci(n);

        // Display result
        System.out.println("Fibonacci Number = " + result);

        // Close Scanner
        sc.close();
    }
}
