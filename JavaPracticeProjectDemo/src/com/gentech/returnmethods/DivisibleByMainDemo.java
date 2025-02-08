package com.gentech.returnmethods;
class DivisibleBy{
    int divisible(int startNumber, int endNumber, int divisibleByNumber){
        int count = 0;
        if(startNumber>0 && endNumber>0) {
            if(startNumber < endNumber)
            for(int i=startNumber;i<=endNumber;i++){
                if(i%divisibleByNumber == 0){
                    count++;
                }
            }
        }else {
            System.out.println("Start Number and End Number should be greater than zero");
        }
        return count;
    }
}
public class DivisibleByMainDemo {
    public static void main(String[] args) {
        DivisibleBy divisibleBy = new DivisibleBy();
        int countResult = divisibleBy.divisible(100, 200, 6);
        System.out.println("Divisible Count is: "+countResult);
    }
}
