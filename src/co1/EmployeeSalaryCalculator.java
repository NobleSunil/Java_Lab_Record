package co1;

import java.util.Scanner;

public class EmployeeSalaryCalculator {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Read basic salary
        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        // Calculate DA and HRA
        double da = basicSalary * 0.10;
        double hra = basicSalary * 0.15;

        // Calculate gross salary
        double grossSalary = basicSalary + da + hra;

        // Display salary details
        System.out.println("\nDA            = " + da);
        System.out.println("HRA           = " + hra);
        System.out.println("Gross Salary  = " + grossSalary);

        // Close Scanner
        sc.close();
    }
}
