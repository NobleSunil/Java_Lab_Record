package co3;

// Abstract parent class
abstract class RescueRobot {

    protected String robotName;
    protected String location;

    // Constructor
    RescueRobot(String robotName, String location) {
        this.robotName = robotName;
        this.location = location;
    }

    // Concrete method
    void displayRobotDetails() {
        System.out.println("Robot: " + robotName);
        System.out.println("Location: " + location);
    }

    // Abstract mission method
    abstract void performMission();
}

// Interface for flying ability
interface Flyable {
    void fly();
}

// Interface for swimming ability
interface Swimmable {
    void swim();
}

// Interface for climbing ability
interface Climbable {
    void climb();
}

// Flying rescue robot
class AerialRobot extends RescueRobot implements Flyable {

    AerialRobot(String name, String location) {
        super(name, location);
    }

    public void fly() {
        System.out.println("Robot is flying.");
    }

    @Override
    void performMission() {
        System.out.println("Performing aerial rescue mission.");
    }
}

// Swimming rescue robot
class UnderwaterRobot extends RescueRobot implements Swimmable {

    UnderwaterRobot(String name, String location) {
        super(name, location);
    }

    public void swim() {
        System.out.println("Robot is swimming underwater.");
    }

    @Override
    void performMission() {
        System.out.println("Performing underwater rescue mission.");
    }
}

// Climbing rescue robot
class MountainRobot extends RescueRobot implements Climbable {

    MountainRobot(String name, String location) {
        super(name, location);
    }

    public void climb() {
        System.out.println("Robot is climbing.");
    }

    @Override
    void performMission() {
        System.out.println("Performing mountain rescue mission.");
    }
}

// Robot supporting multiple abilities
class MultiPurposeRobot extends RescueRobot
        implements Flyable, Swimmable, Climbable {

    MultiPurposeRobot(String name, String location) {
        super(name, location);
    }

    public void fly() {
        System.out.println("Robot is flying.");
    }

    public void swim() {
        System.out.println("Robot is swimming.");
    }

    public void climb() {
        System.out.println("Robot is climbing.");
    }

    @Override
    void performMission() {
        System.out.println("Performing multi-purpose rescue mission.");
    }
}

// Main class
public class EmergencyRescueRobot {

    public static void main(String[] args) {

        // Abstract class references
        RescueRobot robot1 =
                new AerialRobot("SkyRescue", "Mountain");

        RescueRobot robot2 =
                new UnderwaterRobot("AquaRescue", "Ocean");

        RescueRobot robot3 =
                new MountainRobot("RockRescue", "Hills");

        RescueRobot robot4 =
                new MultiPurposeRobot("MultiRescue", "Disaster Zone");

        // Demonstrate robots
        System.out.println("=== Robot 1 ===");
        robot1.displayRobotDetails();
        robot1.performMission();

        System.out.println();

        System.out.println("=== Robot 2 ===");
        robot2.displayRobotDetails();
        robot2.performMission();

        System.out.println();

        System.out.println("=== Robot 3 ===");
        robot3.displayRobotDetails();
        robot3.performMission();

        System.out.println();

        System.out.println("=== Robot 4 ===");
        robot4.displayRobotDetails();
        robot4.performMission();

        System.out.println();

        // Interface reference
        Flyable flyingRobot = new MultiPurposeRobot(
                "FlyingMulti",
                "City"
        );

        flyingRobot.fly();
    }
}