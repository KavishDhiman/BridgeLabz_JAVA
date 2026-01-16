package ControlFlows.Level1;

/*
 * This program checks whether a person
 * is eligible to vote based on age.
 */
public class VotingRights {

    public static void main(String[] args) {

        int age = 20;

        // Checking voting eligibility
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }
}
