package ControlFlows.Level2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1 :");
        double num1= sc.nextDouble();
        System.out.println("Enter the number2 :");
        double num2 = sc.nextDouble();
        double quotient =  num1/num2;
        double remainder = num1%num2;
        System.out.println("The quotient of the number is " + quotient);
        System.out.println("The remainder of the number is " + remainder);
    }
}
