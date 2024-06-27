package com.Xworkz.java.practice.Recursion.rough;

public class Primenumber {
    public static void main(String[] args) {
        int num=13;
        int count=0;

        for (int i = 1; i < num; i++) {
            if(num%2==0){
                count++;
            }
        }

        if(count<=1){
            System.out.println("yes");
        }
        else {
            System.out.println("No");
        }
    }
}
