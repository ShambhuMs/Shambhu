package com.Xworkz.abstr.Runner;

public class MainEnter {
    public static void main(String[] args) {
        CourtRule c1=new CourtRule();
        c1.parking();
        c1.keepSilence();
        c1.respectJudge();
        c1.keepMobileSilence();
        System.out.println(CourtRule.city);
        System.out.println(CourtRule.courtName);
    }
}
