package co1;

import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Read distance in kilometers
        System.out.print("Enter Distance in Kilometers: ");
        double kilometers = sc.nextDouble();

        // Convert distance
        double meters = kilometers * 1000;
        double centimeters = meters * 100;

        // Display converted values
        System.out.println("\nMeters       = " + meters);
        System.out.println("Centimeters  = " + centimeters);

        // Close Scanner
        sc.close();
    }
}