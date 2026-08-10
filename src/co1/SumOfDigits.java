package co1;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Read the number
        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        // Store the original number
        int originalNumber = number;

        // Variable to store the sum
        int sum = 0;

        // Calculate sum of digits
        while (number != 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }

        // Display result
        System.out.println("Sum of digits of " + originalNumber + " = " + sum);

        // Close Scanner
        sc.close();
    }
}

