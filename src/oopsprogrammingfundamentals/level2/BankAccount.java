package oopsprogrammingfundamentals.level2;
/*
 * Problem Statement:
 * Write a Java program to create a BankAccount class that allows
 * depositing, withdrawing, and displaying the account balance.
 */

/*
 * Class Name: BankAccount
 *
 * Description:
 * This class represents a bank account with details such as
 * account holder name, account number, and balance. It provides
 * methods to deposit money, withdraw money with balance validation,
 * and display the current account balance.
 */
public class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient balance");
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.accountHolder = "Ravi";
        acc.accountNumber = 12345;
        acc.balance = 5000;

        acc.deposit(2000);
        acc.withdraw(1000);
        acc.displayBalance();
    }
}
