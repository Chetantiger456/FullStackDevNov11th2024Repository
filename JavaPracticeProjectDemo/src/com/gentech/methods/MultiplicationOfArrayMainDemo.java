package com.gentech.methods;
class MultiplicationOfArray {

    void multiplyArrayValues(int a[], int b[]){
        if(a.length == b.length) {
            System.out.println("Multiplication of two array values:");
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i] + "*" + b[i] + "=" + (a[i] * b[i]));
            }
        }else {
            System.out.println("Cannot Multiply because, Both the array length is not same");
        }
    }
}

public class MultiplicationOfArrayMainDemo {
    public static void main(String[] args) {
        MultiplicationOfArray multiplicationOfArray = new MultiplicationOfArray();
        int[] firstArray = {10, 20, 30, 40};
        int[] secondArray = {11, 22, 33, 44, 55};
        multiplicationOfArray.multiplyArrayValues(firstArray, secondArray);

        int[] firstArray1 = {10, 20, 30, 40, 50};
        int[] secondArray1 = {11, 22, 33, 44, 55};
        multiplicationOfArray.multiplyArrayValues(firstArray1,secondArray1);
    }
}
