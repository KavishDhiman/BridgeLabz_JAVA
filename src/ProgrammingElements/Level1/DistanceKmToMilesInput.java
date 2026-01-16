package ProgrammingElements.Level1;

import java.util.Scanner;

public class DistanceKmToMilesInput {

    /*
     * This program converts kilometers to miles
     * using user input.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking distance in kilometers from user
        double km = sc.nextDouble();

        // Applying conversion formula
        double miles = km / 1.6;

        // Displaying the result
        System.out.println("The total miles is " +
                miles +
                " mile for the given " +
                km +
                " km");
    }
}
