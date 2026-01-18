package Arrays.Level1;

import java.util.Scanner;
/*
 * Problem Statement:
 * Write a Java program to analyze numbers stored in an array by checking
 * whether each number is positive, negative, zero, even, or odd, and then
 * compare the first and last elements of the array.
 */

/*
 * Class Name: NumberAnalysis
 *
 * Description:
 * This class accepts five integer values from the user, stores them in an array,
 * analyzes each number to determine its nature (positive, negative, zero,
 * even or odd), and finally compares the first and last elements of the array.
 */
// Class to analyze numbers for zero, positive/negative, and even/odd
public class NumberAnalysisArray {
    static void main(String[] args) {
        // Scanner to read user input
        Scanner sc = new Scanner(System.in);

        // Array to store 5 numbers
        int[] number = new int[5];

        // Prompt user to enter numbers
        System.out.println("Enter the numbers");

        // Loop to read numbers into the array
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }

        // Enhanced for-loop to analyze each number
        for (int num : number) {

            // Check if number is zero
            if (num == 0) {
                System.out.println("The number is zero");

                // Check if number is negative
            } else if (num < 0) {
                System.out.println("The number is negative");

                // For positive numbers, check even or odd
            } else {
                if (num % 2 == 0) {
                    System.out.println("The number is even");
                } else {
                    System.out.println("The number is odd");
                }
            }
        }
    }
}
