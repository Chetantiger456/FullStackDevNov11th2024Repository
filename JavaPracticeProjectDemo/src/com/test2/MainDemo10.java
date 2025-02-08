package com.test2;
class IMSM{
    void show(){
        System.out.println("IM");
    }
    static void display(){
        System.out.println("SB");
    }
}

class Con1{
    Con1(){
        IMSM imsm = new IMSM();
        imsm.show();
        IMSM.display();
    }
}
public class MainDemo10 {
    public static void main(String[] args) {
        Con1 con = new Con1();
    }
}
