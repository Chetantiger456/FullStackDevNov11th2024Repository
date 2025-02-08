package com.test3;
 interface A{
    abstract void mA1();
    abstract void mA2();
}
 interface B{
    abstract void mB3();
}

class ZZZ implements A,B{

    @Override
    public void mA1() {
        System.out.println("A Method1");
    }

    @Override
    public void mA2() {
        System.out.println("A method2");
    }

    @Override
    public void mB3() {
        System.out.println("B Method");
    }
}

public class MainDemo9 {
    public static void main(String[] args) {
        B b = new ZZZ();
        b.mB3();
    }
}
