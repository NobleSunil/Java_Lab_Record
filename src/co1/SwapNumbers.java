package co1;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Read two numbers
        System.out.print("Enter First Number: ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();

        // Display values before swapping
        System.out.println("\nBefore Swap");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        // Swap using a temporary variable
        int temp = a;
        a = b;
        b = temp;

        // Display values after swapping
        System.out.println("\nAfter Swap");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        // Close Scanner
        sc.close();
    }
}
