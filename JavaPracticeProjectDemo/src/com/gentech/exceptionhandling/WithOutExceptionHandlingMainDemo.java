package com.gentech.exceptionhandling;
class WithOutExceptionMaths{
    static void addition(int x, int y) {
        System.out.println("Addition Result:"+(x+y));
    }

    static void subtraction(int x, int y){
        System.out.println("Subtraction Result:"+(x-y));
    }

    static void division(int x, int y){
        int result = (x/y);
        System.out.println("Division Result:"+result);
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
public class WithOutExceptionHandlingMainDemo {
    public static void main(String[] args) {
        WithOutExceptionMaths.addition(10, 20);
        WithOutExceptionMaths.subtraction(32, 23);
        WithOutExceptionMaths.multiplication(20,67);
        WithOutExceptionMaths.isEvenNumber(34);
        WithOutExceptionMaths.division(450, 0);
        WithOutExceptionMaths.isOddNumber(23);
        WithOutExceptionMaths.isPositiveNumber(78);
        WithOutExceptionMaths.isNegativeNumber(-45);
    }
}
