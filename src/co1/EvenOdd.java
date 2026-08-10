package co1;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Read number
        System.out.print("Enter a Number: ");
        int number = sc.nextInt();

        // Check whether the number is even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }

        // Close Scanner
        sc.close();
    }
}
