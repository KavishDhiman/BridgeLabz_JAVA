package Arrays.Level1;

import java.util.Scanner;

// Class to separate odd and even numbers up to a given number
public class OddEvenArraySeperator {
    public static void main(String[] args) {
        // Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Read the upper limit number
        int number = input.nextInt();

        // Validate that the number is a natural number
        if (number <= 0) {
            System.out.println("Please enter a Natural Number");
            return;
        }

        // Arrays to store even and odd numbers
        int[] even = new int[number / 2 + 1];
        int[] odd = new int[number / 2 + 1];

        // Index trackers for even and odd arrays
        int evenIndex = 0;
        int oddIndex = 0;

        // Loop to separate numbers into even and odd arrays
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                even[evenIndex++] = i;
            } else {
                odd[oddIndex++] = i;
            }
        }

        // Print all odd numbers
        System.out.println("Odd Numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }

        // Print all even numbers
        System.out.println("\nEven Numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }
    }
}
