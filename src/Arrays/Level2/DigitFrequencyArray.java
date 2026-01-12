package Arrays.Level2;

import java.util.Scanner;

public class DigitFrequencyArray {
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
        int[] frequency = new int[10];

        int index = 0;
        while (number != 0) {
            digits[index] = number % 10;
            frequency[digits[index]]++;
            number /= 10;
            index++;
        }

        System.out.println("Digit Frequencies:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + " occurs " + frequency[i] + " times");
            }
        }
    }
}
