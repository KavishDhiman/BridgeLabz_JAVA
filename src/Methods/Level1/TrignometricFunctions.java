/*
 * Problem Statement:
 * ------------------
 * Calculate sine, cosine, and tangent values for a given angle.
 *
 * Description:
 * ------------
 * The program takes an angle in degrees, converts it to radians, computes
 * trigonometric values using Math functions, and displays the results.
 */

package Methods.Level1;

import java.util.Scanner;

// Class to calculate trigonometric functions of an angle
public class TrignometricFunctions {

    // Method to calculate sine, cosine, and tangent of an angle
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        return new double[]{
                Math.sin(radians),
                Math.cos(radians),
                Math.tan(radians)
        };
    }

    public static void main(String[] args) {
        // Scanner to read user input
        Scanner sc = new Scanner(System.in);

        // Read angle in degrees
        double angle = sc.nextDouble();

        // Call method to calculate trigonometric values
        double[] result = calculateTrigonometricFunctions(angle);

        // Display the results
        System.out.println("Sine = " + result[0]);
        System.out.println("Cosine = " + result[1]);
        System.out.println("Tangent = " + result[2]);
    }
}
