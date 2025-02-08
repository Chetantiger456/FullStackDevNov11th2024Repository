package com.test;
class SumOf5Num{
    int add5() {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        return sum;
    }
}
public class SumOf5NumMainDemo {
    public static void main(String[] args) {
        SumOf5Num sumOf5Num = new SumOf5Num();
        System.out.println(sumOf5Num.add5());
    }
}
