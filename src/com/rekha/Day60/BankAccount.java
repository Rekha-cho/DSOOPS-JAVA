package com.rekha.Day60;

public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    static int totalAccounts = 0;

    // Default constructor
    public BankAccount() {
        this.accountNumber = ++totalAccounts;
        this.accountHolderName = "Unknown";
        this.balance = 0.0;
    }

    // Parameterized constructor
    public BankAccount(String name, double balance) {
        this.accountNumber = ++totalAccounts;
        this.accountHolderName = name;
        this.balance = balance;
    }

    // Overloaded deposit methods
    public void deposit(int amount) {
        this.balance += amount;
        System.out.println("Deposited (int): " + amount);
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited (double): " + amount);
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    // Main method to demonstrate
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount("Rekha", 5000);

        acc1.deposit(1000);
        acc2.deposit(2000.50);

        acc1.displayAccountDetails();
        acc2.displayAccountDetails();

        System.out.println("Total Accounts Created: " + totalAccounts);
    }
}
