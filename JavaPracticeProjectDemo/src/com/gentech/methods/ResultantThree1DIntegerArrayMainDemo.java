package com.gentech.methods;
class ResultantThree1DIntegerArray {
    void combineArray(int a[], int b[], int c[])
    {
        if(a.length>0 && b.length>0 && c.length>0){
            int res[] = new int[a.length+b.length+c.length];
            int k = 0;
            long mul = 1;
            for(int i=0;i<a.length;i++){
                res[k] = a[i];
                k++;
            }
            for(int j=0;j<b.length;j++){
                res[k] = b[j];
                k++;
            }
            for(int l=0;l<c.length;l++){
                res[k] = c[l];
                k++;
            }
            System.out.println("Combined Array: ");
            for(int m = 0;m<res.length;m++){
                System.out.println(res[m]);
            }
            for(int n = res.length/2;n<res.length;n++){
                mul = mul * res[n];
            }
            System.out.println("Multiplication of Second Half of the array: "+mul);
        }else{
            System.out.println("Array size should be more than zero");
        }
    }
}

public class ResultantThree1DIntegerArrayMainDemo {
    public static void main(String[] args) {
        ResultantThree1DIntegerArray resultantThree1DIntegerArray = new ResultantThree1DIntegerArray();
        int x[]={10,20,30,40,50};
        int y[]={11,22,33,44,55};
        int z[]={21,22,23,24,25};
        resultantThree1DIntegerArray.combineArray(x, y, z);

        int x1[]={10,20,30,40,50};
        int y1[]={11,22,55};
        int z1[]={21,22,23,24};
        resultantThree1DIntegerArray.combineArray(x1, y1, z1);

        int x2[]={};
        int y2[]={};
        int z2[]={};
        resultantThree1DIntegerArray.combineArray(x2, y2, z2);
    }
}
