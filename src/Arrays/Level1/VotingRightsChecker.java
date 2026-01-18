package Arrays.Level1;

import java.util.Scanner;
/*
 * Problem Statement:
 * Write a Java program to check the voting eligibility of 10 students
 * based on their age.
 */

/*
 * Description:
 * This class accepts the ages of 10 students, stores them in an array,
 * checks whether each student is eligible to vote based on age criteria,
 * and displays the appropriate message for each student.
 */
// Class to check voting eligibility based on age
public class VotingRightsChecker {
    static void main(String[] args) {
        // Scanner to read user input
        Scanner sc = new Scanner(System.in);

        // Array to store ages of 10 people
        int[] ages = new int[10];

        // Loop to read ages into the array
        for (int i = 0; i < ages.length; i++) {
            ages[i] = sc.nextInt();
        }

        // Enhanced for-loop to check voting eligibility for each age
        for (int age : ages) {

            // Check for invalid age
            if (age < 0) {
                System.out.println("Invalid Age");

                // Check if age is eligible for voting
            } else if (age <= 18) {
                System.out.println("Ineligble to vote");

                // Age is valid for voting
            } else {
                System.out.println("Valid Age");
            }
        }
    }
}
