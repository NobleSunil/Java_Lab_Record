package co1;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Read array size
        System.out.print("Enter Number of Elements: ");
        int n = sc.nextInt();

        // Create the array
        int[] numbers = new int[n];

        // Read array elements
        System.out.println("Enter Array Elements:");

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // Read element to search
        System.out.print("Enter Element to Search: ");
        int search = sc.nextInt();

        // Variable to store the position
        int position = -1;

        // Linear search
        for (int i = 0; i < n; i++) {

            if (numbers[i] == search) {
                position = i + 1;
                break;
            }
        }

        // Display search result
        if (position != -1) {
            System.out.println("Element found at position " + position);
        } else {
            System.out.println("Element not found");
        }

        // Close Scanner
        sc.close();
    }
}
