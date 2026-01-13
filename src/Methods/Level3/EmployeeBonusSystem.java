package Methods.Level3;

import java.util.Random;

public class EmployeeBonusSystem {

    static double[][] generateData() {
        Random r = new Random();
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            data[i][0] = 10000 + r.nextInt(90000); // salary
            data[i][1] = 1 + r.nextInt(10);       // years
        }
        return data;
    }

    static double[][] calculateBonus(double[][] data) {
        double[][] result = new double[10][2];
        for (int i = 0; i < 10; i++) {
            double bonus = data[i][1] > 5 ? data[i][0]*0.05 : data[i][0]*0.02;
            result[i][0] = data[i][0] + bonus;
            result[i][1] = bonus;
        }
        return result;
    }
}
