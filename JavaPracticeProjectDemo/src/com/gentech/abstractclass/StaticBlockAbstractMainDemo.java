package com.gentech.abstractclass;
abstract class StaticBlockAbstract{
    static {
        System.out.println("Abstract static block");
    }
}

class NormalClass extends StaticBlockAbstract {

}
public class StaticBlockAbstractMainDemo
{
    public static void main(String[] args) {
        NormalClass normalClass = new NormalClass();
    }
}
