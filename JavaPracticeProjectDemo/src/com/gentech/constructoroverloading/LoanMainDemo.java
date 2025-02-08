package com.gentech.constructoroverloading;

class Loan {
    Loan(int loanId, String loanName) {
        System.out.println("Loan Id:"+loanId+","+"Loan Name:"+loanName);
    }
    Loan(int loanAmount, double interestRate) {
        System.out.println("Loan Amount:"+loanAmount+","+"Interest Rate:"+interestRate);
    }
    Loan(String startDate, String endDate) {
        System.out.println("Start Date:"+startDate+","+"endDate:"+endDate);
    }
    Loan(double monthlyPayment, double totalPayment) {
        System.out.println("Monthly Payment:"+ monthlyPayment+","+"Total Payment:"+totalPayment);
    }
    Loan(String monthlyFrequency) {
        System.out.println("Monthly Frequency:"+monthlyFrequency);
    }
}

public class LoanMainDemo {
    public static void main(String[] args) {
        Loan loan = new Loan(12, "Home loan");
        Loan loan1 = new Loan(3200000, 12.8);
        Loan loan2 = new Loan("12-12-2024", "12-12-2034");
        Loan loan3 = new Loan("Monthly");
        Loan loan4 = new Loan(10000.23, 380000.4554);
    }
}
