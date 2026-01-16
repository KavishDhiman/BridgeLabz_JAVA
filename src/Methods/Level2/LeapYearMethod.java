package Methods.Level2;

import java.util.Scanner;

// Class to check whether a year is a leap year using a method
public class LeapYearMethod {

    // Method to determine if the given year is a leap year
    public static boolean isLeapYear(int year) {
        return year >= 1582 &&
                ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }

    public static void main(String[] args) {
        // Scanner to read user input
        Scanner sc = new Scanner(System.in);

        // Read the year to be checked
        int year = sc.nextInt();

        // Display leap year result
        System.out.println(isLeapYear(year) ? "Leap Year" : "Not a Leap Year");
    }
}
