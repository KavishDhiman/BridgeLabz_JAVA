/*
 * Problem Statement:
 * ------------------
 * Perform various checks and operations on a number and its digits.
 *
 * Description:
 * ------------
 * The class provides methods to analyze digits of a number, check special
 * number properties, and determine largest and smallest digit values.
 */

package Methods.Level3;

// Class to perform various checks and operations on numbers and their digits
public class NumChecker {

    // Method to count the number of digits in a number
    public static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    // Method to extract all digits of a number into an array
    public static int[] getDigits(int n) {
        int[] digits = new int[countDigits(n)];

        // Fill the array with digits in correct order
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    // Method to check if a number is a Duck number (contains zero)
    public static boolean isDuck(int[] digits) {
        for (int d : digits)
            if (d == 0) return true;
        return false;
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int n, int[] digits) {
        int sum = 0;

        // Calculate sum of digits raised to power of number of digits
        for (int d : digits)
            sum += Math.pow(d, digits.length);

        return sum == n;
    }

    // Method to find the largest and second largest digits
    public static int[] largestSecondLargest(int[] digits) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;

        // Loop to find top two maximum digits
        for (int d : digits) {
            if (d > max1) {
                max2 = max1;
                max1 = d;
            } else if (d > max2 && d != max1) {
                max2 = d;
            }
        }
        return new int[]{max1, max2};
    }

    // Method to find the smallest and second smallest digits
    public static int[] smallestSecondSmallest(int[] digits) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        // Loop to find top two minimum digits
        for (int d : digits) {
            if (d < min1) {
                min2 = min1;
                min1 = d;
            } else if (d < min2 && d != min1) {
                min2 = d;
            }
        }
        return new int[]{min1, min2};
    }
}
