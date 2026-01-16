package ControlFlows.Level1;

/*
 * This program adds numbers until
 * zero or a negative number is entered.
 */
public class SumUntilZeroOrNegative {

    public static void main(String[] args) {

        int[] numbers = {4, 6, 3, -1};
        int sum = 0;
        int index = 0;

        // Infinite loop with break condition
        while (true) {
            if (numbers[index] <= 0) {
                break;
            }
            sum += numbers[index];
            index++;
        }

        System.out.println("Sum is: " + sum);
    }
}
