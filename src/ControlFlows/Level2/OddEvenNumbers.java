package ControlFlows.Level2;

import java.util.Scanner;

// Class to print whether numbers are odd or even up to a given number
public class OddEvenNumbers {
    public static void main(String[] args) {
        // Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Read the upper limit number
        int number = input.nextInt();

        // Validate that the number is a natural number
        if (number <= 0) {
            System.out.println("Please enter a Natural Number");
            return;
        }

        // Loop from 1 to number to check odd or even
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0)
                System.out.println(i + " is Even");
            else
                System.out.println(i + " is Odd");
        }
    }
}
