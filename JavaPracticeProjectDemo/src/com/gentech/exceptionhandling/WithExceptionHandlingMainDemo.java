package com.gentech.exceptionhandling;
class WithExceptionMaths1{
    static void addition(int x, int y){
        System.out.println("Addition Result:"+(x+y));
    }

    static void subtraction(int x, int y){
        System.out.println("Subtraction Result:"+(x-y));
    }

    static void division(int x, int y){
        try {
            int result = (x / y);
            System.out.println("Division Result:" + result);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
    }
    static void multiplication(int x, int y){
        System.out.println("Multiplication Result:"+(x*y));
    }

    static void isPositiveNumber(int number){
        if(number>0) {
            System.out.println("Positive Number:"+number);
        }
    }

    static void isNegativeNumber(int number){
        if(number<0){
            System.out.println("Negative Number:"+number);
        }
    }

    static void isEvenNumber(int number){
        if(number%2 == 0){
            System.out.println(number+" is Even Number");
        }
    }

    static void isOddNumber(int number){
        if(number%2 == 1){
            System.out.println(number+" is Odd Number");
        }
    }
}

public class WithExceptionHandlingMainDemo {
    public static void main(String[] args) {
        WithExceptionMaths1.addition(20,39);
        WithExceptionMaths1.subtraction(23,12);
        WithExceptionMaths1.isEvenNumber(12);
        WithExceptionMaths1.isOddNumber(51);
        WithExceptionMaths1.division(23,0);
        WithExceptionMaths1.isNegativeNumber(-12);
        WithExceptionMaths1.isPositiveNumber(45);
        WithExceptionMaths1.multiplication(10,34);
    }
}
