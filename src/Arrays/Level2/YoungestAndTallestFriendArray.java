package Arrays.Level2;

import java.util.Scanner;
/*
 * Problem Statement:
 * Write a Java program to determine the youngest and tallest
 * among three friends. The program should take age and height
 * as input and display the name of the youngest and tallest friend.
 */

/*
 * Class Name: YoungestTallestFriendsArray
 *
 * Description:
 * This class stores names, ages, and heights of three friends
 * using arrays and determines the youngest and tallest friend
 * based on the given input.
 */
// Class to find the youngest age and tallest height among friends
public class YoungestAndTallestFriendArray {
    public static void main(String[] args) {
        // Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Arrays to store ages and heights of 3 friends
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Loop to read age and height for each friend
        for (int i = 0; i < 3; i++) {
            ages[i] = input.nextInt();
            heights[i] = input.nextDouble();
        }

        // Initialize youngest age and tallest height with first friend's data
        int youngest = ages[0];
        double tallest = heights[0];

        // Loop to find youngest age and tallest height
        for (int i = 1; i < 3; i++) {
            if (ages[i] < youngest)
                youngest = ages[i];
            if (heights[i] > tallest)
                tallest = heights[i];
        }

        // Display the results
        System.out.println("Youngest Age = " + youngest);
        System.out.println("Tallest Height = " + tallest);
    }
}
