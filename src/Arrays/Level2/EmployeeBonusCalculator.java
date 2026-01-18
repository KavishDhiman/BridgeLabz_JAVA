package Arrays.Level2;

import java.util.Scanner;
/*
 * Problem Statement:
 * Write a Java program to calculate bonus and updated salary
 * for 10 employees based on their years of service.
 * The program should also calculate the total bonus paid,
 * total old salary, and total new salary.
 */

/*
 *
 * Description:
 * This class calculates employee bonus and revised salary
 * using arrays. Bonus is calculated based on years of service,
 * and cumulative totals are displayed at the end.
 */
// Class to calculate employee bonuses and updated salaries
public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        // Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Arrays to store salary, years of service, bonus, and new salary
        double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        // Variables to store total values
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Loop to read salary and years of service
        for (int i = 0; i < 10; i++) {
            double sal = input.nextDouble();
            double yrs = input.nextDouble();

            // Validate salary and years input
            if (sal <= 0 || yrs < 0) {
                System.out.println("Invalid input, re-enter");
                i--;
                continue;
            }

            // Store valid input values
            salary[i] = sal;
            years[i] = yrs;
            totalOldSalary += sal;
        }

        // Loop to calculate bonus and new salary
        for (int i = 0; i < 10; i++) {

            // Apply bonus percentage based on years of service
            if (years[i] > 5)
                bonus[i] = salary[i] * 0.05;
            else
                bonus[i] = salary[i] * 0.02;

            // Calculate updated salary
            newSalary[i] = salary[i] + bonus[i];

            // Accumulate totals
            totalBonus += bonus[i];
            totalNewSalary += newSalary[i];
        }

        // Display total bonus and salary details
        System.out.println("Total Bonus Payout = " + totalBonus);
        System.out.println("Total Old Salary = " + totalOldSalary);
        System.out.println("Total New Salary = " + totalNewSalary);
    }
}
