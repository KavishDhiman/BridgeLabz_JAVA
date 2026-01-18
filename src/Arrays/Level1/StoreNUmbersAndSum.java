package Arrays.Level1;
/*
 * Problem Statement:
 * Write a Java program to store positive numbers in an array until a
 * non-positive number is entered or the array limit is reached, and
 * then calculate and display their sum.
 */

/*
 * Class Name: StoreValues
 *
 * Description:
 * This class reads double values from the user, stores up to 10 positive
 * numbers in an array, stops input when a zero or negative value is entered,
 * and finally prints all stored values along with their total sum.
 */
import java.util.Scanner;

// Class to store positive numbers in an array and calculate their sum
public class StoreNUmbersAndSum {
    public static void main(String[] args) {
        // Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Array to store up to 10 numbers
        double[] numbers = new double[10];

        // Variable to store total sum
        double total = 0.0;

        // Tracks how many numbers are stored
        int index = 0;

        // Loop to take input until a non-positive number or array limit is reached
        while (true) {
            double value = input.nextDouble();

            // Stop input if value is non-positive or array is full
            if (value <= 0 || index == 10) {
                break;
            }

            // Store the value in the array
            numbers[index] = value;
            index++;
        }

        // Loop to print stored numbers and calculate sum
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        // Display the total sum
        System.out.println("The total sum is " + total);
    }
}
