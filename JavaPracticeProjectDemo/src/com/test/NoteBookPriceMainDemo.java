package com.test;

class NoteBookPrice{
    double notePrice(){
        return 450.45;
    }
}

public class NoteBookPriceMainDemo {
    public static void main(String[] args) {
        NoteBookPrice noteBookPrice = new NoteBookPrice();
        double res =noteBookPrice.notePrice();
        System.out.println("Price: "+res);
    }
}
