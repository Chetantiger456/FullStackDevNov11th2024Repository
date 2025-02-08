package com.gentech.returnmethods;
class ResultOfEvenNumbers {
    int[] findEvenNumbers(int startNumber, int endNumber) {
        int evenCount = 0;
        int[] newArray = null;
        if (startNumber > 0 && endNumber > 0) {
            for (int i = startNumber; i >= endNumber; i--) {
                if (i % 2 == 0) {
                    evenCount++;
                }
            }

            newArray = new int[evenCount];
            int k = 0;
            for (int i = startNumber; i >= endNumber; i--) {
                if (i % 2 == 0) {
                    newArray[k] = i;
                    k++;
                }
            }
        } else {
            System.out.println("Start number and end number should be greater than zero");
        }
        return newArray;
    }
}

public class ResultOfEvenNumbersMainDemo {
    public static void main(String[] args) {
        ResultOfEvenNumbers resultOfEvenNumbers = new ResultOfEvenNumbers();
        int []evenNumbers = resultOfEvenNumbers.findEvenNumbers(40, 20);
        System.out.print("Even Numbers: ");
        for(int i=0;i<evenNumbers.length;i++){
            System.out.print(evenNumbers[i]+" ");
        }
    }
}
