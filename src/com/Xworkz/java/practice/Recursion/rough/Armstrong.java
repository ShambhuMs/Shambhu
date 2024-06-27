package com.Xworkz.java.practice.Recursion.rough;

public class Armstrong {
    public static void main(String[] args) {
        int n=407;
        int sum=0;
        int temp=n;

        while (n!=0){
            int r= n%10;
            sum=sum+r*r*r;
            n=n/10;
        }

        if(sum==temp){
            System.out.println("Yes");
        }
        else{
            System.out.println("NO");
        }
    }
}
