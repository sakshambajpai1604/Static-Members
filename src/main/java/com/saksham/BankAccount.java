package com.saksham;

public class BankAccount {
    private String holder;
    private double balance;
    private static double interestRate = 5.0;
    public BankAccount(String holder, double balance) {
        this.holder = holder;
        this.balance = balance;
    }
    public double calculateInterest() {
        return balance * interestRate / 100.0;
    }
    public void display() {
        System.out.println(holder
                + " | Balance: Rs. " + balance
                + " | Interest: Rs. " + calculateInterest());
    }
    public static void setInterestRate(double rate) {
        interestRate = rate;
    }
    public static double getInterestRate() {
        return interestRate;
    }
}
