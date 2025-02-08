package com.test3;
abstract class AB1{
    abstract void abMethod1();
}
abstract class AB2 extends AB1 implements IF1 {
   abstract void abMethod2();
}
interface IF1{
    void show();
}

class SubC extends AB2{

    @Override
    void abMethod2() {
        System.out.println("ab Method2");
    }

    @Override
    void abMethod1() {
        System.out.println("ab Method1");
    }

    @Override
    public void show() {
        System.out.println("class method show");
    }
}
public class MainDemo2 {
    public static void main(String[] args) {
        SubC subC = new SubC();
        subC.abMethod1();
        subC.abMethod2();
        subC.show();
    }
}
