package com.Xworkz.thread;

public class Car implements Runnable{
    @Override
    public void run() {
        System.out.println("Created thread...");
    }
}
