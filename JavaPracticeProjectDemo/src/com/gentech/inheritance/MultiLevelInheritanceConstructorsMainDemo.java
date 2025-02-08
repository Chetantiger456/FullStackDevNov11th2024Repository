package com.gentech.inheritance;
class Bank{
    Bank(int bandId, String bankName){
        System.out.println("Bank Id:"+bandId);
        System.out.println("Bank Name:"+bankName);
    }
}

class Loan extends Bank{
    String loanName;

    Loan(int bandId, String bankName, String loanName) {
        super(bandId, bankName);
        this.loanName = loanName;
        System.out.println("Loan Name:"+this.loanName);
    }
}

class Amount extends Loan{
    int amount;
    Amount(int bandId, String bankName, String loanName, int amount) {
        super(bandId, bankName, loanName);
        this.amount=amount;
        System.out.println("Amount :"+this.amount);
    }
}

public class MultiLevelInheritanceConstructorsMainDemo {
    public static void main(String[] args) {
        Amount amount = new Amount(34, "Axis Bank", "Home Loan", 1200000);

    }
}
