package com.gentech.returnmethods;
class Transpose2DArray{
    int[][] transposeArray(int arr[][]){
        int[][] transposeArr = new int[arr.length][arr[0].length];
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                transposeArr[i][j] = arr[j][i];
            }
        }
        return transposeArr;
    }
}

public class Transpose2DArrayMainDemo {
    public static void main(String[] args) {
        Transpose2DArray transpose2DArray = new Transpose2DArray();
        int [][]transposeResult = transpose2DArray.transposeArray(new int[][]{{8,4,1},{2,6,9},{3,5,7}});
        for(int i=0;i<transposeResult.length;i++){
            for(int j=0;j<transposeResult[i].length;j++){
                System.out.print(transposeResult[i][j]+" ");
            }
            System.out.println();
        }

    }
}
