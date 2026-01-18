package Arrays.Level2;

import java.util.Scanner;

/*
 * This class reverses a given number
 * by storing its digits in an array.
 */
// Class to reverse a number using an array
public class ReverseNumbersUsingArray {
    public static void main(String[] args) {
        // Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Read the number to be reversed
        int number = input.nextInt();

        int temp = number;
        int count = 0;

        // Loop to count number of digits
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        // Array to store digits in reverse order
        int[] digits = new int[count];
        int index = 0;

        // Loop to extract digits and store them in array
        while (number != 0) {
            digits[index++] = number % 10;
            number /= 10;
        }

        // Print the reversed number
        System.out.print("Reversed Number: ");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);
        }
    }
}
