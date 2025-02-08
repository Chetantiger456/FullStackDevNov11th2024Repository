package com.gentech.constructoroverloading;

public class InsuranceMainDemo {
    public static void main(String[] args) {
        Insurance insurance = new Insurance(34, "Health");
        Insurance insurance1 = new Insurance("Arogy yogana",56);
        Insurance insurance2 = new Insurance("12-12-2024", "12-12-2034");
        Insurance insurance3 = new Insurance(1800000.13414, 1434.7836);
        Insurance insurance4 = new Insurance(true);
    }
}
