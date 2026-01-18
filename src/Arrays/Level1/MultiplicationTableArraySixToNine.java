package Arrays.Level1;

import java.util.Scanner;
/**
 * Problem Statement:
 * Write a Java program to generate and display the multiplication table
 * of a given number from 6 to 9.
 /*
 * Class Name: MultiplicationTableSixToNine
 *
 * Description:
 * This class reads an integer value from the user and generates
 * the multiplication table for that number starting from 6 up to 9.
 * The results are stored in an array and then printed to the console.
 **/
// Class to generate multiplication results for numbers 6 to 9
public class MultiplicationTableArraySixToNine {
    public static void main(String[] args) {
        // Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Read the base number for multiplication
        int number = input.nextInt();

        // Array to store multiplication results for 6, 7, 8, and 9
        int[] multiplicationResult = new int[4]; // for 6,7,8,9

        // Loop to calculate and store multiplication results
        int index = 0;
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[index] = number * i;
            index++;
        }

        // Reset index to read from the beginning of the array
        index = 0;

        // Loop to display the multiplication results
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[index]);
            index++;
        }
    }
}
