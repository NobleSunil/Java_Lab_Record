package co2;

import java.util.Scanner;

public class BoxComparison {

    // Instance variables
    double length;
    double breadth;
    double height;

    // Constructor to initialize box dimensions
    BoxComparison(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    // Method to calculate volume
    double calculateVolume() {
        return length * breadth * height;
    }

    // Method that accepts two Box objects
    static void compareBoxes(BoxComparison box1, BoxComparison box2) {

        // Calculate volumes of both boxes
        double volume1 = box1.calculateVolume();
        double volume2 = box2.calculateVolume();

        // Compare the volumes
        if (volume1 > volume2) {
            System.out.println("Larger Box Volume = " + volume1);
        } else if (volume2 > volume1) {
            System.out.println("Larger Box Volume = " + volume2);
        } else {
            System.out.println("Both boxes have equal volume = " + volume1);
        }
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Read Box 1 dimensions
        System.out.print("Enter Box 1 Length: ");
        double length1 = sc.nextDouble();

        System.out.print("Enter Box 1 Breadth: ");
        double breadth1 = sc.nextDouble();

        System.out.print("Enter Box 1 Height: ");
        double height1 = sc.nextDouble();

        // Read Box 2 dimensions
        System.out.print("Enter Box 2 Length: ");
        double length2 = sc.nextDouble();

        System.out.print("Enter Box 2 Breadth: ");
        double breadth2 = sc.nextDouble();

        System.out.print("Enter Box 2 Height: ");
        double height2 = sc.nextDouble();

        // Create two Box objects
        BoxComparison box1 = new BoxComparison(length1, breadth1, height1);
        BoxComparison box2 = new BoxComparison(length2, breadth2, height2);

        // Pass both objects to the comparison method
        compareBoxes(box1, box2);

        // Close Scanner
        sc.close();
    }
}