package Methods.Level2;

import java.util.Scanner;

// Class to find the youngest age and tallest height using methods
public class YoungestAndTallestFriend {

    // Method to find the youngest age from the array
    public static int findYoungest(int[] ages) {
        int min = ages[0];

        // Loop to find minimum age
        for (int a : ages)
            if (a < min) min = a;

        return min;
    }

    // Method to find the tallest height from the array
    public static double findTallest(double[] heights) {
        double max = heights[0];

        // Loop to find maximum height
        for (double h : heights)
            if (h > max) max = h;

        return max;
    }

    public static void main(String[] args) {
        // Scanner to read user input
        Scanner sc = new Scanner(System.in);

        // Arrays to store ages and heights of 3 friends
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Loop to read age and height values
        for (int i = 0; i < 3; i++) {
            ages[i] = sc.nextInt();
            heights[i] = sc.nextDouble();
        }

        // Display youngest age and tallest height
        System.out.println("Youngest = " + findYoungest(ages));
        System.out.println("Tallest = " + findTallest(heights));
    }
}
