package ControlFlows.Level1;

/*
 * This program calculates the factorial of a number
 * using a while loop.
 */
public class FactorialWhile {

    public static void main(String[] args) {

        int number = 5;
        int factorial = 1;

        // Loop runs until number becomes 0
        while (number > 0) {
            factorial *= number;
            number--;
        }

        System.out.println("Factorial is: " + factorial);
    }
}
