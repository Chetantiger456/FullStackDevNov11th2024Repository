package com.gentech.abstractclass;
abstract class InstanceBlockAbstract{
    {
        System.out.println("Abstract Insert Block");
    }
}

class NormalClass1 extends InstanceBlockAbstract{

}
public class InstanceBlockAbstractMainDemo {
    public static void main(String[] args) {
        NormalClass1 normalClass1 = new NormalClass1();
    }
}
