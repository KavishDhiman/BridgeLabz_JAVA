package Arrays.Level1;

import java.util.Scanner;

public class VotingRightsChecker {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        for(int i=0;i<ages.length;i++){
            ages[i]= sc.nextInt();
        }
        for(int age : ages){
            if (age<0){
                System.out.println("Invalid Age");
            } else if (age <=18) {
                System.out.println("Ineligble to vote");

            }else {
                System.out.println("Valid Age");
            }
        }
    }
}
