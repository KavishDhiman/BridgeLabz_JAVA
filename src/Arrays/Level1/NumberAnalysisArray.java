package Arrays.Level1;

import java.util.Scanner;

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
