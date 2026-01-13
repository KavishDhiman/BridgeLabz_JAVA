package Methods.Level3;

import java.util.Random;

public class MatrixOperations {

    static int[][] randomMatrix(int r, int c) {
        Random rand = new Random();
        int[][] m = new int[r][c];
        for (int i=0;i<r;i++)
            for (int j=0;j<c;j++)
                m[i][j] = rand.nextInt(10);
        return m;
    }

    static int[][] add(int[][] a, int[][] b) {
        int[][] r = new int[a.length][a[0].length];
        for (int i=0;i<a.length;i++)
            for (int j=0;j<a[0].length;j++)
                r[i][j] = a[i][j] + b[i][j];
        return r;
    }

    static int[][] transpose(int[][] a) {
        int[][] t = new int[a[0].length][a.length];
        for (int i=0;i<a.length;i++)
            for (int j=0;j<a[0].length;j++)
                t[j][i] = a[i][j];
        return t;
    }
}
