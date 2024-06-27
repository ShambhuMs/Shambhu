package com.Xworkz.java.practice.Recursion;

// this is not working......

public class ArmStrong {
    public static int count(int n){
        int count=0;
     while (n!=0){
          count++;
          n=n/10;
        }
        return count;
    }
    public static int calculate(int base,int exp){
        int power=1;
        for(int i=0;i<exp;i++){
            power=power*base;
        }
        return power;
    }
    public static void main(String[] args) { // 1+5+3===1^3+5^3+3^3==153
        int n=153;
        int sum=0;
        int r=0;
        int n1=n;
        int s=0;
       while (n>0){
           r=n%10;
           s=count(n);
           sum=sum+calculate(r,s);

       }
if(n1==sum){
    System.out.println("yes");
}
else {
    System.out.println("no");
}


    }
}
