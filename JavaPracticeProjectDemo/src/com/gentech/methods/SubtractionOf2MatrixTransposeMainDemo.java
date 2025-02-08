package com.gentech.methods;
class SubtractionOf2MatrixTranspose{
    void subtract2Matrix(int x[][], int y[][]){
        if(x.length> 0 && x.length>=1 && y.length>0 && y.length>=1 ){
            if(x.length == y.length && x[0].length==y[0].length){
                int[][] subtract = new int[x.length][x[0].length];
                for(int i=0;i<x.length;i++){
                    for(int j=0;j<x[i].length;j++){
                        subtract[i][j] = x[i][j]-y[i][j];
                    }
                }
                System.out.println("Subtracted Array:");
                for(int i=0;i<subtract.length;i++){
                    for(int j=0;j<subtract[i].length;j++){
                        System.out.print(subtract[i][j]+" ");
                    }
                    System.out.println();
                }
                System.out.println("Subtracted Transpose Array:");
                for(int i=0;i<subtract.length;i++){
                    for(int j=0;j<subtract[i].length;j++){
                        System.out.print(subtract[j][i]+" ");
                    }
                    System.out.println();
                }
            }else {
                System.out.println("Both the matrix should have same number of rows and columns");
            }
        }else{
            System.out.println("Matrix row should be greater than zero");
        }
    }
}
public class SubtractionOf2MatrixTransposeMainDemo {
    public static void main(String[] args) {
        SubtractionOf2MatrixTranspose subtractionOf2MatrixTranspose = new SubtractionOf2MatrixTranspose();
        int firstArray[][] = {{10,20,30},{40,50,60},{70,80,90}};
        int secondArray[][]= {{3,2,1},{6,5,4},{9,8,7}};
        subtractionOf2MatrixTranspose.subtract2Matrix(firstArray, secondArray);

        int firstArray1[][] = {};
        int secondArray1[][] = {};
        subtractionOf2MatrixTranspose.subtract2Matrix(firstArray1, secondArray1);

        int firstArray2[][] ={{9,7,8},{6,4,5},{1,3,4}};
        int secondArray2[][] = {{4,5,6},{7,8,9}};
        subtractionOf2MatrixTranspose.subtract2Matrix(firstArray2, secondArray2);
    }
}
