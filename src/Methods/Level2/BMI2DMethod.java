package Methods.Level2;

import java.util.Scanner;

// Class to calculate BMI and determine health status using 2D arrays and methods
public class BMI2DMethod {

    // Method to calculate BMI for each person and store it in the 2D array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            // Convert height from cm to meters
            double heightM = data[i][1] / 100;

            // Calculate BMI and store it
            data[i][2] = data[i][0] / (heightM * heightM);
        }
    }

    // Method to determine weight status based on calculated BMI
    public static String[] getStatus(double[][] data) {
        String[] status = new String[data.length];

        // Loop to assign status for each BMI value
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            status[i] = bmi < 18.5 ? "Underweight" :
                    bmi < 25 ? "Normal" :
                            bmi < 30 ? "Overweight" : "Obese";
        }
        return status;
    }

    public static void main(String[] args) {
        // Scanner to read user input
        Scanner sc = new Scanner(System.in);

        // 2D array to store weight, height, and BMI for 10 persons
        double[][] persons = new double[10][3];

        // Loop to read weight and height for each person
        for (int i = 0; i < 10; i++) {
            persons[i][0] = sc.nextDouble();
            persons[i][1] = sc.nextDouble();
        }

        // Calculate BMI for all persons
        calculateBMI(persons);

        // Get weight status for each person
        String[] status = getStatus(persons);

        // Display BMI and corresponding status
        for (int i = 0; i < 10; i++) {
            System.out.println(persons[i][2] + " " + status[i]);
        }
    }
}
