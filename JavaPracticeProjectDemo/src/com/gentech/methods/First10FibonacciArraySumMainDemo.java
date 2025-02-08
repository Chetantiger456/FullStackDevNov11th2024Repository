package com.gentech.methods;
class First10FibonacciArraySum {
    void fibonacciArraySum(int numOfFib){
        int firstNumber = 0;
        int secondNumber = 1;
        int fibArray[] = new int[numOfFib];
        int sum = 0;
        fibArray[0] = firstNumber;
        fibArray[1] = secondNumber;
        for(int i=2;i<fibArray.length;i++){
            int thirdNumber = firstNumber+secondNumber;
            fibArray[i] = thirdNumber;
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
        }
        System.out.print(numOfFib+" Fibonacci Numbers: ");
        for(int i = 0; i<fibArray.length;i++){
            System.out.print(fibArray[i]+" ");
            sum+= fibArray[i];
        }
        System.out.println("\nSum of fibonacci number:"+sum);
    }
}
public class First10FibonacciArraySumMainDemo {
    public static void main(String[] args) {
        First10FibonacciArraySum first10FibonacciArraySum = new First10FibonacciArraySum();
        first10FibonacciArraySum.fibonacciArraySum(10);
        first10FibonacciArraySum.fibonacciArraySum(20);
    }
}
