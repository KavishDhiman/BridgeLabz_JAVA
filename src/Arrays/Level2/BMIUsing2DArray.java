package Arrays.Level2;
/*
 * Problem Statement:
 * Write a Java program to calculate the Body Mass Index (BMI)
 * of multiple persons using a 2D array. The program should
 * read weight and height, compute BMI, determine health status,
 * and display the results.
 */

/*
 * Class Name: BMI2DArray
 *
 * Description:
 * This class calculates BMI values for multiple persons
 * using a 2D array to store weight, height, and BMI,
 * along with a separate array to store BMI status.
 */

import java.util.Scanner;

// Class to calculate BMI and weight status using a 2D array
public class BMIUsing2DArray {
    public static void main(String[] args) {
        // Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Read number of persons
        int persons = input.nextInt();

        // 2D array to store weight, height, and BMI for each person
        double[][] personData = new double[persons][3]; // weight, height, bmi

        // Array to store weight status for each person
        String[] weightStatus = new String[persons];

        // Loop to read data and calculate BMI
        for (int i = 0; i < persons; i++) {
            double w = input.nextDouble();
            double h = input.nextDouble();

            // Validate positive weight and height
            if (w <= 0 || h <= 0) {
                System.out.println("Enter positive values");
                i--;
                continue;
            }

            // Store weight and height
            personData[i][0] = w;
            personData[i][1] = h;

            // Calculate and store BMI
            personData[i][2] = w / (h * h);

            double bmi = personData[i][2];

            // Determine weight status based on BMI
            if (bmi < 18.5)
                weightStatus[i] = "Underweight";
            else if (bmi < 25)
                weightStatus[i] = "Normal";
            else if (bmi < 30)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }

        // Loop to display BMI details for each person
        for (int i = 0; i < persons; i++) {
            System.out.println("Height: " + personData[i][1] +
                    " Weight: " + personData[i][0] +
                    " BMI: " + personData[i][2] +
                    " Status: " + weightStatus[i]);
        }
    }
}
