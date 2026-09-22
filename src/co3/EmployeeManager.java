package co3;

// Parent class
class Employee {

    // Employee details
    String name;
    double salary;

    // Constructor
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Child class inherits Employee
class Manager extends Employee {

    // Additional property specific to Manager
    String department;

    // Manager constructor
    Manager(String name, double salary, String department) {

        // Calling parent class constructor
        super(name, salary);

        this.department = department;
    }

    // Method to display manager details
    void displayManager() {

        // Calling inherited method
        displayEmployee();

        System.out.println("Department: " + department);
    }
}

// Main class
public class EmployeeManager {

    public static void main(String[] args) {

        // Create Manager object
        Manager manager = new Manager(
                "John",
                50000,
                "IT"
        );

        // Display details
        manager.displayManager();
    }
}