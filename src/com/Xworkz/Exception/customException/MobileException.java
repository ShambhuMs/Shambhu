package com.Xworkz.Exception.customException;

public class MobileException  extends RuntimeException{

     static void meth(){
         System.out.println("running");
        throw new MobileException();
    }
    public static void main(String[] args) {
        meth();

    }
}
