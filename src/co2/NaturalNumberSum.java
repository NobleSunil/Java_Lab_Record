package co2;

import java.util.Scanner;

public class NaturalNumberSum {

    // Recursive method to calculate sum
    static int calculateSum(int n) {

        // Base condition
        if (n == 1) {
            return 1;
        }

        // Recursive call
        return n + calculateSum(n - 1);
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Read number
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        // Calculate sum
        int sum = calculateSum(n);

        // Display result
        System.out.println("Sum = " + sum);

        // Close Scanner
        sc.close();
    }
}
