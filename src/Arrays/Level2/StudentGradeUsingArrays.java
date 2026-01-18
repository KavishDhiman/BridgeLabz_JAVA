package Arrays.Level2;

import java.util.Scanner;
/*
 * This class calculates percentage and grade
 * for multiple students based on their marks.
 */
// Class to calculate student percentage and grade using arrays
public class StudentGradeUsingArrays {
    public static void main(String[] args) {
        // Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Read number of students
        int students = input.nextInt();

        // Arrays to store marks, percentage, and grade
        int[] physics = new int[students];
        int[] chemistry = new int[students];
        int[] maths = new int[students];
        double[] percentage = new double[students];
        String[] grade = new String[students];

        // Loop to read marks and calculate percentage and grade
        for (int i = 0; i < students; i++) {
            int p = input.nextInt();
            int c = input.nextInt();
            int m = input.nextInt();

            // Validate marks input
            if (p < 0 || c < 0 || m < 0) {
                System.out.println("Enter positive marks");
                i--;
                continue;
            }

            // Store marks
            physics[i] = p;
            chemistry[i] = c;
            maths[i] = m;

            // Calculate percentage
            percentage[i] = (p + c + m) / 3.0;

            // Assign grade based on percentage
            if (percentage[i] >= 90)
                grade[i] = "A";
            else if (percentage[i] >= 75)
                grade[i] = "B";
            else if (percentage[i] >= 60)
                grade[i] = "C";
            else
                grade[i] = "D";
        }

        // Loop to display student details
        for (int i = 0; i < students; i++) {
            System.out.println("Physics: " + physics[i] +
                    " Chemistry: " + chemistry[i] +
                    " Maths: " + maths[i] +
                    " Percentage: " + percentage[i] +
                    " Grade: " + grade[i]);
        }
    }
}
