package Arrays.Level1;

import java.util.Scanner;

// Class to generate and store FizzBuzz results using an array
public class FizzBuzzArray {
    public static void main(String[] args) {
        // Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Read the number up to which FizzBuzz is generated
        int number = input.nextInt();

        // Validate that the number is positive
        if (number <= 0) {
            System.out.println("Enter a positive integer");
            return;
        }

        // Array to store FizzBuzz output for each position
        String[] result = new String[number];

        // Loop from 1 to number to apply FizzBuzz logic
        for (int i = 1; i <= number; i++) {

            // Check divisibility conditions and store corresponding value
            if (i % 3 == 0 && i % 5 == 0) {
                result[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                result[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                result[i - 1] = "Buzz";
            } else {
                result[i - 1] = String.valueOf(i);
            }
        }

        // Print the stored FizzBuzz results with their positions
        for (int i = 0; i < result.length; i++) {
            System.out.println("Position " + (i + 1) + " = " + result[i]);
        }
    }
}
