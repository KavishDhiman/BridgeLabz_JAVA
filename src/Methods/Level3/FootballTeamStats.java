/*
 * Problem Statement:
 * ------------------
 * Calculate basic statistics of a football team's player heights.
 *
 * Description:
 * ------------
 * The program generates random heights for players and calculates the
 * mean, shortest, and tallest heights using separate methods.
 */

package Methods.Level3;

import java.util.Random;

// Class to calculate basic statistics of a football team's heights
public class FootballTeamStats {

    // Method to generate random heights for 11 players
    static int[] generateHeights() {
        Random r = new Random();
        int[] heights = new int[11];

        // Loop to assign random heights between 150 and 250
        for (int i = 0; i < heights.length; i++)
            heights[i] = 150 + r.nextInt(101); // 150–250

        return heights;
    }

    // Method to calculate sum of array elements
    static int sum(int[] arr) {
        int s = 0;
        for (int a : arr) s += a;
        return s;
    }

    // Method to calculate mean height
    static double mean(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    // Method to find the shortest height
    static int shortest(int[] arr) {
        int min = arr[0];
        for (int a : arr) if (a < min) min = a;
        return min;
    }

    // Method to find the tallest height
    static int tallest(int[] arr) {
        int max = arr[0];
        for (int a : arr) if (a > max) max = a;
        return max;
    }

    public static void main(String[] args) {
        // Generate heights for the football team
        int[] heights = generateHeights();

        // Display mean, shortest, and tallest heights
        System.out.println("Mean = " + mean(heights));
        System.out.println("Shortest = " + shortest(heights));
        System.out.println("Tallest = " + tallest(heights));
    }
}
