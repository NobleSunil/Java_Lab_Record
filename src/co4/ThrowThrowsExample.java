package co4;

public class ThrowThrowsExample {

    // throws declares that this method may produce
    // an InterruptedException
    public static void sleepForAWhile(int milliseconds)
            throws InterruptedException {

        Thread.sleep(milliseconds);
    }

    // throw is used to explicitly create and throw
    // an exception
    public static void validateAge(int age) {

        if (age < 0) {
            throw new IllegalArgumentException(
                    "Age cannot be negative!"
            );
        }

        System.out.println("Age is valid: " + age);
    }

    public static void main(String[] args) {

        // Handle the checked exception declared by throws
        try {

            sleepForAWhile(1000);

        } catch (InterruptedException e) {

            System.out.println("Sleep interrupted");
        }

        // Handle the exception explicitly thrown by throw
        try {

            validateAge(-5);

        } catch (IllegalArgumentException e) {

            System.out.println("Caught: " + e.getMessage());
        }
    }
}

