package Arrays.Level2;

import java.util.Scanner;

public class YoungestAndTallestFriendArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            ages[i] = input.nextInt();
            heights[i] = input.nextDouble();
        }

        int youngest = ages[0];
        double tallest = heights[0];

        for (int i = 1; i < 3; i++) {
            if (ages[i] < youngest)
                youngest = ages[i];
            if (heights[i] > tallest)
                tallest = heights[i];
        }

        System.out.println("Youngest Age = " + youngest);
        System.out.println("Tallest Height = " + tallest);
    }
}
