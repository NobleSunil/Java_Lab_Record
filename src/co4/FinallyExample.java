package co4;

public class FinallyExample {

    public static void main(String[] args) {

        try {

            // Create an array
            int[] numbers = {1, 2, 3};

            // This causes ArrayIndexOutOfBoundsException
            System.out.println(numbers[5]);

        }
        catch (ArrayIndexOutOfBoundsException e) {

            System.out.println(
                    "Index error: " + e.getMessage()
            );

        }
        finally {

            // This block executes regardless of exception
            System.out.println(
                    "This always runs - clean up resources."
            );
        }
    }
}
