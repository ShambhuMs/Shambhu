package com.xworkz.abs;

public interface Hospital {
    final String hospName="asha";
    final String location="ns palya";



    boolean vehicleParking();

    void mobileOnSilent();
    void notallowanceinOT();
    void silence();

    class HospitalEnter {

        public static void main(String[] args) {
            HospitalRule h1=new HospitalRule();
            h1.mobileOnSilent();
            h1.silence();
            h1.notallowanceinOT();
            h1.vehicleParking();
            System.out.print(hospName);
            System.out.print(hospName);
            System.out.println("=======================");
            CourtRule c1=new CourtRule();
            c1.keepMobileSilence();
            c1.parking();
            c1.keepSilence();
            c1.respectJudge();
            System.out.println(CourtRule.courtName);
            System.out.println(CourtRule.city);
            System.out.println("=========================");
            HospitalRule hos1=new HospitalRule();
            hos1.vehicleParking();
            hos1.silence();
            hos1.notallowanceinOT();
            hos1.mobileOnSilent();
            System.out.println(HostelRule.name);
            System.out.println(HostelRule.location);
            System.out.println("=================================");
            ForestRules f1=new ForestRules();
            f1.donotDisturbAnimals();
            f1.noCuttingTree();
            f1.noHunting();
            f1.plastic();
            System.out.println(Forest.forestName);
            System.out.println(Forest.guardName);
            System.out.println("========================================");
            TempleRules t1=new TempleRules();
            t1.keepsilence();;
            t1.lineManagement();
            t1.notcapturePics();
            t1.timings();
            System.out.println(Temple.TempleName);
            System.out.println(Temple.loc);
        }
    }
}


