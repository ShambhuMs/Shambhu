package com.xworkz.abs;

public class HostelRule implements Hostel{

    @Override
    public void timings() {
        System.out.println("running timings");
    }

    @Override
    public boolean availzym() {
        System.out.println("running availzym");
        return false;
    }

    @Override
    public boolean availAlcohol() {
        System.out.println("running availAlcohol");
        return false;
    }

    @Override
    public void vehicalparkingallowance() {
        System.out.println("running vehicalparkingallowance");
    }
}
