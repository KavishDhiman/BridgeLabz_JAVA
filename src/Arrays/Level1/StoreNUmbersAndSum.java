package Arrays.Level1;

import java.util.Scanner;

public class StoreNUmbersAndSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        // Input loop
        while (true) {
            double value = input.nextDouble();

            if (value <= 0 || index == 10) {
                break;
            }

            numbers[index] = value;
            index++;
        }

        // Calculate sum
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        System.out.println("The total sum is " + total);
    }
}
