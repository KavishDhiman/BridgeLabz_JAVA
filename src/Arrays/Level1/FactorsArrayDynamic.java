package Arrays.Level1;

import java.util.Scanner;

// Class to find all factors of a number using a dynamically growing array
public class FactorsArrayDynamic {
    public static void main(String[] args) {
        // Scanner to take user input
        Scanner input = new Scanner(System.in);

        // Read the number whose factors are to be found
        int number = input.nextInt();

        // Initial size of the factors array
        int maxFactor = 10;

        // Array to store factors
        int[] factors = new int[maxFactor];

        // Keeps track of how many factors are stored
        int index = 0;

        // Loop from 1 to number to check for factors
        for (int i = 1; i <= number; i++) {

            // Check if i is a factor of number
            if (number % i == 0) {

                // If array is full, increase its size
                if (index == maxFactor) {
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];

                    // Copy existing factors to the new array
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp;
                }

                // Store the factor and move to next index
                factors[index++] = i;
            }
        }

        // Print all the factors stored in the array
        System.out.println("Factors of " + number + ":");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}
