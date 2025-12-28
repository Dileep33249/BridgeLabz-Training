package com.inhertence;

class BankAccount {
    protected int accountNumber;
    protected double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayAccountType() {
        System.out.println("Generic Bank Account");
    }
}

// Savings Account
class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    void displayAccountType() {
        System.out.println("Savings Account");
    }
}

// Checking Account
class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    void displayAccountType() {
        System.out.println("Checking Account");
    }
}

// Fixed Deposit Account
class FixedDepositAccount extends BankAccount {
    int maturityPeriod; // in months

    FixedDepositAccount(int accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    @Override
    void displayAccountType() {
        System.out.println("Fixed Deposit Account");
    }
}

public class BankAccountTypes {
    public static void main(String[] args) {

         BankAccount acc1 = new SavingsAccount(101, 50000, 4.5);
       BankAccount acc2 = new CheckingAccount(102, 30000, 10000);
          BankAccount acc3 = new FixedDepositAccount(103, 100000, 24);

        acc1.displayAccountType();
        acc2.displayAccountType();
        acc3.displayAccountType();
    }
}
