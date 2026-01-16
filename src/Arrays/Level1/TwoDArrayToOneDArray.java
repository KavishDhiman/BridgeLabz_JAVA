package Arrays.Level1;

import java.util.Scanner;

// Class to convert a 2D array into a 1D array
public class TwoDArrayToOneDArray {
    public static void main(String[] args) {
        // Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Read number of rows and columns
        int rows = input.nextInt();
        int columns = input.nextInt();

        // 2D array to store matrix elements
        int[][] matrix = new int[rows][columns];

        // 1D array to store flattened matrix
        int[] array = new int[rows * columns];

        // Loop to read elements into the 2D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        // Loop to convert 2D array into 1D array
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index++] = matrix[i][j];
            }
        }

        // Print the 1D array
        System.out.println("1D Array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
