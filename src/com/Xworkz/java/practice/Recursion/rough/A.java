package com.Xworkz.java.practice.Recursion.rough;

public class A {
    public A() {
        System.out.println("no-arg A");
    }
    public void display(){
        System.out.println("Running display in A");

    }
}
class B {
    public B() {
        System.out.println("no-arg B");
    }

    public void display(){
        System.out.println("Running display in B");
    }
}
class C{
    public static void main(String[] args) {
       A a=new A();
       a.display();
    }
}
