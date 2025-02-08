package com.gentech.methods;
class AddOf31DIntegerArray{
    void Add3Arrays(int a[], int b[], int c[]){
        if(a.length==b.length && b.length==c.length){
            int res[] = new int[a.length];
            int multiply = 1;
            for(int i=0;i<a.length;i++){
                res[i] = a[i]+b[i]+c[i];
            }
            System.out.print("Second half of the array elements:");
            for(int i = res.length/2;i<res.length;i++){
                multiply*= res[i];
                System.out.print(res[i]+" ");
            }
            System.out.println("\nSecond half of the Array Multiplication:"+multiply);
        }else{
            System.out.println("Array length of size should be same for all 3 arrays");
        }
    }
}

public class AddOf31DIntegerArrayMainDemo {
    public static void main(String[] args) {
        AddOf31DIntegerArray addOf31DIntegerArray = new AddOf31DIntegerArray();
        int x[]={10,20,30,40,50};
        int y[]={11,22,33,44,55};
        int z[]={21,22,23,24,25};
        addOf31DIntegerArray.Add3Arrays(x, y, z);

        int x1[]={10,20,30,40,50};
        int y1[]={11,22,55};
        int z1[]={21,22,23,24,};
        addOf31DIntegerArray.Add3Arrays(x1, y1, z1);
    }
}
