package com.gentech.inheritance;
class Bank1{
    Bank1(int bandId, String bankName){
        System.out.println("Bank Id:"+bandId);
        System.out.println("Bank Name:"+bankName);
    }
    Bank1(String location)
    {
      System.out.println("Location:"+location);
    }
}

class Loan1 extends Bank1
{
    String loanName;

    Loan1(int bandId1, String bankName1, String loanName)
    {
        super(bandId1, bankName1);
        this.loanName = loanName;
        System.out.println("Loan Name:"+this.loanName);
    }
    Loan1(String location)
    {
        super(location);
    }
}

class Amount1 extends Loan1
{
    int amount;
    Amount1(int bandId, String bankName, String loanName, int amount)
    {
        super(bandId, bankName, loanName);
        this.amount=amount;
        System.out.println("Amount :"+this.amount);
    }
    Amount1(String location)
    {
        super(location);
    }
}

public class MultilevelConstructorOverloadingMainDemo {
    public static void main(String[] args) {
        Amount1 amount = new Amount1(34, "Axis Bank", "Home Loan", 1200000);
        Amount1 amount1 =new Amount1("Bangalore");
    }
}
