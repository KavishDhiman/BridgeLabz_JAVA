package ControlFlows.Level2;

import java.util.Scanner;

// Class to print multiples of a number below 100 using a while loop
public class MultiplesBelowHundredWhile {
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

        // Start checking from 100
        int i = 100;

        // Loop to find and print multiples
        while (i >= 1) {
            if (i % number == 0) {
                System.out.println(i);
            }
            i--;
        }
    }
}
