package com.gentech.returnmethods;
class SumOfArrayElements {
    long sumOfArrayElements(long longArray[]) {
        long sum = 0;
        if(longArray.length>0){
            for(int i=0;i<longArray.length;i++){
                sum+= longArray[i];
            }
        }else{
            System.out.println("Array length should be greater than zero");
        }
        return sum;
    }
}
public class SumOfArrayElementsMainDemo {
    public static void main(String[] args) {
        SumOfArrayElements sumOfArrayElements = new SumOfArrayElements();
        long sumResult = sumOfArrayElements.sumOfArrayElements(new long[] {10,20,30,40,50,60,70,80,90});
        System.out.println("Sum of Array Elements: "+sumResult);
    }
}
