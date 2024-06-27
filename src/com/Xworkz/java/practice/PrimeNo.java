package com.Xworkz.java.practice;


public class PrimeNo {
    //int n=11;



    public static void main(String[] args) {
        int n=13;
        int count=0;
        for (int i =1; i <n ; i++) {
            if(n%i==0){
                count++;
            }
        }
        if(count==1){
            System.out.println("given no is prime");
        }
        else{
            System.out.println("given no is not prime");
        }
    }
}
