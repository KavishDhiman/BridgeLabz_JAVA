package ControlFlows.Level1;

/*
 * This program prints whether numbers
 * from 1 to N are odd or even.
 */
public class OddEvenNumbers {

    public static void main(String[] args) {

        int number = 10;

        // Loop checks each number for odd or even
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is Even");
            } else {
                System.out.println(i + " is Odd");
            }
        }
    }
}
