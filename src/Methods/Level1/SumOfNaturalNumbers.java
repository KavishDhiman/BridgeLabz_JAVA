package Methods.Level1;

import java.util.Scanner;

// Class to calculate the sum of first n natural numbers
public class SumOfNaturalNumbers {

    // Method to calculate sum from 1 to n
    public static int findSum(int n) {
        int sum = 0;

        // Loop to add natural numbers
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Scanner to read user input
        Scanner sc = new Scanner(System.in);

        // Read the value of n
        int n = sc.nextInt();

        // Display the sum of natural numbers
        System.out.println("Sum of natural numbers is " + findSum(n));
    }
}
