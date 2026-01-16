package ControlFlows.Level2;

import java.util.Scanner;

// Class to find the greatest factor of a number using a while loop
public class GreatestFactorWhile {
    public static void main(String[] args) {
        // Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Read the number whose greatest factor is to be found
        int number = input.nextInt();

        // Variable to store the greatest factor (excluding the number itself)
        int greatestFactor = 1;

        // Start checking from number-1
        int i = number - 1;

        // Loop to find the greatest factor
        while (i >= 1) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
            i--;
        }

        // Display the greatest factor
        System.out.println("Greatest factor is " + greatestFactor);
    }
}
