package Methods.Level3;

import java.util.Random;

public class FootballTeamStats {

    static int[] generateHeights() {
        Random r = new Random();
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++)
            heights[i] = 150 + r.nextInt(101); // 150–250
        return heights;
    }

    static int sum(int[] arr) {
        int s = 0;
        for (int a : arr) s += a;
        return s;
    }

    static double mean(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    static int shortest(int[] arr) {
        int min = arr[0];
        for (int a : arr) if (a < min) min = a;
        return min;
    }

    static int tallest(int[] arr) {
        int max = arr[0];
        for (int a : arr) if (a > max) max = a;
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights();
        System.out.println("Mean = " + mean(heights));
        System.out.println("Shortest = " + shortest(heights));
        System.out.println("Tallest = " + tallest(heights));
    }
}
