package com.gentech.returnmethods;
class ResultOfTables {
    int[] tableResult(int tableNumber) {
        int tableArray[] = null;
        if(tableNumber>0){
            tableArray = new int[10];
            for(int i=1;i<=10;i++){
                tableArray[i-1] = tableNumber*i;
            }
        }else{
            System.out.println("Table Number can't be a zero");
        }
        return tableArray;
    }
}
public class ResultOfTablesMainDemo {
    public static void main(String[] args) {
        ResultOfTables resultOfTables = new ResultOfTables();
        int []arrayResult = resultOfTables.tableResult(7);
        System.out.print("Result of Table: ");
        for(int i=0;i<arrayResult.length;i++){
            System.out.print(arrayResult[i]+" ");
        }
    }
}
