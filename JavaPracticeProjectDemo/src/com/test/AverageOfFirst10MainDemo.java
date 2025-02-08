package com.test;
class AverageOfFirst10{
    int avg = 0;
    int avgNum(){
        for(int i=1;i<=10;i++){
            avg+=i;
        }
        return avg/10;
    }
}
public class AverageOfFirst10MainDemo {
    public static void main(String[] args) {
        AverageOfFirst10 averageOfFirst10 = new AverageOfFirst10();
        System.out.println(averageOfFirst10.avgNum());
    }
}
