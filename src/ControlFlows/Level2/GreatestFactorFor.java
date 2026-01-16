package ControlFlows.Level2;

import java.util.Scanner;

// Class to find the greatest factor of a number using a for loop
public class GreatestFactorFor {
    public static void main(String[] args) {
        // Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Read the number whose greatest factor is to be found
        int number = input.nextInt();

        // Variable to store the greatest factor (excluding the number itself)
        int greatestFactor = 1;

        // Loop from number-1 down to 1 to find the greatest factor
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }

        // Display the greatest factor
        System.out.println("Greatest factor is " + greatestFactor);
    }
}
