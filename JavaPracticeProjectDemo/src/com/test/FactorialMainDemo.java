package com.test;
class Factorial{
    int getFact1() {
        int fact = 1;
        int num = 5;
        for (int i = num; i >= 1; i--) {
            fact *= i;
        }
        return fact;
    }
}
public class FactorialMainDemo {
    public static void main(String[] args) {
       Factorial factorial = new Factorial();
       int res1 = factorial.getFact1();
        System.out.println(res1);
    }
}
