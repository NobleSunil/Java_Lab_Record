package co1;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Read principal, rate and time
        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (Years): ");
        double time = sc.nextDouble();

        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Calculate total amount
        double amount = principal + simpleInterest;

        // Display the result
        System.out.println("\nSimple Interest = " + simpleInterest);
        System.out.println("Total Amount    = " + amount);

        // Close Scanner
        sc.close();
    }
}
