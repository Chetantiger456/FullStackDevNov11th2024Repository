package com.gentech.methods;

class CountOfPrimeNumbers {
    void countPrimeNumbers(int startNumber, int endNumber){
        if(startNumber>0 && endNumber>0){
            int count = 0;
            int look = 0;
            System.out.print("Prime Numbers: ");
            for(int i =startNumber;i<=endNumber;i++){
                look = 0;
                for(int j =2;j<i;j++){
                    if(i%j==0){
                        look++;
                    }
                }
                if(look==0){
                    count++;
                    System.out.print(i+" ");
                }
            }
            System.out.println("\nCount of Prime Numbers: "+count);
        }else {
            System.out.println("Start number and end number should be greater than zero");
        }
    }
}

public class CountOfPrimeNumberMainDemo {
    public static void main(String[] args) {
        CountOfPrimeNumbers countOfPrimeNumbers = new CountOfPrimeNumbers();
        countOfPrimeNumbers.countPrimeNumbers(0, 0);
        countOfPrimeNumbers.countPrimeNumbers(100, 200);
    }
}
