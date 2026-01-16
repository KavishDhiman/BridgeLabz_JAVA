package ControlFlows.Level3;

import java.util.Scanner;

// Class to check whether a number is an Abundant number
public class AbundantnumberChecker {
    public static void main(String[] args) {
        // Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Read the number to be checked
        int number = input.nextInt();

        // Variable to store sum of proper divisors
        int sum = 0;

        // Loop to find and add all proper divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Check if the sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number");
        } else {
            System.out.println(number + " is not an Abundant Number");
        }
    }
}
