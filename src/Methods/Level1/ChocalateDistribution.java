package Methods.Level1;

import java.util.Scanner;

// Class to distribute chocolates among children
public class ChocalateDistribution {

    // Method to calculate quotient and remainder of chocolate distribution
    public static int[] findRemainderAndQuotient(int chocolates, int children) {
        return new int[]{chocolates / children, chocolates % children};
    }

    public static void main(String[] args) {
        // Scanner to read user input
        Scanner sc = new Scanner(System.in);

        // Read number of chocolates and children
        int chocolates = sc.nextInt();
        int children = sc.nextInt();

        // Call method to get distribution result
        int[] result = findRemainderAndQuotient(chocolates, children);

        // Display distribution details
        System.out.println("Each child gets " + result[0]);
        System.out.println("Remaining chocolates " + result[1]);
    }
}
