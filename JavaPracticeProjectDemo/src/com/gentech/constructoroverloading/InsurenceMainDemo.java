package com.gentech.constructoroverloading;

class Insurance {
    Insurance(int insuranceId, String insuranceName) {
        System.out.println("Insurance Id:"+insuranceId+", "+"Insurance Name:"+insuranceName);
    }
    Insurance(String policyName, int policyId) {
        System.out.println("Policy Name:"+policyName+", "+policyId);
    }
    Insurance(String startDate, String endDate) {
        System.out.println("Start Date:"+startDate+", "+"End Date:"+endDate);
    }
    Insurance(double coverageAmount, double premiumAmount) {
        System.out.println("Coverage Amount:"+coverageAmount+", "+"Premium Amount:"+premiumAmount);
    }
    Insurance(boolean policyStatus) {
        System.out.println("Policy Status:"+policyStatus);
    }
}

