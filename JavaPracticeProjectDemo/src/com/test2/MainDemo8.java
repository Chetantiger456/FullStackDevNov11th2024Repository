package com.test2;
class IM{
    void show(){
        System.out.println("IMethod");
    }
    {
        System.out.println("IB");
    }
}
class SB{
    static {
        IM im = new IM();
        im.show();
    }
}
public class MainDemo8 {
    public static void main(String[] args) {
        SB sb = new SB();
    }
}
