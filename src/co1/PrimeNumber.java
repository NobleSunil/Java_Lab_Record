package co1;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Read the number
        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        // Assume the number is prime
        boolean isPrime = true;

        // Numbers less than 2 are not prime
        if (number < 2) {
            isPrime = false;
        } else {

            // Check divisibility from 2 up to number - 1
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Display result
        if (isPrime) {
            System.out.println(number + " is Prime");
        } else {
            System.out.println(number + " is Not Prime");
        }

        // Close Scanner
        sc.close();
    }
}