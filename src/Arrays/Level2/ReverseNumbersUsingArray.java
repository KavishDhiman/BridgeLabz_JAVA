package Arrays.Level2;

import java.util.Scanner;

public class ReverseNumbersUsingArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int temp = number;
        int count = 0;

        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        int index = 0;

        while (number != 0) {
            digits[index++] = number % 10;
            number /= 10;
        }

        System.out.print("Reversed Number: ");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);
        }
    }
}
