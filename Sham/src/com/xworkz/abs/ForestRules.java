package com.xworkz.abs;

public class ForestRules implements Forest{
    @Override
    public void plastic() {
        System.out.println("running plastic");
    }

    @Override
    public void noHunting() {
        System.out.println("running noHunting");
    }

    @Override
    public void noCuttingTree() {
        System.out.println("running noCuttingTree");
    }

    @Override
    public void donotDisturbAnimals() {
        System.out.println("running doNotDisturbAnimals");
    }
}
