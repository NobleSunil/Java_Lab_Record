package co2;

import java.util.Scanner;

public class ConstructorChaining {

    // Instance variables
    String name;
    int age;

    // Default constructor
    ConstructorChaining() {

        // Call the parameterized constructor
        this("Manu", 21);

        System.out.println("Default Constructor");
    }

    // Parameterized constructor
    ConstructorChaining(String name, int age) {

        // Initialize instance variables
        this.name = name;
        this.age = age;

        System.out.println("Parameterized Constructor");
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }

    public static void main(String[] args) {

        // Create object using default constructor
        ConstructorChaining student = new ConstructorChaining();
    }
}