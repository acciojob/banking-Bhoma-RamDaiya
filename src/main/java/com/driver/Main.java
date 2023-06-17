package com.driver;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("save", 0.0, 5.0, 50.0);

        System.out.println(savingsAccount.getName().equals("save"));//true

        System.out.println(savingsAccount.getBalance() == 0.0);//true

        System.out.println( savingsAccount.getMinBalance() == 0.0);//true

        System.out.println( savingsAccount.getMaxWithdrawalLimit() == 5.0);//true

        System.out.println( savingsAccount.getRate() == 50.0);//true

        try {
            savingsAccount.withdraw(1.0);
        } catch (Exception var6) {
            System.out.println( var6.getMessage().equals("Insufficient Balance"));//true
        }

        try {
            savingsAccount.deposit(500.0);

            System.out.println( savingsAccount.getName().equals("save"));//true

            System.out.println( savingsAccount.getBalance() == 500.0);//true

            System.out.println( savingsAccount.getMinBalance() == 0.0);//true

            System.out.println( savingsAccount.getMaxWithdrawalLimit() == 5.0);//true

            System.out.println( savingsAccount.getRate() == 50.0);//true

            savingsAccount.withdraw(1.0);

            System.out.println( savingsAccount.getName().equals("save"));//true

            System.out.println( savingsAccount.getBalance() == 499.0);//true

            System.out.println( savingsAccount.getMinBalance() == 0.0);//true

            System.out.println( savingsAccount.getMaxWithdrawalLimit() == 5.0);//true

            System.out.println( savingsAccount.getRate() == 50.0);//true

            savingsAccount.withdraw(5.0);

            System.out.println( savingsAccount.getName().equals("save"));//true

            System.out.println( savingsAccount.getBalance() == 494.0);//true

            System.out.println( savingsAccount.getMinBalance() == 0.0);//true

            System.out.println( savingsAccount.getMaxWithdrawalLimit() == 5.0);//true

            System.out.println( savingsAccount.getRate() == 50.0);//true
        } catch (Exception var5) {
            System.out.println( var5.getMessage().equals("Insufficient Balan"));
        }

        try {
            savingsAccount.withdraw(6.0);

            System.out.println( savingsAccount.getName().equals("save"));

            System.out.println( savingsAccount.getBalance() == 499.0);

            System.out.println( savingsAccount.getMinBalance() == 0.0);

            System.out.println( savingsAccount.getMaxWithdrawalLimit() == 5.0);

            System.out.println( savingsAccount.getRate() == 50.0);
        } catch (Exception var4) {
            System.out.println( var4.getMessage().equals("Maximum Withdraw Limit Exceeded"));//true
        }

        try {
            savingsAccount.withdraw(1000.0);

            System.out.println( savingsAccount.getName().equals("save"));

            System.out.println( savingsAccount.getBalance() == 499.0);

            System.out.println( savingsAccount.getMinBalance() == 0.0);

            System.out.println( savingsAccount.getMaxWithdrawalLimit() == 5.0);

            System.out.println( savingsAccount.getRate() == 50.0);
        } catch (Exception var3) {
            System.out.println( var3.getMessage().equals("Maximum Withdraw Limit Exceeded"));//true
        }

    }
}
