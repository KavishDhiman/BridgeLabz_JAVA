package ControlFlows.Level2;

import java.util.Scanner;

public class MultiplesBelowHundredWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Enter number between 1 and 99");
            return;
        }

        int i = 100;
        while (i >= 1) {
            if (i % number == 0) {
                System.out.println(i);
            }
            i--;
        }
    }
}
