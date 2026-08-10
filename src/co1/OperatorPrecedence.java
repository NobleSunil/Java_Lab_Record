package co1;

import java.util.Scanner;

public class OperatorPrecedence {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Read values
        System.out.print("Enter A: ");
        int a = sc.nextInt();

        System.out.print("Enter B: ");
        int b = sc.nextInt();

        System.out.print("Enter C: ");
        int c = sc.nextInt();

        System.out.print("Enter D: ");
        int d = sc.nextInt();

        System.out.print("Enter E: ");
        int e = sc.nextInt();

        // Evaluate expression using operator precedence
        int result = a + b * c - d / e;

        // Display result
        System.out.println("\nResult = " + result);

        // Close Scanner
        sc.close();
    }
}
