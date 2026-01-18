/*
 * Problem Statement:
 * ------------------
 * Calculate the number of rounds required to cover 5000 meters around a park.
 *
 * Description:
 * ------------
 * The program calculates the park’s perimeter using three sides and determines
 * how many rounds are needed to complete 5000 meters.
 */

package Methods.Level1;

import java.util.Scanner;

// Class to calculate how many rounds are needed to cover 5000 meters
public class Perimeter {

    // Method to calculate number of rounds based on perimeter
    public static double Totalrounds(double s1, double s2, double s3) {
        double perimeter = s1 + s2 + s3;
        return 5000 / perimeter;
    }

    static void main(String[] args) {
        // Scanner to read user input
        Scanner sc = new Scanner(System.in);

        // Read the three sides of the park
        System.out.println("Enter the sides of park in Meters ");
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();

        // Call method to calculate total rounds
        double rounds = Totalrounds(side1, side2, side3);

        // Display the result
        System.out.println("The total number of rounds are" + rounds);
    }
}
