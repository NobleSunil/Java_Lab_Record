package co2;

public class Employee {

    // Instance variables
    String name;
    double salary;

    // Parameterized constructor
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    void display() {
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Salary : " + salary);
    }

    public static void main(String[] args) {

        // Create Employee object using parameterized constructor
        Employee employee = new Employee("Rahul", 35000);

        // Display employee details
        employee.display();
    }
}