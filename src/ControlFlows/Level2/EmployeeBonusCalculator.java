package ControlFlows.Level2;

import java.util.Scanner;

// Class to calculate employee bonus based on years of service
public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        // Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Read employee salary and years of service
        double salary = input.nextDouble();
        int years = input.nextInt();

        // Initialize bonus amount
        double bonus = 0;

        // Apply bonus if years of service is more than 5
        if (years > 5) {
            bonus = salary * 0.05;
        }

        // Display the calculated bonus
        System.out.println("The bonus amount is INR " + bonus);
    }
}
