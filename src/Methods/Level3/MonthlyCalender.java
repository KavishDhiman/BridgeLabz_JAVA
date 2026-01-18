/*
 * Problem Statement:
 * ------------------
 * Display the calendar for a given month and year.
 *
 * Description:
 * ------------
 * The program calculates leap years, number of days in a month, and the
 * starting day to display a formatted monthly calendar.
 */

package Methods.Level3;

// Class to display a monthly calendar
public class MonthlyCalender {

    // Method to check whether a given year is a leap year
    static boolean isLeap(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }

    // Method to return number of days in a given month
    static int daysInMonth(int m, int y) {
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

        // Adjust February days for leap year
        if (m == 2 && isLeap(y)) return 29;
        return days[m - 1];
    }

    // Method to calculate the first day of the month
    static int firstDay(int m, int y) {
        int d = 1;

        // Zeller’s congruence based calculation
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;

        // Return day index (0–6)
        return (d + x + (31 * m0) / 12) % 7;
    }

    public static void main(String[] args) {
        // Month and year to display
        int month = 7, year = 2005;

        // Print calendar header
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Find the starting day of the month
        int start = firstDay(month, year);

        // Print leading spaces before first date
        for (int i = 0; i < start; i++)
            System.out.print("    ");

        // Loop to print all days of the month
        for (int day = 1; day <= daysInMonth(month, year); day++) {
            System.out.printf("%3d ", day);

            // Move to next line after Saturday
            if ((day + start) % 7 == 0)
                System.out.println();
        }
    }
}
