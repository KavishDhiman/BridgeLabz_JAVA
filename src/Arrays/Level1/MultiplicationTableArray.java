package Arrays.Level1;

import java.util.Scanner;

// Class to generate and store a multiplication table using an array
public class MultiplicationTableArray {
    public static void main(String[] args) {
        // Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Read the number for which table is generated
        int number = input.nextInt();

        // Array to store multiplication results
        int[] table = new int[10];

        // Loop to calculate and store table values
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // Loop to display the multiplication table
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }
    }
}
