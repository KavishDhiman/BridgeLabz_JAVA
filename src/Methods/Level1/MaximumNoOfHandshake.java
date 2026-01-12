package Methods.Level1;

import java.util.Scanner;

public class MaximumNoOfHandshake {
    public static  double handshake(double student ){
        return (student*(student-1))/2;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
        double student = sc.nextDouble();
        double hand=handshake(student);
        System.out.println("The maximun number of handshakes possible are :" + hand);
    }
}
