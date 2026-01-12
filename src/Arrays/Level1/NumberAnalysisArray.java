package Arrays.Level1;

import java.util.Scanner;

public class NumberAnalysisArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] number = new int[5];
        System.out.println("Enter the numbers");
        for(int i=0;i< number.length;i++){
            number[i]= sc.nextInt();
        }
        for (int num : number){
            if (num == 0){
                System.out.println("The number is zero");
            } else if (num <0) {
                System.out.println("The number is negative");

            }else{
                if (num%2==0){
                    System.out.println("The number is even");
                }else {
                    System.out.println("The number is odd");
                }
            }

        }


    }
}
