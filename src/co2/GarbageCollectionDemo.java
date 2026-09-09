package co2;

public class GarbageCollectionDemo {

    // Method called when an object is created
    void display() {
        System.out.println("Object Created");
    }

    // finalize() is called by the garbage collector
    @Override
    protected void finalize() {
        System.out.println("Object Destroyed");
    }

    public static void main(String[] args) {

        // Create multiple objects
        GarbageCollectionDemo object1 = new GarbageCollectionDemo();
        GarbageCollectionDemo object2 = new GarbageCollectionDemo();

        object1.display();
        object2.display();

        // Make objects eligible for garbage collection
        object1 = null;
        object2 = null;

        // Request garbage collection
        System.out.println("Garbage Collection Requested");
        System.gc();
    }
}