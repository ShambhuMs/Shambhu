package com.Xworkz.abstr.Runner;

public class HospitalRule implements Hospital {


    @Override
    public  boolean vehicleParking() {
        System.out.println("Running vehicleParking");
        return false;
    }

    @Override
    public void mobileOnSilent() {
        System.out.println("Running mobileOnSilent");
    }

    @Override
    public void notallowanceinOT() {
        System.out.println("Running notallowanceinOT");
    }

    @Override
    public  void silence() {
        System.out.println("Running silence");
    }
}
