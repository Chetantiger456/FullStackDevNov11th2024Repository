package com.test3;
abstract class INM{
    void display(){
        STM.show();
        System.out.println("display");
    }
}

abstract class STM{
    static void show(){
        System.out.println("show");
    }
}

class MAE extends INM{

}

public class MainDemo7 {
    public static void main(String[] args) {
       MAE mae = new MAE();
       mae.display();

    }
}
