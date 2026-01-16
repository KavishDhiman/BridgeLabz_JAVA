package ControlFlows.Level2;

import java.util.Scanner;

// Class to calculate power of a number using a while loop
public class PowerOfNumberWhile {
    public static void main(String[] args) {
        // Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Read the base number and power
        int number = input.nextInt();
        int power = input.nextInt();

        // Variable to store the result
        int result = 1;

        // Counter to track number of multiplications
        int counter = 0;

        // Loop to multiply number power times
        while (counter < power) {
            result *= number;
            counter++;
        }

        // Display the result
        System.out.println("Result is " + result);
    }
}
