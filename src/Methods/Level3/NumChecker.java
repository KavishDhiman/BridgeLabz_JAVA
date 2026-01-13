package Methods.Level3;

public class NumChecker {

    public static int countDigits(int n) {
        int count = 0;
        while (n != 0) { count++; n /= 10; }
        return count;
    }

    public static int[] getDigits(int n) {
        int[] digits = new int[countDigits(n)];
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    public static boolean isDuck(int[] digits) {
        for (int d : digits) if (d == 0) return true;
        return false;
    }

    public static boolean isArmstrong(int n, int[] digits) {
        int sum = 0;
        for (int d : digits)
            sum += Math.pow(d, digits.length);
        return sum == n;
    }

    public static int[] largestSecondLargest(int[] digits) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > max1) { max2 = max1; max1 = d; }
            else if (d > max2 && d != max1) max2 = d;
        }
        return new int[]{max1, max2};
    }

    public static int[] smallestSecondSmallest(int[] digits) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < min1) { min2 = min1; min1 = d; }
            else if (d < min2 && d != min1) min2 = d;
        }
        return new int[]{min1, min2};
    }
}
