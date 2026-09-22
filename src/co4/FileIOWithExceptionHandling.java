package co4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIOWithExceptionHandling {

    public static void main(String[] args) {

        // Name of the file
        String fileName = "data.txt";

        // =========================
        // Writing to the file
        // =========================
        try (PrintWriter writer =
                     new PrintWriter(new FileWriter(fileName))) {

            // Write data into the file
            writer.println("Line 1: Java");
            writer.println("Line 2: Python");
            writer.println("Line 3: C++");

            System.out.println("Data written successfully.");

        } catch (IOException e) {

            // Handle writing errors
            System.out.println(
                    "Write error: " + e.getMessage()
            );
        }

        // =========================
        // Reading from the file
        // =========================
        try (Scanner scanner =
                     new Scanner(new File(fileName))) {

            System.out.println();
            System.out.println(
                    "Contents of " + fileName + ":"
            );

            // Read the file line by line
            while (scanner.hasNextLine()) {

                System.out.println(scanner.nextLine());
            }

        } catch (FileNotFoundException e) {

            // Handle file-not-found error
            System.out.println(
                    "Read error: " + e.getMessage()
            );
        }
    }
}