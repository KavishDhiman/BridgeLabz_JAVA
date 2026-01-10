package ControlFlows.Level2;

import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salary = input.nextDouble();
        int years = input.nextInt();

        double bonus = 0;
        if (years > 5) {
            bonus = salary * 0.05;
        }

        System.out.println("The bonus amount is INR " + bonus);
    }
}
