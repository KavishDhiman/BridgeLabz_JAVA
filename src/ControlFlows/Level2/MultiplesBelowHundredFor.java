package ControlFlows.Level2;

import java.util.Scanner;

// Class to print multiples of a number below 100 using a for loop
public class MultiplesBelowHundredFor {
    public static void main(String[] args) {
        // Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Read the number whose multiples are to be printed
        int number = input.nextInt();

        // Validate input range
        if (number <= 0 || number >= 100) {
            System.out.println("Enter number between 1 and 99");
            return;
        }

        // Loop from 100 down to 1 to find multiples
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {
                System.out.println(i);
            }
        }
    }
}
