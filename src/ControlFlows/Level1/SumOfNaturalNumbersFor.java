package ControlFlows.Level1;

/*
 * This program finds the sum of
 * N natural numbers using a for loop.
 */
public class SumOfNaturalNumbersFor {

    public static void main(String[] args) {

        int n = 5;
        int sum = 0;

        // Loop adds natural numbers
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum is: " + sum);
    }
}
