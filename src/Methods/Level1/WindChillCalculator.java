/*
 * Problem Statement:
 * ------------------
 * Calculate the wind chill based on given temperature and wind speed.
 *
 * Description:
 * ------------
 * The program uses the standard wind chill formula to compute and display
 * the perceived temperature based on user input.
 */

package Methods.Level1;

import java.util.Scanner;

// Class to calculate wind chill based on temperature and wind speed
public class WindChillCalculator {

    // Method to calculate wind chill using standard formula
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature +
                (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        // Scanner to read user input
        Scanner sc = new Scanner(System.in);

        // Read temperature and wind speed
        double temperature = sc.nextDouble();
        double windSpeed = sc.nextDouble();

        // Display calculated wind chill
        System.out.println("Wind Chill = " +
                calculateWindChill(temperature, windSpeed));
    }
}
