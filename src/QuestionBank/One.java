package QuestionBank;

class Vehicle{
    String regNo;
    double dailyRate;

    Vehicle(String regNo, double dailyroute){
        this.regNo = regNo;
        this.dailyRate = dailyroute;
    }

    double computeRent(int days){
        return dailyRate * days;
    }
}

class Car extends Vehicle{
    int numDoors;
    Car(String regNo, double dailyroute, int numDoors){
        super(regNo, dailyroute);
        this.numDoors = numDoors;
    }

    @Override
    double computeRent(int days){
        return super.computeRent(days) + 200;
    }
}

public class One{
    public static void main(String[]args){
        Car c = new Car("KL01AB1234", 500, 4);

        System.out.println("Registration:" + c.regNo);
        System.out.println("Daily Rate:" + c.dailyRate);
        System.out.println("Number of Doors:" + c.numDoors);
        System.out.println("Total Rent:" + c.computeRent(6));
    }
}