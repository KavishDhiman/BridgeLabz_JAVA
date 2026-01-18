package Arrays.Level2;

import java.util.Scanner;
/*
 * This class extracts digits from an integer number,
 * stores them in an array, and determines the largest
 * and second largest digits among them.
 */
// Class to find the largest and second largest digits using a dynamic array
public class LargestAndSecondDynamic {
    public static void main(String[] args) {
        // Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Read the number whose digits are to be processed
        int number = input.nextInt();

        // Initial size of the digits array
        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        // Tracks number of digits stored
        int index = 0;

        // Loop to extract digits and store them dynamically
        while (number != 0) {

            // Increase array size if it becomes full
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];

                // Copy old digits into new array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }
                digits = temp;
            }

            // Store current digit
            digits[index++] = number % 10;
            number /= 10;
        }

        // Variables to store largest and second largest digits
        int largest = 0, secondLargest = 0;

        // Loop to find largest and second largest values
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display results
        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + secondLargest);
    }
}
