package com.gentech.returnmethods;
class ByteArrayFirstRow {
   byte[] firstRowFromArray(byte array2D[][]) {
       byte[] firstRow = null;
       if (array2D.length > 0 && array2D[0].length>0) {
           firstRow = new byte[array2D.length];
           for (int j = 0;j < array2D[0].length;j++){
               firstRow[j] = array2D[0][j];
           }
       }else{
           System.out.println("Array length can never be zero");
       }
       return firstRow;
   }
}

public class ByteArrayFirstRowMainDemo {
    public static void main(String[] args) {
        ByteArrayFirstRow byteArrayFirstRow = new ByteArrayFirstRow();
       byte[] firstRowResult =  byteArrayFirstRow.firstRowFromArray(new byte[][] {{6,3,8},{9,1,7},{2,4,5}});
        for (int i = 0; i < firstRowResult.length; i++) {
            System.out.print(firstRowResult[i]+" ");
        }
    }
}
