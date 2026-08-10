package co1;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Read the number
        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        // Generate multiplication table from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        // Close Scanner
        sc.close();
    }
}
