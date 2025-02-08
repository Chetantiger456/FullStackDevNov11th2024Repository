package com.gentech.returnmethods;
class CountOfOddNumbers {
    int oddCount(int startNumber, int endNumber){
        int oddCount = 0;
        for(int i=startNumber;i<=endNumber;i++){
            if(i%2==1)
            {
                oddCount++;
            }
        }
        return oddCount;
    }
}
public class CountOfOddNumbersMainDemo {
    public static void main(String[] args) {
        CountOfOddNumbers countOfOddNumbers = new CountOfOddNumbers();
        int countResult = countOfOddNumbers.oddCount(1, 500);
        System.out.println("Odd Numbers Count: "+countResult);
    }
}
