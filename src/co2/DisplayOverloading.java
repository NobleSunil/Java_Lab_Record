package co2;

public class DisplayOverloading {

    // Method to display an integer
    void display(int number) {
        System.out.println("Integer : " + number);
    }

    // Method to display a double
    void display(double number) {
        System.out.println("Double : " + number);
    }

    // Method to display a string
    void display(String text) {
        System.out.println("String : " + text);
    }

    public static void main(String[] args) {

        // Create object
        DisplayOverloading obj = new DisplayOverloading();

        // Call overloaded methods
        obj.display(10);
        obj.display(25.6);
        obj.display("Java");
    }
}
