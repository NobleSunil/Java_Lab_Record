package co4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWritePrintWriter {

    public static void main(String[] args) {

        // Name of the output file
        String fileName = "output.txt";

        // Try-with-resources automatically closes PrintWriter
        try (PrintWriter writer = new PrintWriter(fileName)) {

            // Write data to the file
            writer.println("Hello, world!");

            writer.printf(
                    "Formatted number: %.2f%n",
                    3.14159
            );

            writer.println("End of file.");

            System.out.println(
                    "Data written to " + fileName
            );

        } catch (FileNotFoundException e) {

            System.out.println(
                    "Cannot write to file: " + e.getMessage()
            );
        }
    }
}
