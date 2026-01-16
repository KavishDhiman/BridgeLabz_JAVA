package ControlFlows.Level3;

import java.util.Scanner;

// Class to check whether a number is a Harshad number
public class HarshadNumberChecker {
    public static void main(String[] args) {
        // Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Read the number to be checked
        int number = input.nextInt();

        // Store original number for processing
        int originalNumber = number;

        // Variable to store sum of digits
        int sum = 0;

        // Loop to calculate sum of digits
        while (originalNumber != 0) {
            sum += originalNumber % 10;
            originalNumber = originalNumber / 10;
        }

        // Check if number is divisible by sum of its digits
        if (sum != 0 && number % sum == 0) {
            System.out.println(number + " is a Harshad Number");
        } else {
            System.out.println(number + " is not a Harshad Number");
        }
    }
}
