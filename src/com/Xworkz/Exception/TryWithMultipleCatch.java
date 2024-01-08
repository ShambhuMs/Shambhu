package com.Xworkz.Exception;

public class TryWithMultipleCatch {
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        int s=20;

        try{
            System.out.println(a[5]);
            int c=20/0;
            System.out.println(c);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException ");
            System.out.println(e);
        }
        catch (ArithmeticException p){
            System.out.println("ArithmeticException");
            System.out.println(p);


        }

    }
}
