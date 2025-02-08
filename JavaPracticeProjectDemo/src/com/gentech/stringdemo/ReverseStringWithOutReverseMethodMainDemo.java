package com.gentech.stringdemo;

public class ReverseStringWithOutReverseMethodMainDemo {
    public static void main(String[] args) {
        String s = "JAVASCRIPT";
//        for (int i = s.length() - 1; i >= 0; i--) {
//            //System.out.println("i="+i);
//            System.out.print(s.charAt(i));
//        }
//            char ch[] = s.toCharArray();
//        for (int i = ch.length - 1; i >= 0; i--) {
//            System.out.println(ch[i]);
//        }

        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.println(s.substring(i, i+1));
        }
    }
}
