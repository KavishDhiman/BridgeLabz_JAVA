package ControlFlows.Level3;

import java.util.Scanner;

// Class to check whether a year is a leap year using if-else
public class LeapYearIfElse {
    public static void main(String[] args) {
        // Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Read the year to be checked
        int year = input.nextInt();

        // Validate year based on Gregorian calendar start
        if (year < 1582) {
            System.out.println("Year should be greater than or equal to 1582");
        } else {
            // Apply leap year rules
            if (year % 400 == 0) {
                System.out.println("Year is a Leap Year");
            } else if (year % 100 == 0) {
                System.out.println("Year is not a Leap Year");
            } else if (year % 4 == 0) {
                System.out.println("Year is a Leap Year");
            } else {
                System.out.println("Year is not a Leap Year");
            }
        }
    }
}
