package com.test;
class String1DArr{
    String strArr[] = {"aa", "dd", "rr"};
    String[] sendArray(){

        return strArr;
    }
}
public class String1DArrMainDemo {
    public static void main(String[] args) {
        String1DArr string1DArr = new String1DArr();
       String []sr =  string1DArr.sendArray();
        for (int i = 0; i <sr.length ; i++) {
            System.out.println(sr[i]);

        }
    }
}
