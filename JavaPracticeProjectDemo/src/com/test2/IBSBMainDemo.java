package com.test2;
class IBSB{
    {
        System.out.println("second Instance Block");
    }
    {
        System.out.println("First Instance Block");
    }
    {
        System.out.println("Third Instance Block");
    }

}
public class IBSBMainDemo {
    public static void main(String[] args) {
        IBSB ibsb = new IBSB();
    }
}
