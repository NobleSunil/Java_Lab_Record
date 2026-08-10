package co1;

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Read marks
        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        // Determine grade using if-else
        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade = A");
        } else if (marks >= 80) {
            System.out.println("Grade = B");
        } else if (marks >= 70) {
            System.out.println("Grade = C");
        } else {
            System.out.println("Grade = D");
        }

        // Close Scanner
        sc.close();
    }
}
