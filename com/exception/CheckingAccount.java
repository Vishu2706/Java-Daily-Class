package com.exception;

public class CheckingAccount{
    int accNo;
    double balance;
    String acName;

    public CheckingAccount(int no, double cash, String name){
        this.accNo = no;
        this.balance = cash;
        this.acName = name;
        System.out.println("Hello "+ acName +" Your Account Number" + accNo + "Is Opened With " + balance + "rs.");
    }

    public void deposit (double amount){
        this.balance = this.balance + amount;
    }

    public void withdraw(double amount) throws InsufficientFund{
        if(amount <= this.balance){
            this.balance = this.balance - amount;
        }else{
            throw new InsufficientFund(amount - this.balance);
        }
    }

    public void checkBalance(){
        System.out.println("Current Balance : "+ this.balance);
    }

}