package com.tw.practice;

class BharatBank{
    private double accountBalance;
    private final String accountType;
    private static final int savingsInterest = 3, currentInterest = 0;

    BharatBank(double accountBalance, String accountType){
        this.accountBalance = accountBalance;
        this.accountType = accountType;
    }

    void depositMoney(double depositAmount){
        accountBalance = accountBalance + depositAmount;
    }

    void withdrawMoney(double withdrawAmount){
        accountBalance = accountBalance - withdrawAmount;
    }

    double calculateInterest(){
        double timeDuration = 0.25;
        if(accountType.equalsIgnoreCase("Savings")){
            return (double) this.accountBalance * savingsInterest * timeDuration / 100;
        }
        return (double) this.accountBalance * currentInterest * timeDuration / 100;
    }
}

public class BankTransaction {
    public static void main(String[] args) {
        BharatBank gopalsAccount = new BharatBank(5000, "Current");
        gopalsAccount.depositMoney(10000);

        BharatBank amritasAccount = new BharatBank(100000, "Savings");
        amritasAccount.withdrawMoney(45000);

        System.out.println("Interest earned by Gopal: "+gopalsAccount.calculateInterest());
        System.out.println("Interest earned by Amrita: "+amritasAccount.calculateInterest());
    }
}
