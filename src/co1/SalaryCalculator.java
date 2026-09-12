package co1;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Get basic salary from the user
        System.out.print("Enter basic salary: ");
        double basicSalary = scanner.nextDouble();

        // Calculate allowances
        double hra = basicSalary * 0.20;  // 20% HRA
        double da = basicSalary * 0.10;   // 10% DA

        // Calculate gross salary
        double grossSalary = basicSalary + hra + da;

        // Display salary details
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + grossSalary);

        scanner.close();
    }
}