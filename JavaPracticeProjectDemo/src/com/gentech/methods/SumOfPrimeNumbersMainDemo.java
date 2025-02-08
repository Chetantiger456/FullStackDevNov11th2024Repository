package com.gentech.methods;
class SumOfPrimeNumbers {
    void sumOfPrime(int startNumber, int endNumber){
        if(startNumber>0 && endNumber>0){
            int look = 0;
            int sum = 0;
            System.out.print("Prime Numbers: ");
            for(int i = startNumber;i<=endNumber;i++){
                look=0;
                for(int j=2;j<i;j++){
                    if(i%j==0){
                        look++;
                    }
                }
                if(look == 0){
                    System.out.print(i+" ");
                    sum+= i;
                }
            }
            System.out.println("\nSum of Prime Numbers: "+sum);
        }else {
            System.out.println("Start number and end number should be greater than zero");
        }
    }
}

public class SumOfPrimeNumbersMainDemo {
    public static void main(String[] args) {
        SumOfPrimeNumbers sumOfPrimeNumbers = new SumOfPrimeNumbers();
        sumOfPrimeNumbers.sumOfPrime(0, 0);
        sumOfPrimeNumbers.sumOfPrime(1, 100);
    }
}
