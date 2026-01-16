package ControlFlows.Level2;

import java.util.Scanner;

// Class to find and print factors of a number using a while loop
public class FactorsUsingWhile {
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

        // Start checking factors from 1
        int i = 1;

        // Loop to find and print factors of the number
        while (i < number) {
            if (number % i == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
