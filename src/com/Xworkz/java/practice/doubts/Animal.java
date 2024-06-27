package com.Xworkz.java.practice.doubts;

public class Animal {
    public void run(){
        System.out.println("run method running in Animal");
        sleep();
    }
    public void sleep(){
        System.out.println("sleep method running in Animal");
    }
}
class Dog extends Animal{
    @Override
    public void run() {
        System.out.println("gdfgfjksidweudw");
        sleep();
    }

  @Override
    public  void sleep() {
        System.out.println("Sleep in Dog");
    }
}
