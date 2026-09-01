package co2;

public class Rectangle {

    // Instance variables
    double length;
    double breadth;

    // Default constructor
    Rectangle() {
        length = 1;
        breadth = 1;
    }

    // Parameterized constructor
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate area
    double calculateArea() {
        return length * breadth;
    }

    public static void main(String[] args) {

        // Object using default constructor
        Rectangle rectangle1 = new Rectangle();

        // Object using parameterized constructor
        Rectangle rectangle2 = new Rectangle(8, 5);

        // Display areas
        System.out.println("Rectangle 1 Area = " + rectangle1.calculateArea());
        System.out.println("Rectangle 2 Area = " + rectangle2.calculateArea());
    }
}