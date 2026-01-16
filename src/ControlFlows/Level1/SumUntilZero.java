package ControlFlows.Level1;

/*
 * This program keeps adding numbers
 * until the user enters zero.
 */
public class SumUntilZero {

    public static void main(String[] args) {

        int[] numbers = {5, 3, 2, 0};
        int sum = 0;
        int index = 0;

        // Loop stops when zero is encountered
        while (numbers[index] != 0) {
            sum += numbers[index];
            index++;
        }

        System.out.println("Sum is: " + sum);
    }
}
