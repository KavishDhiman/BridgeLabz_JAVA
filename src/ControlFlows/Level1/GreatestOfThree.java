package ControlFlows.Level1;

/*
 * This program finds the greatest number
 * among three given numbers.
 */
public class GreatestOfThree {

    public static void main(String[] args) {

        int a = 10, b = 20, c = 15;

        // Comparing all three numbers
        if (a >= b && a >= c) {
            System.out.println("Greatest is: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Greatest is: " + b);
        } else {
            System.out.println("Greatest is: " + c);
        }
    }
}
