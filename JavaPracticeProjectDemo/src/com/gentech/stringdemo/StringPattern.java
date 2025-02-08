package com.gentech.stringdemo;
class Pattern{
   static String s = "PROGRAM";


   static void pattern1(int flm1){
        for(int i = 0;i<s.length()-flm1;i++){
            for(int j=0;j<=i;j++) {
                System.out.print(s.charAt(j)+" ");
            }
            System.out.println();
        }
    }

   static void patternReverse(int flm2){
        for (int i = s.length()-1-flm2; i >=0; i--) {
            for (int j = 0;j<=i;j++){
                System.out.print(s.charAt(j)+" ");
            }
            System.out.println();
        }
    }

   static void patterHalfDiamond(int flm1, int flm2){
        Pattern.pattern1(flm1);
        Pattern.patternReverse(flm2);

    }
}

public class StringPattern {
    public static void main(String[] args) {
        Pattern.pattern1(0);
        System.out.println("+++++++++++++++++++");
        Pattern.patternReverse(0);
        System.out.println("********************");
        Pattern.patterHalfDiamond(0,1);
    }
}
