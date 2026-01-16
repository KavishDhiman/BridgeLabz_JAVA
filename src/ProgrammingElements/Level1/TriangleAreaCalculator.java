package ProgrammingElements.Level1;

import java.util.Scanner;

public class TriangleAreaCalculator {

    /*
     * This program calculates the area of a triangle
     * using base and height provided by the user.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking base and height as input
        double base = sc.nextDouble();
        double height = sc.nextDouble();

        // Area formula: 1/2 * base * height
        double area = 0.5 * base * height;

        // Displaying the area
        System.out.println("The area of the triangle is " + area);
    }
}
