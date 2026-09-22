package co4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadScanner {

    public static void main(String[] args) {

        // Specify the input file
        File file = new File("input.txt");

        // Try-with-resources automatically closes Scanner
        try (Scanner scanner = new Scanner(file)) {

            // Read the file line by line
            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();

                System.out.println(line);
            }

        } catch (FileNotFoundException e) {

            System.out.println(
                    "File not found: " + e.getMessage()
            );
        }
    }
}