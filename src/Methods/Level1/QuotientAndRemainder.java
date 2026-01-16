package Methods.Level1;

import java.util.Scanner;

// Class to calculate quotient and remainder using a method
public class QuotientAndRemainder {

    // Method to find quotient and remainder of two numbers
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        // Scanner to read user input
        Scanner sc = new Scanner(System.in);

        // Read the number and divisor
        int number = sc.nextInt();
        int divisor = sc.nextInt();

        // Call method to get quotient and remainder
        int[] result = findRemainderAndQuotient(number, divisor);

        // Display the results
        System.out.println("Quotient = " + result[0]);
        System.out.println("Remainder = " + result[1]);
    }
}
