package co2;

public class ObjectCounter {

    // Static variable shared by all objects
    static int count = 0;

    // Constructor
    ObjectCounter() {
        count++;
    }

    // Method to display the object count
    void displayCount() {
        System.out.println("Number of objects created: " + count);
    }

    public static void main(String[] args) {

        // Creating objects
        ObjectCounter obj1 = new ObjectCounter();
        ObjectCounter obj2 = new ObjectCounter();
        ObjectCounter obj3 = new ObjectCounter();

        // Display total number of objects
        obj1.displayCount();
    }
}