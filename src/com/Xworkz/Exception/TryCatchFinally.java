package com.Xworkz.Exception;

public class TryCatchFinally {
    public static void main(String[] args) {
        try{
            int i=25/0;
            System.out.println(i);
        }

        catch(ArithmeticException e){
            System.out.println(e);
        }
        finally {
            System.out.println("finally block is always executed");
        }

    }
}
