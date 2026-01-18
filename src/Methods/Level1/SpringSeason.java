/*
 * Problem Statement:
 * ------------------
 * Check whether a given date falls within the Spring season.
 *
 * Description:
 * ------------
 * The program takes month and day as input, verifies if the date lies
 * between March 20 and June 20, and displays the result.
 */

package Methods.Level1;

// Class to check whether a given date falls in the Spring season
public class SpringSeason {

    // Method to determine if the given month and day are in Spring
    public static boolean isSpringSeason(int month, int day) {
        return (month == 3 && day >= 20) ||
                (month == 4) ||
                (month == 5) ||
                (month == 6 && day <= 20);
    }

    public static void main(String[] args) {
        // Read month and day from command-line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check and display whether it is Spring season
        if (isSpringSeason(month, day)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
