package com.Xworkz.dimondProblemSol;

public class Main implements Interface2,Interface3{
    @Override
    public void display() {
        Interface2.super.display();

//        System.out.println("display running in main class");
    }

    @Override
    public void show1() {
        Interface2.super.show1();
    }

    @Override
    public void show() {
        Interface3.super.show();
    }

    public static void main(String[] args) {
        
        Main a=new Main();
        a.display();
        a.show1();
        a.show();
    }
}
