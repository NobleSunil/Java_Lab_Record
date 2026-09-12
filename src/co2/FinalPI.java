package co2;

public class FinalPI {

    // Final variable - its value cannot be changed
    static final double PI = 3.14159;

    // Method to calculate circle area
    static double calculateArea(double radius) {
        return PI * radius * radius;
    }

    public static void main(String[] args) {

        double radius = 7;

        // Calculate area using final PI value
        double area = calculateArea(radius);

        System.out.println("Radius: " + radius);
        System.out.println("PI: " + PI);
        System.out.println("Area of Circle: " + area);
    }
}
