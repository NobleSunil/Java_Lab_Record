package co1;

public class PositiveNegativeZero {

    public static void main(String[] args) {

        // Declare an array of numbers
        int[] numbers = {10, -5, 0, 20, -8, 0};

        // Counters for each type
        int positive = 0;
        int negative = 0;
        int zero = 0;

        // Check each element
        for (int number : numbers) {

            if (number > 0) {
                positive++;
            }
            else if (number < 0) {
                negative++;
            }
            else {
                zero++;
            }
        }

        // Display the counts
        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zeros: " + zero);
    }
}