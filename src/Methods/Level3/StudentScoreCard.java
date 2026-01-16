package Methods.Level3;

import java.util.Random;

// Class to generate random score cards for students
public class StudentScoreCard {

    // Method to generate random scores for n students in 3 subjects
    static int[][] generateScores(int n) {
        Random r = new Random();
        int[][] scores = new int[n][3];

        // Loop to assign random scores between 10 and 99
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                scores[i][j] = 10 + r.nextInt(90);

        return scores;
    }
}
