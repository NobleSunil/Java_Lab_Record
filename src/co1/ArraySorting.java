package co1;

import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        System.out.print("Enter Number of Elements: ");
        int n = sc.nextInt();

        // Create the array
        int[] numbers = new int[n];

        // Read array elements
        System.out.println("Enter Array Elements:");

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // Sort the array using bubble sort
        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - 1 - i; j++) {

                // Swap if elements are in the wrong order
                if (numbers[j] > numbers[j + 1]) {

                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        // Display sorted array
        System.out.println("Sorted Array:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        // Close Scanner
        sc.close();
    }
}
