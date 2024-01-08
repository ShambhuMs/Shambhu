package com.Xworkz.java.practice.Arrays;

public class SumOfEachDigit {
    public static void main(String[] args) {
        int arr[]={21,30,5,19,42};
       int newArr[]=new int[arr.length];

        for (int i = 0; i <=arr.length-1; i++) {
            int sum=0;
            int rem=0;
            int n=arr[i];

            while (n>0){
                rem=n%10;
                sum=sum+rem;
                n=n/10;
                newArr[i]=sum;
            }

        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
}
