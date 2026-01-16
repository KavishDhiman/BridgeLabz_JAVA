package ControlFlows.Level3;

import java.util.Scanner;

// Class to check leap year using a single if condition
public class LeapYearSingleIf {
    public static void main(String[] args) {
        // Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Read the year to be checked
        int year = input.nextInt();

        // Check leap year condition and valid year range
        if (year >= 1582 &&
                ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println("Year is a Leap Year");
        }
        // Valid year but not a leap year
        else if (year >= 1582) {
            System.out.println("Year is not a Leap Year");
        }
        // Invalid year
        else {
            System.out.println("Year should be greater than or equal to 1582");
        }
    }
}
