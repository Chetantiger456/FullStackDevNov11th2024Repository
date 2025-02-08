package com.gentech.abstractclass;
abstract class StaticMethodAbstractClass{
    static void firstStaticMethod(){
        System.out.println("First static method");
    }
    static void secondStaticMethod(){
        System.out.println("Second static method");
    }
}
class SC extends StaticMethodAbstractClass{

}
public class StaticMethodAbstractClassMainDemo {
    public static void main(String[] args) {
        StaticMethodAbstractClass.firstStaticMethod();
        StaticMethodAbstractClass.secondStaticMethod();
    }
}
