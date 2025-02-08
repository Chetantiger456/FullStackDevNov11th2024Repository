package com.gentech.methods;
class StringArrayConcat {

    void SecondHalfConcat(String strArr[]){
        if(strArr.length>=2) {
            String strConcat = "";
            System.out.println("String to Concatenate:");
            for (int i = strArr.length / 2; i < strArr.length; i++) {
                strConcat += strArr[i];
                System.out.println(strArr[i]);
            }
            System.out.println("String Array Second Half Concat: " + strConcat);
        }else{
            System.out.println("If array is less than 1 we cant find the second half and can't be concatenated");
        }
    }
}

public class StringArrayConcatMainDemo {
    public static void main(String[] args) {
        StringArrayConcat stringArrayConcat = new StringArrayConcat();
        String strArray[] = {"Hi", "Hello", "How", "Are", "You", "Welcome", "to", "the", "New", "World"};
        stringArrayConcat.SecondHalfConcat(strArray);

        String strArray1[] = {"Hello"};
        stringArrayConcat.SecondHalfConcat(strArray1);
    }
}
