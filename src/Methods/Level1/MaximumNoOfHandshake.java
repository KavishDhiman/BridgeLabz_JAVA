/*
 * Problem Statement:
 * ------------------
 * Write a program to determine the maximum number of handshakes possible
 * among a given number of students, assuming that each student shakes hands
 * with every other student exactly once.
 *
 * Description:
 * ------------
 * This program calculates the maximum number of handshakes using a mathematical
 * formula derived from combinations. The calculation ensures that no handshake
 * is counted more than once.
 *
 * The formula used to calculate the maximum number of handshakes is:
 *     n * (n - 1) / 2
 * where 'n' represents the total number of students.
 *
 * The program takes user input for the number of students, calls a separate
 * method to perform the calculation, and then displays the result.
 */

package Methods.Level1;

import java.util.Scanner;

// Class to calculate the maximum number of handshakes
public class MaximumNoOfHandshake {

    // Method to calculate maximum handshakes using formula n*(n-1)/2
    public static double handshake(double student) {
        return (student * (student - 1)) / 2;
    }

    static void main(String[] args) {
        // Scanner to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt and read number of students
        System.out.println("Enter the number of students");
        double student = sc.nextDouble();

        // Call handshake method to calculate result
        double hand = handshake(student);

        // Display the result
        System.out.println("The maximun number of handshakes possible are :" + hand);
    }
}
