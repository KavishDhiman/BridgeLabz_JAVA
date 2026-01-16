package ControlFlows.Level2;

import java.util.Scanner;

// Class to calculate power of a number using a for loop
public class PowerOfNumberFor {
    public static void main(String[] args) {
        // Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Read the base number and power
        int number = input.nextInt();
        int power = input.nextInt();

        // Variable to store the result
        int result = 1;

        // Loop to multiply number power times
        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        // Display the result
        System.out.println("Result is " + result);
    }
}
