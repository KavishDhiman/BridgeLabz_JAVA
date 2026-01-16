package ControlFlows.Level1;

/*
 * This program checks whether a given
 * date falls in the Spring Season.
 */
public class SpringSeason {

    public static void main(String[] args) {

        int month = 4;
        int day = 15;

        // Spring season condition check
        if ((month == 3 && day >= 20) ||
                (month == 4) ||
                (month == 5) ||
                (month == 6 && day <= 20)) {

            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
