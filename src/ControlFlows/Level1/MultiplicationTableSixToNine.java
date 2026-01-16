package ControlFlows.Level1;

/*
 * This program prints the multiplication table
 * of a number from 6 to 9.
 */
public class MultiplicationTableSixToNine {

    public static void main(String[] args) {

        int number = 5;

        // Loop generates multiplication from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
