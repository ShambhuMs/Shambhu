package com.Xworkz.java.practice;

public class NnoOfPrime {

    static boolean isPrime(int n){
        int count=0;
        for (int i = 1; i <=n; i++) {
            if(n%i==0){
                count++;
            }
        }

        return count==2;
    }
    public static void main(String[] args) {
        int n = 50;
        int count=0;
        for (int i = 0; i <= 50; i++) {
            if (isPrime(i) == true) {
                if(count<n) {
                    System.out.println(i);
                    count++;
                }
            }
        }
    }
}
