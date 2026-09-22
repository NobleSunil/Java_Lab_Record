package co4;

public class TryCatchExample {

    public static void main(String[] args) {

        // Code that may cause an exception
        try {

            int number1 = 10;
            int number2 = 0;

            // Division by zero causes ArithmeticException
            int result = number1 / number2;

            System.out.println("Result: " + result);

        }
        // Handles the ArithmeticException
        catch (ArithmeticException e) {

            System.out.println(
                    "Cannot divide by zero: " + e.getMessage()
            );
        }

        // Program continues after handling the exception
        System.out.println("Program continues...");
    }
}