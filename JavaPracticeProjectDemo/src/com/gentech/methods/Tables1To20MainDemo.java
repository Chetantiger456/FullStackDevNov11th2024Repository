package com.gentech.methods;
class Tables {
    void tables(int a, int b){
        for(int i=a;i<=b;i++){
            for(int j=1;j<=10;j++){
                System.out.println(i+"*"+j+"="+i*j);
            }
            System.out.println();
        }
        System.out.println("OR");
        for(int i=1;i<=10;i++){
            for(int j=a;j<=b;j++){
                System.out.print(j+"*"+i+"="+j*i+"         ");
            }
            System.out.println();
        }
    }
}
public class Tables1To20MainDemo {
    public static void main(String[] args) {
        Tables tables = new Tables();
        tables.tables(1, 20);

        //tables.tables(30, 60);
    }
}
