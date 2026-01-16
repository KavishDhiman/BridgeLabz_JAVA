package Arrays.Level2;

import java.util.Scanner;

// Class to calculate BMI and weight status using separate arrays
public class BodyMassIndex {
    public static void main(String[] args) {
        // Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Read number of persons
        int persons = input.nextInt();

        // Arrays to store weight, height, BMI, and status
        double[] weight = new double[persons];
        double[] height = new double[persons];
        double[] bmi = new double[persons];
        String[] status = new String[persons];

        // Loop to read data and calculate BMI for each person
        for (int i = 0; i < persons; i++) {
            weight[i] = input.nextDouble();
            height[i] = input.nextDouble();

            // Calculate BMI
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Determine weight status based on BMI
            if (bmi[i] < 18.5)
                status[i] = "Underweight";
            else if (bmi[i] < 25)
                status[i] = "Normal";
            else if (bmi[i] < 30)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        // Loop to display BMI details for each person
        for (int i = 0; i < persons; i++) {
            System.out.println("Height: " + height[i] +
                    " Weight: " + weight[i] +
                    " BMI: " + bmi[i] +
                    " Status: " + status[i]);
        }
    }
}
