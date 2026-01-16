package ControlFlows.Level2;

import java.util.Scanner;

// Class to print FizzBuzz output using a for loop
public class FizzBuzzFor {
    public static void main(String[] args) {
        // Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Read the upper limit number
        int number = input.nextInt();

        // Validate that the number is positive
        if (number <= 0) {
            System.out.println("Enter a positive integer");
            return;
        }

        // Loop from 1 to number and apply FizzBuzz logic
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }
}
