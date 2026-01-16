package Methods.Level3;

// Class to support calendar-related calculations
public class CalenderDisplay {

    // Method to check whether a given year is a leap year
    static boolean isLeap(int y) {
        return y >= 1582 && ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0);
    }

    // Method to calculate the first day of a given month and year
    static int firstDay(int m, int y) {
        int d = 1; // First day of the month

        // Adjust year based on month
        int y0 = y - (14 - m) / 12;

        // Calculate intermediate value
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

        // Adjust month value
        int m0 = m + 12 * ((14 - m) / 12) - 2;

        // Return day of the week (0–6)
        return (d + x + 31 * m0 / 12) % 7;
    }
}
