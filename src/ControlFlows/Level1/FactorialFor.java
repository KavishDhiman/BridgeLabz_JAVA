package ControlFlows.Level1;

/*
 * This program calculates the factorial of a number
 * using a for loop.
 */
public class FactorialFor {

    public static void main(String[] args) {
        // inititalization
        int number = 5;
        int factorial = 1;

        // Loop multiplies numbers from 1 to the given number
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial is: " + factorial);
    }
}
