package Methods.Level1;

import java.util.Scanner;

public class Perimeter {
    public static  double Totalrounds(double s1,double s2, double s3){
        double perimeter = s1+s2+s3;
        return  5000/perimeter;

    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides of park in Meters ");
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();
        double rounds = Totalrounds(side1,side2,side3);
        System.out.println("The total number of rounds are" + rounds);
    }
}
