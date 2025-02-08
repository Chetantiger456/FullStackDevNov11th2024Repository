package com.gentech.practic;

public class ExplicitTypeCastingDemo
{
    public static void main(String[] args) {
        int i = 101;
        System.out.println("int i: "+i);
        byte b = (byte) i;
        System.out.println("byte b: "+b);

        int j = 300;
        System.out.println("int j: "+j);
        byte b1= (byte) j;
        // byte range is 256 so it will subtract if value is more than 256
        // 300-256=44
        System.out.println("byte b1: "+b1);

        int k = 68;
        System.out.println("int k:"+k);
        char ch = (char) k;
        System.out.println("char ch : "+ch);
    }
}
