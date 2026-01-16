package ControlFlows.Level2;

import java.util.Scanner;

// Class to find and print factors of a number using a for loop
public class FactorsUsingFor {
    public static void main(String[] args) {
        // Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Read the number whose factors are to be printed
        int number = input.nextInt();

        // Validate that the number is positive
        if (number <= 0) {
            System.out.println("Enter a positive integer");
            return;
        }

        // Loop to check and print factors of the number
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}
