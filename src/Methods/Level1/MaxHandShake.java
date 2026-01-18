/*
 * Problem Statement:
 * ------------------
 * Given a number of students present in a room, calculate the maximum number
 * of handshakes that can occur if every student shakes hands with every other
 * student exactly once.
 *
 * Description:
 * ------------
 * This program calculates the maximum possible number of handshakes using
 * a mathematical formula. The logic is based on the concept of combinations,
 * where each pair of students can perform one handshake.
 *
 * The formula used is:
 *     n * (n - 1) / 2
 * where 'n' is the number of students.
 *
 * The program takes the number of students as input from the user, computes
 * the maximum number of handshakes using a separate method, and displays
 * the result.
 */

package Methods.Level1;

import java.util.Scanner;

// Class to calculate the maximum number of handshakes
public class MaxHandShake {

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
