package Arrays.Level2;

import java.util.Scanner;

// Class to calculate the frequency of each digit in a number
public class DigitFrequencyArray {
    public static void main(String[] args) {
        // Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Read the number whose digits are to be analyzed
        int number = input.nextInt();

        int temp = number;
        int count = 0;

        // Loop to count total number of digits
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        // Array to store individual digits
        int[] digits = new int[count];

        // Array to store frequency of digits 0 to 9
        int[] frequency = new int[10];

        // Loop to extract digits and count their frequency
        int index = 0;
        while (number != 0) {
            digits[index] = number % 10;
            frequency[digits[index]]++;
            number /= 10;
            index++;
        }

        // Display the frequency of each digit
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + " occurs " + frequency[i] + " times");
            }
        }
    }
}
