package com.gentech.returnmethods;
class DivisibleBy10{
    int[] divisible(int startNumber, int endNumber, int divisibleByNumber) {
        int count = 0;
        int[] newArray = null;
        if (startNumber > 0 && endNumber > 0) {
            for (int i = startNumber; i >= endNumber; i--) {
                if (i % divisibleByNumber == 0) {
                    count++;
                }
            }
            newArray = new int[count];
            int k = 0;
            for (int i = startNumber; i >= endNumber; i--) {
                if (i % divisibleByNumber == 0) {
                    newArray[k] = i;
                    k++;
                }
            }
        } else {
            System.out.println("Start Number and End Number should be greater than zero");
        }
        return newArray;
    }
}
public class DivisibleBy10MainDemo {
    public static void main(String[] args) {
        DivisibleBy10 divisibleBy10 = new DivisibleBy10();
        int[] countResult = divisibleBy10.divisible(500, 200, 10);
        System.out.print("Divisible values is: ");
        for (int i = 0; i < countResult.length; i++) {
            System.out.print(countResult[i]+" ");
        }
    }
}
