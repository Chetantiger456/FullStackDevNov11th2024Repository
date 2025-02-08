package com.test3;
interface FIF{
    int id=32;
    int zip = 72884;
    String email = "ee@gmail.com";
}
interface SIF{
    int mobile= 31312;
    String name = "XZCCV";
    String address = "Bangalore";
}

class IndPen{
    void displayAllVariables(){
        System.out.println(+FIF.id+" "+FIF.zip+" "+FIF.email);
        System.out.println(SIF.address+" "+SIF.name+" "+SIF.mobile);
    }
}
public class MainDemo6 {
    public static void main(String[] args) {
        IndPen indPen = new IndPen();
        indPen.displayAllVariables();
    }
}
