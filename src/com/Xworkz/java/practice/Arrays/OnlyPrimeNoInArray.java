package com.Xworkz.java.practice.Arrays;

public class OnlyPrimeNoInArray {
    //findinhg only prime number and calculating sum of prime numbers
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
            int sum=0;
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            int n=arr[i];
            for (int j = 1; j <=i; j++) {
                if (n % j == 0) {
                    count++;
                }
            }
            if(count==1){
                System.out.println("is prime : "+arr[i]);
                sum=sum+arr[i];
            }
            else{
                System.out.println("notprime: "+arr[i]);
            }
        }
        System.out.println("Sum is: "+sum);



    }
}
