package ControlFlows.Level3;

import java.util.Scanner;

public class LeapYearSingleIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year = input.nextInt();

        if (year >= 1582 &&
                ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println("Year is a Leap Year");
        } else if (year >= 1582) {
            System.out.println("Year is not a Leap Year");
        } else {
            System.out.println("Year should be greater than or equal to 1582");
        }
    }
}
