package Arrays.Level1;

import java.util.Scanner;

// Class to calculate the mean height of a football team
public class MeanHeightFootballTeam {
    public static void main(String[] args) {
        // Scanner to take height inputs
        Scanner input = new Scanner(System.in);

        // Array to store heights of 11 players
        double[] heights = new double[11];

        // Variable to store total height
        double sum = 0.0;

        // Loop to read heights and calculate total sum
        for (int i = 0; i < heights.length; i++) {
            heights[i] = input.nextDouble();
            sum += heights[i];
        }

        // Calculate mean height
        double mean = sum / heights.length;

        // Display the mean height
        System.out.println("The mean height of the football team is " + mean);
    }
}
