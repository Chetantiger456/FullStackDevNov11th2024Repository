package com.test;
class NativePlace{
   String getNative(){
       return "Bangalore";
   }
}
public class NativePlaceMainDemo {
    public static void main(String[] args) {
        NativePlace nativePlace = new NativePlace();
        String res = nativePlace.getNative();
        System.out.println(res);
    }
}
