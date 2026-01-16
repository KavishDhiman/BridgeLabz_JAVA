package Arrays.Level2;

import java.util.Scanner;

// Class to find the largest and second largest digits of a number
public class LargestAndSecondLargestDigit {
    public static void main(String[] args) {
        // Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Read the number whose digits are to be analyzed
        int number = input.nextInt();

        // Maximum digits allowed to be stored
        int maxDigit = 10;

        // Array to store extracted digits
        int[] digits = new int[maxDigit];

        // Tracks how many digits are stored
        int index = 0;

        // Loop to extract digits until number ends or array limit is reached
        while (number != 0 && index < maxDigit) {
            digits[index++] = number % 10;
            number /= 10;
        }

        // Variables to store largest and second largest digits
        int largest = 0, secondLargest = 0;

        // Loop to determine largest and second largest values
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display the results
        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + secondLargest);
    }
}
