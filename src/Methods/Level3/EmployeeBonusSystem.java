package Methods.Level3;

import java.util.Random;

// Class to generate employee data and calculate bonus
public class EmployeeBonusSystem {

    // Method to generate random salary and years of service data
    static double[][] generateData() {
        Random r = new Random();
        double[][] data = new double[10][2];

        // Loop to assign random salary and years to each employee
        for (int i = 0; i < 10; i++) {
            data[i][0] = 10000 + r.nextInt(90000); // salary
            data[i][1] = 1 + r.nextInt(10);       // years
        }
        return data;
    }

    // Method to calculate bonus and new salary for each employee
    static double[][] calculateBonus(double[][] data) {
        double[][] result = new double[10][2];

        // Loop to compute bonus based on years of service
        for (int i = 0; i < 10; i++) {
            double bonus = data[i][1] > 5 ? data[i][0] * 0.05 : data[i][0] * 0.02;
            result[i][0] = data[i][0] + bonus; // new salary
            result[i][1] = bonus;              // bonus amount
        }
        return result;
    }
}
