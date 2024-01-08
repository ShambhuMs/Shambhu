package com.Xworkz.Exception;

public class TryWithMultiCatchAndFinally {
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        try{
            System.out.println(a[5]);
        }
        catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println(e);
        }
        finally {
            System.out.println("Exception Handled");
        }
    }
}
