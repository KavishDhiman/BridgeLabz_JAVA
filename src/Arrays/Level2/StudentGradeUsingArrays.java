package Arrays.Level2;

import java.util.Scanner;

public class StudentGradeUsingArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int students = input.nextInt();

        int[] physics = new int[students];
        int[] chemistry = new int[students];
        int[] maths = new int[students];
        double[] percentage = new double[students];
        String[] grade = new String[students];

        for (int i = 0; i < students; i++) {
            int p = input.nextInt();
            int c = input.nextInt();
            int m = input.nextInt();

            if (p < 0 || c < 0 || m < 0) {
                System.out.println("Enter positive marks");
                i--;
                continue;
            }

            physics[i] = p;
            chemistry[i] = c;
            maths[i] = m;

            percentage[i] = (p + c + m) / 3.0;

            if (percentage[i] >= 90)
                grade[i] = "A";
            else if (percentage[i] >= 75)
                grade[i] = "B";
            else if (percentage[i] >= 60)
                grade[i] = "C";
            else
                grade[i] = "D";
        }

        for (int i = 0; i < students; i++) {
            System.out.println("Physics: " + physics[i] +
                    " Chemistry: " + chemistry[i] +
                    " Maths: " + maths[i] +
                    " Percentage: " + percentage[i] +
                    " Grade: " + grade[i]);
        }
    }
}
