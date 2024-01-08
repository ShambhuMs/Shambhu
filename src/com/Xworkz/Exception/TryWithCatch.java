package com.Xworkz.Exception;

public class TryWithCatch {
    public static void main(String[] args) {
        String s=null;
        try{
            throw new NullPointerException("Enter values");
        }
        catch (NullPointerException e){
            System.out.println("String is empty");
        }
    }
}
