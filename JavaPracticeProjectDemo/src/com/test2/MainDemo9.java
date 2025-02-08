package com.test2;
class ISM {
    void show(){
        System.out.println("IM");
    }
    static void display(){
        System.out.println("SM");
    }
}

class IB2 {
    {
        ISM ism = new ISM();
        ism.show();
        ISM.display();
    }
}
public class MainDemo9 {
    public static void main(String[] args) {
        IB2 ib2 = new IB2();
    }
}
