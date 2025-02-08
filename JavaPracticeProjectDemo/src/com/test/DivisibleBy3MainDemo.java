package com.test;
class DivisibleBy3{
    int countDiv() {
        int count = 0;
        for (int i = 40; i <= 80; i++) {
            if (i%3==0) {
                count++;
            }
        }
        return count;
    }
}
public class DivisibleBy3MainDemo {
    public static void main(String[] args) {
        DivisibleBy3 divisibleBy3 = new DivisibleBy3();
        System.out.println(divisibleBy3.countDiv());
    }
}
