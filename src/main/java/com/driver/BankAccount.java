
package com.driver;

public class BankAccount {

    private String name;
    private double balance;
    private double minBalance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }

    public BankAccount(String name, double balance, double minBalance) {
        this.name = name;
        this.balance = balance;
        this.minBalance = minBalance;
    }

    public String generateAccountNumber(int digits, int sum) throws Exception{
        //Each digit of an account number can lie between 0 and 9 (both inclusive)
        //Generate account number having given number of 'digits' such that the sum of digits is equal to 'sum'
        //If it is not possible, throw "Account Number can not be generated" exception
        if(sum <= 0 || sum > (digits * 9))
            throw new RuntimeException("Account Number can not be generated");
        else{
            sum -= 1;
            digits -= 1;
            int count = 0;
            String acnNo = "";
            while(count < digits){
                if(sum >= 9){
                    acnNo = 9 + acnNo;
                    sum -= 9;
                }else{
                    acnNo = sum + acnNo;
                    sum = 0;
                }
                count++;
            }
            if(sum > 0){
                sum += 1;
                acnNo = sum + acnNo;
            }else{
                acnNo = 1 + acnNo;
            }
            return acnNo;
        }
    }

    public void deposit(double amount) {
        //add amount to balance
        balance += amount;
    }

    public void withdraw(double amount) throws Exception {
        // Remember to throw "Insufficient Balance" exception, if the remaining amount would be less than minimum balance
        if((balance - amount) < minBalance){
            throw new RuntimeException("Insufficient Balance");
        }else{
            balance -= amount;
        }
    }

}