/*
 * Problem Statement:
 * ------------------
 * Check the voting eligibility of students based on their age.
 *
 * Description:
 * ------------
 * The program reads the ages of multiple students and determines whether
 * each student is eligible to vote using a method.
 */

package Methods.Level2;

import java.util.Scanner;

// Class to check voting eligibility of students using a method
public class StudentVoteChecker {

    // Method to determine if a student can vote based on age
    public static boolean canStudentVote(int age) {
        return age >= 18;
    }

    public static void main(String[] args) {
        // Scanner to read user input
        Scanner sc = new Scanner(System.in);

        // Array to store ages of 10 students
        int[] ages = new int[10];

        // Loop to read ages and check voting eligibility
        for (int i = 0; i < 10; i++) {
            ages[i] = sc.nextInt();
            System.out.println(canStudentVote(ages[i]) ? "Can Vote" : "Cannot Vote");
        }
    }
}
