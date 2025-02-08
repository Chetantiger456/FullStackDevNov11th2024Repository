package com.gentech.returnmethods;
class SumOfNumbers{
    int sumNumbers(int startNumber, int endNumber){
        int sum = 0;
        if(startNumber > 0 && endNumber > 0){
            for(int i=startNumber;i<=endNumber;i++){
                sum+=i;
            }
        }else{
            System.out.println("Starting number and Ending number should be greater than zero");
        }
        return sum;
    }
}
public class SumBetween10To20MainDemo {
    public static void main(String[] args) {
        SumOfNumbers sumOfNumbers = new SumOfNumbers();
        int sumResult = sumOfNumbers.sumNumbers(10, 20);
        System.out.println("Result of sum: "+sumResult);
    }
}
