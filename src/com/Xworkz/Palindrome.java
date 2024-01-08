package com.Xworkz;

public class Palindrome {
    public static void main(String[] args) {
        int n=123454321;
        int temp=n;
        int r=0;
        int rev=0;
        while (n>0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(temp==rev){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
    }
}
