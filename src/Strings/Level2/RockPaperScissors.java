package Strings.Level2;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    static String[] choices = {"rock", "paper", "scissors"};

    // Generates computer choice randomly
    public static String getComputerChoice() {
        return choices[new Random().nextInt(3)];
    }

    // Determines winner based on rules
    public static String findWinner(String user, String computer) {
        if (user.equals(computer))
            return "Draw";

        if ((user.equals("rock") && computer.equals("scissors")) ||
                (user.equals("paper") && computer.equals("rock")) ||
                (user.equals("scissors") && computer.equals("paper")))
            return "User";

        return "Computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int games = sc.nextInt();
        int userWins = 0, computerWins = 0;

        for (int i = 0; i < games; i++) {
            String userChoice = sc.next();
            String computerChoice = getComputerChoice();

            String result = findWinner(userChoice, computerChoice);

            if (result.equals("User")) userWins++;
            if (result.equals("Computer")) computerWins++;
        }

        System.out.println("User Wins: " + userWins);
        System.out.println("Computer Wins: " + computerWins);
    }
}
