/*
 * Problem Statement:
 * ------------------
 * Perform operations on the factors of a given number.
 *
 * Description:
 * ------------
 * The program finds all factors of a number and calculates their sum,
 * product, and sum of squares using separate methods.
 */

package Methods.Level2;

import java.util.Scanner;

// Class to perform different operations on factors of a number
public class FactorOperation {

    // Method to find all factors of a given number
    public static int[] findFactors(int number) {
        int count = 0;

        // First loop to count total number of factors
        for (int i = 1; i <= number; i++)
            if (number % i == 0) count++;

        // Array to store factors
        int[] factors = new int[count];
        int index = 0;

        // Second loop to store factors in the array
        for (int i = 1; i <= number; i++)
            if (number % i == 0) factors[index++] = i;

        return factors;
    }

    // Method to calculate sum of all factors
    public static int sumFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    // Method to calculate product of all factors
    public static int productFactors(int[] factors) {
        int product = 1;
        for (int f : factors) product *= f;
        return product;
    }

    // Method to calculate sum of squares of all factors
    public static double sumOfSquares(int[] factors) {
        double sum = 0;
        for (int f : factors) sum += Math.pow(f, 2);
        return sum;
    }

    public static void main(String[] args) {
        // Scanner to read user input
        Scanner sc = new Scanner(System.in);

        // Read the number
        int number = sc.nextInt();

        // Find all factors of the number
        int[] factors = findFactors(number);

        // Print all factors
        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");

        // Display sum, product, and sum of squares of factors
        System.out.println("\nSum = " + sumFactors(factors));
        System.out.println("Product = " + productFactors(factors));
        System.out.println("Sum of Squares = " + sumOfSquares(factors));
    }
}
