package main.java;

public class BankAccount {
    private final int accountNumber;
    private final String accountHolderName;
    private double balance;

    public BankAccount(int accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public String getAccountHolderName() {
        return this.accountHolderName;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        this.balance -= amount;
    }
}
