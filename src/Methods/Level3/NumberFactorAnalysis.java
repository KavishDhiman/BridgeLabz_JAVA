package Methods.Level3;

public class NumberFactorAnalysis {

    public static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) count++;

        int[] factors = new int[count];
        int idx = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) factors[idx++] = i;

        return factors;
    }

    public static int sumOfProperFactors(int[] factors, int n) {
        int sum = 0;
        for (int f : factors)
            if (f != n) sum += f;
        return sum;
    }

    public static boolean isPerfect(int n, int[] factors) {
        return sumOfProperFactors(factors, n) == n;
    }

    public static boolean isAbundant(int n, int[] factors) {
        return sumOfProperFactors(factors, n) > n;
    }

    public static boolean isDeficient(int n, int[] factors) {
        return sumOfProperFactors(factors, n) < n;
    }

    public static boolean isStrong(int n) {
        int temp = n, sum = 0;
        while (temp > 0) {
            int d = temp % 10;
            sum += factorial(d);
            temp /= 10;
        }
        return sum == n;
    }

    static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
    }
}
