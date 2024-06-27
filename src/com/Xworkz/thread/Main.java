package com.Xworkz.thread;

public class Main {
    public static void main(String[] args) {
        System.out.println("Thread name: "+Thread.currentThread().getName());
        //creating thread by using class...
        Car car=new Car();
        Thread thread=new Thread(car);
        thread.start();
        // by using lambda expression creating a thread without creating any classes...
        Thread thread1=new Thread( ()-> System.out.println("Created another thread..."),"second thread");
        thread1.start();
        System.out.println("Thread name: "+thread1.getName());
    }
}
