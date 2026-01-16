package ProgrammingElements.Level1;

import java.util.Scanner;

public class SquareSideFinder {

    /*
     * This program finds the side length of a square
     * using the perimeter provided by the user.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking perimeter of the square
        double perimeter = sc.nextDouble();

        // Side of square = perimeter / 4
        double side = perimeter / 4;

        // Displaying the result
        System.out.println(
                "The length of the side is " +
                        side +
                        " whose perimeter is " +
                        perimeter
        );
    }
}
