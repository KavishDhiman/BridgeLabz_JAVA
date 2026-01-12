package Methods.Level1;
import java.util.*;
public class SimpleInterest {
    public static double calculatesimpleinterest(double principal,double rate,double time){
        return (principal*rate*time)/100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the parameters");
        double principal=sc.nextDouble();
        double rate =sc.nextDouble();
        double time = sc.nextDouble();
        double SimpleInterest = calculatesimpleinterest(principal,rate,time);
        System.out.println("The Simple Interest is " + SimpleInterest +
                " for Principal " + principal +
                ", Rate of Interest " + rate +
                " and Time " + time);
    }
}
