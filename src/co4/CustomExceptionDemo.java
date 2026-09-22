package co4;

// Custom unchecked exception
class InvalidAgeException extends RuntimeException {

    public InvalidAgeException(String message) {
        super(message);
    }
}

// Custom checked exception
class InsufficientFundsException extends Exception {

    public InsufficientFundsException(String message) {
        super(message);
    }
}

// Main class
public class CustomExceptionDemo {

    // Method declares the checked exception
    public static void withdraw(double balance, double amount)
            throws InsufficientFundsException {

        if (amount > balance) {

            throw new InsufficientFundsException(
                    "Insufficient balance! Required: " + amount
            );
        }

        System.out.println(
                "Withdrawal successful. New balance: "
                        + (balance - amount)
        );
    }

    // Method using custom unchecked exception
    public static void setAge(int age) {

        if (age < 0 || age > 150) {

            throw new InvalidAgeException(
                    "Age must be between 0 and 150."
            );
        }

        System.out.println("Age set to " + age);
    }

    public static void main(String[] args) {

        // Test insufficient balance
        try {

            withdraw(100.0, 200.0);

        } catch (InsufficientFundsException e) {

            System.out.println(
                    "Transaction failed: " + e.getMessage()
            );
        }

        // Test invalid age
        try {

            setAge(200);

        } catch (InvalidAgeException e) {

            System.out.println(
                    "Error: " + e.getMessage()
            );
        }
    }
}