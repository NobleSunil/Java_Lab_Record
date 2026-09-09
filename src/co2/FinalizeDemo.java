package co2;

public class FinalizeDemo {

    // Constructor
    FinalizeDemo() {
        System.out.println("Object Created");
    }

    // finalize() is called before the object is garbage collected
    @Override
    protected void finalize() {
        System.out.println("finalize() method called");
    }

    public static void main(String[] args) {

        // Create an object
        FinalizeDemo object = new FinalizeDemo();

        // Make the object eligible for garbage collection
        object = null;

        // Request garbage collection
        System.gc();
    }
}
