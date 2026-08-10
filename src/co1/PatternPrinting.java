package co1;

import java.util.Scanner;

public class PatternPrinting {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Read number of rows
        System.out.print("Enter Number of Rows: ");
        int rows = sc.nextInt();

        // Outer loop controls the number of rows
        for (int i = 1; i <= rows; i++) {

            // Inner loop prints stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }

        // Close Scanner
        sc.close();
    }
}