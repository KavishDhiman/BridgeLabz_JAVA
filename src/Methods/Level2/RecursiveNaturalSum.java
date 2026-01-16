package Methods.Level2;

import java.util.Scanner;

// Class to calculate sum of natural numbers using recursion and formula
public class RecursiveNaturalSum {

    // Method to calculate sum using recursion
    public static int recursiveSum(int n) {
        if (n == 0) return 0;
        return n + recursiveSum(n - 1);
    }

    // Method to calculate sum using mathematical formula
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        // Scanner to read user input
        Scanner sc = new Scanner(System.in);

        // Read the value of n
        int n = sc.nextInt();

        // Exit if input is not a positive number
        if (n <= 0) return;

        // Calculate sum using both methods
        int rSum = recursiveSum(n);
        int fSum = formulaSum(n);

        // Display the results
        System.out.println("Recursive Sum = " + rSum);
        System.out.println("Formula Sum = " + fSum);
    }
}
