package com.test;
class CubeOfNumber{
    int i=5;
    int cubeNum(){
        return i*i*i;
    }
}
public class CubeOfNumberMainDemo {
    public static void main(String[] args) {
      CubeOfNumber cubeOfNumber = new CubeOfNumber();
      int res = cubeOfNumber.cubeNum();
        System.out.println(res);
    }
}
