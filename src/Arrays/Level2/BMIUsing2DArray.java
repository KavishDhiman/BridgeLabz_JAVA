package Arrays.Level2;

import java.util.Scanner;

public class BMIUsing2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int persons = input.nextInt();

        double[][] personData = new double[persons][3]; // weight, height, bmi
        String[] weightStatus = new String[persons];

        for (int i = 0; i < persons; i++) {
            double w = input.nextDouble();
            double h = input.nextDouble();

            if (w <= 0 || h <= 0) {
                System.out.println("Enter positive values");
                i--;
                continue;
            }

            personData[i][0] = w;
            personData[i][1] = h;
            personData[i][2] = w / (h * h);

            double bmi = personData[i][2];

            if (bmi < 18.5)
                weightStatus[i] = "Underweight";
            else if (bmi < 25)
                weightStatus[i] = "Normal";
            else if (bmi < 30)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }

        for (int i = 0; i < persons; i++) {
            System.out.println("Height: " + personData[i][1] +
                    " Weight: " + personData[i][0] +
                    " BMI: " + personData[i][2] +
                    " Status: " + weightStatus[i]);
        }
    }
}
