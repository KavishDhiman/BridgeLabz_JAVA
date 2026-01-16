package ControlFlows.Level3;

import java.util.Scanner;

// Class to check whether a number is an Armstrong number
public class ArmstrongNumberChecker {
    public static void main(String[] args) {
        // Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Read the number to be checked
        int number = input.nextInt();

        // Store original number for comparison
        int originalNumber = number;

        // Variable to store sum of cubes of digits
        int sum = 0;

        // Loop to extract digits and calculate cube sum
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum += digit * digit * digit;
            originalNumber = originalNumber / 10;
        }

        // Check if sum of cubes equals the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number");
        } else {
            System.out.println(number + " is not an Armstrong Number");
        }
    }
}
