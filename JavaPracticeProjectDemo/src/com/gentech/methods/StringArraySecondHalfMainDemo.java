package com.gentech.methods;
class StringArraySecondHalf {
    void secondHalfReverse(String strArr[]){
        if(strArr.length>0){
            String newStrArr[] = new String[strArr.length-strArr.length/2];
            int k=0;
            System.out.println("Second Half of the Array: ");
            for(int i=strArr.length/2;i<strArr.length;i++){
                newStrArr[k] = strArr[i];
                k++;
                System.out.println(strArr[i]);
            }
            System.out.println("Reverse Direction:");
            for(int i=newStrArr.length-1;i>=0;i--){
                System.out.println(newStrArr[i]);
            }

        }else {
            System.out.println("String array size should be greater than zero");
        }
    }
}

public class StringArraySecondHalfMainDemo {
    public static void main(String[] args) {
        StringArraySecondHalf stringArraySecondHalf = new StringArraySecondHalf();
        String strArray[] = {"Hi", "Hello", "How", "Are", "You", "Welcome", "to", "the", "New", "World"};

        stringArraySecondHalf.secondHalfReverse(strArray);
    }
}
