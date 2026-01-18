/*
 * Problem Statement:
 * ------------------
 * Analyze a number based on its factors and special number properties.
 *
 * Description:
 * ------------
 * The class provides methods to find factors of a number and determine
 * whether it is perfect, abundant, deficient, or strong.
 */

package Methods.Level3;

// Class to analyze a number based on its factors and special properties
public class NumberFactorAnalysis {

    // Method to find all factors of a given number
    public static int[] findFactors(int n) {
        int count = 0;

        // First loop to count number of factors
        for (int i = 1; i <= n; i++)
            if (n % i == 0) count++;

        // Array to store factors
        int[] factors = new int[count];
        int idx = 0;

        // Second loop to store factors
        for (int i = 1; i <= n; i++)
            if (n % i == 0) factors[idx++] = i;

        return factors;
    }

    // Method to calculate sum of proper factors (excluding the number itself)
    public static int sumOfProperFactors(int[] factors, int n) {
        int sum = 0;
        for (int f : factors)
            if (f != n) sum += f;
        return sum;
    }

    // Method to check if a number is a Perfect number
    public static boolean isPerfect(int n, int[] factors) {
        return sumOfProperFactors(factors, n) == n;
    }

    // Method to check if a number is an Abundant number
    public static boolean isAbundant(int n, int[] factors) {
        return sumOfProperFactors(factors, n) > n;
    }

    // Method to check if a number is a Deficient number
    public static boolean isDeficient(int n, int[] factors) {
        return sumOfProperFactors(factors, n) < n;
    }

    // Method to check if a number is a Strong number
    public static boolean isStrong(int n) {
        int temp = n, sum = 0;

        // Loop to calculate sum of factorials of digits
        while (temp > 0) {
            int d = temp % 10;
            sum += factorial(d);
            temp /= 10;
        }
        return sum == n;
    }

    // Method to calculate factorial of a digit
    static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
    }
}
