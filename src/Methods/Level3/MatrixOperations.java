package Methods.Level3;

import java.util.Random;

// Class to perform basic matrix operations
public class MatrixOperations {

    // Method to generate a matrix with random values
    static int[][] randomMatrix(int r, int c) {
        Random rand = new Random();
        int[][] m = new int[r][c];

        // Loop to fill matrix with random numbers (0–9)
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                m[i][j] = rand.nextInt(10);

        return m;
    }

    // Method to add two matrices
    static int[][] add(int[][] a, int[][] b) {
        int[][] r = new int[a.length][a[0].length];

        // Loop to add corresponding elements of matrices
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                r[i][j] = a[i][j] + b[i][j];

        return r;
    }

    // Method to find the transpose of a matrix
    static int[][] transpose(int[][] a) {
        int[][] t = new int[a[0].length][a.length];

        // Loop to swap rows and columns
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                t[j][i] = a[i][j];

        return t;
    }
}
