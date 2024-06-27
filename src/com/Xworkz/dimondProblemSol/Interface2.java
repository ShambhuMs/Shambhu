package com.Xworkz.dimondProblemSol;

public interface Interface2 extends Interface1{
    default void show1(){
        System.out.println("Show1 running in Interface 2....");
    }

//    @Override
//    default void display() {
//        Interface1.super.display();
//        System.out.println("Running in Int 2..........");
//    }
}
