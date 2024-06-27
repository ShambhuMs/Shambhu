package com.Xworkz.java.practice.Recursion.rough;

public interface ShowInt {
       void display();
}
class A1 implements ShowInt{
    ShowInt s;
    public A1(ShowInt s) {
        System.out.println("No-arg cons in A");
    }

    @Override
    public void display() {
        System.out.println("Running display in A");
    }
}
class B1 implements ShowInt{
    public B1() {
        System.out.println("No-arg cons in B");
    }

    @Override
    public void display() {
        System.out.println("Running display in B");
    }
}
class C1 implements ShowInt{
    public C1() {
        System.out.println("No-arg cons in C");
    }



    @Override
    public void display() {
        System.out.println("Running display in C");
    }
}
class D{
    public static void main(String[] args) {
        ShowInt b1=new B1();
        ShowInt a1=new A1(b1);
        a1.display();
        System.out.println("===============================");
        ShowInt c1=new C1();
        ShowInt a=new A1(c1);
    }
}