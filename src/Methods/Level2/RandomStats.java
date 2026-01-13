package Methods.Level2;

import java.util.Random;

public class RandomStats {

    public static int[] generate4DigitRandomArray(int size) {
        Random r = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = 1000 + r.nextInt(9000);
        return arr;
    }

    public static double[] findAverageMinMax(int[] nums) {
        int min = nums[0], max = nums[0], sum = 0;
        for (int n : nums) {
            sum += n;
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        return new double[]{ (double)sum / nums.length, min, max };
    }

    public static void main(String[] args) {
        int[] arr = generate4DigitRandomArray(5);
        double[] stats = findAverageMinMax(arr);

        for (int n : arr) System.out.print(n + " ");
        System.out.println("\nAverage=" + stats[0] +
                " Min=" + stats[1] +
                " Max=" + stats[2]);
    }
}
