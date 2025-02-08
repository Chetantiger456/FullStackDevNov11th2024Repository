package com.test2;
class D1{
    {
        System.out.println("IB");
    }
    static {
        System.out.println("SB");
    }
}
class D2{
    D2(String name){
        D1 d1 = new D1();
        System.out.println(name);
    }
}
public class ISCMainDemo7 {
    public static void main(String[] args) {
        D2 d2 = new D2("Santhu");
    }
}
