/*
 * Problem Statement:
 * ------------------
 * Generate random 4-digit numbers and compute basic statistics.
 *
 * Description:
 * ------------
 * The program generates an array of random 4-digit numbers, calculates
 * the average, minimum, and maximum values, and displays the results.
 */

package Methods.Level2;

import java.util.Random;

// Class to generate random numbers and calculate statistics
public class RandomStats {

    // Method to generate an array of random 4-digit numbers
    public static int[] generate4DigitRandomArray(int size) {
        Random r = new Random();
        int[] arr = new int[size];

        // Loop to fill array with random 4-digit numbers
        for (int i = 0; i < size; i++)
            arr[i] = 1000 + r.nextInt(9000);

        return arr;
    }

    // Method to find average, minimum, and maximum values
    public static double[] findAverageMinMax(int[] nums) {
        int min = nums[0], max = nums[0], sum = 0;

        // Loop to calculate sum, min, and max
        for (int n : nums) {
            sum += n;
            min = Math.min(min, n);
            max = Math.max(max, n);
        }

        return new double[]{ (double) sum / nums.length, min, max };
    }

    public static void main(String[] args) {
        // Generate random array
        int[] arr = generate4DigitRandomArray(5);

        // Calculate statistics
        double[] stats = findAverageMinMax(arr);

        // Print generated numbers
        for (int n : arr)
            System.out.print(n + " ");

        // Print average, min, and max values
        System.out.println("\nAverage=" + stats[0] +
                " Min=" + stats[1] +
                " Max=" + stats[2]);
    }
}
