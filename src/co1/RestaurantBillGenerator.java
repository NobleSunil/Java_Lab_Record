package co1;

import java.util.Scanner;

public class RestaurantBillGenerator {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Constants
        final double GST_RATE = 0.05;
        final double SERVICE_CHARGE_RATE = 0.10;

        // Read food cost
        System.out.print("Enter Food Cost: ");
        double foodCost = sc.nextDouble();

        // Calculate GST and Service Charge
        double gst = foodCost * GST_RATE;
        double serviceCharge = foodCost * SERVICE_CHARGE_RATE;

        // Calculate final bill
        double totalBill = foodCost + gst + serviceCharge;

        // Display bill details
        System.out.println("\nGST             = " + gst);
        System.out.println("Service Charge  = " + serviceCharge);
        System.out.println("Final Bill      = " + totalBill);

        // Close Scanner
        sc.close();
    }
}
