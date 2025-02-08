package com.test;
class ByteArray{
    byte[] sendArray(byte b[]){
        return b;
    }
}
public class ByteArrayMainDemo {
    public static void main(String[] args) {
       ByteArray byteArray = new ByteArray();
       byte[] res = byteArray.sendArray(new byte[] {1,3,4,6});
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
