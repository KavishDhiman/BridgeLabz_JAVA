package ControlFlows.Level3;

import java.util.Scanner;

// Class to count the number of digits in a given number
public class DigitCounter {
    public static void main(String[] args) {
        // Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Read the number whose digits are to be counted
        int number = input.nextInt();

        // Variable to store digit count
        int count = 0;

        // Special case when number is zero
        if (number == 0) {
            count = 1;
        } else {
            // Loop to count digits by dividing the number
            while (number != 0) {
                number = number / 10;
                count++;
            }
        }

        // Display the digit count
        System.out.println("The number of digits is " + count);
    }
}
