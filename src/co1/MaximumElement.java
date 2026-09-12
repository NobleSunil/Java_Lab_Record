package co1;

public class MaximumElement {

    public static void main(String[] args) {

        // Declare an array
        int[] numbers = {10, 25, 7, 40, 15};

        // Assume the first element is the maximum
        int maximum = numbers[0];

        // Compare remaining elements
        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
        }

        // Display maximum element
        System.out.println("Maximum element: " + maximum);
    }
}
