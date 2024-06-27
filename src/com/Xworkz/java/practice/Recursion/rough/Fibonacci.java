package com.Xworkz.java.practice.Recursion.rough;

public class Fibonacci {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int fib=10;
        int c;
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i <fib ; i++) {
          c=a+b;
          a=b;
          b=c;
            System.out.println(i+": "+c);
        }
    }
}
