package co2;

public class AccessControl {

    // Private variable - cannot be accessed directly outside the class
    private String name;
    private int age;

    // Setter method to set the name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method to get the name
    public String getName() {
        return name;
    }

    // Setter method to set the age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter method to get the age
    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

        AccessControl student = new AccessControl();

        // Setting values using setter methods
        student.setName("Noble");
        student.setAge(22);

        // Getting values using getter methods
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
}