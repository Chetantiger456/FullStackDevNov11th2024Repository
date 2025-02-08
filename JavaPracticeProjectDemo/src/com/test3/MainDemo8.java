package com.test3;
abstract class FIMF{
   abstract void show();
}

abstract class SSMF{
    static void display(){
        System.out.println("display");
    }
}
class MDD extends FIMF
{
    void show(){
        System.out.println("show");
    }
}
public class MainDemo8 {
    public static void main(String[] args) {
           MDD mdd = new MDD();
           mdd.show();
           SSMF.display();
    }
}
