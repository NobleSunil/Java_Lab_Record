package co2;

import java.util.Scanner;

public class ReturnCircleObject {

    // Instance variables
    double radius;
    double area;

    // Constructor
    ReturnCircleObject(double radius, double area) {
        this.radius = radius;
        this.area = area;
    }

    // Method that calculates and returns a Circle object
    static ReturnCircleObject calculateCircle(double radius) {

        // Calculate area of circle
        double area = Math.PI * radius * radius;

        // Create Circle object with calculated values
        ReturnCircleObject circle = new ReturnCircleObject(radius, area);

        // Return the object
        return circle;
    }

    // Method to display circle details
    void display() {
        System.out.println("Radius = " + radius);
        System.out.println("Area = " + area);
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Read radius
        System.out.print("Enter Radius: ");
        double radius = sc.nextDouble();

        // Call method and receive Circle object
        ReturnCircleObject circle = calculateCircle(radius);

        // Display radius and area
        circle.display();

        // Close Scanner
        sc.close();
    }
}