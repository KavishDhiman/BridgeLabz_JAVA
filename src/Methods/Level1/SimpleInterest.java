/*
 * Problem Statement:
 * ------------------
 * Calculate the simple interest for given principal, rate of interest, and time.
 *
 * Description:
 * ------------
 * The program uses the simple interest formula to compute interest based on
 * user input and displays the calculated value.
 */

package Methods.Level1;

import java.util.*;

// Class to calculate simple interest
public class SimpleInterest {

    // Method to calculate simple interest using formula (P * R * T) / 100
    public static double calculatesimpleinterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        // Scanner to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt and read principal, rate, and time
        System.out.println("Enter the parameters");
        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();

        // Call method to calculate simple interest
        double SimpleInterest = calculatesimpleinterest(principal, rate, time);

        // Display the result
        System.out.println("The Simple Interest is " + SimpleInterest +
                " for Principal " + principal +
                ", Rate of Interest " + rate +
                " and Time " + time);
    }
}
