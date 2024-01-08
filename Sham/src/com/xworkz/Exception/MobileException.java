package com.xworkz.Exception;

public class MobileException  extends RuntimeException{

     static void meth(){
         System.out.println("running");
        throw new IndexOutOfBoundsException();
    }
    public static void main(String[] args) {
        meth();

    }
}
