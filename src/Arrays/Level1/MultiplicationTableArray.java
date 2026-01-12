package Arrays.Level1;

import java.util.Scanner;

public class MultiplicationTableArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int[] table = new int[10];

        // Store results
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // Display results
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }
    }
}
