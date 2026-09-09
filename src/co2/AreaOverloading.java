package co2;

public class AreaOverloading {

    // Calculate area of square
    double area(double side) {
        return side * side;
    }

    // Calculate area of rectangle
    double area(double length, double breadth) {
        return length * breadth;
    }

    public static void main(String[] args) {

        // Create object
        AreaOverloading obj = new AreaOverloading();

        // Calculate square area
        double squareArea = obj.area(6);

        // Calculate rectangle area
        double rectangleArea = obj.area(8, 4);

        // Display results
        System.out.println("Area of Square = " + squareArea);
        System.out.println("Area of Rectangle = " + rectangleArea);
    }
}