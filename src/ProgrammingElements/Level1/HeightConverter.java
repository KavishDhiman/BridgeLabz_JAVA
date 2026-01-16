package ProgrammingElements.Level1;

import java.util.Scanner;

public class HeightConverter {

    /*
     * This program converts height from centimeters
     * into feet and inches.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking height in centimeters
        double cm = sc.nextDouble();

        // Converting cm to inches
        double inches = cm / 2.54;

        // Calculating feet and remaining inches
        int feet = (int) inches / 12;
        double remainingInches = inches % 12;

        // Displaying converted values
        System.out.println("Your Height in cm is " +
                cm +
                " while in feet is " +
                feet +
                " and inches is " +
                remainingInches);
    }
}
