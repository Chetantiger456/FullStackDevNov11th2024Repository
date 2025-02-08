package com.gentech.methods;

class PrimeNumbers {
    void isPrime(int startNum, int endNum){
        if(startNum > 0 && endNum > 0){
            int look=0;
            for(int i = startNum;i<=endNum;i++){
                look=0;
                for(int j = 2;j<i;j++){
                    if(i%j==0){
                        look++;
                    }
                }
                if(look==0){
                    System.out.println(i+" is a Prime Number");
                }
            }

        }else {
            System.out.println("Start number and end number should be greater than zero");
        }
    }
}

public class PrimeNumbersMainDemo {
    public static void main(String[] args) {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.isPrime(0, 0);
        primeNumbers.isPrime(50, 100);
    }
}
