package co1;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Constant rate per unit
        final double RATE_PER_UNIT = 7.5;

        // Read units consumed
        System.out.print("Enter Units Consumed: ");
        double units = sc.nextDouble();

        // Calculate electricity bill
        double billAmount = units * RATE_PER_UNIT;

        // Display bill
        System.out.println("\nElectricity Bill = " + billAmount);

        // Close Scanner
        sc.close();
    }
}
