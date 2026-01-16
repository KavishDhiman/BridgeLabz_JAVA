package ControlFlows.Level3;

// Class to calculate the day of the week for a given date
public class DayOfWeek {
    public static void main(String[] args) {

        // Read month, day, and year from command-line arguments
        int m = Integer.parseInt(args[0]); // month
        int d = Integer.parseInt(args[1]); // day
        int y = Integer.parseInt(args[2]); // year

        // Adjust year based on month
        int y0 = y - (14 - m) / 12;

        // Calculate intermediate value for day calculation
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

        // Adjust month value
        int m0 = m + 12 * ((14 - m) / 12) - 2;

        // Calculate day of the week (0–6)
        int d0 = (d + x + (31 * m0) / 12) % 7;

        // Print the calculated day of the week
        System.out.println(d0);
    }
}
