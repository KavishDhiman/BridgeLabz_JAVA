package ProgrammingElements.Level2;

import java.util.Scanner;

public class TotalIncomeCalculator {

    /*
     * This program calculates total income
     * by adding salary and bonus.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salary = sc.nextDouble();
        double bonus = sc.nextDouble();

        double totalIncome = salary + bonus;

        System.out.println(
                "The salary is INR " + salary +
                        " and bonus is INR " + bonus +
                        ". Hence Total Income is INR " + totalIncome
        );
    }
}
