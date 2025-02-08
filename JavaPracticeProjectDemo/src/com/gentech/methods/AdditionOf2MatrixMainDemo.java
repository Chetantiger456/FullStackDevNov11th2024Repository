package com.gentech.methods;

 class AdditionOf2Matrix {
    void add2Matrix(int x[][], int y[][]){
        if(x.length> 0 && x.length>=1 && y.length>0 && y.length>=1 ){
            if(x.length == y.length && x[0].length == y[0].length){
                int[][] addition = new int[x.length][x[0].length];
                int sum = 0;
                for(int i=0;i<x.length;i++){
                    for(int j=0;j<x[i].length;j++){
                        addition[i][j] = x[i][j]+y[i][j];
                    }
                }
                System.out.println("Additon of 2 matrix Result:");
                for(int i=0;i<addition.length;i++){
                    for(int j=0;j<addition[i].length;j++){
                        System.out.print(addition[i][j]+" ");
                    }
                    System.out.println();
                }
                for(int i=0;i<addition[1].length;i++){
                     sum+= addition[1][i];
                }
                System.out.println("Sum of Second Row :"+sum);
            }else {
                System.out.println("Both the matrix should have same rows and columns");
            }
        }else {
            System.out.println("Matrix row should be greater than zero");
        }
    }
}

public class AdditionOf2MatrixMainDemo {
    public static void main(String[] args) {
        AdditionOf2Matrix additionOf2Matrix = new AdditionOf2Matrix();
        int firstArray[][] = {{10,20,30},{40,50,60},{70,80,90}};
        int secondArray[][]= {{3,2,1},{6,5,4},{9,8,7}};
        additionOf2Matrix.add2Matrix(firstArray, secondArray);

        int firstArray1[][] = {};
        int secondArray1[][] = {};
        additionOf2Matrix.add2Matrix(firstArray1, secondArray1);

        int firstArray2[][] ={{9,7,8},{6,4,5},{1,3,4}};
        int secondArray2[][] = {{4,5,6},{7,8,9}};
        additionOf2Matrix.add2Matrix(firstArray2, secondArray2);
    }
}
