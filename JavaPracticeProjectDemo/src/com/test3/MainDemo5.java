package com.test3;
interface IF11{
    void if1();
}
interface IF22{
    void if2();
}
interface IF33{
    void if3();
}
interface MIF extends IF11,IF22,IF33{
    void mIF();
}

class MSub implements MIF{

    @Override
    public void mIF() {
        System.out.println("mIf");
    }

    @Override
    public void if1() {
        System.out.println("if1");
    }

    @Override
    public void if2() {
        System.out.println("if2");
    }

    @Override
    public void if3() {
        System.out.println("if3");
    }
}
public class MainDemo5 {
    public static void main(String[] args) {
        MSub mSub = new MSub();
        mSub.if1();
        mSub.if2();
        mSub.if3();
        mSub.mIF();
    }
}
