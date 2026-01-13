package Methods.Level2;

import java.util.Scanner;

public class BMI2DMethod {

    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double heightM = data[i][1] / 100;
            data[i][2] = data[i][0] / (heightM * heightM);
        }
    }

    public static String[] getStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            status[i] = bmi < 18.5 ? "Underweight" :
                    bmi < 25 ? "Normal" :
                            bmi < 30 ? "Overweight" : "Obese";
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] persons = new double[10][3];

        for (int i = 0; i < 10; i++) {
            persons[i][0] = sc.nextDouble();
            persons[i][1] = sc.nextDouble();
        }

        calculateBMI(persons);
        String[] status = getStatus(persons);

        for (int i = 0; i < 10; i++) {
            System.out.println(persons[i][2] + " " + status[i]);
        }
    }
}
