package com.gentech.practic;

public class ImplicitTypeCastingDemo {
    public static void main(String[] args) {
        short s = 10;
        System.out.println("short s: "+s);
        int i = s;
        System.out.println("int i: "+i);
        byte b = 29;
        System.out.println("byte b: "+b);
        int j = b;
        System.out.println("int j: "+j);
        int k = 30;
        System.out.println("int k: "+k);
        long l = k;
        System.out.println("long l:"+l);
    }
}
