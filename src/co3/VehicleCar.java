package co3;

// Parent class
class Vehicle {

    // Public member
    public String company;

    // Protected member
    protected String model;

    // Default member
    String fuelType;

    // Constructor
    Vehicle(String company, String model, String fuelType) {
        this.company = company;
        this.model = model;
        this.fuelType = fuelType;
    }
}

// Child class
class Car extends Vehicle {

    // Constructor
    Car(String company, String model, String fuelType) {
        super(company, model, fuelType);
    }

    // Display inherited members
    void displayCar() {
        System.out.println("Vehicle Information");
        System.out.println("-------------------");
        System.out.println("Company : " + company);
        System.out.println("Model : " + model);
        System.out.println("Fuel Type : " + fuelType);
    }
}

// Main class
public class VehicleCar {

    public static void main(String[] args) {

        Car car = new Car(
                "Toyota",
                "Innova",
                "Diesel"
        );

        car.displayCar();

        System.out.println("Car object created successfully.");
    }
}
