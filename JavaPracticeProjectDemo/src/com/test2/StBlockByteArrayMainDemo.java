package com.test2;
class StBlockByteArray{
    static {
        byte [][]b = {{6,7},{2,9}};
        for (int i = 0; i < b.length; i++) {
            for(int j = 0;j<b[i].length;j++){
                System.out.print(b[j][i]+" ");
            }
            System.out.println();
        }
    }
}
public class StBlockByteArrayMainDemo {
    public static void main(String[] args) {
        StBlockByteArray stBlockByteArray = new StBlockByteArray();
    }
}
