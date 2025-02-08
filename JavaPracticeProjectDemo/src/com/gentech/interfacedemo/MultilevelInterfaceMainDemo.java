package com.gentech.interfacedemo;

interface BankAccount {
    void deposit();
    void withdraw();
}
interface CheckingAccount extends BankAccount {
    void getOverdraftLimit();
}
interface SavingsAccount extends CheckingAccount {
    void applyInterest();
}
interface BusinessAccount extends SavingsAccount {
    void requestBusinessLoan(); }

class AllAccounts implements BusinessAccount{

    @Override
    public void requestBusinessLoan() {
        System.out.println("Request Business Loan");
    }

    @Override
    public void getOverdraftLimit() {
        System.out.println("Over Draft Limit");
    }

    @Override
    public void deposit() {
        System.out.println("Deposit");
    }

    @Override
    public void withdraw() {
        System.out.println("With draw");
    }

    @Override
    public void applyInterest() {
        System.out.println("Apply Interest");
    }
}
public class MultilevelInterfaceMainDemo {
    public static void main(String[] args) {
        AllAccounts allAccounts = new AllAccounts();
        allAccounts.deposit();
        allAccounts.withdraw();
        allAccounts.requestBusinessLoan();
        allAccounts.applyInterest();
        allAccounts.getOverdraftLimit();
    }
}
