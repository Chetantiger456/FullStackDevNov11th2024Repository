package com.gentech.methods;
class CharacterArrayFirstHalf {
    void assignToNewArray(char ch[]){
        if(ch.length>0){
            char newCh[] = new char[ch.length];
            for(int i=0;i<ch.length;i++){
                newCh[i] = ch[i];
                System.out.println(ch[i]);
            }
            System.out.println("Reverse of first Half:");
            for(int j = (newCh.length/2)-1;j>=0;j--){
                System.out.println(newCh[j]);
            }
        }else {
            System.out.println("Array size should be greater than zero");
        }
    }
}

public class CharacterArrayFirstHalfMainDemo {
    public static void main(String[] args) {
        CharacterArrayFirstHalf characterArrayFirstHalf = new CharacterArrayFirstHalf();
        char fCh[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        characterArrayFirstHalf.assignToNewArray(fCh);
        char fCh1[] = {};
        characterArrayFirstHalf.assignToNewArray(fCh1);
    }
}
