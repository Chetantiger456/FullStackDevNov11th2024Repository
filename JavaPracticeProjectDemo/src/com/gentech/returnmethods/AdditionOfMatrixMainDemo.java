package com.gentech.returnmethods;
class AdditionOfMatrix {
    int[][] addMatrix(int firstArray[][], int secondArray[][]) {
        int[][] newArray = null;
        if (firstArray.length == secondArray.length && firstArray[0].length == secondArray[0].length) {
            newArray = new int[firstArray.length][firstArray[0].length];
            for(int i=0;i<firstArray.length;i++){
                for(int j=0;j<firstArray[0].length;j++){
                    newArray[i][j] = firstArray[i][j]+secondArray[i][j];
                }
            }
        } else {
            System.out.println("Both the Array rows and columns length should match");
        }
        return newArray;
    }
}

public class AdditionOfMatrixMainDemo {
    public static void main(String[] args) {
        AdditionOfMatrix additionOfMatrix = new AdditionOfMatrix();
        int [][]result = additionOfMatrix.addMatrix(new int[][] {{6,4,2},{8,7,4},{3,5,2}}, new int[][] {{7,5,3},{9,7,5},{5,3,4}});
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[i].length;j++){
                System.out.print(result[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
