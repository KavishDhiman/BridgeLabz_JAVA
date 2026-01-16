package ControlFlows.Level1;

/*
 * This program checks whether a number
 * is a natural number and finds its sum.
 */
public class NaturalNumber {

    public static void main(String[] args) {

        int number = 5;

        // Natural numbers are positive integers
        if (number > 0) {
            int sum = number * (number + 1) / 2;
            System.out.println("Sum of natural numbers is: " + sum);
        } else {
            System.out.println("Not a natural number");
        }
    }
}
