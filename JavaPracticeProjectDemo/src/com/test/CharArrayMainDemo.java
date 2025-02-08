package com.test;
class CharArray{
    char ch[] = {'a','d','f'};
    char[] sendChar(){
        return ch;
    }
}
public class CharArrayMainDemo {
    public static void main(String[] args) {
        CharArray charArray = new CharArray();
        char[] cr = charArray.sendChar();
        for (int i = 0; i < cr.length; i++) {
            System.out.println(cr[i]);
        }
    }
}
