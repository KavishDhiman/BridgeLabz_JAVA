package Methods.Level3;

import java.util.Random;

public class StudentScoreCard {

    static int[][] generateScores(int n) {
        Random r = new Random();
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                scores[i][j] = 10 + r.nextInt(90);
        return scores;
    }
}
