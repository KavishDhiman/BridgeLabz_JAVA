/*
 * Problem Statement:
 * ------------------
 * Check whether a given number is positive, negative, or zero.
 *
 * Description:
 * ------------
 * The program takes a number as input, determines its sign using a method,
 * and displays whether it is positive, negative, or zero.
 */

package Methods.Level1;

import java.util.Scanner;

// Class to check whether a number is positive, negative, or zero
public class PositiveNegativeZero {

    // Method to determine the sign of a number
    public static int numChecker(double num) {
        if (num < 0) {
            return -1;
        } else if (num > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        // Scanner to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt and read the number
        System.out.println("Enter the number:");
        double num = sc.nextDouble();

        // Call method to check number sign
        int sign = numChecker(num);

        // Display result based on returned value
        if (sign == 1) {
            System.out.println("Positive");
        } else if (sign == -1) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
