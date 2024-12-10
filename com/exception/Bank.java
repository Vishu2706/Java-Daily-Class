package com.exception;

import java.util.Scanner;

public class Bank{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckingAccount c = new CheckingAccount(139,10343434,"Levi Ackerman");
        double amount;

        while (true) { 
            System.out.println("******************************************************************");
            System.out.println("1. Deposit");
            System.out.println("2. Withdrawl");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter Your Choice :");
            int choice = sc.nextInt();
            System.out.println("******************************************************************");


            if( choice == 1 ){
                System.out.println("Enter Deposit Amount :");
                amount = sc.nextDouble();
                c.deposit(amount);
                System.out.println("******************************************************************");
            }else if( choice == 2){
                try{
                    System.out.println(" Enter Deposit Amount :");
                    amount = sc.nextDouble();
                    c.withdraw(amount);
                System.out.println("******************************************************************");
                }
                catch (InsufficientFund e){
                    System.out.println("Sorry you need to Another"+ e.getAmount()+"rs.");
                    System.out.println("******************************************************************");
                }
            }else if(choice == 3){
                c.checkBalance();
                System.out.println("******************************************************************");
            }else if(choice == 4){
                System.out.println(" Thank you for using our services.");
                System.out.println("******************************************************************");
            }
            else{
                System.out.println("Invalid Choice. Please Try Again.");
                System.out.println("******************************************************************");
            }
        }

    }
}