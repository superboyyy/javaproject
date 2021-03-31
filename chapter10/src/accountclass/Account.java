package accountclass;

import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private java.util.Date dateCreated;

    public Account() {
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new java.util.Date();
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        double monthlyInterestRate = annualInterestRate / 12 / 100;
        return monthlyInterestRate;
    }

    public double getMonthlyInterest() {
        double monthlyInterest = balance * (annualInterestRate / 12 / 100);
        return monthlyInterest;
    }

    public void withDraw(double money) {
        balance = balance - money;
    }

    public void deposit(double money) {
        balance = balance + money;
    }
}
