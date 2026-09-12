package co2;

public class TemperatureConversion {

    // Static method to convert Celsius to Fahrenheit
    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {

        double celsius = 25;

        // Calling static method directly using class name
        double fahrenheit = TemperatureConversion.celsiusToFahrenheit(celsius);

        System.out.println("Temperature in Celsius: " + celsius);
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}