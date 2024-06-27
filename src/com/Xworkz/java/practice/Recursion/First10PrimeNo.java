package com.Xworkz.java.practice.Recursion;

public class First10PrimeNo {
    public static boolean isPrime(int n){
        int count=0;
        for (int i = 1; i <n ; i++) {
            if (n%i==0){
                count++;
            }
        }
        return count==1;
    }

    public static void main(String[] args) {
        int count=0;
        int num=1;
        while (count<10){
            if (isPrime(num)){
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}
